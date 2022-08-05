package com.succeed;

import org.springframework.stereotype.Component;

/**
 * @author kinoz
 * @Date 2022/8/4 - 20:57
 * @apiNote
 */
@Component
public class Book {
    private String id;
    private String name;
    private double money;
    private String password;

    public Book() {
    }

    public Book(String id, String name, double money, String password) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", password='" + password + '\'' +
                '}';
    }
}
