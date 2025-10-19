package srp;

public class OrderService {
    private final OrderRepository repo;
    private final OrderCalculator calculator;
    private final Notifier notifier;
    private final OrderPrinter printer;

    public OrderService(OrderRepository repo, OrderCalculator calculator, Notifier notifier, OrderPrinter printer){
        this.repo = repo; this.calculator = calculator; this.notifier = notifier; this.printer = printer;
    }

    public void checkout(Order order){
        double total = calculator.total(order);
        printer.print(order, total);
        repo.save(order);
        notifier.notify(order.getCustomerEmail(), "Receipt total=" + total);
    }
}
