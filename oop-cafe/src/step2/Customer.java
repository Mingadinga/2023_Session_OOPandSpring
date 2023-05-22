package step2;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Random;

public class Customer {

    private Integer money;
    private Coffee coffee;

    public Customer(Integer money) {
        this.money = money;
    }

    public void orderCoffee(Barista barista, Menu menu) {
        MenuItem menuItem = menu.recommend();
        Coffee coffee = barista.takeOrder(menuItem, this);
        this.coffee = coffee;
    }

    public void pay(Integer cost) {
        if (money >= cost) {
            this.money -= cost;
        } else {
            throw new RuntimeException("잔액이 부족합니다!");
        }
    }

}



