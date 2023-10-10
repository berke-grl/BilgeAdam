public class Qashqai extends SuvCar{



    public Qashqai(String vehicleType, int speedLimit, int doorNumber, long fuelCapacity, String systemError, boolean engineStatus, long currentFuel, int speed, long wheelPressure) {
        super(vehicleType, speedLimit, doorNumber, fuelCapacity, systemError, engineStatus, currentFuel, speed, wheelPressure);

    }

    @Override
    public String toString() {
        return "Qashqai{" +
                ", wheelPressure=" + wheelPressure +
                ", vehicleType='" + vehicleType + '\'' +
                ", speedLimit=" + speedLimit +
                ", doorNumber=" + doorNumber +
                ", fuelCapacity=" + fuelCapacity +
                ", systemError='" + systemError + '\'' +
                ", engineStatus=" + engineStatus +
                ", currentFuel=" + currentFuel +
                ", speed=" + speed +
                '}';
    }

    @Override
    protected long inflateWheels(int amount) {
        wheelPressure += amount / 2;
        return wheelPressure;
    }
}
