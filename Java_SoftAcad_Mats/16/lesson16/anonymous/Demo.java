package lesson16.anonymous;

public class Demo {
	public static void main(String[] args) {
		Book book = new Book();
		
		Page page1 = new Page();
		ReadedPage page2 = new ReadedPage();
		ReadedPage page3 = new ReadedPage();
		
		book.addNewPage(page1);
		book.addNewPage(page2);
		
		book.addNewPage(new Page() {
			private boolean isReaded;
			
			public boolean isReaded() {
				return isReaded;
			}
		});
		
	}
}
