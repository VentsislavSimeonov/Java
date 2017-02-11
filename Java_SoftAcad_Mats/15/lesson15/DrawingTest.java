package lesson15;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame("Drawing program");
		frame.setSize(1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		// create panels and add it to the frame
		JPanel panel = new DrawingPanel();
		//add components to the panel
		//finally add the panel with the components in it to the frame
		frame.add(panel);
		frame.setVisible(true);
		
		System.out.println(" this is the end my friend.");

	}

}
