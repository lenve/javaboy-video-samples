package org.javaboy.json.bean;

import java.util.Date;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-23 6:36
 */
public class User {
    private Integer id;
    private String username;
    private String address;

//    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
