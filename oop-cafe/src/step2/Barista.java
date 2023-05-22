package step2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Barista {

    private Integer amount;

    private Coffee makeCoffee(MenuItem menuItem) {
        return new Coffee(
                menuItem.getName(),
                menuItem.getPrice());
    }

    private void receive(Integer value) {
        this.amount += value;
    }

    // 추가
    public Coffee takeOrder(MenuItem menuItem, Customer customer) {
        customer.pay(menuItem.getPrice()); // 손님의 결제 수단에 상관없이 결제만 요청
        receive(menuItem.getPrice());
        return makeCoffee(menuItem);
    }
}

