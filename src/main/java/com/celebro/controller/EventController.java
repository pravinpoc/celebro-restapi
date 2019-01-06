package com.celebro.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.celebro.model.Address;
import com.celebro.model.CBUser;
import com.celebro.model.Event;
import com.celebro.service.CbUserService;
import com.celebro.service.EventService;

@RestController
@RequestMapping("v1/event")
public class EventController {

	@Autowired
	CbUserService cbUserService;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	EventService eventService;

	@GetMapping("/save")
	public @ResponseBody Event saveEvent() {
		System.out.println("Om Vigneshwaraaya Namahaa");
		CBUser cbUser = cbUserService.findByLastName("Kanipakam").get(0);
		Address ad = new Address();
		ad.setAdressLine1("Vignesh Devasthanam");
		ad.setCity("Kanipakam");
		ad.setState("Ap");
		ad.setCountry("India");
		Event event = new Event();
		event.setAddress(ad);
		event.setCbUser(cbUser);
		event.setEventName("Om vignesh");
		event.setEventDesc("Om vigneshwaraaya Namahaa");
		event.setEventType("Vignesh Celebrations");
		return eventService.saveEvent(event);
	}

}
