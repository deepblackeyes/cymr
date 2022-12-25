package com.jojoldu.book.springboot.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {
    //메인 페이지
    @GetMapping("/")
    public String index(){
        return "index";
    }

    //글 등록
    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

}
