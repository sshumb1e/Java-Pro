package homework14;

import java.util.*;
import java.util.stream.Collectors;

public class ProductBuilder {

    private final List<Product> products;

    public ProductBuilder(List<Product> products) {
        this.products = products;
    }

    public List<Product> getFilterTypePrice(String type, double price) {
        return products.stream()
                .filter(product -> product.getType().equals(type))
                .filter(product -> product.getPrice() > price)
                .toList();
    }

    public List<Product> discountWithType(String type, int percent) {
        return products.stream()
                .filter(product -> product.getType().equals(type))
                .filter(product -> product.isDiscountPossibility())
                .peek(product -> product.gettingDiscount(percent))
                .toList();
    }
    public Product getLowPrice(String type) throws NoSuchElementException {
        return products.stream()
                .filter(product -> product.getType().equals(type))
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(NoSuchElementException::new);
    }

    public List<Product> lastAdded() {
        return products.stream()
                .sorted(Comparator.comparing(Product::getLocalDate).reversed())
                .limit(3)
                .toList();
    }

    public double countSumByConditions(int year, String type, int maxPrice) {
        return products.stream()
                .filter(product -> product.getLocalDate().getYear() == year)
                .filter(product -> product.getType().equals(type))
                .filter(product -> product.getPrice() <= maxPrice)
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public Map<String, List<Product>> grouping() {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }



}
