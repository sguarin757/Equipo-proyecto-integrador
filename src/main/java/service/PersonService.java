package service;

import models.Person;
import java.util.List;

public interface PersonService {
    Person create(Person person);

    boolean update(Person updatePerson);

    boolean delete(Long userId);

    Person findById(Long userId);

    List<Person> findAll();
}

