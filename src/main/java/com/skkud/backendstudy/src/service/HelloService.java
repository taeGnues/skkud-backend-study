package com.skkud.backendstudy.src.service;

import com.skkud.backendstudy.src.entity.Hello;
import com.skkud.backendstudy.src.model.GetHelloMarketAllRes;
import com.skkud.backendstudy.src.model.GetHelloMarketRes;
import com.skkud.backendstudy.src.repository.HelloRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HelloService {
    private HelloRepository helloRepository;

//    @Transactional
//    public List<GetHelloMarketRes> searchHelloMartNameLike(String keyword) {
//
//        List<GetHelloMarketRes> helloMartInfos = helloRepository.findHelloMartInfoByNameIncludeKeywordOrderByDesc(keyword);
//
//        return helloMartInfos;
//    }

    @Transactional
    public List<Long> helloAll(){
//        List<Long> hellos = new ArrayList<>();
//
//        try {
//            hellos = helloRepository.findAll().stream().map(Hello::getId).toList();
////            hellos = helloRepository.helloAll();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        Hello hello1 = new Hello("jeong", "01012341234", "설명1");
//        Hello hello2 = new Hello("ha", "01012341234", "설명2");
//        Hello hello3 = new Hello("kim", "01012341234", "설명3");
//
//        helloRepository.save(hello1);
//        helloRepository.save(hello2);
//        helloRepository.save(hello3);

        List<Long> hellos = helloRepository.helloAllTest();
        return hellos;
    }

}
