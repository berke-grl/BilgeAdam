import java.util.ArrayList;

public abstract class VehicleFunctions {
    abstract boolean isEngineStart();

    abstract boolean isEngineStop();

    abstract String anySystemError();

    abstract long currentFuel();

    abstract void speedUp(int amount);

    abstract void speedDown(int amount);
}
