package lesson17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlowPanel extends JPanel {
	public FlowPanel() {
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		JTextField text = new JTextField(10);
		add(text);
		JButton b = new JButton("Button1");
		b.setSize(1000, 180);
		add(b);
		add(new JButton("Button2"));
		add(new JButton("Button3"));
	}
}