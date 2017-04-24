package com.parangluv.withmypet.common.entity;

import java.sql.Timestamp;
import java.util.Date;

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
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date regDate;								// 등록시간
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date modDate;								// 수정시간
	
	@Column(nullable = false, columnDefinition="bit(1) default 0")
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
