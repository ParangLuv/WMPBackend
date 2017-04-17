package com.parangluv.withmypet.reply.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.parangluv.withmypet.article.domain.ArticleId;
import com.parangluv.withmypet.reply.domain.ReplyId;

import lombok.Data;

@Data
@Embeddable
public class ReplyId implements Serializable{
	private ArticleId article;
	private Long replyId;

	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	 
	        ReplyId that = (ReplyId) o;
	 
	        if (!article.equals(that.article)) return false;
	        return replyId.equals(that.replyId);
	 
	    }
	 
	    @Override
	    public int hashCode() {
	        int result = article.hashCode();
	        result = 31 * result + replyId.hashCode();
	        return result;
	    }
}
