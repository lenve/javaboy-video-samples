package org.javaboy.jpa2.dao1;

import org.javaboy.jpa2.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-29 7:32
 */
public interface BookDao1 extends JpaRepository<Book,Integer> {
}
