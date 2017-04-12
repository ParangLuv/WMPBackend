package com.parangluv.withmypet.messagebox.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.parangluv.withmypet.article.domain.Article;
import com.parangluv.withmypet.board.domain.Board;
import com.parangluv.withmypet.user.domain.User;

import lombok.Data;

@Data
@Entity
public class MessageBox {
	@Id	@GeneratedValue
	private long id;											// 메세지 박스 KEY
	
	@OneToOne
	@JoinColumn(name="USER")
	private User messageBoxOwner;								// 메세지 박스 주인(수신자)
	
	@OneToMany(mappedBy="parentMessageBox")
	private List<Message> childMessages = new ArrayList<>();	// 자식 메세지들
}
