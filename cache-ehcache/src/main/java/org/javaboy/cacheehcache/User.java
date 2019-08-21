package org.javaboy.cacheehcache;

import java.io.Serializable;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-07 16:55
 */
public class User implements Serializable {
    private Integer id;
    private String name;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
