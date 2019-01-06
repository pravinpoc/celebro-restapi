package com.celebro.repositry;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.celebro.model.CBUser;

public interface CBUserRepositry extends CrudRepository<CBUser, Long> {

    List<CBUser> findByLastName(String lastName);
    CBUser findByUsername(String username);
}