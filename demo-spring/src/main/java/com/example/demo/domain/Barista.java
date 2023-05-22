package com.example.demo.domain;

import com.example.demo.domain.customer.Payable;

public class Barista {

    private Integer amount = 100_000; // db에서 조회

    public Coffee makeCoffee(MenuItem menuItem) {
        return new Coffee(menuItem);
    }

    public Coffee takeOrder(MenuItem menuItem, Payable payable) {
        payable.pay(menuItem.cost());
        receive(menuItem.cost());
        return makeCoffee(menuItem);
    }

    public void receive(Integer price) {
        this.amount += price;
    }
}
