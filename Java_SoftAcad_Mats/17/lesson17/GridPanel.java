package lesson17;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GridPanel extends JPanel {
	public GridPanel() {
		setLayout(new GridLayout(2, 3, 15, 3 ));
		add(new JButton("Button 1"));
		add(new JButton("Button 2"));
		add(new JButton("Button 3"));
		add(new JButton("Button 4"));
		add(new JButton("Button 5"));
		//add(new JButton("Button 6"));
	}
}