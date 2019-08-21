package org.javaboy.jpa2;

import org.javaboy.jpa2.bean.Book;
import org.javaboy.jpa2.dao1.BookDao1;
import org.javaboy.jpa2.dao2.BookDao2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Jpa2ApplicationTests {

    @Autowired
    BookDao1 bookDao1;
    @Autowired
    BookDao2 bookDao2;
    @Test
    public void contextLoads() {
        List<Book> all = bookDao1.findAll();
        System.out.println(all);
        List<Book> all1 = bookDao2.findAll();
        System.out.println(all1);
    }

}
