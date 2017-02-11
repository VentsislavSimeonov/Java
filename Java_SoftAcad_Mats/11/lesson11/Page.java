package lesson11;

public class Page {

	private String title = "";
	private String text = "";
	
	public Page(String title) {
		this.title = title;
	}
	
	public void addText(String text) {
		this.text += text;
	}
	
	public void deleteText() {
		this.text = "";
	}
	
	public String viewPage() {
		return title + "\n" + text;
	}
}
