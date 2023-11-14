package com.skkud.backendstudy.src.repository;

import com.skkud.backendstudy.src.entity.Hello;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface HelloRepository extends JpaRepository<Hello, Long> {

    @Query("""
    select h.id from Hello h
    """)
    List<Long> helloAllTest();


//    @Query("""
//        select h.id, h.name, h.description, himg.imageOriginName, himg.imageSavedName from HelloImage himg, Hello h, HelloMart hm where himg.hello.id=h.id and h.id=hm.id and h.name like %:keyword% order by h.id desc limit 3
//    """)
//    List<GetHelloMarketRes> findHelloMartInfoByNameIncludeKeywordOrderByDesc(@Param("keyword") String keyword);

    @Query("""
        select new com.skkud.backendstudy.src.model.GetHelloMarketRes(h.id, h.name, h.description) from Hello h, HelloMart hm where h.id=hm.id and h.name like %:keyword% order by h.id desc limit 3
    """)
    List<GetHelloMarketRes> findHelloMartInfoByNameIncludeKeywordOrderByDesc(@Param("keyword") String keyword);



}