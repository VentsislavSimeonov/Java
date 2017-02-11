package lesson17;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class PanelsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// frame.add(new FlowPanel());
		frame.add(new BorderPanel());
		
		frame.setSize(350, 200);
		frame.setVisible(true);
	}

}
