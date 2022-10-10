package lesson8.geometry;

public class Square implements Figure {

    int a = 25;

    @Override
    public int figureArea() {
        return a * a;
    }
}
