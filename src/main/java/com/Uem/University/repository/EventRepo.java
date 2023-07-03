package com.Uem.University.repository;

import com.Uem.University.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EventRepo extends CrudRepository<Event,Integer> {
    List<Event> findByEventDate(LocalDate eventDate);

}
