package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
//Posts클래스 생성 후, Posts 클래스로 Database를 접근하게 해 줄 JpaRepository 를 생성한다.
public interface PostsRepository extends JpaRepository<Posts, Long>{ // JpaRepository <Entity, 기본키 타입> 을 상속받으면 crud가 자동으로 생성된다.
}
