package com.parangluv.withmypet.user.domain;

public enum UserAuthority {
	ADMIN("관리자"),
	VET("수의사"),
	USER("유저");
	
	
	private String auth;
	
	UserAuthority(String auth) {
		this.auth = auth;
	}
	
}
