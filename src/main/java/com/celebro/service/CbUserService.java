package com.celebro.service;

import java.util.List;

import com.celebro.model.CBUser;

public interface CbUserService {
	
	CBUser getCbUserByUsername(String username);
	
	 List<CBUser> findByLastName(String lastName);
	 
	 public CBUser saveCbUser(CBUser cbUser);

}
