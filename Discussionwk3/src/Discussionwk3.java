import javax.swing.*;

public class Discussionwk3 {
	
	public static void main(String[] args) { 
		
		String myName = "Joseph";
		
		int length = myName.length();
		
		for (int count = 0; count < length; count++) {
			JOptionPane.showMessageDialog(null, count);
		}
	
		//for (char i: myName.toCharArray()) {
		//	JOptionPane.showMessageDialog(null, i);
		//}
	}

}
