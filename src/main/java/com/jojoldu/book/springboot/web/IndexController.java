package com.jojoldu.book.springboot.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor // 이거 없이 Controller 만 쓰니깐 안됐다 이유는 모르겠다..
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";

        //mustache 의 기본 경로는 /main/java/resource/templates 이다.
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}
