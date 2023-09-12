public enum Setting {
    // Enum constants with their associated string representations
    OFF("---"),
    LOW("--+"),
    MEDIUM("-++"),
    HIGH("+++");

    // Instance variable to store the string representation
    private final String setting;

    // Constructor accepting a string
    Setting(String representation) {
        this.setting = representation;
    }

    // Overridden toString method to return the string representation
    @Override
    public String toString() {
        return setting;
    }

}
