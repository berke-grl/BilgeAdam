
public class Main {
    public static void main(String[] args) {

        Qashqai qashqai = new Qashqai(VehicleType.SUV.toString(), 220, 4, 65, "low fuel warning",
                false, 21, 0, 30);

        //speed Configurations
        qashqai.speedUp(25);
        qashqai.speedUp(50);

        //wheel pressure configurations (it will be divided by 2 because of the override method in qashqai class)
        qashqai.inflateWheels(4);

        //you can not set new vehicle type after instance creation because this field is FINAL
        //qashqai.vehicleType = "sedan";


        System.out.println(qashqai);
    }
}
enum VehicleType{
    SUV,
    SEDAN,
    HATCHBACK,
    TRUCK,
    STATION_WAGON
}