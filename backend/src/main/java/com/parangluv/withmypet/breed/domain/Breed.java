package com.parangluv.withmypet.breed.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.parangluv.withmypet.common.entity.CommonEntity;

import lombok.Data;

@Data
@Entity
public class Breed extends CommonEntity {
	
	@Id	@GeneratedValue
	private long id;				// breed key
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Species species;		// speices
	
	@Column(nullable = false, length=20)
	private String name;			// breed name;
	
	@Column(nullable = true, columnDefinition="TEXT")
	private String commonFeature;	// 공통특성
	
	@Column(nullable = true, columnDefinition="int(3)")
	private int avgMinLifespan;		// 평균수명 최저치
	
	@Column(nullable = true, columnDefinition="int(3)")
	private int avgMaxLifespan;		// 평균수명 최고치
	

}
