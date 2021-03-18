package com.fim.wilstra.campDragonFire.model.controller;

import com.fim.wilstra.campDragonFire.model.javaEntity.Person;
import com.fim.wilstra.campDragonFire.model.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/")
    public List<Person> list() {
        return personService.listAll();
    }

}
