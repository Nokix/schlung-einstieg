package gmbh.conteco.schlungeinstieg.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartRunner implements CommandLineRunner {
    @Autowired
    ShoppingCart cart;

    @Override
    public void run(String... args) throws Exception {
        Item item0 = new Item("Hose", 1000L);
        Item item1 = new Item("Cola", 50L);

        cart.addItem(item0);
        cart.addItem(item1);
        cart.addItem(item1);
        cart.removeItem(item0);

        cart.checkout();
    }
}
