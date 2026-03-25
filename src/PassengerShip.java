public class PassengerShip extends Ship implements PassengerServices {

    private int passengerCapacity;
    private int passengerCount;
    private int numberOfCabins;
    private boolean entertainment;

    public PassengerShip(String name, String registrationNumber, double tonnage, int crewSize,
                         double currentSpeed, String currentPort,
                         int passengerCapacity, int passengerCount, int numberOfCabins, boolean entertainment) {
        super(name, registrationNumber, tonnage, crewSize, currentSpeed, currentPort);
        this.passengerCapacity = passengerCapacity;
        this.passengerCount = passengerCount;
        this.numberOfCabins = numberOfCabins;
        this.entertainment = entertainment;
    }

    // docking = stop + update port, and then people get off
    @Override
    public void dock(String port) {
        super.dock(port);
        disembarkPassengers();
    }

    private void disembarkPassengers() {
        this.passengerCount = 0;
    }

    @Override
    public void startEntertainment() {
        if (entertainment) {
            System.out.println("Passenger ship " + getName() + " entertainment started.");
        } else {
            System.out.println("Passenger ship " + getName() + " has no entertainment.");
        }
    }

    @Override
    public String getPassengerManifest() {
        // for this lab we just return details as a string
        return "Passenger Manifest:\n"
                + "Ship: " + getName() + "\n"
                + "Passenger Count: " + passengerCount + "\n"
                + "Capacity: " + passengerCapacity + "\n";
    }

    @Override
    public String toString() {
        return "PassengerShip [name=" + getName()
                + ", registrationNumber=" + getRegistrationNumber()
                + ", tonnage=" + getTonnage()
                + ", crewSize=" + getCrewSize()
                + ", currentSpeed=" + getCurrentSpeed()
                + ", currentPort=" + getCurrentPort()
                + ", passengerCapacity=" + passengerCapacity
                + ", passengerCount=" + passengerCount
                + ", numberOfCabins=" + numberOfCabins
                + ", entertainment=" + entertainment + "]";
    }

    // getters + setters
    public int getPassengerCapacity() { return passengerCapacity; }
    public void setPassengerCapacity(int passengerCapacity) { this.passengerCapacity = passengerCapacity; }

    public int getPassengerCount() { return passengerCount; }
    public void setPassengerCount(int passengerCount) { this.passengerCount = passengerCount; }

    public int getNumberOfCabins() { return numberOfCabins; }
    public void setNumberOfCabins(int numberOfCabins) { this.numberOfCabins = numberOfCabins; }

    public boolean isEntertainment() { return entertainment; }
    public void setEntertainment(boolean entertainment) { this.entertainment = entertainment; }
}

