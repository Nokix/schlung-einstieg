package gmbh.conteco.schlungeinstieg.aop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShoppingCartTest {

    @Autowired
    ShoppingCart cart;

    private Item itemA;
    private Item itemB;

    @BeforeEach
    void setUp() {
        itemA = new Item("A", 1L);
        itemB = new Item("B", 2L);
    }

    @Test
    void addItemTest() {
        cart.addItem(itemA);
        assertEquals(1, cart.getItemCount());
    }

    @Test
    void addItemTest2() {
        assertEquals(4, 4);
    }
}