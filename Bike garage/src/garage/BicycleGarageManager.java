package garage;

import interfaces.BarcodePrinter;
import interfaces.BarcodeReader;
import interfaces.Database;
import interfaces.ElectronicLock;
import interfaces.PinCodeTerminal;

/**
 * This Class is the bridge between the hardware drivers and the program. The
 * drivers execute certain methods when used, these are then called in this
 * class. For a driver to be able to use the methods in BicycleGarageManager it
 * has to register the manager first. This should be done right after
 * initializing the object (driver). The BicycleGarageManager also have to
 * register the drivers so that it can access the public methods in those
 * objects (drivers).
 * 
 * This class have to have certain methods according to the course homepage:
 * http://cs.lth.se/etsa01/projekt-2015/specifikation-av-mjukvaran/
 * 
 * @author lurvas777
 * 
 */
public class BicycleGarageManager {// TODO implement methods specified by course
									// homepage:
									// http://cs.lth.se/etsa01/projekt-2015/specifikation-av-mjukvaran/
	
	private BarcodePrinter printer;
	private BarcodeReader reader;
	private ElectronicLock entryLock, exitLock;
	private PinCodeTerminal terminal;
	private Database database;

	/**
	 * Register hardware so that the BicycleGarageManager knows which drivers to
	 * access.
	 *
	 * @param printer
	 *            BarcodePrinter that should be registered.
	 * @param entryLock
	 *            ElectronicLock for the entry.
	 * @param exitLock
	 *            ElectronicLock for the exit.
	 * @param terminal
	 *            PinCodeTerminal for the entry door.
	 */
	public void registerHardwareDrivers(BarcodePrinter printer,
			ElectronicLock entryLock, ElectronicLock exitLock,
			PinCodeTerminal terminal) {

		this.printer = printer;
		this.entryLock = entryLock;
		this.exitLock = exitLock;
		this.terminal = terminal;
	}

	/**
	 * This method will be called when a user has used the bar code reader at
	 * the entry door. Bicycle ID should be a string of 5 characters, where
	 * every character can be '0', '1',... '9'.
	 *
	 * @param bicycleID
	 *            String representing the ID for a bicycle
	 */
	public void entryBarcode(String bicycleID) {
		//hoho asdf
	}

	/**
	 * Will be called when a user has used the bar code reader at the exit door.
	 * Bicycle ID should be a string of 5 characters, where every character can
	 * be '0', '1',... '9'.
	 * 
	 * @param bicycleID
	 *            String representing the ID for a bicycle
	 */
	public void exitBarcode(String bicycleID) {
	}

	/**
	 * Will be called when a user has pressed a key at the keypad at the entry
	 * door. The following characters could be pressed: '0', '1',... '9', '*',
	 * '#'.
	 * 
	 * @param c
	 *            Char that was entered. This car can be anything of the
	 *            following: '0', '1',... '9', '*', '#'.
	 */
	public void entryCharacter(char c) {
		// Test
		//2
	}
}
