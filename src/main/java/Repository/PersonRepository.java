package Repository;

import models.Person;
import java.util.List;

public interface PersonRepository {
    Person createPerson(Person person);

    boolean deletePerson(Long userId);

    boolean updatePerson(Person person);

    Person findById(Long userId);

    boolean finBydocumentNumber(String documentNumber);

    List<Person> findAll();

    boolean existsById(Long userId);

    boolean existsByDocumentNumber(String documentNumber);
}

