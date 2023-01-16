package com.rwg1.Backend_Map.controller;

import com.rwg1.Backend_Map.models.Person;
import com.rwg1.Backend_Map.models.Room;
import com.rwg1.Backend_Map.models.Zuweisung;
import com.rwg1.Backend_Map.service.PersonService;
import com.rwg1.Backend_Map.service.RoomService;
import com.rwg1.Backend_Map.service.ZuweisungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MasterController {

    @Autowired
    private RoomService roomService;

    @Autowired
    private ZuweisungService zuweisungService;

    @Autowired
    private PersonService personService;

    //========================Room Mappings===============================

    @GetMapping("/rooms")
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }

    @GetMapping(path = "/room/id/{roomID}")
    public Optional<Room> getRoomById(@PathVariable("roomID") Long id){
        return roomService.getRoomById(id);
    }

    @GetMapping(path = "/room/nummer/{nummer}")
    public List<Room> getRoomByNumber(@PathVariable("nummer") String nummer){
        return roomService.getRoomByNumber(nummer);
    }

    //========================Zuweisung Mappings===============================

    @GetMapping(path = "/zuweisung")
    public List<Zuweisung> getAllZuweisungen(){
        return zuweisungService.getAllZuweisungen();
    }

    @GetMapping(path = "/zuweisung/room/{roomID}")
    public List<Zuweisung> getZuweisungByRoomId(@PathVariable("roomID") Long roomId){
        return zuweisungService.getZuweisungByRoomId(roomId);
    }

    @GetMapping(path = "/zuweisung/person/{personID}")
    public List<Zuweisung> getZuweisungByPersonId(@PathVariable("personID") Long personId){
        return zuweisungService.getZuweisungByPersonId(personId);
    }

    //========================Person Mappings===============================

    @GetMapping("/personen")
    public List<Person> getAllPersonen(){return personService.getAllPersonen();}

    @GetMapping("/person/id/{id}")
    public Optional<Person> getPersonById(@PathVariable("id") Long id){
        return personService.getPersonById(id);
    }

    @GetMapping("/person/name/{name}")
    public List<Person> getPersonByName(@PathVariable("name") String name){
        return personService.getPersonByName(name);
    }

    //========================Raum mit Person Mappings===============================

    @GetMapping("/rwp/{roomID}") //rwp = Room with Person
    public Room getRWP(@PathVariable("roomID") Long id){
        List<Person> personenImRaum = new ArrayList<>();

        List<Zuweisung> zuweisungen = zuweisungService.getZuweisungByRoomId(id);

        for (Zuweisung z:
             zuweisungen) {
            Optional<Person> p = personService.getPersonById(z.getPerson_id());
            try {
                personenImRaum.add(p.get());
            }catch (Exception e){
                System.out.println(e);
            }
        }

        Optional<Room> room = roomService.getRoomById(id);

        room.get().setPersonen(personenImRaum);

        return room.get();
    }

    
    @GetMapping("/rwp/number/{roomnumber}") //rwp = Room with Person
    public Room getRWP(@PathVariable("roomnumber") String number){

        try {

            Long roomID = roomService.getRoomByNumber(number).get(0).getId();


            List<Person> personenImRaum = new ArrayList<>();

            List<Zuweisung> zuweisungen = zuweisungService.getZuweisungByRoomId(roomID);

            for (Zuweisung z:
                zuweisungen) {
                Optional<Person> p = personService.getPersonById(z.getPerson_id());
                try {
                    personenImRaum.add(p.get());
                }catch (Exception e){
                    System.out.println(e);
                }
            }

            Optional<Room> room = roomService.getRoomById(roomID);

            room.get().setPersonen(personenImRaum);

            return room.get();

        } catch (Exception e) {
            return null;
        }
        
    }

}
