package com.example.demo.domain;

import com.example.demo.domain.customer.Customer;
import org.springframework.stereotype.Component;

@Component
public class Cafe {

    private final Menu menu;

    public Cafe(Menu menu) {
        this.menu = menu;
    }

    public void enter(Customer customer, Barista barista) {
        customer.order(menu, barista);
    }

}
