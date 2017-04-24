package com.parangluv.withmypet.article.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parangluv.withmypet.article.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
