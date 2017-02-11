package hw16;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
	private JLabel info;
	
	private int x;
	
	public EncryptionPanel(int x) {
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.x = x;
		
		mode = new JComboBox(MODES);
		this.add(mode);
		
		label = new JLabel("Text to encrypt");
		this.add(label);
		
		text = new JTextField(10);
		text.setName("myTextField");
		text.setToolTipText("Enter the word to be encrypted here");
		this.add(text);
		
		encrypt = new JButton("Encrypt");
		clear = new JButton("Clear");
		
		this.add(encrypt);
		this.add(clear);
		
		area = new JTextArea(TEXT_AREA_ROWS, TEXT_AREA_COLS);
		this.add(area);
		area.setEditable(false);
		
		info = new JLabel("");
		this.add(info);
		
		InfoListener infoListener = new InfoListener();
		clear.addMouseListener(infoListener);
		encrypt.addMouseListener(infoListener);
		text.addMouseListener(infoListener);
		area.addMouseListener(infoListener);
		mode.addMouseListener(infoListener);
		
		clear.addActionListener(new ClearButtonListener());
		
		mode.addActionListener(new ModeListener());
		
		encrypt.addActionListener(new EncryptListener());
	}
	
	private class ClearButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			area.setText("");
		}
	}
	
	private class InfoListener implements MouseListener {

		public void mouseClicked(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
			// e.getComponent().getName()
			if(e.getSource() == encrypt) {
				info.setText("This button encrypts the text");
			} else if(e.getSource() == clear) {
				info.setText("This button clears the text area");
			} else if(e.getSource() == mode) {
				info.setText("This combo change the modes");
			} else if(e.getSource() == area) {
				info.setText("This area shows the encrypted text");
			} else if(e.getSource() == text) {
				info.setText("Enter the word to be encrypted here");
			}
		}

		public void mouseExited(MouseEvent e) {
			info.setText("");
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseReleased(MouseEvent e) {
		}
		
	}
	
	private class ModeListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String selectedItem = (String)mode.getSelectedItem();
			
			if(selectedItem.equals(MODES[0])) {
				label.setText("Text to encrypt");
				encrypt.setText("Encrypt");
			} else {
				label.setText("Text to decrypt");
				encrypt.setText("Decrypt");
			}
		}
	}
	
	private class EncryptListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(encrypt.getText().equals("Encrypt")) {
				String result = encrypt(text.getText());
				area.setText(area.getText() + "\n" + text.getText() + " --> " + result);
			} else {
				String result = decrypt(text.getText());
				area.setText(area.getText() + "\n" + text.getText() + " <-- " + result);
			}
		}
		
	}
	
	private String encrypt(String textToEncrypt) {
		String result = "";
		
		for (int i = 0; i < textToEncrypt.length(); i++) {
			int oldSymbol = textToEncrypt.charAt(i);
			int newSymbol = oldSymbol + x + i;
			char c = (char)newSymbol;
			result += c;
		}
		return result;
	}
	
	private String decrypt(String textToDecrypt) {
		String result = "";
		
		for (int i = 0; i < textToDecrypt.length(); i++) {
			int oldSymbol = textToDecrypt.charAt(i);
			int newSymbol = oldSymbol - x - i;
			char c = (char)newSymbol;
			result += c;
		}
		return result;
	}
	
}
