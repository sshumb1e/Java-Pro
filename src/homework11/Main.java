package homework11;

public class Main {

    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.add("Jone");
        coffeeOrderBoard.add("Loli");
        coffeeOrderBoard.add("Kass");

        coffeeOrderBoard.draw();
        coffeeOrderBoard.delivery(1);
        coffeeOrderBoard.delivery();
        coffeeOrderBoard.draw();
    }
}
