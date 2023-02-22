package com.rwg1.Backend_Map.rep;

import com.rwg1.Backend_Map.models.Zuweisung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ZuweisungRep extends JpaRepository<Zuweisung, Long> {

    @Query(
            value = "SELECT * FROM Zuweisung z WHERE z.room_id = :room",
            nativeQuery = true)
    List<Zuweisung> findByRoomId(@Param("room") Long roomId);


    @Query(
            value = "SELECT * FROM Zuweisung z WHERE z.person_id = :person",
            nativeQuery = true)
    List<Zuweisung> findByPersonId(@Param("person") Long personId);


    
}
