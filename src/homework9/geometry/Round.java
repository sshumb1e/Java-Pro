package homework9.geometry;

public class Round implements Figure {

    int radius = 30;

    @Override
    public int figureArea() {
        return (int) (radius * radius * Math.PI);
    }
}
