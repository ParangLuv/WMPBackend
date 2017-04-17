package com.parangluv.withmypet.reply.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
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
	@GeneratedValue
	private ReplyId replyId;

	@MapsId("article") 
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "article", referencedColumnName = "articleId", foreignKey=@ForeignKey(name="article")),	
		@JoinColumn(name = "board", referencedColumnName = "board", foreignKey=@ForeignKey(name="board"))}) 
	private Article article;							// 부모 게시물
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="USER", foreignKey = @ForeignKey(name = "USER"))
	private User replyWriter;		// 작성자
	
	@Column(nullable=false, columnDefinition="TEXT")
	private String content;			// 내용
	
	@Column(nullable=false)
	private long parentReply;		// 부모댓글
	
	@Column(nullable=false)
	private int indent;				// 들여쓰기 

}
