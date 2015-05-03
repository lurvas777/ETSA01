package garage;

import interfaces.BarcodePrinter;
import interfaces.ElectronicLock;
import interfaces.PinCodeTerminal;


/**
 * This class have to have certain methods according to the course homepage: http://cs.lth.se/etsa01/projekt-2015/specifikation-av-mjukvaran/
 * @author tfy11mj2
 * 
 */
public class BicycleGarageManager {//TODO implement methods specified by course homepage: http://cs.lth.se/etsa01/projekt-2015/specifikation-av-mjukvaran/
									//TODO make this class abstract maybe?

	/** Register hardware so that BicycleGarageManager
	 * knows which drivers to access. 
	 *
	 * @param printer
	 * @param entryLock
	 * @param exitLock
	 * @param terminal
	 */
	public void registerHardwareDrivers(BarcodePrinter printer,
	     ElectronicLock entryLock, ElectronicLock exitLock,
	     PinCodeTerminal terminal) {
	}

	
	/* Will be called when a user has used the bar code
	 * reader at the entry door. Bicycle ID should be a
	 * string of 5 characters, where every character
	 * can be '0', '1',... '9'. */
	
	/**
	 * @param bicycleID
	 */
	public void entryBarcode(String bicycleID) {
		System.out.println("hello this is dog");
	}

	/* Will be called when a user has used the bar code
	 * reader at the exit door. Bicycle ID should be a
	 * string of 5 characters, where every
	 * character can be '0', '1',... '9'. */
	
	/**
	 * @param bicycleID
	 */
	public void exitBarcode(String bicycleID) {
	}

	/* Will be called when a user has pressed a key at the
	 * keypad at the entry door. The following characters could be
	 * pressed: '0', '1',... '9', '*', '#'. */
	
	/**
	 * @param c
	 */
	public void entryCharacter(char c) {
	}
	
}
