package lesson17;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BorderPanel extends JPanel {
	public BorderPanel() {
		// create components
		JButton north = new JButton("North");
		JButton east = new JButton("East");
		JButton south = new JButton("South");
		JButton west = new JButton("West");
		JButton center = new JButton("Center");
		
		// set layout
		BorderLayout layout = new BorderLayout(30, 15);
		setLayout(layout);
		
		// add the components to the panel
		add(north, BorderLayout.NORTH);
		add(east, BorderLayout.EAST);
		add(new FlowPanel(), BorderLayout.SOUTH);
		add(west, BorderLayout.WEST);
		add(center, BorderLayout.CENTER);
	}
}
