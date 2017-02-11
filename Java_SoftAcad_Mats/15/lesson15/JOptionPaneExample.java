package lesson15;

import javax.swing.JOptionPane;

public class JOptionPaneExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// JOptionPane.showMessageDialog(null, "Some text to display");
//		 JOptionPane.showMessageDialog(null, "Some message", "Test",
//				JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Some message biiiig messsssAAAAgggggggggggggggeeeeet tttttttt", "Test for the bla bla",
//				JOptionPane.QUESTION_MESSAGE);
	
//		//user input with yes no
//		int choice = JOptionPane.showConfirmDialog(null, "Are you female?");
//		System.out.println(choice);
		
//		//user input
//		String name = JOptionPane.showInputDialog("Enter your name");
//			System.out.println(name);
		String name = JOptionPane.showInputDialog(null, "Enter your family name", 
				"Some title", JOptionPane.QUESTION_MESSAGE);
		System.out.println(name);
	}

}
