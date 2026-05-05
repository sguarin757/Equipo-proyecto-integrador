package Repository.impl;

import Repository.PersonRepository;
import models.Person;
import java.util.ArrayList;
import java.util.List;

public class PersonRepositoryInMemory implements PersonRepository {

    private List<Person> persons;
    private Long nextUserId;

    public PersonRepositoryInMemory() {
        this.persons = new ArrayList<>();
        this.nextUserId = 1L;
    }

    @Override
    public Person createPerson(Person person) {
        if (person == null) {
            return null;
        }
        if (finBydocumentNumber(person.getDocumentNumber())) {
            return null;
        }
        person.setUserId(nextUserId++);
        persons.add(person);
        return person;
    }

    @Override
    public boolean deletePerson(Long userId) {
        Person person = findById(userId);
        if (person == null) {
            return false;
        }
        return persons.remove(person);
    }

    @Override
    public boolean updatePerson(Person person) {
        if (person == null || person.getUserId() == null) {
            return false;
        }
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getUserId().equals(person.getUserId())) {
                persons.set(i, person);
                return true;
            }
        }
        return false;
    }

    @Override
    public Person findById(Long userId) {
        if (userId == null) {
            return null;
        }
        for (Person person : persons) {
            if (person.getUserId().equals(userId)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public boolean finBydocumentNumber(String documentNumber) {
        if (documentNumber == null || documentNumber.isBlank()) {
            return false;
        }
        for (Person person : persons) {
            if (documentNumber.equals(person.getDocumentNumber())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Person> findAll() {
        return new ArrayList<>(persons);
    }

    @Override
    public boolean existsById(Long userId) {
        return findById(userId) != null;
    }

    @Override
    public boolean existsByDocumentNumber(String documentNumber) {
        return finBydocumentNumber(documentNumber);
    }
}

