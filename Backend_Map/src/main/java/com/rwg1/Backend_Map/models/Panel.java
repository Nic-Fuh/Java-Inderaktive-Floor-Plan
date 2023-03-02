package com.rwg1.Backend_Map.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalTime;

@Entity
public class Panel {

    @Id
    private Long id;

    private String gender;
    private String person;
    private String fa;
    private String gf;
    private int status;
    private String perso_nr;
    private String vorname;
    private String abteilung;
    @Column(columnDefinition = "VARCHAR(5)", name = "telefonBuero")
    private String telefonBuero;
    @Column(columnDefinition = "VARCHAR(15)", name = "telefonMobil")
    private String telefonMobil;
    private String email;
    private LocalTime az_soll;
    private LocalTime pause_soll;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getFa() {
        return fa;
    }

    public void setFa(String fa) {
        this.fa = fa;
    }

    public String getGf() {
        return gf;
    }

    public void setGf(String gf) {
        this.gf = gf;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPerso_nr() {
        return perso_nr;
    }

    public void setPerso_nr(String perso_nr) {
        this.perso_nr = perso_nr;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public String getTelefonBuero() {
        return telefonBuero;
    }

    public void setTelefonBuero(String telefonBuero) {
        this.telefonBuero = telefonBuero;
    }

    public String getTelefonMobil() {
        return telefonMobil;
    }

    public void setTelefonMobil(String telefonMobil) {
        this.telefonMobil = telefonMobil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalTime getAz_soll() {
        return az_soll;
    }

    public void setAz_soll(LocalTime az_soll) {
        this.az_soll = az_soll;
    }

    public LocalTime getPause_soll() {
        return pause_soll;
    }

    public void setPause_soll(LocalTime pause_soll) {
        this.pause_soll = pause_soll;
    }
}
