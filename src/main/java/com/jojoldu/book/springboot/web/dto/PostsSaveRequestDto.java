package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
public class PostsSaveRequestDto { //controller와 서비스에 사용함
    private String title;
    private String content;
    private String author;
    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity(){ //request/response 클래스로 사용해선 안됨=>데이터 테이블과 직결연결이기 때문
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
