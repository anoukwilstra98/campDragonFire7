package com.fim.wilstra.campDragonFire.model.repository;

import com.fim.wilstra.campDragonFire.model.javaEntity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
}
