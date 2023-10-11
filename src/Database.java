import entity.Person;
import services.PersonDatabaseOperations;

import java.util.ArrayList;

public class Database implements PersonDatabaseOperations {

    ArrayList<Person> persons = new ArrayList<>();

    protected void showAll() {
        for (Person p : persons) {
            System.out.println(p);
        }
    }

    @Override
    public void add(Person person) {
        if (person.getId() != 0 && person.getFirstName() != null)
            persons.add(person);
        else
            System.out.println("id and firstName are required fields for creating new person ! ");
    }

    @Override
    public Person find(int id) {
        Person searchedPerson = null;

        //search person with id
        for (Person p : persons) {
            if (p.getId() == id)
                searchedPerson = p;
        }
        return searchedPerson;
    }

    @Override
    public void updateFirstName(int id, String firstName) {
        //find person
        Person oldPerson = find(id);
        if (oldPerson != null) {
            oldPerson.setFirstName(firstName);
        } else {
            System.out.println("There is no person with that id :" + id);
        }
    }

    @Override
    public void remove(int id) {
        Person p = find(id);
        if (p != null) {
            persons.remove(p);
        } else {
            System.out.println("There is no person with that id :" + id);
        }
    }
}
