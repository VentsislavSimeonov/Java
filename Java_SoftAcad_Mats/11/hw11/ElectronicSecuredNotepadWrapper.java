package hw11;

public class ElectronicSecuredNotepadWrapper implements INotepad, IЕlectronicDevice{
	private SecuredNotepad securedNotepad;
	private boolean isOn;
	
	private ElectronicSecuredNotepadWrapper(SecuredNotepad securedNotepad) {
		this.securedNotepad = securedNotepad;
	}
	
	public static ElectronicSecuredNotepadWrapper createInstance(String pass, int pageCount) {
		SecuredNotepad securedNotepad = SecuredNotepad.createInstance(pass, pageCount);
		if(securedNotepad == null) {
			return null;
		}
		return new ElectronicSecuredNotepadWrapper(securedNotepad);
	}

	@Override
	public void writeOnPage(String text, int pageNumber) {
		if(isOn) {
			securedNotepad.writeOnPage(text, pageNumber);
		}
		
	}

	@Override
	public void writeOverPage(String text, int pageNumber) {
		if(isOn) {
			securedNotepad.writeOverPage(text, pageNumber);
		}
	}

	@Override
	public void deletePage(int pageNumber) {
		if(isOn) {
			securedNotepad.deletePage(pageNumber);
		}
		
	}

	@Override
	public void printAllPages() {
		if(isOn) {
			securedNotepad.printAllPages();
		}
		
	}

	@Override
	public boolean searchWord(String word) {
		if(isOn) {
			return securedNotepad.searchWord(word);
		}
		//this should throw exception
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if(isOn) {
			securedNotepad.printAllPagesWithDigits();
		}
		
	}
	
	@Override
	public void start() {
		if(isOn) {
			System.out.println("The device has already been started");
			return;
		}
		isOn = true;		
	}

	@Override
	public void stop() {
		if(!isOn) {
			System.out.println("The device has already been stoped");
			return;
		}
		isOn = false;
	}

	@Override
	public boolean isStarted() {
		return isOn;
	}
	
}
