package step3;

import step3.customer.*;

public class Cafe {

    private final Barista barista;
    private final Menu menu = new Menu();

    public Cafe(Barista barista) {
        this.barista = barista;
    }

    public void enter(Customer customer) {
        customer.order(menu, barista);
    }

    public static void main(String[] args) {
        Barista barista = new Barista(100_000);
        Cafe cafe = new Cafe(barista);

        PayWay clientChoice = PayWay.CASH; // 사용자 입력
        Payable payable = PayableFactory.with(clientChoice, 10_000);
        Customer customer = new Customer(payable);

        cafe.enter(customer);
    }

}
