import entity.Person;
import services.PersonDatabaseOperations;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SqlDatabase sqlDatabase = new SqlDatabase();

        // Adding Dummy data
        sqlDatabase.add(new Person(1,"Berke","Gürel",22,true));
        sqlDatabase.add(new Person(2,"Selim","Dinler",32,true));
        sqlDatabase.add(new Person(3,"Aktan","Sanhal",26,true));
        sqlDatabase.add(new Person(4,"Ali","Yılmaz",17,false));

        //find data with id
        System.out.println(sqlDatabase.find(2));

        //update given person's first name
        sqlDatabase.updateFirstName(2,"Giray");

        //remove person with given id
        sqlDatabase.remove(4);

        //show all data
        sqlDatabase.showAll();


    }
}
