package interfaces;

/**
 * Interface for BarcodePrinter.
 * @author lurvas777
 */
public interface BarcodePrinter {//TODO implement method
	
	/** Print a bicycleID as a barcode.
	 * Bicycle ID should be a string of 5 characters, where every 
	 * character can be '0', '1',... '9'. 
	 * 
	 * @param bicycleID String representing the ID of a bicycle.
	 */
	public void printBarcode(String bicycleID);
}
