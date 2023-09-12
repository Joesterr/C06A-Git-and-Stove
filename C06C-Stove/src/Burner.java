public class Burner {
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	
	public static final int TIME_DURATION = 2;
	
	public enum Temperature {
		BLAZING,
		HOT,
		WARM,
		COLD
	}
	
    public Burner() {
        this.myTemperature = Temperature.COLD;
        this.mySetting = Setting.OFF;
        this.timer = 0;
    }
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
	
	public Temperature getTemperature() {
		return myTemperature;
	}
}