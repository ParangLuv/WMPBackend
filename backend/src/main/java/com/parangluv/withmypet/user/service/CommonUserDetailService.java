package com.parangluv.withmypet.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.parangluv.withmypet.user.domain.User;
import com.parangluv.withmypet.user.domain.UserSecure;

public class CommonUserDetailService implements UserDetailsService{

	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		User user = userService.findByUserName(username);
		
			if(user == null){
				throw new UsernameNotFoundException(username);
			}
			return new UserSecure(user);
				
	}
}
