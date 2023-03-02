package com.rwg1.Backend_Map.service;

import com.rwg1.Backend_Map.models.Panel;
import com.rwg1.Backend_Map.models.Room;
import com.rwg1.Backend_Map.rep.RoomRep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    private final RoomRep roomRep;

    private List<Panel> personList;

    @Autowired
    public RoomService(RoomRep roomRep){this.roomRep = roomRep;}

    public List<Room> getAllRooms(){return roomRep.findAll();}

    public Optional<Room> getRoomById(Long id){return roomRep.findById(id);}

    public List<Room> getRoomByNumber(String nummer){
        return roomRep.findByNumber(nummer);
    }

    public List<Panel> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Panel> personList) {
        this.personList = personList;
    }
}
