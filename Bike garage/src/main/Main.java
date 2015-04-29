package main;

import garage.BicycleGarageManager;
import testdrivers.BarcodePrinterTestDriver;
import testdrivers.BarcodeReaderEntryTestDriver;
import testdrivers.BarcodeReaderExitTestDriver;
import testdrivers.PinCodeTerminalTestDriver;

/**
 * @author tfy11mj2
 *
 */
public class Main {

	/**
	 * @param args
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
		
	}

}
