package me.xfactor.springboottest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.xfactor.springboottest.domain.Article;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {

    private String title;
    private String content;

    public Article toEntity() {
        // 빌더 패턴을 사용해 DTO -> Entity로 변환
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
