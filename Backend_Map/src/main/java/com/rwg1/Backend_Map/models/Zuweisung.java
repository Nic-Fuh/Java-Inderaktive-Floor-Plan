package com.rwg1.Backend_Map.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Zuweisung {

    @Id
    @GeneratedValue
    private Long id;

    private Long Room_id;
    private Long Person_id;


    public Long getRoom_id() {
        return Room_id;
    }

    public void setRoom_id(Long room_id) {
        Room_id = room_id;
    }

    public Long getPerson_id() {
        return Person_id;
    }

    public void setPerson_id(Long person_id) {
        Person_id = person_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
