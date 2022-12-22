package com.jojoldu.book.springboot.web.dto;


public class HelloResponseDtoTest {


    public void 롬복_기능_테스트() {

        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then


    }
}
