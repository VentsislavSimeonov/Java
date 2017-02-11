package hw16;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EncryptionPanelDemo {
	public static void main(String[] args) {
		int x = -1;
		while(x < 1 || x > 10) {
			String numberStr = JOptionPane.showInputDialog("Enter value between 1 and 10");
			if (numberStr == null) {
				System.exit(-1);
			}

			try {
				x = Integer.parseInt(numberStr);
			} catch(NumberFormatException e) {
				x = -1;
			} 
		}
		
		JFrame frame = new JFrame("Encryption application");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new EncryptionPanel(x);
		frame.add(panel);
		frame.setVisible(true);
	}
}
