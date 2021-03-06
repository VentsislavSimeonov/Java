package lesson16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChristmasPanel extends JPanel {
	private JLabel text;
	private JButton button;
	private JButton button2;
	private String xMas = "Merry Christmas.";
	
	public ChristmasPanel() {
		button = new JButton("click me");
		this.add(button);
		
		button2 = new JButton("click me 2");
		this.add(button2);
		
		text = new JLabel();
		this.add(text);
		//text = new JLabel("MERRY CHRISTMAS AND HAPPY NEW YEAR!");
		//text.setVisible(false);
		
		ButtonListener listener = new ButtonListener();
		button.addActionListener(listener);
		button2.addActionListener(listener);
		
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("anonymous listener was called.");
				text.setText(xMas);
				//text.setVisible(true);
				//text.setText(text.getText() + " MERRY CHRISTMAS AND HAPPY NEW YEAR!");
			}
		});
		

	}
	
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Inner class was called.");
			if (e.getSource() instanceof JButton) {
				text.setText(((JButton)e.getSource()).getText());
			}
			//text.setVisible(true);
			//text.setText(text.getText() + " MERRY CHRISTMAS AND HAPPY NEW YEAR!");
		}
	}
}
