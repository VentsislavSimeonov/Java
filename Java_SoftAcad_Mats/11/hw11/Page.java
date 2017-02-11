package hw11;

public class Page {
	private String title;
	private String text;
	
	public Page(String title, String text) {
		this.title = title;
		this.text = text;
	}
	
	public void addText(String text) {
		//this.text += text;
		this.text = this.text + text;
		//this.text = this.text.concat(text);
	}
	
	public void deleteText() {
		this.text = "";
	}
	
	public String viewPage() {
		return title + "\n" + text;
	}
	
	public boolean searchWord(String word) {
		return text.contains(word);
	}
	
	public boolean contaisDigit() {
		for (int i = 0; i < text.length(); i++) {
			// if (Character.isDigit(text.charAt(i)))
			if(text.charAt(i) >= '0' && text.charAt(i) <= '9') {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return this.title;
	}
}
