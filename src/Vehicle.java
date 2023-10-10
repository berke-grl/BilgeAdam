import java.util.ArrayList;

public class Vehicle extends VehicleFunctions {

    final String vehicleType;
    final int speedLimit;
    final int doorNumber;
    final long fuelCapacity;
    String systemError;
    boolean engineStatus;
    long currentFuel;
    int speed;

    public Vehicle(String vehicleType,
                   int speedLimit,
                   int doorNumber,
                   long fuelCapacity,
                   String systemError,
                   boolean engineStatus,
                   long currentFuel,
                   int speed) {
        this.vehicleType = vehicleType;
        this.speedLimit = speedLimit;
        this.doorNumber = doorNumber;
        this.fuelCapacity = fuelCapacity;
        this.systemError = systemError;
        this.engineStatus = engineStatus;
        this.currentFuel = currentFuel;
        this.speed = speed;
    }

    @Override
    boolean isEngineStart() {
        return engineStatus;
    }

    @Override
    boolean isEngineStop() {
        return engineStatus;
    }

    @Override
    String anySystemError() {
        return systemError;
    }

    @Override
    long currentFuel() {
        return currentFuel;
    }

    @Override
    void speedUp(int amount) {
        if (speed + amount > speedLimit) {
            System.out.println("You cannot exceed the speed limit which is " + speedLimit + " km/h");
        } else {
            speed += amount;
            System.out.println("Current speed : " + speed);
        }
    }

    @Override
    void speedDown(int amount) {
        if (speed - amount < 0) {
            System.out.println("Car is stopped");
        } else {
            speed -= amount;
            System.out.println("Current speed : " + speed);
        }
    }
}
