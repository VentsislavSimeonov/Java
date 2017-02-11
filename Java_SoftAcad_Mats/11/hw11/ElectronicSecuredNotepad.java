package hw11;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IЕlectronicDevice{
	private boolean isOn;
	
	public ElectronicSecuredNotepad(String pass, int pageCount) {
		super(pass, pageCount);
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
			System.out.println("The device has already been stopped");
			return;
		}
		isOn = false;
	}

	@Override
	public boolean isStarted() {
		return isOn;
	}
	
	@Override
	public void writeOnPage(String text, int pageNumber) {
		if(isStarted()) {
			super.writeOnPage(text, pageNumber);
		} else {
			System.out.println("The device is switched off");
		}
	}
	
	@Override
	public void writeOverPage(String text, int pageNumber) {
		if(isStarted()) {
			super.writeOverPage(text, pageNumber);
		} else {
			System.out.println("The device is switched off");
		}
	}
	
	@Override
	public void deletePage(int pageNumber) {
		if(isStarted()) {
			super.deletePage(pageNumber);
		} else {
			System.out.println("The device is switched off");
		}
	}
	
	//...
}
