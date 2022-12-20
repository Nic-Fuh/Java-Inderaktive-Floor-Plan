package com.rwg1.Backend_Map.controller;

import com.rwg1.Backend_Map.models.Zuweisung;
import com.rwg1.Backend_Map.rep.ZuweisungRep;
import com.rwg1.Backend_Map.service.ZuweisungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ZuweisungController {

    @Autowired
    private ZuweisungService zuweisungService;
/*
    @GetMapping(path = "/zuweisung")
    public List<Zuweisung> getAllZuweisungen(){
        return zuweisungService.getAllZuweisungen();
    }

    @GetMapping(path = "/zuweisung/room/{roomID}")
    public Optional<Zuweisung> getZuweisungByRoomId(@PathVariable("roomID") Long roomId){
        return zuweisungService.getZuweisungByRoomId(roomId);
    }
    @GetMapping(path = "/zuweisung/person/{personID}")
    public Optional<Zuweisung> getZuweisungByPersonId(@PathVariable("personID") Long personId){
        return zuweisungService.getZuweisungByPersonId(personId);
    }
*/
}
