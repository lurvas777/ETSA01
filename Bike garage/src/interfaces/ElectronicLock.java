package interfaces;

/**
 * Interface for ElectronicLcok
 * 
 * @author lurvas777
 */
public interface ElectronicLock {//TODO implement method
	
	/** Open the lock for timeOpen seconds.
	 * 
	 * @param timeOpen Integer, the time to open the lock in seconds.
	 */
	public void open(int timeOpen);
}
