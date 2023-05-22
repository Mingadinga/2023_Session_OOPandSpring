package step3.customer;

public class PayWithCash implements Payable {
    private Integer money;

    public PayWithCash(Integer money) {
        this.money = money;
    }

    @Override
    public void pay(Integer cost) {
        if (money >= cost){
            this.money -= cost;
        } else {
            throw new RuntimeException("잔액이 부족합니다!");
        }
    }

}

