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
	 * @param manager BicycleGarageManager to register.
	 */
	public void register(BicycleGarageManager manager);
	
	/** Turn on LED for lightTime seconds.
	 * Color: 
	 * red color: RED_LED = 0 
	 * green color: GREEN_LED = 1 	
	 * 
	 * @param colour Integer, the color specifies the LED light on the terminal which will light up.
	 * @param lightTime Integer, the time that the LED light will be lit.
	 */
	public void lightLED(int colour, int lightTime);

}
