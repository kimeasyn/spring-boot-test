package me.xfactor.springboottest.service;

import lombok.RequiredArgsConstructor;
import me.xfactor.springboottest.domain.Article;
import me.xfactor.springboottest.dto.AddArticleRequest;
import me.xfactor.springboottest.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }
}
