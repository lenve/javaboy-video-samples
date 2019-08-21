package org.javaboy.freemarker.bean;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-20 6:59
 */
public class User {
    private Long id;
    private String username;
    private String address;
    private Integer gender;

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
