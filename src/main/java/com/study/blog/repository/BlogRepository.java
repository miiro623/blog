package com.study.blog.repository;

import com.study.blog.domain.Article;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public interface BlogRepository extends JpaRepository<Article, Long> {
}
