package com.example.demo.domain.customer;

public class PayableFactory {
    public static Payable of(PayWay payWay) {
        if (payWay == PayWay.CASH) return new PayWithCash();
        if (payWay == PayWay.CARD) return new PayWithCard();
        throw new RuntimeException();
//        else return new PayNotAllowed();
    }
}
