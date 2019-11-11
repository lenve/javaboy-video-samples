package org.javaboy.mongo.dao;

import org.javaboy.mongo.bean.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-02 7:31
 */
public interface BookDao extends MongoRepository<Book,Integer> {
    List<Book> findBookByNameContaining(String name);
}
