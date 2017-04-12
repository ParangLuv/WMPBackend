package com.parangluv.withmypet.article.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class ArticleId implements Serializable{
	private Long board;
	private Long article;

	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	 
	        ArticleId that = (ArticleId) o;
	 
	        if (!board.equals(that.board)) return false;
	        return article.equals(that.article);
	 
	    }
	 
	    @Override
	    public int hashCode() {
	        int result = board.hashCode();
	        result = 31 * result + article.hashCode();
	        return result;
	    }

	
}
