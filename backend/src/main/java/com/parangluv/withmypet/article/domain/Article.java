package com.parangluv.withmypet.article.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.parangluv.withmypet.board.domain.Board;
import com.parangluv.withmypet.reply.domain.Reply;
import com.parangluv.withmypet.user.domain.User;

import lombok.Data;

@Data
@Entity
public class Article {
	@Id	@GeneratedValue
	private long id;										// Article Key
	
	@ManyToOne
	@JoinColumn(name="BOARD")
	private Board parentBoard;								// 부모 게시판
	@ManyToOne
	@JoinColumn(name="USER")
	private User articleWriter;								// 작성자
	
	@OneToMany(mappedBy="parentArticle")
	private List<Reply> childReplys = new ArrayList<>();	// 자식 댓글 리스트


	@Column(nullable = false, length=80)
	private String title;									// 제목
	@Column(nullable = false, columnDefinition="TEXT")
	private String content;									// 내용
	@Column(nullable = false, length=20)
	private String category;								// 카테고리

	
	@Column(nullable = false)
	private boolean isDeleted;								// 논리삭제 여부
	@Column(nullable = false, length=5)
	private int hits;										// 조회수
	@Column(nullable = false, length=5)
	private int recommends;									// 추천수
	@Column(nullable = true)
	private String attachedFile;							// 첨부파일 이름
	@Column(nullable = true)
	private String fileLocation; 							// 첨부파일 주소
	
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date regDate;									// 작성시간
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date modDate;									// 수정시간
}
