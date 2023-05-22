package com.example.demo;

import com.example.demo.domain.customer.PayWay;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderServiceTest {

    @Autowired OrderService orderService;

    @Test
    public void test() {
        orderService.order(PayWay.CASH);
    }
}

