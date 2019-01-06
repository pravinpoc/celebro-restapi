package com.celebro.repositry;

import org.springframework.data.repository.CrudRepository;

import com.celebro.model.Event;

public interface EventRepositry extends CrudRepository<Event, Long> {


}