package lesson5;

import java.util.Scanner;

public class Calculator {

    static Scanner scanner;
    static double num1;
    static double num2;

    public static void main(String[] args) {
        System.out.println("Calculator");
        getInputs();

    }
    private static void getInputs() {

        scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        num1 = scanner.nextDouble();

        System.out.print("Input a number: ");
        num2 = scanner.nextDouble();

        doCalculation(doOption(), num1, num2);
    }
    private static int doOption() {

        scanner = new Scanner(System.in);

        System.out.print("""
                --------------------------
                Choose an option:
                1 - Addition.
                2 - Subtraction.
                3 - Multiplication.
                4 - Division.
                0 - Exit.
                """);

        return scanner.nextInt();
    }
    private static void doCalculation(int option, double num1, double num2) {
        switch (option) {
            case 1 -> {
                double result = num1 + num2;
                System.out.println("Result: " + result);
                getInputs();
            }
            case 2 -> {
                double result = num1 - num2;
                System.out.println("Result: " + result);
                getInputs();
            }
            case 3 -> {
                double result = num1 * num2;
                System.out.println("Result: " + result);
                getInputs();
            }
            case 4 -> {
                double result = num1 / num2;
                System.out.println("Result: " + result);
                getInputs();
            }
            case 0 -> {
                System.out.println("App is closed");
                scanner.close();
                System.exit(0);

            }
            default -> throw new IllegalStateException("Unexpected value: " + doOption());
        }
    }
}
