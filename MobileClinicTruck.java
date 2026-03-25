public class MobileClinicTruck implements EmergencySupport {

    private String truckId;
    private String region;
    private int doctorCount;
    private boolean stockedWithMedicine;

    public MobileClinicTruck(String truckId, String region, int doctorCount, boolean stockedWithMedicine) {
        this.truckId = truckId;
        this.region = region;
        this.doctorCount = doctorCount;
        this.stockedWithMedicine = stockedWithMedicine;
    }

    @Override
    public void deployAid() {
        System.out.println("Mobile clinic truck " + truckId + " deploying " + doctorCount + " doctors.");
        // after deploying we’re not stocked anymore
        this.stockedWithMedicine = false;
    }

    @Override
    public String getEmergencyReadinessReport() {
        return "Truck Emergency Report:\n"
                + "ID: " + truckId + "\n"
                + "Region: " + region + "\n"
                + "Doctors on Board: " + doctorCount + "\n"
                + "Medicine: " + (stockedWithMedicine ? "Stocked with Medicine" : "Not Stocked") + "\n";
    }

    @Override
    public String toString() {
        return "MobileClinicTruck [ truckId=" + truckId
                + ", region=" + region
                + ", doctorCount=" + doctorCount
                + ", stockedWithMedicine=" + stockedWithMedicine + " ]";
    }

    // getters + setters
    public String getTruckId() { return truckId; }
    public void setTruckId(String truckId) { this.truckId = truckId; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public int getDoctorCount() { return doctorCount; }
    public void setDoctorCount(int doctorCount) { this.doctorCount = doctorCount; }

    public boolean isStockedWithMedicine() { return stockedWithMedicine; }
    public void setStockedWithMedicine(boolean stockedWithMedicine) { this.stockedWithMedicine = stockedWithMedicine; }
}

