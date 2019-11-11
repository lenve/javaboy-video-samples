package org.javaboy.thymeleaf.bean;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-20 7:59
 */
public class Book {
    private Integer id;
    private String name;
    private String author;
    private Double price;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
