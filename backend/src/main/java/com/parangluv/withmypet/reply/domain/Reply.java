package com.parangluv.withmypet.reply.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.parangluv.withmypet.user.domain.User;

import lombok.Data;

@Entity
@Data
public class Reply {
	
	
	@Id private int boardNo;
	@Id	private int articleNo;
	@Id @GeneratedValue
	private int replyNo;
	@ManyToOne
	@JoinColumn
	private User user;
	
	private String uname;
	private String id;
	private String content;
	private int parent;
	private int indent;
	private Date writeTime;
	private int delete;
	
}
