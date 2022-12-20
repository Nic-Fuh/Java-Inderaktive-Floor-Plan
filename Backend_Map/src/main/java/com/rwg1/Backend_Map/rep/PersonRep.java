package com.rwg1.Backend_Map.rep;

import com.rwg1.Backend_Map.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRep extends JpaRepository<Person, Long> {

    @Query(
            value = "SELECT * FROM Person p WHERE p.person = :name",
            nativeQuery = true)
    List<Person> findByName(@Param("name") String name);

}
