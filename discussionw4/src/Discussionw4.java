import javax.swing.JOptionPane;

public class Discussionw4 {

	public static double getArea(double radius) {
		double area = radius * radius * Math.PI;
		return area;
	}
	
	public static void main(String[] args) {
		String strRadius = JOptionPane.showInputDialog(null, "Enter the radius of a circle");
		double dblRadius = Double.parseDouble(strRadius);
		
		JOptionPane.showMessageDialog(null, getArea(dblRadius));
		

	}

}
