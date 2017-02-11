package hw11;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad{
	private final String password;
	
	protected SecuredNotepad(String password, int pageCount) {
		super(pageCount);
		this.password = password;
	}
	
	public static SecuredNotepad createInstance(String password, int pageCount) {
		if(isStrongPassword(password)) {
			return new SecuredNotepad(password, pageCount);
		}
		return null;
	}
	
	private boolean isValidPassword() {
		//The user enters password
		System.out.println("Enter password:");
		Scanner sc = new Scanner(System.in);
		//read the pass
		String enteredPass = sc.nextLine();
		//compare the password with the one in the notepad
		if(enteredPass.equals(password)) {
			return true;
		} else {
			System.out.println("Wrong password!");
			return false;
		}
	}
	
	@Override
	public void writeOnPage(String text, int pageNumber) {
		if(isValidPassword()) {
			super.writeOnPage(text, pageNumber);
		}
	}
	
	@Override
	public void writeOverPage(String text, int pageNumber) {
		if(isValidPassword()) {
			super.writeOverPage(text, pageNumber);
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
	
	private static boolean isStrongPassword(String pass) {
		//check password's length
		if(pass.length() < 5) {
			return false;
		}
		//check if the pass contains digit
		if(!containsSybmol(pass, '0', '9')) {
			return false;
		}
		//check if the pass contains lower case
		if(!containsSybmol(pass, 'a', 'z')) {
			return false;
		}
		//check if the pass contains upper case
		if(!containsSybmol(pass, 'A', 'Z')) {
			return false;
		}
			
		return true;
	}
	
	private static boolean containsSybmol(String text, char start, char end) {
		for (int i = 0; i < text.length(); i++) {
			if(start <= text.charAt(i) && text.charAt(i) <= end) {
				return true;
			}
		}
		return false;
	}
}
