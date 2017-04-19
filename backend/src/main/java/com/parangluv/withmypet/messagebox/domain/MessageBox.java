package com.parangluv.withmypet.messagebox.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.parangluv.withmypet.common.domain.CommonEntity;
import com.parangluv.withmypet.user.domain.User;

import lombok.Data;

@Data
@Entity
public class MessageBox extends CommonEntity{
	@Id	@GeneratedValue
	private long id;											// 메세지 박스 KEY
	
	@OneToOne
	@JoinColumn(name="MessageBoxOwner", nullable = false, foreignKey = @ForeignKey(name="user"))
	private User messageBoxOwner;								// 메세지 박스 주인(수신자)
	
	@OneToMany(mappedBy="parentMessageBox")
	private List<Message> childMessages = new ArrayList<>();	// 자식 메세지들
}
