package services;

import entity.Person;

public interface PersonDatabaseOperations {
    void add(Person person);
    Person find(int id);
    void updateFirstName(int id,String firstName);
    void remove(int id);

}
