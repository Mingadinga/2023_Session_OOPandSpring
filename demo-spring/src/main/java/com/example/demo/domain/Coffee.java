package com.example.demo.domain;

import lombok.Getter;

public class Coffee {
    @Getter
    private String name;
    private Integer price;

    public Coffee(MenuItem menuItem) {
        this.name = menuItem.getName();
        this.price = menuItem.cost();
    }
}
