import entity.Person;
import services.PersonDatabaseOperations;

public class Main {

    public static void main(String[] args) {

        SqlDatabase sqlDatabase = new SqlDatabase();

        // Dummy datas
        sqlDatabase.add(new Person(1,"Berke","Gürel",22,true));
        sqlDatabase.add(new Person(2,"Selim","Dinler",32,true));
        sqlDatabase.add(new Person(3,"Aktan","Sanhal",26,true));
        sqlDatabase.add(new Person(4,"Ali","Yılmaz",17,false));

        sqlDatabase.showAll();


    }
}
