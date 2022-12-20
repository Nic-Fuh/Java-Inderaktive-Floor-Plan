package com.rwg1.Backend_Map.rep;

import com.rwg1.Backend_Map.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoomRep extends JpaRepository<Room, Long> {

    @Query(
            value = "SELECT * FROM Room r WHERE r.nummer = :nummer",
            nativeQuery = true)
    List<Room> findByNumber(@Param("nummer") String nummer);

}
