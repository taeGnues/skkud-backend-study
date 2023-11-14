package com.skkud.backendstudy.src.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Inheritance(strategy = InheritanceType.JOINED) // 조인 전략
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DiscriminatorColumn(name = "DTYPE") // DTYPE column 생성
public class Hello {

    @Id
    @Column(name = "HELLO_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String phoneNum;

    @Lob
    private String description;

    @OneToMany(mappedBy = "hello") // 다대일 양방향.
    private List<HelloImage> helloImages = new ArrayList<>();

    public Hello(String name, String phoneNum, String description) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.description = description;
    }
}
