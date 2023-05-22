package com.example.demo;

import com.example.demo.domain.Barista;
import com.example.demo.domain.Cafe;
import com.example.demo.domain.customer.Customer;
import com.example.demo.domain.customer.PayWay;
import com.example.demo.domain.customer.PayableFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final Cafe cafe;

    public void order(PayWay payway) {
        Customer customer = new Customer(PayableFactory.of(payway));
        Barista barista = new Barista();
        cafe.enter(customer, barista);
    }

}
