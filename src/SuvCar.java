import java.util.ArrayList;

public class SuvCar extends Vehicle {

    long wheelPressure;

    public SuvCar(String vehicleType,
                  int speedLimit,
                  int doorNumber,
                  long fuelCapacity,
                  String systemError,
                  boolean engineStatus,
                  long currentFuel,
                  int speed,
                  long wheelPressure) {
        super(vehicleType, speedLimit, doorNumber, fuelCapacity, systemError, engineStatus, currentFuel, speed);
        this.wheelPressure = wheelPressure;
    }

    protected long inflateWheels(int amount) {
        wheelPressure += amount;
        return wheelPressure;
    }

}
