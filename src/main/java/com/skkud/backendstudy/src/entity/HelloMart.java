package com.skkud.backendstudy.src.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DiscriminatorValue("MART")
public class HelloMart extends Hello{
    public HelloMart(String name, String phoneNum, String description) {
        super(name, phoneNum, description);
    }
}
