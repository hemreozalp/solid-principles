package srp;

import java.time.LocalDateTime;

public class OrderRepository {
    public void save(Order order){
        System.out.println("[DB] Saved order for " + order.getCustomerEmail() + " at " + LocalDateTime.now());
    }
}
