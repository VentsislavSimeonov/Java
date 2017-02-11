package lesson17;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridPanel2 extends JPanel {
	public GridPanel2() {
		setLayout(new GridLayout(3, 2, 20, 20));
		add(new JButton("Button 1"));
		JPanel p = new JPanel();
		JButton b2 = new JButton("Button 2");
		p.add(b2);
		add(p);
		//add(new JLabel());
		add(new JButton("Button 4"));
		add(new JButton("Button 5"));
		add(new JButton("Button 6"));
	}
}