package interfaces;

public interface BarcodePrinter {//TODO implement method
	
	/* Print a bicycleID as a barcode.
	 * Bicycle ID should be a string of 5 characters, where every 
	 * character can be '0', '1',... '9'. */

	/**
	 * @param bicycleID
	 */
	public void printBarcode(String bicycleID);
}
