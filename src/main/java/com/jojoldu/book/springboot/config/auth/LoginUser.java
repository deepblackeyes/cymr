package com.jojoldu.book.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)//어노테이션 생성 위치 지정, 파라미터 선언 객체에서만 사용
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {
}
