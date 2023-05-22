package step1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Barista {

    private Integer amount;

    public Coffee makeCoffee(MenuItem menuItem) {
        return new Coffee(
                menuItem.getName(),
                menuItem.getPrice());
    }

}
