package lesson;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel{
	private static final int ROWS = 4;
	private static final int COLUMNS = 4;
	private static final int DIGITS_BUTTONS_COUNT = 10;
	private static final int VERTICAL_GAP = 10;
	private static final int HORIZONTAL_GAP = 10;
	private static final int BUTTONS_FONT = 25;
	
	private JButton[] digits;
	private JButton plus;
	private JButton minus;
	private JButton division;
	private JButton multi;
	private JButton equals;
	private JButton ce;
	
	public ButtonsPanel() {
		setLayout(new GridLayout(ROWS, COLUMNS, VERTICAL_GAP, HORIZONTAL_GAP));
		
		
		Font buttonsFont = null;
		digits = new JButton[DIGITS_BUTTONS_COUNT];
		for (int i = 0; i < digits.length; i++) {
			//init the digit buttons
			digits[i] = new JButton("" + i);
			buttonsFont = new Font(digits[0].getFont().getName(), Font.BOLD, BUTTONS_FONT);
			digits[i].setFont(buttonsFont);
		}
		plus = new JButton("+");
		plus.setFont(buttonsFont);
		minus = new JButton("-");
		minus.setFont(buttonsFont);
		division = new JButton("/");
		division.setFont(buttonsFont);
		multi = new JButton("*");
		multi.setFont(buttonsFont);
		equals = new JButton("=");
		equals.setFont(buttonsFont);
		ce = new JButton("C");
		ce.setFont(buttonsFont);
		
		//add the buttons to the grid
		add(digits[7]);
		add(digits[8]);
		add(digits[9]);
		add(plus);
		
		add(digits[4]);
		add(digits[5]);
		add(digits[6]);
		add(minus);
		
		add(digits[1]);
		add(digits[2]);
		add(digits[3]);
		add(multi);
		
		add(digits[0]);
		add(ce);
		add(equals);
		add(division);
		
	}
	
	public JButton[] getDigits() {
		return digits;
	}

	public static int getRows() {
		return ROWS;
	}

	public static int getColumns() {
		return COLUMNS;
	}

	public static int getDigitsButtonsCount() {
		return DIGITS_BUTTONS_COUNT;
	}

	public static int getVerticalGap() {
		return VERTICAL_GAP;
	}

	public static int getHorizontalGap() {
		return HORIZONTAL_GAP;
	}

	public static int getButtonsFont() {
		return BUTTONS_FONT;
	}

	public JButton getPlus() {
		return plus;
	}

	public JButton getMinus() {
		return minus;
	}

	public JButton getDivision() {
		return division;
	}

	public JButton getMulti() {
		return multi;
	}

	public JButton getEquals() {
		return equals;
	}

	public JButton getCe() {
		return ce;
	}
}
