package com.skkud.backendstudy.src.repository;

import com.skkud.backendstudy.src.entity.Hello;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest // @DataJpaTest로 할 경우 오류 발생
public class HelloRepositoryTest {

    Logger log = (Logger) LoggerFactory.getLogger(HelloRepositoryTest.class);

    @Autowired
    private HelloRepository helloRepository;


    @Test
    public void findAllTest() {

        // Given
        Hello hello1 = new Hello("jeong", "01012341234", "설명1");
        Hello hello2 = new Hello("ha", "01012341234", "설명2");
        Hello hello3 = new Hello("kim", "01012341234", "설명3");
        helloRepository.save(hello1);
        helloRepository.save(hello2);
        helloRepository.save(hello3);

        List<Long> hellos = helloRepository.helloAllTest();
        log.info(hellos.toString());

        assertEquals(hello1.getId(), hellos.get(0));

    }
}
