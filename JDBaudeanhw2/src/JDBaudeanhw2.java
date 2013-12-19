import javax.swing.*;

public class JDBaudeanhw2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String titleBar = "Random Number Generator";
		String numbers = "";
		int randomNumber = 0;
		int sum = 0;
		
		for (int count = 0; count < 100; count++) {
			
			randomNumber = (int)(Math.random() * 1000);
			sum = sum + randomNumber;
			
			// Add a new line every 10 numbers for readability
			if (count %10 == 0 && count != 0) {
				numbers = numbers + "\n";
			}
			
			numbers = numbers + Integer.toString(randomNumber) + ", ";
		}
		JOptionPane.showMessageDialog(null, "Your 100 random numbers are:\n\n" + numbers,
				titleBar, JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "The sum of all of your random numbers is:\n" + sum,
				titleBar, JOptionPane.INFORMATION_MESSAGE);

	}

}
