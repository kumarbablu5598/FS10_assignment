package com.Uem.University.repository;

import com.Uem.University.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends CrudRepository<Event,Integer> {

}
