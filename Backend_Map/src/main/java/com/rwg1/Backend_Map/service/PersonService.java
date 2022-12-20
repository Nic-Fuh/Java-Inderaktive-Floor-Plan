package com.rwg1.Backend_Map.service;

import com.rwg1.Backend_Map.models.Person;
import com.rwg1.Backend_Map.rep.PersonRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRep personRep;

    @Autowired
    public PersonService(PersonRep personRep){this.personRep = personRep;}

    public List<Person> getAllPersonen(){return personRep.findAll();}

    public Optional<Person> getPersonById(Long id){
        return personRep.findById(id);
    }

    public List<Person> getPersonByName(String name){
        return personRep.findByName(name);
    }

}
