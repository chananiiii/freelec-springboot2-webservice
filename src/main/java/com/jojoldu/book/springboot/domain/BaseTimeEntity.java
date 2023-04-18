package com.jojoldu.book.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // JPA Entity 들이 BaseTimeEntity를 상속할 경우 필드(createdDate, modifiedDate) 도 칼럼으로 인식하게 함
@EntityListeners(AuditingEntityListener.class) // BaseTimeEntity 클래스에 Auditing 기능 포함
public abstract class BaseTimeEntity {
    @CreatedDate
    private LocalDateTime createdDate; // Entity 가 생성되어 저장될 때 시간이 자동저장
    @LastModifiedDate
    private LocalDateTime modifiedDate; // 조회한 Entity 의 값을 변경할 때 시간이 자동 저장된다.
}
