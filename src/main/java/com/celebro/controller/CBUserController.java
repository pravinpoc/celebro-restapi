package com.celebro.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.celebro.model.CBUser;
import com.celebro.service.CbUserService;
import com.celebro.service.EventService;

@RestController
@RequestMapping("v1/cbuser")
public class CBUserController {

	@Autowired
	CbUserService cbUserService;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	EventService eventService;

	@GetMapping("/{username}")
	public @ResponseBody CBUser getCbUser(@PathVariable String username) {
		System.out.println("Om Vigneshwaraaya Namahaa");
		System.out.println("Id-->>" + username);
		return (cbUserService.getCbUserByUsername(username));
	}

	@GetMapping("/save")
	public @ResponseBody CBUser saveUser() {
		System.out.println("Om Vigneshwaraaya Namahaa");
		return cbUserService.saveCbUser(new CBUser());
	}

}
