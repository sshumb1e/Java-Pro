package homework3;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(methodTask6(5,8));
        methodTask7();
        System.out.println(methodTask8(24));
        methodTask9();
        System.out.println(methodTask10(2045));

    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 75;
        int b = 27;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = -25;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 44;
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean methodTask6 (int a, int b) {

        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }

    public static void methodTask7() {
        int y = 21;
        if (y >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отприцательное");
        }
    }

    public static boolean methodTask8(int x) {
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void methodTask9() {
        String line = "apple";
        int t = 4;
        for (int i = 1; i <= t; i++) {
            System.out.println("[" + i + "]" + " " + line);
        }
    }

    public static boolean methodTask10(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }

    }
}
