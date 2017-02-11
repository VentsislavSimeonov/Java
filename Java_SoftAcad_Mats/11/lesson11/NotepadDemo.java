package lesson11;

public class NotepadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Page page = new Page("Title");
		page.addText("to be deleted");
		page.deleteText();
		page.addText("here we have some text");
		page.addText(" and we have some moooore");
		System.out.println(page.viewPage());
		
		SimpleNotepad simpleNotepad = new SimpleNotepad(3);
		simpleNotepad.deletePage(15);
		simpleNotepad.addTextToPage("SOme text - page 1", 1);
		simpleNotepad.addTextToPage("text on page 2", 2);
		simpleNotepad.addTextToPage("text on page 3", 3);
		simpleNotepad.printAllPages();
		simpleNotepad.deletePage(3);
		simpleNotepad.printAllPages();
		
//		SecuredNotepad securedNotepad = new SecuredNotepad("ala", 3);
//		SimpleNotepad securedNotepad = new SecuredNotepad("ala", 3);
		INotepad securedNotepad = new SecuredNotepad("ala", 3);
		securedNotepad.deletePage(15);
		securedNotepad.addTextToPage("SOme text - page 1", 1);
		securedNotepad.addTextToPage("text on page 2", 2);
		securedNotepad.addTextToPage("text on page 3", 3);
		securedNotepad.printAllPages();
		securedNotepad.deletePage(3);
		securedNotepad.printAllPages();
		
		
	}

}
