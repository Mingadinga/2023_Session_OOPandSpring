package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MenuItem {
    @Getter private final String name;
    private final Integer price;
    public int cost() {
        return price;
    }
}
