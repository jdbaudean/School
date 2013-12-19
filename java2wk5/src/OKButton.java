/*
 * JD Baudean
 * Week 5 discussion Review 17.1
 * CMIS 242 OL4
 */

import java.awt.Color;

import javax.swing.*;


public class OKButton extends JFrame {
	
	public OKButton() {
		ImageIcon ravensIcon = new ImageIcon("images/Ravens.jpg");
		ImageIcon edReedIcon = new ImageIcon("images/EdReed.jpg");
		ImageIcon rayLewisIcon = new ImageIcon("images/RayLewis.jpg");
		
		JButton jButton = new JButton("Click", ravensIcon);
		jButton.setBackground(Color.black);
		jButton.setForeground(Color.white);
		jButton.setRolloverIcon(edReedIcon);
		jButton.setPressedIcon(rayLewisIcon);
		jButton.setVerticalTextPosition(SwingConstants.TOP);
		jButton.setHorizontalTextPosition(SwingConstants.CENTER);
		
		add(jButton);
	}

	public static void main(String[] args) {
		JFrame frame = new OKButton();
		frame.setTitle("Ravens");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
