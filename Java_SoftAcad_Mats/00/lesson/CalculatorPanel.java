package lesson;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CalculatorPanel extends JPanel {
	private static final int TEXT_FONT = 22;
	private JTextArea text;
	private ButtonsPanel buttonsPanel;
	private StringBuilder upText;
	private StringBuilder downText;
	
	private int result;
	private char action;
	
	public CalculatorPanel() {
		setLayout(new BorderLayout());
		
		text = new JTextArea(2, 10);
		text.setFont(new Font(text.getFont().getName(), Font.BOLD, TEXT_FONT));
		add(text, BorderLayout.NORTH);
		buttonsPanel = new ButtonsPanel();
		add(buttonsPanel, BorderLayout.CENTER);
		
		addListeners();
		
		result = 0;
		action = '+';
		
		upText = new StringBuilder();
		downText = new StringBuilder();
	}
	
	private void addListeners() {
		DigitButtonsListener digitList = new DigitButtonsListener();
		for (int i = 0; i < buttonsPanel.getDigits().length; i++) {
			buttonsPanel.getDigits()[i].addActionListener(digitList);
		}
		
		ActionButtonsListener actionButtonListener = new ActionButtonsListener();
		buttonsPanel.getPlus().addActionListener(actionButtonListener);
		buttonsPanel.getMinus().addActionListener(actionButtonListener);
		buttonsPanel.getMulti().addActionListener(actionButtonListener);
		buttonsPanel.getDivision().addActionListener(actionButtonListener);
	}

	private void refreshTextArea() {
		text.setText(upText + "\n" + downText);
	}
	
	private class DigitButtonsListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			downText.append(button.getText());
			refreshTextArea();
		}
	}
	
	private class ActionButtonsListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int newMember = Integer.parseInt(downText.toString());
			
			switch (action) {
				case '+':
					result += newMember;
					break;
				case '-':
					result -= newMember;
					break;
				case '*':
					result *= newMember;
					break;
				case '/':
					result /= newMember;
					break;
			//..
			}
//			if(action == '+') {
//				
//			} else if(action == '-') {
//				result -= newMember;
//			}
			
			JButton button = (JButton)e.getSource();
			action = button.getText().charAt(0);
			
			upText.append(newMember).append(action);
			downText.setLength(0);
//			downText.append(result);
			refreshTextArea();
			System.out.println("result " + result);
			System.out.println("action " + action);
		}
		
	}
}
