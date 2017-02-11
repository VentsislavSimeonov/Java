package lesson15;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TrianglePanelTest {

	public static void main(String[] args) {
		String widthStr = JOptionPane.showInputDialog(null, "Enter width");
		int width = Integer.parseInt(widthStr);
		String heightStr = JOptionPane.showInputDialog(null, "Enter height");
		int height = Integer.parseInt(heightStr);
		String sideStr = JOptionPane.showInputDialog(null, "Enter side");
		int side = Integer.parseInt(sideStr);
		
		JFrame f = new JFrame("Triangle Program");
		f.setSize(width, height);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		TrianglePanel p = new TrianglePanel(side);
		f.add(p);
	}
}