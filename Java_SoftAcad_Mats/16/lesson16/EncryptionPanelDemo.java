package lesson16;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EncryptionPanelDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Encryption application");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String inputX = JOptionPane.showInputDialog(frame, "Input salt X: "); 
		int x = Integer.valueOf(inputX);
		
		JPanel panel = new EncryptionPanel(x);
		frame.add(panel);
		frame.setVisible(true);
	}
}
