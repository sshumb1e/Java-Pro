package homework13;

import java.util.*;

public class Main {

    public static void main(String[] args) {

       FileNavigator fileNavigator = new FileNavigator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book name: ");
        String name = scanner.nextLine().trim();
        scanner.close();

        fileNavigator.readBook(name);
        fileNavigator.writeReport(name);

        System.out.println("\n" + fileNavigator.findTenPopularWords());
        System.out.println("\nCount uniq words = ".concat(String.valueOf(fileNavigator.countUniqueWords())));
    }
}
