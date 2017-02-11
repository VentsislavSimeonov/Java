package hw11;

public interface IЕlectronicDevice {
	void start();
	void stop();
	/**
	 * Returns true if electronic device is started.
	 * @return true if started. Otherwise - false.
	 */
	boolean isStarted();
}
