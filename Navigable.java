//Any vehicle that can move / navigate.

public interface Navigable {

    // takes a destination and goes there (for us it just updates location)
    void navigateTo(String destination);

    // set speed
    void setCurrentSpeed(double speed);

    // get speed
    double getCurrentSpeed();
}


