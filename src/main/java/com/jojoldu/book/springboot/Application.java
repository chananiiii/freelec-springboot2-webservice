package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // 내장 WAS 실행
        // 이렇게 되면 tomcat 을 따로 설치할 필요가 없다.
        SpringApplication.run(Application.class, args);
    }
}
