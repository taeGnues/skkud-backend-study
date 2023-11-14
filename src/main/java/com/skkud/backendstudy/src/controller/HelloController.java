package com.skkud.backendstudy.src.controller;

import com.skkud.backendstudy.src.entity.Hello;
import com.skkud.backendstudy.src.model.GetHelloMarketAllRes;
import com.skkud.backendstudy.src.model.GetHelloMarketRes;
import com.skkud.backendstudy.src.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/hello")
public class HelloController {

    HelloService helloService;

//    @GetMapping("/{keyword}")
//    public List<GetHelloMarketRes> searchHelloMartInfos(@PathVariable String keyword){
//        List<GetHelloMarketRes> helloMartInfos = helloService.searchHelloMartNameLike(keyword);
//
//        return helloMartInfos;
//    }

    @GetMapping("/all")
    public List<Long> helloAll(){
        List<Long> hellos = new ArrayList<>();
        try {
            hellos = helloService.helloAll();
        }catch (Exception e){
            e.printStackTrace();
        }

        return hellos;
    }

    @GetMapping("")
    public String hello(){
        return "hello";
    }

}
