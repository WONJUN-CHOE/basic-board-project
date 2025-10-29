package com.springbasic.basicboardproject.repository;

import com.springbasic.basicboardproject.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
