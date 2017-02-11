package lesson17;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BoxPanel1 extends JPanel {
	public BoxPanel1() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(new JButton("Button 1"));
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.add(new JButton("Horizontal 1 with some big name"));
		horizontalBox.add(new JButton("Horizontal 2"));
		horizontalBox.add(new JButton("Horizontal 3"));
		horizontalBox.add(new JButton("Horizontal 4"));
		add(horizontalBox);
		// horizontalBox.setAlignmentX(Box.LEFT_ALIGNMENT);
		add(new JButton("Button 2"));
		add(new JButton("Button 3"));
		add(new JButton("Button 4"));
	}
}