package com.celebro.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celebro.model.CBUser;
import com.celebro.repositry.CBUserRepositry;
import com.celebro.service.CbUserService;

@Service
public class CbUserServiceImpl implements CbUserService {

	@Autowired
	CBUserRepositry cbUserRepositry;

	@Transactional
	public List<CBUser> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return cbUserRepositry.findByLastName(lastName);
	}

	@Transactional
	public CBUser saveCbUser(CBUser cbUser) {
		CBUser cbUser1 = new CBUser();
		return cbUserRepositry.save(cbUser1);
	}

	@Override
	public CBUser getCbUserByUsername(String username) {
		// TODO Auto-generated method stub
		return cbUserRepositry.findByUsername(username);
	}

}
