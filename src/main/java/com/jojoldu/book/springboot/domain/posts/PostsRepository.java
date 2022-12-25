package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> { //<엔티티 클래스, pk 타입
    //Dao라 불리는 DB Layer 접근자 -> JPA에선 Repository 인터페이스로 생성

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC") //가독성 중시
    List<Posts> findAllDesc();
}
