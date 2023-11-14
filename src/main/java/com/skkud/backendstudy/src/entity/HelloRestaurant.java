package com.skkud.backendstudy.src.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DiscriminatorValue("RESTAURANT")
public class HelloRestaurant extends Hello{
    public HelloRestaurant(String name, String phoneNum, String description) {
        super(name, phoneNum, description);
    }
}
