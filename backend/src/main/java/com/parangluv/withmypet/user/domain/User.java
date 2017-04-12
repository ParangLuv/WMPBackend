package com.parangluv.withmypet.user.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.parangluv.withmypet.article.domain.Article;
import com.parangluv.withmypet.board.domain.Board;
import com.parangluv.withmypet.messagebox.domain.MessageBox;
import com.parangluv.withmypet.pet.domain.Pet;
import com.parangluv.withmypet.reply.domain.Reply;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id	@GeneratedValue
	private long id;										// User Key
	
	@OneToMany(mappedBy = "owner")
	private List<Pet> userPets = new ArrayList<>(); 		// 소유한 펫 리스트
	@OneToMany(mappedBy = "articleWriter")
	private List<Article> userArticles = new ArrayList<>();	// 작성한 글 리스트
	@OneToMany(mappedBy = "replyWriter")
	private List<Reply> userReplys = new ArrayList<>();		// 작성한 댓글 리스트
	@OneToOne(mappedBy = "messageBoxOwner")
	private MessageBox userMessageBox;						// 메세지 박스
	
	
	@Column(nullable = false, length = 60)
	private String email; 									// login시 아이디
	@Column(nullable = false, length = 20)
	private String username;								// 닉네임
	@Column(nullable = false, length = 20)
	private String password;								// 패스워드
	@Transient
	private String repeatPassword;							// 가입/정보변경시 Transient
	


	@Column(nullable = false, length = 2)
	private int incorrectPasswordInputNo;					// 비밀번호 틀린 횟수
	@Column(nullable = false)
	private boolean isAccountNonExpired;					// 계정만료여부
	@Column(nullable = false)
	private boolean isAccountNonLocked;						// 계정 잠김여부
	@Column(nullable = false)
	private boolean isEnabled;								// 계정 활성화 여부

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private UserAuthority userAuthority;					// 계정 권한타입
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date joinDate;									// 가입시간
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date lastLoginDate;								// 최종로그인시간
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date lastChangePasswordDate;					// 최종비밀번호변경시간
	
}
