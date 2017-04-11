package com.parangluv.withmypet.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.parangluv.withmypet.user.domain.User;
import com.parangluv.withmypet.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void addUser(User user) {
		Assert.notNull(user);
		userRepository.save(user);
	}

	@Override
	public User findByUserName(String username) {
		return userRepository.findByUsername(username);
	}
	
	
}
