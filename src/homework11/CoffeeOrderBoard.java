package homework11;


import java.util.HashMap;
import java.util.Map;

public class CoffeeOrderBoard {

    private int nextOrder = 0;
    private int orderForDelivery = 0;
    private Map<Integer, Order> orders = new HashMap<>();

    public void add(String name) {
        this.orders.put(nextOrder, new Order(name, nextOrder));
        nextOrder++;
    }

    public Order delivery() {
        boolean present = orders.containsKey(orderForDelivery);
        if (present) {
            Order order = orders.get(orderForDelivery);
            orders.remove(orderForDelivery);
            return order;
        } else {
            System.out.println("there is no order in the queue");
            return null;
        }
    }
    public Order delivery(int number) {
        if (orders.containsKey(number)) {
            Order order = orders.get(number);
            orders.remove(number);
            return order;
        }
        else {
            System.out.println("present order is not in queue");
            return null;
        }
    }

    public void draw() {
        System.out.println("====================");
        System.out.println("Num" + " | " + "Name");
        for (Map.Entry<Integer, Order> orderEntry: orders.entrySet()) {
            System.out.println(orderEntry.getKey() + " | " + orderEntry.getValue().getName());
        }
    }
}