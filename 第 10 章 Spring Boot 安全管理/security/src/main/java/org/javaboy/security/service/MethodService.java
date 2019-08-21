package org.javaboy.security.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-11 11:04
 */
@Service
public class MethodService {
    @PreAuthorize("hasRole('admin')")
    public String admin() {
        return "hello admin";
    }

    @Secured("ROLE_user")
    public String user() {
        return "hello user";
    }

    @PreAuthorize("hasAnyRole('admin','user')")
    public String hello() {
        return "hello hello";
    }
}
