package com.jojoldu.book.springboot.domain.post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> { //<엔티티 클래스, pk 타입
    //Dao라 불리는 DB Layer 접근자 -> JPA에선 Repository 인터페이스로 생성
}
