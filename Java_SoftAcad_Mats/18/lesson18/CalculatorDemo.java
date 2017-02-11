package lesson18;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalculatorDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculator");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new CalculatorPanel();
		frame.add(panel);
		
		
		frame.setVisible(true);
	}
}
