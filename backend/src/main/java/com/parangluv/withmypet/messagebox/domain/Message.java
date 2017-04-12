package com.parangluv.withmypet.messagebox.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.parangluv.withmypet.user.domain.User;

import lombok.Data;

@Data
@Entity
public class Message {
	@Id	@GeneratedValue
	private long id;						// Message Key
	
	@ManyToOne
	@JoinColumn(name="MESSAGEBOX")
	private MessageBox parentMessageBox;	// 부모 메세지 박스
	private User sender;					// 발신자


	@Column(nullable = false, length=40)
	private String title;					// 제목
	@Column(nullable = false, columnDefinition="TEXT")
	private String content;					// 내용
	
	
	@Column(nullable = false)
	private boolean	isOpened;				// 열람여부
	@Column(nullable = false)
	private boolean isDeleted;				// 삭제여부
		
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date openDate;					// 열람시간
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date sendDate;					// 발신시간
}
