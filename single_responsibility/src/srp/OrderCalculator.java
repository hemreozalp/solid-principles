package srp;

public class OrderCalculator {
    private final double taxRate;
    public OrderCalculator(double taxRate){ this.taxRate = taxRate; }

    public double total(Order order){
        double subtotal = 0;
        for (Order.Item it : order.getItems()) subtotal += it.qty * it.unitPrice;
        return subtotal * (1.0 + taxRate);
    }
}