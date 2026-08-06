class Thermostat {

    // Private variables
    private String location;
    private int temperature;

    // Constants
    private static final int MIN = 16;
    private static final int MAX = 30;

    // Static variable
    private static int activeCount = 0;

    // Constructor with location and startTemp
    public Thermostat(String location, int startTemp) {
        this.location = location;

        if (startTemp >= MIN && startTemp <= MAX) {
            this.temperature = startTemp;
        } else {
            this.temperature = 22;
        }

        activeCount++;
    }

    // Constructor with only location
    public Thermostat(String location) {
        this(location, 22);
    }

    // Raise temperature
    public void raise() {
        if (temperature < MAX) {
            temperature++;
        } else {
            System.out.println("Already at maximum (30)");
        }
    }

    // Lower temperature
    public void lower() {
        if (temperature > MIN) {
            temperature--;
        } else {
            System.out.println("Already at minimum (16)");
        }
    }

    // Getter
    public int getTemperature() {
        return temperature;
    }

    // Static getter
    public static int getActiveCount() {
        return activeCount;
    }

    // Main method
    public static void main(String[] args) {

        Thermostat t1 = new Thermostat("Living Room", 25);
        Thermostat t2 = new Thermostat("Bedroom");

        System.out.println("Initial Temperature: " + t1.getTemperature());

        // Raise 10 times
        System.out.println("\nRaising Temperature:");
        for (int i = 1; i <= 10; i++) {
            t1.raise();
            System.out.println("Temperature = " + t1.getTemperature());
        }

        // Lower 20 times
        System.out.println("\nLowering Temperature:");
        for (int i = 1; i <= 20; i++) {
            t1.lower();
            System.out.println("Temperature = " + t1.getTemperature());
        }

        // Active count
        System.out.println("\nActive Thermostats = " + Thermostat.getActiveCount());
    }
}