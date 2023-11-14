package com.skkud.backendstudy.src.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DiscriminatorValue("CAFE") // DTYPE value가 생략할 경우 HelloCafe로 들어감.
public class HelloCafe extends Hello{
    public HelloCafe(String name, String phoneNum, String description) {
        super(name, phoneNum, description);
    }
}
