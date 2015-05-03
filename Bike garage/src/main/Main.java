package main;

import operator.GUI;
import garage.BicycleGarageManager;
import testdrivers.BarcodePrinterTestDriver;
import testdrivers.BarcodeReaderEntryTestDriver;
import testdrivers.BarcodeReaderExitTestDriver;
import testdrivers.ElectronicLockTestDriver;
import testdrivers.PinCodeTerminalTestDriver;

/**
 * Class containing the main method for this project. This will lunch some test drivers, simulating the hardware, and a GUI for the operator.
 * 
 * @author tfy11mj2
 */
public class Main {

	/**
	 * Main method. Lunch test drivers and GUI.
	 * 
	 * @param args String array containing arguments. This method does not make any use of the arguments.
	 */
	public static void main(String[] args) {
		
		BicycleGarageManager BGM = new BicycleGarageManager();
		BarcodePrinterTestDriver BP = new BarcodePrinterTestDriver();
		BarcodeReaderEntryTestDriver BRentry = new BarcodeReaderEntryTestDriver();
		BarcodeReaderExitTestDriver BRexit = new BarcodeReaderExitTestDriver();
		PinCodeTerminalTestDriver PCT = new PinCodeTerminalTestDriver();
		ElectronicLockTestDriver ELentry = new ElectronicLockTestDriver("entry");
		ElectronicLockTestDriver ELexit = new ElectronicLockTestDriver("exit");
		
		BRentry.register(BGM);
		BRexit.register(BGM);
		PCT.register(BGM);
		
		GUI gui = new GUI();
	}

}
