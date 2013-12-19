import javax.swing.JOptionPane;


public class JDBaudeanp2 {

	public static double[] getNums() {
		
		String reply = JOptionPane.showInputDialog(null, "How many numbers would you like to enter?");
		int numNums = Integer.parseInt(reply);
		String[] strArray = new String[numNums];
		
		for (int i = 0; i < numNums; i++) {
			strArray[i] = JOptionPane.showInputDialog(null, "Enter a number: ");
		} 
		
		//Convert the array of strings to an array of doubles
		double[] numDouble = new double[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			numDouble[i] = Double.parseDouble(strArray[i]);
		}
		return numDouble;
	}
	
	public static double getSum(double[] nums) {
		double sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	public static double getAverage(double[] nums) {
		double average = 0;
		double sum  = getSum(nums);
		
		average = sum / nums.length;
		
		return average;
	}
	
	public static void checkSum(double sum) {
		if (sum > 100) {
			JOptionPane.showMessageDialog(null, "Values have exceeded a sum of 100");
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
		
		//Get the numbers that will be used for the calculations
		double[] numArray = getNums();
		
		//Calculate the sum of the numbers
		double sum = getSum(numArray);
		
		//Check to ensure that the sum of the numbers does not exceed 100
		checkSum(sum);
		
		JOptionPane.showMessageDialog(null, "You have entered " + numArray.length + " numbers");
		JOptionPane.showMessageDialog(null, "The sum of your numbers is: " + sum);
		JOptionPane.showMessageDialog(null, "The average of your numbers is: " + getAverage(numArray));

	}

}
