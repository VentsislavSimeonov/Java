package lesson17;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.BLUE);
		panel1.setToolTipText("panel1");
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.RED);
		panel2.setToolTipText("panel 2");
		
		//frame.add(new AdvancedPanel());
		// frame.add(new GridPanel());
		// frame.add(new GridPanel2());
		// frame.add(new BoxLayoutPanel());
		// frame.add(new BoxPanel1());
		// frame.add(new BoxPanel2());
		 frame.add(new NullLayout());
		//frame.add(panel2);
		
		frame.setVisible(true);
	}

}

