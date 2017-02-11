package lesson11;

public class SimpleNotepad implements INotepad {
	
	private final int DEFAULT_NUMBER_OF_PAGES = 10;
	private Page[] pages;
	
	public SimpleNotepad(int numberOfPages) {
		if (numberOfPages <= 0) {
			pages = new Page[DEFAULT_NUMBER_OF_PAGES]; 
		} else {
			pages = new Page[numberOfPages];
		}
		
		for (int i = 0; i < pages.length; i++) {
			// pages[i] = new Page("Title" + (i + 1));
			pages[i] = new Page("Title" + Integer.toString(i + 1));
		}
	}

	@Override
	public void addTextToPage(String text, int pageNumber) {
		if (!checkPageNumber(pageNumber)) {
			System.out.println("invalid page number.");
			return;
		}
		pages[pageNumber - 1].addText(text);
	}

	@Override
	public void replaceTextOnPage(String text, int pageNumber) {
		if (!checkPageNumber(pageNumber)) {
			System.out.println("invalid page number.");
			return;
		}
		pages[pageNumber - 1].deleteText();
		pages[pageNumber - 1].addText(text);
	}

	@Override
	public void deletePage(int pageNumber) {
		if (!checkPageNumber(pageNumber)) {
			System.out.println("invalid page number.");
			return;
		}
		pages[pageNumber - 1].deleteText();
	}

	@Override
	public void printAllPages() {
		for(int i = 0; i < pages.length; i++ ) {
			System.out.println(pages[i].viewPage());
			System.out.println();
		}
	}
	
	private boolean checkPageNumber(int pageNumber) {
		if (pageNumber < 0 || pageNumber > pages.length) {
			return false;
		}
		return true;
	}

}
