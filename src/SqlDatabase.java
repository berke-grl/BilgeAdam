import entity.Person;
import services.Convertable;

public class SqlDatabase extends Database implements Convertable {
    @Override
    protected void showAll() {
        System.out.println("Current Database : SQL Database");
        super.showAll();
    }

    @Override
    public Object[] convertToArray() {
        return persons.toArray();
    }
}
