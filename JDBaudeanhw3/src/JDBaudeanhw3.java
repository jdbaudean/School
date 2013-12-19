import javax.swing.JOptionPane;
import java.util.Arrays;

public class JDBaudeanhw3 {
	
	public static double[] parseStr(String numbers) {
		//Parses a string by whitespace and converts to an array of doubles
		
		double[] numArray;
		numArray = new double[10];
		
		String[] words = numbers.split(" ");
		numsCheck(words);
		
		for (int i = 0; i < words.length; i++ ) {
			Double number = Double.parseDouble(words[i]);
			numArray[i] = number;
		}
		return numArray;
	}
	
	public static void numsCheck(String[] userInput) {
		
		if (userInput.length != 10) {
			JOptionPane.showMessageDialog(null, "You may only enter exactly 10 numbers");
			System.exit(0);
		}
		
	}
	
	public static void outputArray(double[] outputNumbers) {
		
		String outputString = Arrays.toString(outputNumbers);
		JOptionPane.showMessageDialog(null, outputString);
		
	}
	
	public static void main(String[] args) {
		double[] convertedArray;
		convertedArray = new double[10];
		
		String numStr = JOptionPane.showInputDialog(null, "Enter 10 numbers: ");
		convertedArray = parseStr(numStr);
		
		Arrays.sort(convertedArray);
		outputArray(convertedArray);
		
	}

}
