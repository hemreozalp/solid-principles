package srp;
import srp.*;

public class App {
    public static void main(String[] args){
        Order order = new Order("customer@example.com");
        order.addItem("ABC-1", 2, 100);
        order.addItem("XYZ-9", 1, 250);

        OrderService service = new OrderService(
                new OrderRepository(),
                new OrderCalculator(0.20),
                new EmailNotifier(),
                new OrderPrinter()
        );

        service.checkout(order);
    }
}
