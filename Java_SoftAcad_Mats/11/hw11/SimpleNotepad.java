package hw11;

public class SimpleNotepad implements INotepad{
	public final static int DEFAULT_PAGE_NUMBER = 10; 
	private Page[] pages;
	
	public SimpleNotepad(int numberPages){
		if (numberPages <= 0) {
			numberPages = DEFAULT_PAGE_NUMBER;
		}
		pages = new Page[numberPages];
		for (int i = 0; i < pages.length; i++) {
			pages[i] = new Page("Page " + (i + 1), "");
		}
	}
	
	@Override
	public void writeOnPage(String text, int pageNumber) {
		if(isValidPageNumber(pageNumber)) {
			pages[pageNumber - 1].addText(text);
		}
	}

	@Override
	public void writeOverPage(String text, int pageNumber) {
		if(isValidPageNumber(pageNumber)) {
			pages[pageNumber - 1].deleteText();
			pages[pageNumber - 1].addText(text);
		}
	}

	@Override
	public void deletePage(int pageNumber) {
		if(isValidPageNumber(pageNumber)) {
			pages[pageNumber - 1].deleteText();
		}
	}

	@Override
	public void printAllPages() {
		for (int i = 0; i < pages.length; i++) {
			System.out.println(pages[i].viewPage());
			System.out.println();
		}
	}
	
	private boolean isValidPageNumber(int pageNumber) {
		if(pageNumber > 0 && pageNumber <= pages.length) {
			return true;
		}
		System.out.println("Wrong page number!");
		return false;
	}
	
	@Override
	public boolean searchWord(String word) {
		for (int i = 0; i < pages.length; i++) {
			if(pages[i].searchWord(word)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < pages.length; i++) {
			if(pages[i].contaisDigit()) {
				System.out.println(pages[i].viewPage());
			}
		}
		
	}

}
