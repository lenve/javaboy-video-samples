package org.javaboy.mongorest.dao;

import org.javaboy.mongorest.bean.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-03 23:14
 */
public interface BookDao extends MongoRepository<Book, Integer> {
}
