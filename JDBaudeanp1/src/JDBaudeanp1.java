import javax.swing.*;

public class JDBaudeanp1 {
	
	public static void main(String[] args) {
		
		//Create new panel for users name
		JTextField firstNameField = new JTextField(10);
		JTextField middleInitialField = new JTextField(10);
		JTextField lastNameField = new JTextField(10);
		
		JPanel namePanel = new JPanel();
			
		namePanel.add(new JLabel("First Name: "));
		namePanel.add(firstNameField);
		namePanel.add(new JLabel("Middle Initial: "));
		namePanel.add(middleInitialField);
		namePanel.add(new JLabel("Last Name: "));
		namePanel.add(lastNameField);
		
		//Create new panel for lucky numbers
		JTextField firstNumberField = new JTextField(10);
		JTextField secondNumberField = new JTextField(10);
		JTextField thirdNumberField = new JTextField(10);
		
		JPanel luckyNumbersPanel = new JPanel();
		
		luckyNumbersPanel.add(new JLabel("First Number: "));
		luckyNumbersPanel.add(firstNumberField);
		luckyNumbersPanel.add(new JLabel("Second Number: "));
		luckyNumbersPanel.add(secondNumberField);
		luckyNumbersPanel.add(new JLabel("Third Number: "));
		luckyNumbersPanel.add(thirdNumberField);
		
		//Get user info
		JOptionPane.showConfirmDialog(null, namePanel, "Enter Your Name", JOptionPane.OK_CANCEL_OPTION);
		String age = JOptionPane.showInputDialog(null, "Enter your age: ");
		JOptionPane.showConfirmDialog(null, luckyNumbersPanel, "Enter Your Lucky Numbers", 
										JOptionPane.OK_CANCEL_OPTION);

		//Create welcome message
		String welcomeMessage = "Welcome ";
		welcomeMessage += firstNameField.getText() + " " + 
							middleInitialField.getText() + " " + 
							lastNameField.getText();
		
		//Calcuate age category
		int ageConverted = Integer.parseInt(age);
		if (ageConverted <= 12)
			welcomeMessage += ", you're just a kid!";
		if ((ageConverted > 12) && (ageConverted < 20))
			welcomeMessage += ", you're a teenager!";
		if (ageConverted == 20)
			welcomeMessage += ", you're almost an adult.";
		if (ageConverted > 21)
			welcomeMessage += ", you're an adult.";
		
		
		//Average of lucky numbers
		int sum = Integer.parseInt(firstNumberField.getText());
		sum += Integer.parseInt(secondNumberField.getText());
		sum += Integer.parseInt(thirdNumberField.getText());
		int average = sum / 3;
		
		//Display results to user
		JOptionPane.showMessageDialog(null, welcomeMessage);
		JOptionPane.showMessageDialog(null, "The average of your lucky numbers is " + average);

		System.exit(0);

	}

}
