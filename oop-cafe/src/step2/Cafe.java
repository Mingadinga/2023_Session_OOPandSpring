package step2;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Cafe {

    private Barista barista;
    private Menu menu;

    public void enter(Customer customer){
        customer.orderCoffee(barista, menu);
    }

    public static void main(String[] args) {

        Menu menu = new Menu();
        Barista bob = new Barista(100_000);
        Customer cathy = new Customer(50_000);
        Cafe cafe = new Cafe(bob, menu);

        cafe.enter(cathy);

    }

}


