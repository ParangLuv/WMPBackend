package com.parangluv.withmypet.reply.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.parangluv.withmypet.article.domain.Article;
import com.parangluv.withmypet.board.domain.Board;
import com.parangluv.withmypet.user.domain.User;

import lombok.Data;

@Data
@Entity
public class Reply {
	@Id	@GeneratedValue
	private long id;				// 댓글키
	
	@ManyToOne
	@JoinColumn(name="ARTICLE")
	private Article parentArticle;	// 부모 게시물
	@ManyToOne
	@JoinColumn(name="USER")
	private User replyWriter;		// 작성자
	
	@Column(nullable=false, columnDefinition="TEXT")
	private String content;			// 내용
	@Column(nullable=false)
	private long parentReply;		// 부모댓글
	@Column(nullable=false)
	private int indent;				// 들여쓰기
	@Column(nullable=false)
	private boolean isDeleted;		// 논리삭제 여부
	
	
	@Column(nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date regDate;			// 작성시간
	@Column(nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date modDate;			// 수정시간
}
