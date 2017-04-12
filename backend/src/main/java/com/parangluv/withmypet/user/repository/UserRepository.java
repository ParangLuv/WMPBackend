package com.parangluv.withmypet.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parangluv.withmypet.user.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	 
	
}
