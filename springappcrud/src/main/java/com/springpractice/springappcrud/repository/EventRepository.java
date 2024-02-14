package com.springpractice.springappcrud.repository;

import com.springpractice.springappcrud.model.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EventRepository extends CrudRepository<Event, Long> {

    Event save(Event event);

    List<Event> findAll();

    Optional<Event> findById(Long id);






}
