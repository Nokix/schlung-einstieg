package gmbh.conteco.schlungeinstieg.aop;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.LongStream;
import java.util.stream.Stream;

@Component
public class ShoppingCart {
    private Map<Item, Long> cart = new HashMap<>();

    private long itemCount = 0;

    private long price = 0;

    @LogMe
    public long addItem(Item item) {
        Long amountOfItem = cart.getOrDefault(item, 0L);
        amountOfItem++;
        cart.put(item, amountOfItem);
        return amountOfItem;
    }

    public void deleteItem(Item item) {
        cart.remove(item);
    }

    public long removeItem(Item item) {
        if (!cart.containsKey(item)) return 0;
        Long amountOfItem = cart.get(item);
        amountOfItem--;
        if (amountOfItem == 0) {
            cart.remove(item);
        } else {
            cart.put(item, amountOfItem);
        }
        return amountOfItem;
    }

    @LogMe
    public void checkout() {
        System.out.println("You have " + itemCount + " items in your cart.");
        System.out.println("The Price is: " + price);
    }

    public void updateItemCount() {
        this.itemCount = cart.values().stream()
                .mapToLong(Long::longValue).sum();
    }


    // von Torben
    public void updatePrice() {
        this.price = cart.keySet().stream()
                .mapToLong(item -> cart.get(item) * item.getPrice())
                .sum();
    }

    public long getItemCount() {
        return itemCount;
    }

    public long getPrice() {
        return price;
    }
}
