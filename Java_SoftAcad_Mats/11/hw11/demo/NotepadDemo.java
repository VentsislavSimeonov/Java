package hw11.demo;

import hw11.INotepad;
import hw11.SecuredNotepad;

public class NotepadDemo {
	public static void main(String[] args) {
		
		//INotepad securedNotepad = new SecuredNotepad("Soft-acad", 5);
		// INotepad securedNotepad = SecuredNotepad.createInstance("Soft-Acad*321", 20);
//		securedNotepad.writeOnPage("abc", -1);
//		securedNotepad.writeOnPage("abc", 2);
//		securedNotepad.printAllPages();
//		System.out.println("search for abc: " + securedNotepad.searchWord("abc"));
//		System.out.println("search for dd: " + securedNotepad.searchWord("dd"));
//		INotepad notepad = new ElectronicSecuredNotepad("Soft-Acad", 10);
//		((IЕlectronicDevice)notepad).start();
//		((IЕlectronicDevice)notepad).isStarted();
		// or just: ElectronicSecuredNotepad electronicNotepad = new ElectronicSecuredNotepad("Soft-Acad*321", 10);
//		notepad.writeOnPage("abcd", 1);
//		notepad.writeOnPage("ABC", 2);
//		notepad.writeOnPage("1234", 3);
//		notepad.printAllPages();
		
		
		// notepad = new SimpleNotepad(2);
		//INotepad notepad = new SecuredNotepad("dfsfsdfsdfsdf", 123);
		INotepad notepad2 = SecuredNotepad.createInstance("StrongPaword", 10);
		System.out.println(notepad2 == null);
		notepad2 = SecuredNotepad.createInstance("StrongPa55word", 10);
		notepad2.printAllPages();
		System.out.println(notepad2 == null);
	}
}
