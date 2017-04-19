package com.parangluv.withmypet.pet.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.parangluv.withmypet.breed.domain.Breed;
import com.parangluv.withmypet.common.domain.CommonEntity;
import com.parangluv.withmypet.healthnote.domain.HealthNote;
import com.parangluv.withmypet.user.domain.User;

import lombok.Data;

@Data
@Entity
public class Pet extends CommonEntity{

	@Id @GeneratedValue
	private long id;						// PET KEY
	@Column(nullable=false, length=20)
	private String name;					// 펫 이름
	
	@Column(nullable = false)
	private boolean sex;					// 펫 성별
	@Column(nullable = false, columnDefinition="int(2)")
	private int age;						// 펫 연령
	@Column(nullable = true, length=12)
	private String color;					// 펫 색
	@Column(nullable = true)
	private String microchip;				// 마이크로칩 번호
	
	@OneToOne
	@JoinColumn(name="BREED", foreignKey = @ForeignKey(name = "breed"), nullable = false)
	private Breed breed;					// 품종정보
	
	@ManyToOne
	@JoinColumn(name = "owner", foreignKey = @ForeignKey(name="owner_id"), nullable = false)
	private User owner;						// 주인
	
	@OneToOne
	@JoinColumn(foreignKey = @ForeignKey(name="healthNote_id"), nullable = false, name="heathNote_id")
	private HealthNote userPetHealthNote;	// 건강수첩
	
}
