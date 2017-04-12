package com.parangluv.withmypet.healthnote.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.websocket.OnOpen;

import com.parangluv.withmypet.article.domain.Article;
import com.parangluv.withmypet.board.domain.Board;
import com.parangluv.withmypet.pet.domain.Pet;

import lombok.Data;

@Data
@Entity
public class HealthNote {
	@Id	@GeneratedValue
	private long id;			// 노트 KEY
	
	@OneToOne
	@JoinColumn(name="PET")
	private Pet Pet;		// 노트 주인 동물
}
