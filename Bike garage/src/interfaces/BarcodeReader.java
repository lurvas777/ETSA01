package interfaces;

import garage.BicycleGarageManager;

/**
 * Interface for BarcodeReader
 * 
 * @author lurvas777
 */
public interface BarcodeReader {//TODO implement method
	
	/** 
	 * Register bicycle garage manager so that the bar code
	 * reader knows which manager to call when a user has used 
	 * the reader. 
	 * 
	 * @param manager BicycleGarageManager to register.
	 */
	public void register(BicycleGarageManager manager);	
}
