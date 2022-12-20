package com.rwg1.Backend_Map.controller;

import com.rwg1.Backend_Map.models.Person;
import com.rwg1.Backend_Map.rep.PersonRep;
import com.rwg1.Backend_Map.rep.RoomRep;
import com.rwg1.Backend_Map.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;
/*
    @GetMapping("/persons")
    public List<Person> getAllPersonen(){return personService.getAllPersonen();}

    @GetMapping("/person/{id}")
    public Optional<Person> getPersonById(@PathVariable("id") Long id){
        return personService.getPersonById(id);
    }

    @GetMapping("/person/{name}")
    public Optional<Person> getPersonByName(@PathVariable("name") String name){
        return personService.getPersonByName(name);
    }
*/
}
