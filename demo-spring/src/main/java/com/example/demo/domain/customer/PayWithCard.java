package com.example.demo.domain.customer;

public class PayWithCard implements Payable {
    private Card card = new Card(10_000); // db에서 조회

    public void pay(Integer cost) {
        card.pay(cost);
    }

    private class Card {
        private String cardNum;

        private Integer money;

        public Card(Integer money) {
            this.money = money;
        }

        private void pay(Integer cost) {
            if(this.money >= cost) {
                this.money -= cost;
            } else {
                throw new RuntimeException("잔액이 부족합니다!");
            }
        }
    }
}

