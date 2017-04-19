package com.parangluv.withmypet.article.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

import com.parangluv.withmypet.board.domain.Board;
import com.parangluv.withmypet.common.domain.CommonEntity;
import com.parangluv.withmypet.reply.domain.Reply;
import com.parangluv.withmypet.user.domain.User;

import lombok.Data;

@Data
@Entity
public class Article extends CommonEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long articleId;
	
	@Column(nullable=false)
	private Long articleNo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="board_id", foreignKey = @ForeignKey(name="board_id"), nullable = false)
	private Board boardId;											// 부모게시판
	
	@ManyToOne
	@JoinColumn(name="writer", foreignKey = @ForeignKey(name="writer"), nullable = false)
	private User articleWriter;										// 작성자
	
	@OneToMany(mappedBy="articleId", fetch = FetchType.EAGER)
	private List<Reply> replys = new ArrayList<>();					// 자식 댓글 리스트
	
	public List<Reply> getReplys() {
		if(replys==null){
			replys = new ArrayList();
		}
		return replys;
	}

	
	@Column(nullable = false, length=80) @NotEmpty
	private String title;									// 제목
	
	@Column(nullable = false, columnDefinition="TEXT") @NotEmpty
	private String content;									// 내용
	
	@Column(nullable = false, length=20)
	private Category category;								// 카테고리
	
    @Column(name = "ip", nullable = false, length = 255)
    private String ip;										// 게시글 IP정보

	@Column(nullable = false, length=5)
	private int hits;										// 조회수
	@Column(nullable = false, length=5)
	private int recommends;									// 추천수
	@Column(nullable = true)
	private String attachedFile;							// 첨부파일 이름
	@Column(nullable = true)
	private String fileLocation; 							// 첨부파일 주소
	
}