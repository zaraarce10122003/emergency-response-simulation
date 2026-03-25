public class RescueHelicopter implements EmergencySupport {

    private String callSign;
    private String baseLocation;
    private int medicalKits;
    private double altitude;
    private double currentSpeed;
    private boolean hasRescueHoist;

    public RescueHelicopter(String callSign, String baseLocation, int medicalKits,
                            double altitude, double currentSpeed, boolean hasRescueHoist) {
        this.callSign = callSign;
        this.baseLocation = baseLocation;
        this.medicalKits = medicalKits;
        this.altitude = altitude;
        this.currentSpeed = currentSpeed;
        this.hasRescueHoist = hasRescueHoist;
    }

    @Override
    public void deployAid() {
        System.out.println("Rescue helicopter " + callSign + " deploying " + medicalKits + " medical kits.");
        this.medicalKits = 0;
    }

    @Override
    public String getEmergencyReadinessReport() {
        return "Helicopter Emergency Report:\n"
                + "Call Sign: " + callSign + "\n"
                + "Base Location: " + baseLocation + "\n"
                + "Medical Kits: " + medicalKits + "\n"
                + "Rescue Hoist: " + (hasRescueHoist ? "Available" : "Not Available") + "\n";
    }

    @Override
    public String toString() {
        return "RescueHelicopter [callSign='" + callSign + '\''
                + ", baseLocation='" + baseLocation + '\''
                + ", currentSpeed=" + currentSpeed
                + ", altitude=" + altitude
                + ", medicalKits=" + medicalKits
                + ", hasRescueHoist=" + hasRescueHoist + " ]";
    }

    // getters + setters
    public String getCallSign() { return callSign; }
    public void setCallSign(String callSign) { this.callSign = callSign; }

    public String getBaseLocation() { return baseLocation; }
    public void setBaseLocation(String baseLocation) { this.baseLocation = baseLocation; }

    public int getMedicalKits() { return medicalKits; }
    public void setMedicalKits(int medicalKits) { this.medicalKits = medicalKits; }

    public double getAltitude() { return altitude; }
    public void setAltitude(double altitude) { this.altitude = altitude; }

    public double getCurrentSpeed() { return currentSpeed; }
    public void setCurrentSpeed(double currentSpeed) { this.currentSpeed = currentSpeed; }

    public boolean isHasRescueHoist() { return hasRescueHoist; }
    public void setHasRescueHoist(boolean hasRescueHoist) { this.hasRescueHoist = hasRescueHoist; }
}
