package service.impl;

import Repository.PersonRepository;
import service.PersonService;
import models.Person;
import java.util.List;

public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person create(Person person) {
        return personRepository.createPerson(person);
    }

    @Override
    public boolean update(Person updatePerson) {
        return personRepository.updatePerson(updatePerson);
    }

    @Override
    public boolean delete(Long userId) {
        return personRepository.deletePerson(userId);
    }

    @Override
    public Person findById(Long userId) {
        return personRepository.findById(userId);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }
}

