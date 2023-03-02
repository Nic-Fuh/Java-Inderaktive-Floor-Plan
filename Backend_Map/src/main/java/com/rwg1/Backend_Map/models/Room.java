package com.rwg1.Backend_Map.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Room {

    @Id
    @GeneratedValue
    private Long id;
    private String nummer;
    @Transient
    private List<Panel> personen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public List<Panel> getPersonen() {
        return personen;
    }

    public void setPersonen(List<Panel> personen) {
        this.personen = personen;
    }
}
