package com.example.demo;

import com.example.demo.domain.customer.PayWay;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CafeController {

    private final OrderService orderService;

    @PostMapping("/customers/{id}/order/{payWay}")
    public String recommendOrder(@PathVariable Integer id, @PathVariable String payWay) {
        // payway 검증 필요하다면 추가
        orderService.order(PayWay.of(payWay));
        return "커피 나왔습니다. 맛있게 드세요.";
    }

}
