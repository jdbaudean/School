import javax.swing.*;
import java.awt.event.*;

public class ImplementListener {
	public static void main(String[] args) {
		
		JFrame frame1 = new JFrame("Implement Listener");
		frame1.setTitle("Implement Listener");
		frame1.setSize(200, 150);
		frame1.setLocation(200, 100);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
		
		
		JButton jButtonOk = new JButton("OK");
		JButton jButtonGoRavens = new JButton("O's");
		JButton jButtonExit = new JButton("Exit");
		
		JPanel panel = new JPanel();
		panel.add(jButtonOk);
		panel.add(jButtonGoRavens);
		panel.add(jButtonExit);
		frame1.add(panel);
		
		
		OKListenerClass listener1 = new OKListenerClass();
		jButtonOk.addActionListener(listener1);
	
		GoRavensListenerClass listener2 = new GoRavensListenerClass();
		jButtonGoRavens.addActionListener(listener2);
		
		ExitListenerClass exitObject = new ExitListenerClass();
		jButtonExit.addActionListener(exitObject);
	}
}
		
	class OKListenerClass implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("OK button was clicked");
		}
	}
	
	class GoRavensListenerClass implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("Orioles Rule!!");
		}
	}
	
	class ExitListenerClass implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("Exiting");
			System.exit(0);
		}
	}

