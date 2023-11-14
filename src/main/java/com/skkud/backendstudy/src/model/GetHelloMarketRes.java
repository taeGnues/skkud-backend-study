package com.skkud.backendstudy.src.model;

import lombok.Data;

@Data
public class GetHelloMarketRes {

    private Long id;
    private String name;
    private String description;
//    private String imageOriginName;
//    private String imageSavedName;

    public GetHelloMarketRes(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
