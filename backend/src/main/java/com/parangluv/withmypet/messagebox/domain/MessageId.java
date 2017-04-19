package com.parangluv.withmypet.messagebox.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.parangluv.withmypet.article.domain.ArticleId;

import lombok.Data;

@Data
@Embeddable
public class MessageId implements Serializable{
	private Long messagebox;
	private Long messageId;

	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	 
	        MessageId that = (MessageId) o;
	 
	        if (!messagebox.equals(that.messagebox)) return false;
	        return messageId.equals(that.messageId);
	 
	    }
	 
	    @Override
	    public int hashCode() {
	        int result = messagebox.hashCode();
	        result = 31 * result + messageId.hashCode();
	        return result;
	    }
	
}
