package step3;

import lombok.Getter;
import step3.customer.Payable;

public class Barista {

    @Getter
    private Integer amount;

    public Barista(Integer amount) {
        this.amount = amount;
    }

    public Coffee makeCoffee(MenuItem menuItem) {
        return new Coffee(menuItem);
    }

    public Coffee takeOrder(MenuItem menuItem, Payable payable) {
        // 얼렁뚱땅 넘어간 코드 : menuItem.cost() 사용이 반복됨
        // 만약 할인 가격을 계산해야한다면 무엇이 바뀔까요?
        // 두개의 관심사 혼재 : 계산해야하는 가격 얻기, 결제하기
        // 어떻게 해결해야할까요?
        payable.pay(menuItem.cost());
        receive(menuItem.cost());
        Coffee coffee = makeCoffee(menuItem);
        return coffee;
    }

    private void receive(Integer price) {
        this.amount += price;
    }
}
