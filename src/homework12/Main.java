package homework12;

public class Main {

    public static void main(String[] args) {

        String filePath1 = "C:/Hillel";
        String filePath2 = "C:/Hillel2";

        FileData file1 = new FileData("file1", 274, filePath1);
        FileData file2 = new FileData("file2", 95, filePath1);
        FileData file3 = new FileData("file3", 498, filePath2);
        FileData file4 = new FileData("file4", 321, filePath2);

        FileNavigator navigateFile = new FileNavigator();
        navigateFile.add(filePath1, file1);
        navigateFile.add(filePath1, file2);
        navigateFile.add(filePath2, file3);
        navigateFile.add(filePath2, file4);

        System.out.println(navigateFile.find(filePath1));

        System.out.println(navigateFile.filterBySize(700));

        System.out.println(navigateFile.filterBySize(455));

        navigateFile.add(filePath2, file1);

        navigateFile.remove(filePath1);
        System.out.println(navigateFile.find(filePath1));


    }
}
