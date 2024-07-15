package me.xfactor.springboottest.repository;

import me.xfactor.springboottest.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
