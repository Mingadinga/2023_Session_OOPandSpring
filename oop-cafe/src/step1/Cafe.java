package step1;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Cafe {

    private Barista barista;
    private Menu menu;

    public void enter(Customer customer){
        MenuItem selectedMenuItem = customer.selectRandomMenuItem(menu);
        customer.setMoney(customer.getMoney() - selectedMenuItem.getPrice());
        barista.setAmount(barista.getAmount() + selectedMenuItem.getPrice());
        Coffee coffee = barista.makeCoffee(selectedMenuItem);
        customer.setCoffee(coffee);
    }

    public static void main(String[] args) {

        // init
        List<MenuItem> menuItemList = new ArrayList<>();
        menuItemList.add(new MenuItem("Americano", 1_500));
        menuItemList.add(new MenuItem("Cappuccino", 2_000));
        menuItemList.add(new MenuItem("Caramel Macchiato", 2_500));
        menuItemList.add(new MenuItem("Espresso", 2_500));
        Menu menu = new Menu(menuItemList);

        Barista bob = new Barista(100_000);
        Cafe cafe = new Cafe(bob, menu);

        Customer cathy = new Customer(50_000);

        // run
        cafe.enter(cathy);

    }

}
