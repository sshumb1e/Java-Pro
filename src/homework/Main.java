package homework;
import java.util.Scanner;
public class Main {
    static Scanner sc;
    static String clientName;
    static double sumDeposit;

    static ClientDeposit client;
    static String infoClient;
    public static void main(String[] args) {
        inputData();
        showData(processData());
    }
    private static void inputData() {
        sc = new Scanner(System.in);
        System.out.print("Enter your name and surname: ");
        clientName = sc.nextLine();
        System.out.print("Enter amount of deposit: ");
        sumDeposit = sc.nextDouble();
    }
    public static void showData(String output) {
        System.out.println(output);
    }
    private static String processData() {
        client = new ClientDeposit(clientName, sumDeposit);
        infoClient = client.infoClient();
        return infoClient;



    }
}
