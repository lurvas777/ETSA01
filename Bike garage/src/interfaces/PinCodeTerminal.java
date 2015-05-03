package interfaces;

import garage.BicycleGarageManager;

/**
 * Interface for PinCodeTerminal.
 * 
 * @author lurvas777
 */
public interface PinCodeTerminal {//TODO implement methods
	
	public static final int RED_LED = 0,
							GREEN_LED = 1;	
	/** Register bicycle garage manager so that the pin code
	 * terminal knows which manager to call when a user has 
	 * pressed a key.
	 * 
	 * @param manager
	 */
	public void register(BicycleGarageManager manager);
	
	/** Turn on LED for lightTime seconds.
	 * Colour: 
	 * colour = RED_LED = 0 => red 
	 * colour = GREEN_LED = 1 => green 	
	 * 
	 * @param colour
	 * @param lightTime
	 */
	public void lightLED(int colour, int lightTime);


}
