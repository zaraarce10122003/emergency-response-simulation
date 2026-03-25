public class Lab1 {

    public static void main(String[] args) {

        DisasterResponseCoordinator coordinator = new DisasterResponseCoordinator();

        AidShip aidShip = new AidShip(
                "Madleen",
                "AID-001",
                8000.0,
                120,
                0.0,
                "Melona",
                "Medical",
                200,
                true
        );

        RescueHelicopter helicopter = new RescueHelicopter(
                "ECHO-7",
                "Melona",
                50,
                0.0,
                0.0,
                true
        );

        MobileClinicTruck truck = new MobileClinicTruck(
                "TRK-12",
                "Melona",
                5,
                true
        );

        coordinator.registerResponder(aidShip);
        coordinator.registerResponder(helicopter);
        coordinator.registerResponder(truck);

        coordinator.printAllReadinessReports();
        coordinator.deployAll();

        System.out.println();
        System.out.println(coordinator);
    }
}
