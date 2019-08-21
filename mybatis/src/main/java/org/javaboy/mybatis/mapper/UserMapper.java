package org.javaboy.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.javaboy.mybatis.bean.User;

import java.util.List;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-28 9:28
 */
//@Mapper
public interface UserMapper {
    List<User> getAllUser();
}
