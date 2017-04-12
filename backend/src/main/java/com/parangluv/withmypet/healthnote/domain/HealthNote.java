package com.parangluv.withmypet.healthnote.domain;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.parangluv.withmypet.pet.domain.Pet;

import lombok.Data;

@Data
@Entity
public class HealthNote {

	@Id	@GeneratedValue
	private long id;			// 노트 KEY
	
	@OneToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "Pet"), name="Pet")
	private Pet Pet;		// 노트 주인 동물
	
}
