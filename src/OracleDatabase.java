public class OracleDatabase extends Database{

    @Override
    protected void showAll() {
        System.out.println("Current Database : Oracle Database");
        super.showAll();
    }
}
