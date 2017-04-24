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
	
	
	
}
