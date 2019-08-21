package org.javaboy.securitydy.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.javaboy.securitydy.bean.Role;
import org.javaboy.securitydy.bean.User;

import java.util.List;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-11 17:12
 */
public interface UserMapper {

    List<Role> getRolesById(Integer id);

    User loadUserByUsername(String username);
}
