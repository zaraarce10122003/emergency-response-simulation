public abstract class Ship implements Navigable{

    private String name;
    private String registrationNumber;
    private double tonnage;
    private int crewSize;
    private double currentSpeed;
    private String currentPort;

    public Ship(String name, String registrationNumber, double tonnage, int crewSize,
                double currentSpeed, String currentPort) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.tonnage = tonnage;
        this.crewSize = crewSize;
        this.currentSpeed = currentSpeed;
        this.currentPort = currentPort;
    }

    //TODO: u might need other constructors

public void dock(String port){
    this.currentPort = currentPort;
    this.currentSpeed = 0;
    }

    //TOD: toString method and all setters and getters
    @Override
    public void navigateTo(String destination) {
        // simple simulation: just update where it is
        this.currentPort = destination;
    }

    @Override
    public void setCurrentSpeed(double speed) {
        this.currentSpeed = speed;
    }

    @Override
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String toString() {
        return "Ship [name=" + name
                + ", registrationNumber=" + registrationNumber
                + ", tonnage=" + tonnage
                + ", crewSize=" + crewSize
                + ", currentSpeed=" + currentSpeed
                + ", currentPort=" + currentPort + "]";
    }

    // getters + setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }

    public double getTonnage() { return tonnage; }
    public void setTonnage(double tonnage) { this.tonnage = tonnage; }

    public int getCrewSize() { return crewSize; }
    public void setCrewSize(int crewSize) { this.crewSize = crewSize; }

    public String getCurrentPort() { return currentPort; }
    public void setCurrentPort(String currentPort) { this.currentPort = currentPort; }
}
