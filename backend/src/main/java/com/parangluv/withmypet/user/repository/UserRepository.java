package com.parangluv.withmypet.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parangluv.withmypet.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByUserName(String userName);
	
}
