package lesson18;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class CalculatorPanel extends JPanel {
	private JTextArea text;
	private ButtonsPanel buttonsPanel;
	
	private static final int TEXT_FONT_SIZE = 22;
	
	private StringBuilder upperText = new StringBuilder();
	private StringBuilder lowerText = new StringBuilder();
	private long result;
	private JButton operationButton = null;
	
	public CalculatorPanel() {
		setLayout(new BorderLayout());
		
		text = new JTextArea(2, 10);
		text.setEditable(false);
		text.setFont(new Font(text.getFont().getName(), Font.BOLD, TEXT_FONT_SIZE));
		add(text, BorderLayout.NORTH);
		buttonsPanel = new ButtonsPanel();
		add(buttonsPanel, BorderLayout.CENTER);
		
		operationButton = buttonsPanel.getPlus();
		
		addListeners();

	}
	
	private void addListeners() {
		// all digits listeners
		DigitButtonsListener digitListner = new DigitButtonsListener();
		for (int i = 0; i < buttonsPanel.getDigits().length; i++) {
			buttonsPanel.getDigits()[i].addActionListener(digitListner);
		}
		
		// all operations +, - , /, *
		OperationsListener operationsListener = new OperationsListener();
		buttonsPanel.getMinus().addActionListener(operationsListener);
		buttonsPanel.getPlus().addActionListener(operationsListener);
		buttonsPanel.getMulti().addActionListener(operationsListener);
		buttonsPanel.getDivision().addActionListener(operationsListener);
	}
	
	private class OperationsListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			
			upperText.append(lowerText).append(button.getText());
			
			long insertedValue = Long.valueOf(lowerText.toString());
			
			// ==, getText..
			switch (operationButton.getText()) {
				case "+" :
					result += insertedValue;
					break;
				case "*" :
					result *= insertedValue;
					break;
				case "/" : 
					result /= insertedValue;
					break;
				case "-" :
					result -= insertedValue;
					break;
			}
			
			operationButton = button;
			
			lowerText.setLength(0);

			refreshTextArea();
			System.out.println(result);
		}
		
	}

	private void refreshTextArea() {
		text.setText(upperText.toString() + "\n" + lowerText.toString());
	}
	
	private class DigitButtonsListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			lowerText.append(button.getText());
			refreshTextArea();
		}

	}

}
