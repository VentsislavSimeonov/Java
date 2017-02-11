package lesson11;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
	private final String password;
	
	public SecuredNotepad(String password, int pageCount) {
		super(pageCount);
		this.password = password;
	}
	
	private boolean isValidPassword() {
		System.out.println("Enter password:");
		Scanner sc = new Scanner(System.in);
		String enteredPass = sc.nextLine();
		if(enteredPass.equals(password)) {
			return true;
		} else {
			System.out.println("Wrong password!");
			return false;
		}
	}
	
	@Override
	public void addTextToPage(String text, int pageNumber) {
		if(isValidPassword()) {
			super.addTextToPage(text, pageNumber);
		}
	}
	
	@Override
	public void replaceTextOnPage(String text, int pageNumber) {
		if(isValidPassword()) {
			super.replaceTextOnPage(text, pageNumber);
		}
	}
	
	@Override
	public void deletePage(int pageNumber) {
		if(isValidPassword()) {
			super.deletePage(pageNumber);
		}
	}
	
	@Override
	public void printAllPages() {
		if(isValidPassword()) {
			super.printAllPages();
		}
	}
}
