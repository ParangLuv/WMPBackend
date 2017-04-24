package com.parangluv.withmypet.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.parangluv.withmypet.user.domain.User;
import com.parangluv.withmypet.user.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api/user")
@Api(value = "Version 0.01")
public class UserController {
	
	@Autowired
	private UserService us;
	
	@ApiOperation(value = "Get Users with pagenation")
	@RequestMapping(method = RequestMethod.GET)
	public Page<User> getUsers(@RequestParam Integer page){
		return null;
	}
	
}
