/*
 * JD Baudean
 * Final Project
 * CMIS242 OL 4
 */

import java.util.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.awt.*;

public class ColorChanger extends JFrame {
	
	private JPanel radioButtonPanel = new JPanel();
	private ButtonGroup radioButtonGroup = new ButtonGroup();
	
	
	public ColorChanger() {
		
		HashMap<String, String> colors = this.colorMap();
		
		createRadioButtons(colors);
		this.radioButtonPanel.setLayout(new GridLayout(4, 4, 20, 20));
		
		// Set default colors for border and background
		this.radioButtonPanel.setBorder(new LineBorder(Color.BLACK, 10));
		this.radioButtonPanel.setBackground(Color.BLACK);
		
		add(radioButtonPanel);
	}

	private void createRadioButtons(HashMap<String, String> hash) {
		// create radio buttons and action listener
		
		for (Map.Entry<String, String> entry : hash.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			final Color color = Color.decode(value);
			JRadioButton radioButton = new JRadioButton(key);
			
			radioButton.setBorder(BorderFactory.createRaisedBevelBorder());
			radioButton.setBorderPainted(true);
			this.radioButtonPanel.add(radioButton);
			this.radioButtonGroup.add(radioButton);
			
			radioButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					radioButtonPanel.setBackground(color);
					radioButtonPanel.setBorder(new LineBorder(color, 10));
				}
			});
		}
	}
	
	private HashMap<String, String> colorMap() {
		HashMap<String, String> colorHash = new HashMap<String, String>();
		
		colorHash.put("Aqua", "#00FFFF");
		colorHash.put("Beige", "#F5F5DC");
		colorHash.put("Blue", "#0000FF");
		colorHash.put("Blue Violet", "#8A2BE2");
		colorHash.put("Brown", "#A52A2A");
		colorHash.put("Coral", "#FF7F50");
		colorHash.put("Dark Blue", "#00008B");
		colorHash.put("Gold", "#FFD700");
		colorHash.put("Gray", "#808080");
		colorHash.put("Green", "#008000");
		colorHash.put("Hot Pink", "#FF69B4");
		colorHash.put("Khaki", "#F0E68C");
		colorHash.put("Maroon", "#800000");
		colorHash.put("Navy", "#000080");
		colorHash.put("Olive", "#808000");
		colorHash.put("Orange", "#FFA500");
		colorHash.put("Peru", "#CD853F");
		colorHash.put("Purple", "#800080");
		colorHash.put("Red", "#FF0000");
		colorHash.put("Yellow", "#FFFF00");
		
		return colorHash;
	}
	
	public static void main(String[] args) {
		
		ColorChanger colorChanger = new ColorChanger();
		
		colorChanger.setSize(600, 300);
		colorChanger.setTitle("Color Changer");
		colorChanger.setLocationRelativeTo(null);
		colorChanger.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		colorChanger.setVisible(true);
	}
}
