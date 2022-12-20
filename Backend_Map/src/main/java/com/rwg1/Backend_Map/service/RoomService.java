package com.rwg1.Backend_Map.service;

import com.rwg1.Backend_Map.models.Person;
import com.rwg1.Backend_Map.models.Room;
import com.rwg1.Backend_Map.rep.RoomRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    private final RoomRep roomRep;

    private List<Person> personList;

    @Autowired
    public RoomService(RoomRep roomRep){this.roomRep = roomRep;}

    public List<Room> getAllRooms(){return roomRep.findAll();}

    public Optional<Room> getRoomById(Long id){return roomRep.findById(id);}

    public List<Room> getRoomByNumber(String nummer){return roomRep.findByNumber(nummer);}

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
