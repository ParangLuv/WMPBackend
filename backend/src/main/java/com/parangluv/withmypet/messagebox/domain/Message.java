package com.parangluv.withmypet.messagebox.domain;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.parangluv.withmypet.common.domain.CommonEntity;
import com.parangluv.withmypet.user.domain.User;

import lombok.Data;

@Data
@Entity
public class Message extends CommonEntity{

	@EmbeddedId @GeneratedValue
	private MessageId messageId;						// Message Key
	
	@MapsId("MESSAGEBOX") 
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="MESSAGEBOX", nullable = false, foreignKey = @ForeignKey(name="MESSAGEBOX"))
	private MessageBox parentMessageBox;	// 부모 메세지 박스
	
	@OneToOne
	@JoinColumn(name="MessageSender", nullable = false, foreignKey = @ForeignKey(name="sender"))
	private User sender;					// 발신자


	@Column(nullable = false, length=40)
	private String title;					// 제목
	@Column(nullable = false, columnDefinition="TEXT")
	private String content;					// 내용
	
	
	@Column(nullable = false)
	private boolean	isOpened;				// 열람여부
	
	@Column(nullable = false)
	private Timestamp openDate;					// 열람시간
	
	@Column(nullable = false)
	private Timestamp sendDate;					// 발신시간
	
}
