package lesson11;

public interface INotepad {
	
	void addTextToPage(String text, int pageNumber);
	void replaceTextOnPage(String text, int pageNumber);
	void deletePage(int pageNumber);
	void printAllPages();
}
