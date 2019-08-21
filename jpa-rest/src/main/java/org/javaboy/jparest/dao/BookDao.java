package org.javaboy.jparest.dao;

import org.javaboy.jparest.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-02 8:08
 */
@CrossOrigin
@RepositoryRestResource(path = "bs",collectionResourceRel = "bs",itemResourceRel = "b")
public interface BookDao extends JpaRepository<Book,Integer> {
    @RestResource(path = "byname",rel = "findbyname")
    List<Book> findBookByNameContaining(@Param("name") String name);
}