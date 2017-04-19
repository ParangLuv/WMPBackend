package com.parangluv.withmypet.reply.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.parangluv.withmypet.article.domain.Article;
import com.parangluv.withmypet.common.domain.CommonEntity;
import com.parangluv.withmypet.user.domain.User;

import lombok.Data;

@Data
@Entity
public class Reply extends CommonEntity{
	
	@EmbeddedId 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private ReplyId replyId;

	
	@ManyToOne
	@JoinColumn(name="replyWriter", foreignKey = @ForeignKey(name="replyWriter"), nullable = false)
	private User replyWriter;										// 작성자
	
	@MapsId("article") 
	@ManyToOne
	@org.hibernate.annotations.ForeignKey(name = "articleBoard")
	@JoinColumns({
		@JoinColumn(name = "article", referencedColumnName = "articleId"),	
		@JoinColumn(name = "board", referencedColumnName = "board")
		}) 
	private Article article;										// 부모 게시물
		
	@Column(nullable=false, columnDefinition="TEXT")
	private String content;											// 내용
	
	@Column(nullable=false)
	private long parentReply;										// 부모댓글
	
	@Column(nullable=false)
	private boolean indent;											// 들여쓰기 

}
