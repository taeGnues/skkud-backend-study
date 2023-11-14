package com.skkud.backendstudy.src.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class HelloImage {

    @Id
    @Column(name = "HELLO_IMAGE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageSavedName;
    private String imageOriginName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HELLO_ID")
    private Hello hello;

}
