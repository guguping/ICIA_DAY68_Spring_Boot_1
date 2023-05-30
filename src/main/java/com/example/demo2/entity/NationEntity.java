package com.example.demo2.entity;

import javax.persistence.*;

@Entity // Entity 클래스로 선언 : 테이블을 자바 객체화할 때 사용함 = 데이터베이스의 테이블 역활을 한다
        // 사용 전에 컬럼 하나는 필수로 있어야한다 보통 첫 컬럼은 pk 컬럼으로 많이 지정한다
@Table(name = "nation_table") // 테이블 이름을 원하는 이름으로 변경
public class NationEntity { // 테이블 이름의 디폴트는 2개의 대문자 문장의 앞을 소문자로 바꾸고 _ 를 붙인다 예)nation_entity
    @Id // pk 컬럼 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 적용
    private Long id;

    // column 추가
    @Column(length = 50,nullable = false , unique = true) 
    // length로 크기를 변경하고 nullable = false는 not null을 뜻한다 unique = true는 말그대로 유니크 제약조건을 뜻한다 ) nullable의 디폴트는 true이다
    private String nationName; // 컬럼의 이름도 테이블 이름과 같이 대문자를 소문자로 바꾸고 _ 를 붙인다 ) 디폴트 크기는 255이다 = nation_name varchar(255)

    @Column
    private int population;
}
