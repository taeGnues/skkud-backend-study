package com.skkud.backendstudy.src.model;

import com.skkud.backendstudy.src.entity.HelloImage;
import lombok.Data;

import java.util.List;

@Data
public class GetHelloMarketAllRes {
    private Long id;
    private String name;
    private String phoneNum;
    private String description;
    private List<HelloImage> helloImages;

    public GetHelloMarketAllRes(Long id, String name, String phoneNum, String description, List<HelloImage> helloImages) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.description = description;
        this.helloImages = helloImages;
    }
}
