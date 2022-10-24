package lesson11;

public class Order implements Comparable<Order> {

    private int orderNumber;
    private String name;
    static int counter = 1;

    public Order(String name, int orderNumber) {
        this.name = name;
        this.orderNumber = counter++;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public String toString() {
        return " " + orderNumber + " | " + name;
    }

    @Override
    public int compareTo(Order order) {
        int compare = order.orderNumber;
        if (this.orderNumber > compare) {
            return 1;
        } else {
            return -1;
        }
    }
}
