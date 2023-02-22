package com.rwg1.Backend_Map.service;

import com.rwg1.Backend_Map.models.Zuweisung;
import com.rwg1.Backend_Map.rep.ZuweisungRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZuweisungService {

    private final ZuweisungRep rep;

    @Autowired
    public ZuweisungService(ZuweisungRep rep){this.rep = rep;}

    public List<Zuweisung> getAllZuweisungen(){return rep.findAll();}

    public List<Zuweisung> getZuweisungByRoomId(Long id){return rep.findByRoomId(id);}

    public List<Zuweisung> getZuweisungByPersonId(Long id){return rep.findByPersonId(id);}

    public void createZuweisung(Zuweisung zuweisung){

        rep.save(zuweisung);

    }

}
