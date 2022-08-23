package com.hnt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnt.entity.User;
import com.hnt.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public void save(User user) {
		repository.save(user);

	}

	public Iterable<User> getUser() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}
