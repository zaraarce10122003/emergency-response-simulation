public class AidShip extends Ship implements EmergencySupport {

    private String aidType;
    private int suppliesOnBoard;
    private boolean hasHelipad;

    public AidShip(String name, String registrationNumber, double tonnage, int crewSize,
                   double currentSpeed, String currentPort,
                   String aidType, int suppliesOnBoard, boolean hasHelipad) {
        super(name, registrationNumber, tonnage, crewSize, currentSpeed, currentPort);
        this.aidType = aidType;
        this.suppliesOnBoard = suppliesOnBoard;
        this.hasHelipad = hasHelipad;
    }

    // same docking behavior, but also unload supplies after docking
    @Override
    public void dock(String port) {
        super.dock(port);
        unloadSupplies();
    }
    private void unloadSupplies() {
        this.suppliesOnBoard = 0;
    }

    @Override
    public void deployAid() {
        System.out.println("Aid Ship " + getName() + " is deploying " + suppliesOnBoard
                + " units of " + aidType + " aid.");
        unloadSupplies();
    }

    @Override
    public String getEmergencyReadinessReport() {
        return "Ship Emergency Report:\n"
                + "Name: " + getName() + "\n"
                + "Aid Type: " + aidType + "\n"
                + "Supplies on Board: " + suppliesOnBoard + "\n"
                + "Helipad: " + (hasHelipad ? "Available" : "Not Available") + "\n";
    }

    @Override
    public String toString() {
        return "Ship [name=" + getName()
                + ", registrationNumber=" + getRegistrationNumber()
                + ", tonnage=" + getTonnage()
                + ", crewSize=" + getCrewSize()
                + ", currentSpeed=" + getCurrentSpeed()
                + ", currentPort=" + getCurrentPort()
                + ", aidType=" + aidType
                + ", suppliesOnBoard=" + suppliesOnBoard
                + ", hasHelipad=" + hasHelipad + " ]";
    }

    // getters + setters
    public String getAidType() { return aidType; }
    public void setAidType(String aidType) { this.aidType = aidType; }

    public int getSuppliesOnBoard() { return suppliesOnBoard; }
    public void setSuppliesOnBoard(int suppliesOnBoard) { this.suppliesOnBoard = suppliesOnBoard; }

    public boolean isHasHelipad() { return hasHelipad; }
    public void setHasHelipad(boolean hasHelipad) { this.hasHelipad = hasHelipad; }
}