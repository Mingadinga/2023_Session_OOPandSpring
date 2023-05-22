package step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Menu {
    private final List<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
        items.add(new MenuItem("Americano", 1_500));
        items.add(new MenuItem("Cappuccino", 2_000));
        items.add(new MenuItem("Caramel Macchiato", 2_500));
        items.add(new MenuItem("Espresso", 2_500));
    }

    public MenuItem choose(String name) {
        for(MenuItem each: items) {
            if (each.getName().equals(name)) {
                return each;
            }
        }
        return null;
    }

    public String recommend() {
        Random random = new Random();
        int randomIndex = random.nextInt(items.size());
        return items.get(randomIndex).getName();
    }
}


