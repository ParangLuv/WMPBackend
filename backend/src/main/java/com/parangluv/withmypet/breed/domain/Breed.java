package com.parangluv.withmypet.breed.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.parangluv.withmypet.article.domain.Article;
import com.parangluv.withmypet.board.domain.Board;

import lombok.Data;

@Data
@Entity
public class Breed {
	
	@Id	@GeneratedValue
	private long id;				// breed key
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Species species;		// speices
	
	@Column(nullable = false, length=20)
	private String name;			// breed name;
	@Column(nullable = true, columnDefinition="TEXT")
	private String commonFeature;	// 공통특성
	@Column(nullable = true, length=3)
	private int avgMinLifespan;		// 평균수명 최저치
	@Column(nullable = true, length=3)
	private int avgMaxLifespan;		// 평균수명 최고치
	
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date regDate;			// 작성시간
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date modDate;			// 수정시간
	
}
