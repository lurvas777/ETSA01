package main;

import operator.GUI;
import garage.BicycleGarageManager;
import testdrivers.BarcodePrinterTestDriver;
import testdrivers.BarcodeReaderEntryTestDriver;
import testdrivers.BarcodeReaderExitTestDriver;
import testdrivers.PinCodeTerminalTestDriver;

/**
 * Class containing the main method for this project. This will lunch some test drivers, simulating the hardware, and a GUI for the operator.
 * 
 * @author tfy11mj2
 */
public class Main {

	/**
	 * Main method. Lunches test drivers and GUI.
	 * 
	 * @param args String array containing arguments. This method does not make any use of the arguments.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BicycleGarageManager BGM = new BicycleGarageManager();
		BarcodePrinterTestDriver BP = new BarcodePrinterTestDriver();
		BarcodeReaderEntryTestDriver BRE = new BarcodeReaderEntryTestDriver();
		BarcodeReaderExitTestDriver BREx = new BarcodeReaderExitTestDriver();
		PinCodeTerminalTestDriver PCT = new PinCodeTerminalTestDriver();
		
		BRE.register(BGM);
		BREx.register(BGM);
		PCT.register(BGM);
		
		GUI gui = new GUI();
	}

}
