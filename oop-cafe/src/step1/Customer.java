package step1;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Random;

@Getter @Setter
public class Customer {

    private Integer money;
    private Coffee coffee;

    public Customer(Integer money) {
        this.money = money;
    }

    public MenuItem selectRandomMenuItem(Menu menu) {
        List<MenuItem> menuItems = menu.getItems();
        Random random = new Random();
        int randomIndex = random.nextInt(menuItems.size());
        return menuItems.get(randomIndex);
    }

}
