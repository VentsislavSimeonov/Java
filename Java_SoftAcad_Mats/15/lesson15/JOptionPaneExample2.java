package lesson15;

import javax.swing.JOptionPane;

import hw11.Page;

public class JOptionPaneExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] cars = {"BMW", "Mercedes", "Bentley", "Golf"};
		String chosenCar = (String)JOptionPane.showInputDialog(null, "Which is your favourite car?",
				"Choose car", JOptionPane.QUESTION_MESSAGE, null, cars, "BMW");
		
		System.out.println(chosenCar);
		
		Page[] pages = new Page[2];
		pages[0] = new Page("Page 1", "Text of the first page");
		pages[1] = new Page("Page 2", "Text of the second page");
		
		Page page = (Page)JOptionPane.showInputDialog(null, "Please, choose page?", "Choose page",
				JOptionPane.QUESTION_MESSAGE, null, pages, pages[1]);
		System.out.println(page.viewPage());

	}

}
