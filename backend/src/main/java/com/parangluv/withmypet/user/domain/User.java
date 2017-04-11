package com.parangluv.withmypet.user.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/* DTO 작성, 객체와 테이블을 매칭시킨다.  */

@Data
@Entity
public class User {

	
/********* 유저 기본정보(no, id, nick, pass) **********/	

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false, length = 60, unique=true)
	private String email;

	@Column(nullable = false, length = 20, unique=true)
	private String username;
	
	@JsonIgnore
	@Column(nullable = false, length = 30)
	private String password;
	
	@Transient
	private String repeatPassword;
	
/********* END OF 유저 기본정보(no, id, nick, pass) **********/	
/********* 유저 계정정보 *****************************/	
	// 최종 로그인시간
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date joinDate;	
	
	// 최종 로그인시간
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastLogin;	
	
	// 최근 비밀번호 변경일
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastChangePassword;
	
	// 비밀번호 틀린 횟수
	@Column(nullable = false)
	private int incorrectPasswordInputNo;
	
	// 계정 만료여부
	@Column(nullable = false)
	private boolean isAccountNonExpired;
	
	// 계정 잠김여부(비밀번호 틀려서)
	@Column(nullable = false)
	private boolean isAccountNonLocked;
	
	// 계정 비밀번호 만료(비밀번호 변경 기간 이후)
	@Column(nullable = false)
	private boolean isCredentialsNonExpired;

	// 계정 활성화 여부(유저 / 관리자가 임의로 설정)
	@Column(nullable = false)
	private boolean isEnabled;
	
	// 계정 권한
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private UserAuthority userAuthority;
	// UserAuthority auth1 = UserAuthority.valueOf("ADMIN");

	
	
	
/********* END OF 유저 계정정보 *****************************/	
/********* 유저 참조정보 *****************************/
	
	
/********* END OF 유저 참조정보 *****************************/	
	


	
}
