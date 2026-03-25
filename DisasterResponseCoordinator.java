import java.util.ArrayList;

public class DisasterResponseCoordinator {

    private ArrayList<EmergencySupport> responders;

    public DisasterResponseCoordinator() {
        responders = new ArrayList<>();
    }

    public DisasterResponseCoordinator(ArrayList<EmergencySupport> responders) {
        this.responders = responders;
    }

    // adds a responder to the list
    public void registerResponder(EmergencySupport responder) {
        responders.add(responder);
    }

    // deploy everyone
    public void deployAll() {
        System.out.println("\nDeploying all emergency units:");
        for (EmergencySupport r : responders) {
            r.deployAid();
        }
    }

    // print all readiness reports
    public void printAllReadinessReports() {
        System.out.println("Emergency Readiness Reports:");
        for (EmergencySupport r : responders) {
            System.out.print(r.getEmergencyReadinessReport());
            System.out.println("=======================================");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DisasterResponseCoordinator [responders=\n");
        for (EmergencySupport r : responders) {
            sb.append(r.toString()).append("\n");
        }
        sb.append("]");
        return sb.toString();
    }

    // getters + setters
    public ArrayList<EmergencySupport> getResponders() { return responders; }
    public void setResponders(ArrayList<EmergencySupport> responders) { this.responders = responders; }
}
