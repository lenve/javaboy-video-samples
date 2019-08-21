package org.javaboy.controlleradvice;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-24 14:53
 */
public class Book {
    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
