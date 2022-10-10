package lesson8.geometry;

public class Triangle implements Figure {

    int a = 15;
    int b = 20;

    @Override
    public int figureArea() {
        return a * b / 2;
    }
}
