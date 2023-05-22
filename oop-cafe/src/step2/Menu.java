package step2;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@AllArgsConstructor
public class Menu {
    // 불변 객체로 변경
    private final List<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
        items.add(new MenuItem("Americano", 1_500));
        items.add(new MenuItem("Cappuccino", 2_000));
        items.add(new MenuItem("Caramel Macchiato", 2_500));
        items.add(new MenuItem("Espresso", 2_500));
    }

    public MenuItem recommend() {
        Random random = new Random();
        int randomIndex = random.nextInt(items.size());
        return items.get(randomIndex);
    }
}

