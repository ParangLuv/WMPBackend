package com.parangluv.withmypet.user.service;

import com.parangluv.withmypet.user.domain.User;

public interface UserService {

	void addUser(User user);
	User findByUserName(String username);

}
