package com.parangluv.withmypet.article.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ArticleId implements Serializable{
	private Long board;
	private Long articleId;

	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	 
	        ArticleId that = (ArticleId) o;
	 
	        if (!board.equals(that.board)) return false;
	        return articleId.equals(that.articleId);
	 
	    }
	 
	    @Override
	    public int hashCode() {
	        int result = board.hashCode();
	        result = 31 * result + articleId.hashCode();
	        return result;
	    }

	
}
