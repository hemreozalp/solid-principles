package srp;

public class OrderPrinter {
    public void print(Order order, double total){
        System.out.println("Order for: " + order.getCustomerEmail());
        for (Order.Item it : order.getItems())
            System.out.println("- " + it.sku + " x" + it.qty + " @ " + it.unitPrice);
        System.out.println("TOTAL=" + total);
    }
}
