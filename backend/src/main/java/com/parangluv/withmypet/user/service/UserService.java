package com.parangluv.withmypet.user.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.parangluv.withmypet.common.util.NumberPerPage;
import com.parangluv.withmypet.user.domain.User;
import com.parangluv.withmypet.user.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired private UserRepository ur;
	
	
	public Page<User> findAll(int page){
		Pageable pageable = new PageRequest(page, NumberPerPage.TEN.getValue(), Sort.Direction.DESC, "id");
		return this.ur.findAll(pageable);
	}
	
	public User findByUserName(String userName){
		return this.ur.findByUserName(userName);
	}
	
	public User createUser(User user){
		return this.ur.save(user);
	}
	
	public User updateUser(User user){
		return this.ur.save(user);
	}
	
	public void deleteUser(User user){
		this.ur.delete(user);
	}
}
