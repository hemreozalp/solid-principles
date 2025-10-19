import java.util.*;
import java.time.*;

class BadOrderProcessor {
    static class OrderItem {
        String sku;
        int qty;
        double unitPrice;
        OrderItem(String sku, int qty, double unitPrice){
            this.sku = sku; this.qty = qty; this.unitPrice = unitPrice;
        }
    }

    private final List<OrderItem> items = new ArrayList<>();
    private final String customerEmail;
    private final double taxRate;

    BadOrderProcessor(String customerEmail, double taxRate){
        this.customerEmail = customerEmail; this.taxRate = taxRate;
    }

    void addItem(String sku, int qty, double unitPrice){
        items.add(new OrderItem(sku, qty, unitPrice));
    }

    double calculateTotal(){
        double subtotal = 0;
        for (OrderItem it : items) subtotal += it.qty * it.unitPrice;
        return subtotal * (1.0 + taxRate);
    }

    void saveToDatabase(){
        System.out.println("[DB] Order saved at " + LocalDateTime.now());
    }

    void sendEmailReceipt(){
        System.out.println("[MAIL] Sent receipt to " + customerEmail);
    }

    void printSummary(){
        System.out.println("Order for: " + customerEmail);
        for (OrderItem it : items)
            System.out.println("- " + it.sku + " x" + it.qty + " @ " + it.unitPrice);
        System.out.println("TOTAL=" + calculateTotal());
    }

    public static void main(String[] args){
        BadOrderProcessor p = new BadOrderProcessor("customer@example.com", 0.20);
        p.addItem("ABC-1", 2, 100);
        p.addItem("XYZ-9", 1, 250);
        p.printSummary();
        p.saveToDatabase();
        p.sendEmailReceipt();
    }
}