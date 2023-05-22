package com.example.demo.domain.customer;

public enum PayWay {
    CARD, CASH;

    public static PayWay of(String type) {
        if(type.equals("card")) return PayWay.CARD;
        else if(type.equals("cash")) return PayWay.CASH;
        throw new UnsupportedOperationException();
    }
}
