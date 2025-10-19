package srp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    public static class Item {
        public final String sku;
        public final int qty;
        public final double unitPrice;

        public Item(String sku, int qty, double unitPrice) {
            this.sku = sku;
            this.qty = qty;
            this.unitPrice = unitPrice;
        }
    }

    private final String customerEmail;
    private final List<Item> items = new ArrayList<>();

    public Order(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void addItem(String sku, int qty, double unitPrice) {
        items.add(new Item(sku, qty, unitPrice));
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
