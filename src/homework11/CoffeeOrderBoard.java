package homework11;

import java.util.Collections;
import java.util.LinkedList;

public class CoffeeOrderBoard {

    LinkedList<Order> ordersList = new LinkedList<>();

    public void add(String name) {
        Order order = new Order(name,1);
        if(!ordersList.contains(order)) {
            ordersList.addLast(order);
        }
    }

    public void deliver() {
        Collections.sort(ordersList);
        ordersList.remove(ordersList.getFirst());
    }

    public void deliver(int orderNumber) {
        for (Order orders: ordersList) {
            if (orders.getOrderNumber() == orderNumber) {
                ordersList.remove(orders);
            }
        }
    }

    public void draw() {
        System.out.println("Number" + " | " + "Name");
        ordersList.forEach((order) -> System.out.println(order.toString()));
    }
}
