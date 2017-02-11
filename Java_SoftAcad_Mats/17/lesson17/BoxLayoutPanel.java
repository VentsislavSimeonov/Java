package lesson17;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BoxLayoutPanel extends JPanel {
	public BoxLayoutPanel() {
		BoxLayout l = new BoxLayout(this, BoxLayout.Y_AXIS);
		setLayout(l);
		add(new JButton("Button 1"));
		add(new JButton("This is button 2"));
		add(new JButton("Button 3"));
	}
}