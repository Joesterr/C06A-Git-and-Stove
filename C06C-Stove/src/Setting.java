/**
 * Setting class. 
 *  
 * @author Calvin Tran
 * @author Jonathan Nunez Toledo
 * @Date 9/11/23
 * 
 * Enumeration representing the different settings for a stove burner.
 */
public enum Setting {
    // Enum constants with their associated string representations
    OFF("---"),
    LOW("--+"),
    MEDIUM("-++"),
    HIGH("+++");

    // Instance variable to store the string representation
    private final String setting;

    /**
     * Constructor accepting a string representation for the setting.
     *
     * @param representation The string representation of the setting.
     */
    Setting(String representation) {
        this.setting = representation;
    }

    /**
     * Get the string representation of the setting.
     *
     * @return The string representation of the setting.
     */
    @Override
    public String toString() {
        return setting;
    }
}