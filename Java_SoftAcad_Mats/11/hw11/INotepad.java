package hw11;

public interface INotepad {
	void writeOnPage(String text, int pageNumber);
	void writeOverPage(String text, int pageNumber);
	void deletePage(int pageNumber);
	void printAllPages();
	boolean searchWord(String word);
	void printAllPagesWithDigits();
}
