package com.rwg1.Backend_Map.controller;

import com.rwg1.Backend_Map.models.Room;
import com.rwg1.Backend_Map.rep.RoomRep;
import com.rwg1.Backend_Map.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;
/*
    @GetMapping("/rooms")
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }

    @GetMapping(path = "/room/{roomID}")
    public Optional<Room> getRoomById(@PathVariable("roomID") Long id){
        return roomService.getRoomById(id);
    }
*/
}
