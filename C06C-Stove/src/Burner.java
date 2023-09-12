/**
 * Burner class. 
 *  
 * @author Calvin Tran
 * @author Jonathan Nunez Toledo
 * @Date 9/11/23
 * 
 * Represents an individual stove burner with temperature and setting control.
 */
public class Burner {
    private Temperature myTemperature;
    private Setting mySetting;
    private int timer;

    public static final int TIME_DURATION = 2;

    /**
     * Enumeration representing the possible temperatures of the burner.
     */
    public enum Temperature {
        BLAZING,
        HOT,
        WARM,
        COLD
    }

    /**
     * Constructor to initialize the burner with default values (COLD and OFF).
     */
    public Burner() {
        this.myTemperature = Temperature.COLD;
        this.mySetting = Setting.OFF;
        this.timer = 0;
    }

    /**
     * Increase the setting of the burner (if not already at HIGH) and reset the timer.
     */
    public void plusButton() {
        switch (mySetting) {
            case OFF:
                mySetting = Setting.LOW;
                break;
            case LOW:
                mySetting = Setting.MEDIUM;
                break;
            case MEDIUM:
                mySetting = Setting.HIGH;
                break;
            case HIGH:
                break;
        }
        timer = TIME_DURATION;
    }

    /**
     * Decrease the setting of the burner (if not already OFF) and reset the timer.
     */
    public void minusButton() {
        switch (mySetting) {
            case OFF:
                break;
            case LOW:
                mySetting = Setting.OFF;
                break;
            case MEDIUM:
                mySetting = Setting.LOW;
                break;
            case HIGH:
                mySetting = Setting.MEDIUM;
                break;
        }
        timer = TIME_DURATION;
    }

    /**
     * Update the temperature of the burner based on the timer and setting.
     */
    public void updateTemperature() {
        if (timer > 0) {
            timer--;
            if (timer == 0) {
                switch (mySetting) {
                    case OFF:
                        myTemperature = Temperature.COLD;
                        break;
                    case LOW:
                        myTemperature = Temperature.WARM;
                        break;
                    case MEDIUM:
                        myTemperature = Temperature.HOT;
                        break;
                    case HIGH:
                        myTemperature = Temperature.BLAZING;
                        break;
                }
            }
        }
    }

    /**
     * Display the current status of the burner, including its setting and temperature.
     */
    public void display() {
        System.out.print("[" + mySetting.toString() + "]");
        switch (myTemperature) {
            case COLD:
                System.out.println("....cooool");
                break;
            case WARM:
                System.out.println(".....warm");
                break;
            case HOT:
                System.out.println(".....CAREFUL");
                break;
            case BLAZING:
                System.out.println("....VERY HOT! DON'T TOUCH");
                break;
        }
    }

    /**
     * Get the current temperature of the burner.
     *
     * @return The current temperature.
     */
    public Temperature getTemperature() {
        return myTemperature;
    }
}