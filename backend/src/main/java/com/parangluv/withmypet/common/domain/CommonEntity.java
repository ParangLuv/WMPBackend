package com.parangluv.withmypet.common.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@MappedSuperclass
public class CommonEntity {
	
	@Column(nullable = false)
	private Timestamp regDate;								// 등록시간
	
	@Column(nullable = false)
	private Timestamp modDate;								// 수정시간
	
	@Column(nullable = false)
	private boolean isDeleted;								// 논리삭제 여부
	
	@Column
	private String extra1;
	
	@Column
	private String extra2; 
	
	@Column
	private String extra3;
	
	@Column
	private String extra4;
}
