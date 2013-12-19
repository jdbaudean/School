/*
 * JD Baudean
 * Week 6 Discussion
 * CMIS242 OL4
 */
import javax.swing.*;

public class RecursivePower {
	public static int power(int coefficient) {
		if (coefficient == 0) {
			return 1;
		} else {
			return 2 * power(coefficient - 1);
		}
	}
	
	public static void main(String[] args) {
		int coefficient = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a coefficient"));
		JOptionPane.showMessageDialog(null, "2 to the power of " + coefficient + " is " + power(coefficient));
	}
}
