package lesson10;

public class PhilipsRemoveControl implements IDVDRemoteController,
		ITVRemoveController, IWashingMachineRemote {
	private int battery = 100;
	
	public PhilipsRemoveControl(int battery) {
		this.battery = battery;
	}

	@Override
	public void startTV() {
		System.out.println("Philips Start tv");
	}

	@Override
	public void stopTV() {
		// TODO Auto-generated method stub

	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub

	}

	@Override
	public void goToChannel(int channelNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void play() {
		System.out.println("philips is playing");
	}

	@Override
	public void eject() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertDisk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void startWashing() {
		System.out.println("start washing mashine");
	}

}
