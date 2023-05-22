package step3.customer;

import step3.Barista;
import step3.Coffee;
import step3.Menu;
import step3.MenuItem;

public class Customer {
    private Coffee coffee;

    // 손님은 결제할 수 있다
    private Payable payable;

    // 실제로 어떤 Payable 클래스가 들어올지는 외부에서 결정한다
    public Customer(Payable payable) {
        this.payable = payable;
    }

    public void order(Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menu.recommend());
        barista.takeOrder(menuItem, payable);
        this.coffee = coffee;
    }
}

