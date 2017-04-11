package com.parangluv.withmypet.board.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Board {
	
	@Id @GeneratedValue
	private int boardNo;
	
	@Column(nullable = false, length = 30, unique=true)
	private String boardName;

		
	
}
