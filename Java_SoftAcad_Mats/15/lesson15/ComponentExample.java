package lesson15;

import hw11.Page;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ComponentExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame("Component Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();

		
		JScrollPane scrollPane = new JScrollPane(panel);
		frame.add(scrollPane);

		
		JLabel label = new JLabel("Please enter your credit card number");
		panel.add(label);
		
		JTextField textField = new JTextField("Sample text");
		textField.setMinimumSize(new Dimension(50, 30));
		panel.add(textField);
		
		JButton button = new JButton("Buttons text");
		panel.add(button);
		
		JTextArea textArea = new JTextArea("Initial text");
		textArea.setSize(new Dimension(200, 300));
		panel.add(textArea);
		
		Page[] pages = new Page[2];
		pages[0] = new Page("Page 1", "Text of the first page");
		pages[1] = new Page("Page 2", "Text of the second page");
		JComboBox<Page> comboBox = new JComboBox<>(pages);
		panel.add(comboBox);
		
		JCheckBox checkBox = new JCheckBox("Check this out", true);
		panel.add(checkBox);
		
		JRadioButton radioButton = new JRadioButton("First radio button", true);
		JRadioButton radioButton2 = new JRadioButton("Second radio button", false);
		
		panel.add(radioButton);
		panel.add(radioButton2);

	}

}
