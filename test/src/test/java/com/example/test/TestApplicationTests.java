package com.example.test;

import com.example.test.entity.BookEntity;
import com.example.test.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void contextLoads() {
        Iterable<BookEntity> all = bookRepository.findAll();
        for (BookEntity bookEntity : all) {
            System.out.println(bookEntity.toString());
        }
    }

}
