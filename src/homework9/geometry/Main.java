package homework9.geometry;

public class Main {

    public static void main(String[] args) {
        System.out.println("Figure's area is: " + calcArea());
    }

    public static int calcArea() {

        Figure[] figures = {new Round(), new Triangle(), new Square()};
        int sumArea = 0;
        for( int i = 0; i < figures.length; i++) {
           sumArea = sumArea + figures[i].figureArea();
        }
        return sumArea;
    }
}
