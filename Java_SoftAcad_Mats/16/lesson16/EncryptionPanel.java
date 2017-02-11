package lesson16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EncryptionPanel extends JPanel {
	private static final String[] MODES = {"Encrypt", "Decrypt"};

	private static final int TEXT_AREA_ROWS = 8;

	private static final int TEXT_AREA_COLS = 10;
	
	private JComboBox mode;
	private JLabel label;
	private JTextField text;
	private JButton encrypt;
	private JButton clear;
	private JTextArea area;
	private int x;
	
	// private String currentMode = "Encrypt";
	
	public EncryptionPanel(int inputX) {
		
		this.x = inputX;
		
		mode = new JComboBox(MODES);
		mode.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// currentMode = (String)mode.getSelectedItem();
				encrypt.setText((String)mode.getSelectedItem());
			}
			
		});
		this.add(mode);
		
		label = new JLabel("Text to encrypt");
		this.add(label);
		
		text = new JTextField(10);
		this.add(text);
		
		encrypt = new JButton("Encrypt");
		encrypt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (text.getText().equals("Encrypt")) {
					String encryptedString = encrypt(text.getText());
					area.setText(encryptedString);
				} else if (text.getText().equals("Decrypt")) {
					String decryptedString = decrypt(text.getText());
					area.setText(decryptedString);
				}
				
				// ((JButton)e.getSource()).getText();
			}


		});
		clear = new JButton("Clear");
		
		this.add(encrypt);
		this.add(clear);
		
		area = new JTextArea(TEXT_AREA_ROWS, TEXT_AREA_COLS);
		JScrollPane scrollPane = new JScrollPane(area);
		// Find how to disable horizontal scroll?
		this.add(scrollPane);
		area.setEditable(false);
		
		clear.addActionListener(new ClearButtonListener());
	}
	
	private String encrypt(String text) {
		// TODO Auto-generated method stub
		return text;
		
	}
	
	private String decrypt(String text) {
		// TODO Auto-generated method stub
		return text;
	}
	
	private class ClearButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			area.setText("");
			text.setText("");
		}
		
	}
	
	private class InfoListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			e.getSource();
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
