package com.example.demo.domain.customer;

import com.example.demo.domain.*;

public class Customer {
    private Coffee coffee;
    private Payable payable;

    public Customer(Payable payable) {
        this.payable = payable;
    }

    public void order(Menu menu, Barista barista) {
        MenuItem menuItem = menu.recommend();
        Coffee coffee = barista.takeOrder(menuItem, payable);
        this.coffee = coffee;
    }
}
