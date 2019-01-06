package com.celebro.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celebro.model.Event;
import com.celebro.repositry.EventRepositry;
import com.celebro.service.EventService;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	EventRepositry eventRepositry;
	
	@Transactional
	public Event saveEvent(Event event) {
		// TODO Auto-generated method stub
		return eventRepositry.save(event);
	}
	

}
