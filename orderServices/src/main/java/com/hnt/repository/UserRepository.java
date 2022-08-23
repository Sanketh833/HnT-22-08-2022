package com.hnt.repository;

import org.springframework.data.repository.CrudRepository;

import com.hnt.entity.User;

public interface UserRepository extends CrudRepository<User	, Integer> {

}
