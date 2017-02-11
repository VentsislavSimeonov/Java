package lesson17;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BoxPanel2 extends JPanel {
	public BoxPanel2() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(new JButton("Button 1"));
		// add rigit area
		add(Box.createRigidArea(new Dimension(0, 50)));
		add(new JButton("Button 2"));
		add(new JButton("Button 3"));
		// add horizontal glue
		add(Box.createVerticalGlue());
		add(new JButton("Button 4"));
	}
}