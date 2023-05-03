package gmbh.conteco.schlungeinstieg.aop;

public class Item {
    private String name;
    private long price;

    public Item(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public long getPrice() {
        return price;
    }
}
