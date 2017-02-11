package lesson17;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NullLayout extends JPanel {
	public NullLayout() {
		setLayout(null);
		JLabel l = new JLabel("Label");
		JButton b = new JButton("Button to exit the program");
		JButton b1 = new JButton("Button2");
		l.setBounds(5, 10, 62, 16);
		b.setBounds(274, 100, 230, 30);
		b1.setBounds(559, 130, 80, 30);
		add(l);
		add(b);
		add(b1);
	}
}