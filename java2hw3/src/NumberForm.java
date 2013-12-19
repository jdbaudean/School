/*
 * JD Baudean
 * Homework 3
 * CMIS242 OL 4
 */

import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.*;

public class NumberForm extends JFrame {
	
	private JTextField firstNumberField = new JTextField();
	private JTextField secondNumberField = new JTextField();
	private JTextField greatestCommonDivisorField = new JTextField();
	private JTextField leastCommonMultipleField = new JTextField();
		
	private JButton jButtonCalculate = new JButton("Calculate");
		
	public NumberForm() {
			
		// Panel for the number fields
		JPanel numbersPanel = new JPanel(new GridLayout(5, 22));
		numbersPanel.add(new JLabel("First Number: "));
		numbersPanel.add(firstNumberField);
		numbersPanel.add(new JLabel("Second Number: "));
		numbersPanel.add(secondNumberField);
		numbersPanel.add(new JLabel("Greatest Common Divisor"));
		numbersPanel.add(greatestCommonDivisorField);
		numbersPanel.add(new JLabel("Least Common Multiple"));
		numbersPanel.add(leastCommonMultipleField);
		
		// Add a new panel for the calculate button
		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(jButtonCalculate);
		
		add(numbersPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		// Register the listener object
		jButtonCalculate.addActionListener(new ButtonListener());
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int firstNumber = Integer.parseInt(firstNumberField.getText());
			int secondNumber = Integer.parseInt(secondNumberField.getText());
			
			int greatestCommonDivisor = calculateGreatestCommonDivisor(firstNumber, secondNumber);
			int leastCommonMultiple = (firstNumber * (secondNumber / greatestCommonDivisor));
			
			greatestCommonDivisorField.setText(Integer.toString(greatestCommonDivisor));
			leastCommonMultipleField.setText(Integer.toString(leastCommonMultiple));
		}
	}
	
	public int calculateGreatestCommonDivisor(int number1, int number2) {
		if (number2 == 0) return number1;
		return calculateGreatestCommonDivisor(number2, number1 % number2);
	}
	
	public static void main (String[] args) {
		
		NumberForm frame = new NumberForm();
		frame.pack();
		frame.setTitle("Numbers");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
