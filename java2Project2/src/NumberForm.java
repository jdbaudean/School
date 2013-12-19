
/*
 * JD Baudean
 * Project 2
 * CMIS242 OL 4
 */

import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.*;

public class NumberForm extends JFrame {
	
	private JTextField firstNumberField = new JTextField();
	private JTextField secondNumberField = new JTextField();
	private JTextArea firstTextArea = new JTextArea();
	private JTextArea secondTextArea = new JTextArea();
	private boolean showGCD;
	private boolean showPrime;
		
		
	public NumberForm() {
			
		JButton jButtonCalculate = new JButton("Calculate");
		final JCheckBox jCheckDisplayPrime = new JCheckBox("Check for prime numbers");
		
		// Configure text areas
		firstTextArea.setEditable(false);
		firstTextArea.setFont(new Font("Serif", Font.PLAIN, 30));
		secondTextArea.setEditable(false);
		secondTextArea.setFont(new Font("Serif", Font.PLAIN, 14));
		secondTextArea.setLineWrap(true);
		secondTextArea.setWrapStyleWord(true);
		
		// Panels for the number fields
		JPanel numbersPanel = new JPanel(new BorderLayout());
		JPanel inputPanel = new JPanel(new GridLayout(2, 10));
		JPanel outputPanel = new JPanel(new GridLayout(1, 10));
		
		inputPanel.add(new JLabel("First Number: "));
		inputPanel.add(firstNumberField);
		inputPanel.add(new JLabel("Second Number: "));
		inputPanel.add(secondNumberField);
		outputPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		// Add a new panel for the calculate button
		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(jButtonCalculate);
		
		// Add a panel for the check box
		JPanel checkBoxPanel = new JPanel(new GridLayout(2, 10));
		checkBoxPanel.add(jCheckDisplayPrime);
		checkBoxPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		// Register the button listener object
		jButtonCalculate.addActionListener(new ButtonListener());
		
		// Create radio buttons
		JRadioButton gcdRadioButton, lcmRadioButton;
		JPanel radioButtonPanel = new JPanel();
		radioButtonPanel.setLayout(new GridLayout(2, 1));
		radioButtonPanel.add(gcdRadioButton = new JRadioButton("GCD"));
		radioButtonPanel.add(lcmRadioButton = new JRadioButton("LCM"));
		
		// Configure button group so only one radio button can pressed at a time
		ButtonGroup radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(gcdRadioButton);
		radioButtonGroup.add(lcmRadioButton);
		
		// Configure the sub panels
		numbersPanel.add(inputPanel, BorderLayout.NORTH);
		numbersPanel.add(outputPanel, BorderLayout.SOUTH);
		outputPanel.add(radioButtonPanel, BorderLayout.WEST);
		outputPanel.add(firstTextArea, BorderLayout.EAST);
		checkBoxPanel.add(secondTextArea);
		
		// Add primary panels to the main panel
		add(checkBoxPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		add(numbersPanel, BorderLayout.NORTH);
		
		// Listeners for radio buttons and check box
		
		gcdRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showGCD = true;
			}
		});
		
		lcmRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showGCD = false;
			}
		});
		
		jCheckDisplayPrime.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (jCheckDisplayPrime.isSelected()) showPrime = true;
				else showPrime = false;
					
			}
		});
	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int firstNumber = Integer.parseInt(firstNumberField.getText());
			int secondNumber = Integer.parseInt(secondNumberField.getText());
			
			int greatestCommonDivisor = calculateGreatestCommonDivisor(firstNumber, secondNumber);
			int leastCommonMultiple = (firstNumber * (secondNumber / greatestCommonDivisor));
			
			if (showGCD) {
				firstTextArea.setText(Integer.toString(greatestCommonDivisor));
			} else {
				firstTextArea.setText(Integer.toString(leastCommonMultiple));
			}
			
			if (showPrime) {
				secondTextArea.setText(isPrime(firstNumber) + " and " + isPrime(secondNumber));
			} else secondTextArea.setText("");
		}
	}
	
	public int calculateGreatestCommonDivisor(int number1, int number2) {
		if (number2 == 0) return number1;
		return calculateGreatestCommonDivisor(number2, number1 % number2);
	}
	
	public String isPrime(int number) {
		for(int divisor = 2; divisor * divisor <= number; divisor++) {
			if ((number % divisor) == 0) 
				return Integer.toString(number) + " is not prime";
		}
		return Integer.toString(number) + " is prime";
	}
	

	public static void main (String[] args) {
		
		NumberForm frame = new NumberForm();
		frame.setSize(400, 200);
		frame.setTitle("Numbers");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}