package homework14;

import java.time.LocalDate;

public class Product {

    private final String type;
    private double price;
    private final boolean discountPossibility;
    private final LocalDate localDate;

    public Product(String type, double price, boolean discountPossibility, LocalDate localDate) {
        this.type = type;
        this.price = price;
        this.discountPossibility = discountPossibility;
        this.localDate = localDate;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscountPossibility() {
        return discountPossibility;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void gettingDiscount(int percent) {
        this.price -= this.price * percent / 100;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", discountPossibility=" + discountPossibility +
                ", localDate=" + localDate +
                '}';
    }
}
