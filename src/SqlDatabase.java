public class SqlDatabase extends Database{
    @Override
    protected void showAll() {
        System.out.println("Current Database : SQL Database");
        super.showAll();
    }
}
