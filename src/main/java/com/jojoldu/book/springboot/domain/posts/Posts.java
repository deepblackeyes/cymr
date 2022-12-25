package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor; //

import javax.persistence.*;

@Getter //코틀린 등의 새 언어 전환시 롬복이 더 필요 없을 경우 쉽게 삭제 가능
@NoArgsConstructor //기본 생성자 자동 추가
@Entity //주 어노이테션을 클래스에 가깝게 생성, 테이블과 링크될 클래스 , 절대 Setter 메소드 x
public class Posts extends BaseTimeEntity { //실제 DB 테이블과 매칭될 클래스

    @Id //pk 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK의 생성 규칙
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //해당 클래스의 빌더 패턴 클래스 생성
    public Posts(String title, String content, String author) { //생성자를 통해 DB 삽입
        this.title = title;
        this.content = content;
        this.author = author;
        //값 변경이 필요한 경우 해당 이벤트에 맞는 public 메소드 호출

    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
