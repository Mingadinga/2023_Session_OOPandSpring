package step3.customer;

public class PayWithCard implements Payable {
    private Card card;

    public PayWithCard(Integer money) {
        this.card = new Card(money);
    }

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
            if (money >= cost){
                this.money -= cost;
            } else {
                throw new RuntimeException("잔액이 부족합니다!");
            }
        }
    }
}
