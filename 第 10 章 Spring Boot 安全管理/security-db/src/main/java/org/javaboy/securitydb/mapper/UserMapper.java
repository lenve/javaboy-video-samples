package org.javaboy.securitydb.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.javaboy.securitydb.bean.Role;
import org.javaboy.securitydb.bean.User;

import java.util.List;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-11 14:26
 */
@Mapper
public interface UserMapper {
    User loadUserByUsername(String username);

    List<Role> getUserRolesById(Integer id);
}
