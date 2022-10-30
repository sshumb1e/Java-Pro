package homework9.geometry;

public class Main {

    public static void main(String[] args) {

        Shape[] figures = {new Round(), new Triangle(), new Square()};
        int sumArea = 0;
        for (int i = 0; i < figures.length; i++) {
            sumArea = sumArea + figures[i].area();
        }
        System.out.println(sumArea);

    }
}
