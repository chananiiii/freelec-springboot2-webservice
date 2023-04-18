package com.jojoldu.book.springboot.domain.posts;


import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // 롬복 어노테이션
@NoArgsConstructor // 롬복 어노테이션
@Entity // JPA 어노테이션, 테이블과 링크될 클래스임을 나타낸다. 보통 _으로 테이블 이름을 매칭
//ex TestJava.java -> test_java table
public class Posts extends BaseTimeEntity {
    @Id // PK 필드를 나타냅니다.
    @GeneratedValue(strategy= GenerationType.IDENTITY) // PK 생성 규칙을 나타낸다. // GenerationType.IDENTITY는 auto_increment 를 의미한다.
    private Long id;

    @Column(length = 500, nullable = false) // 테이블의 칼럼을 나타낸다. 굳이 선언하지 않아도 해당 클래스의 필드는 모두 칼럼이 된다.
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 해당 클래스의 빌더 패턴 클래스 생성
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) { // 쿼리를 던지는 부분이 없다.
        this.title = title;
        this.content = content;
    }
}
