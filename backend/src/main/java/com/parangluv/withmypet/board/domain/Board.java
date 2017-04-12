package com.parangluv.withmypet.board.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Board {
	@Id	@GeneratedValue
	private long id;												// 게시판 Key
	
	@Column(nullable = false, length=40)
	private String name;											// 게시판 이름
	@Column(nullable = false)
	private boolean isDeleted;										// 게시판 논리삭제여부
//	@OneToMany(mappedBy="parentBoard")
//	private List<Article> childArticles = new ArrayList<>();		// 자식 게시물
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date regDate;											// 등록 시간
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date modDate;											// 수정 시간
	
	
}
