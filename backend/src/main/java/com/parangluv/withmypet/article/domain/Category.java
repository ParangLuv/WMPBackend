package com.parangluv.withmypet.article.domain;

public enum Category {
	NOTICE("공지사항"),
	QNA("문의"),
	FREE("자유"),
	NEWS("뉴스"),
	ETC("기타");
	
	
	private String category;
	
	Category(String category) {
		this.category = category;
	}
}
