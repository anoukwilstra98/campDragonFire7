package com.fim.wilstra.campDragonFire.model.service;

import com.fim.wilstra.campDragonFire.model.javaEntity.Person;
import com.fim.wilstra.campDragonFire.model.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> listAll() {
        return (List<Person>) personRepository.findAll();
    }

    public void save(Person person) {
        personRepository.save(person);
    }

    public Person get(Integer id) {
        return personRepository.findById(id).get();
    }

    public void delete(Integer id) {
        personRepository.deleteById(id);
    }

}
