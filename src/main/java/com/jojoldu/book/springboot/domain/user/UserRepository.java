package com.jojoldu.book.springboot.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User>  findByemail(String email); //소셜로그인 반환되는 값 중 email을 통해
    //생성 사용자, 처음 사용자인지 판별
}
