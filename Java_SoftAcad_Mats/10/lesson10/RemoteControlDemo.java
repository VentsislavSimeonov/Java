package lesson10;

public class RemoteControlDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SumsungDVDRemoteController sumsung = new SumsungDVDRemoteController();
		PhilipsRemoveControl philips = new PhilipsRemoveControl(100);
		SonyDVDRemoteController sony = new SonyDVDRemoteController();
		
		IDVDRemoteController dvdRemoteController1 = sumsung;
		IDVDRemoteController dvdRemoteController2 = philips;
		IDVDRemoteController dvdRemoteController3 = sony;
		
		dvdRemoteController2.play();
		
		// ITVRemoveController tvRemote1 = sumsung;
		ITVRemoveController tvRemote2 = philips;
		// ITVRemoveController tvRemote3 = sony;
		
		if (tvRemote2 instanceof IDVDRemoteController) {
			((IDVDRemoteController) tvRemote2).insertDisk();
		}
		
		IDVDRemoteController[] dvdRemoteArray = new IDVDRemoteController[5];
		dvdRemoteArray[0] = sumsung;
		dvdRemoteArray[1] = sony;
		dvdRemoteArray[2] = philips;
		
		for (IDVDRemoteController remote : dvdRemoteArray) {
			if (remote != null) {
				remote.play();
			}
		}

	}

}
