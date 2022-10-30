package homework9.geometry;

public class Round implements Shape {

    int radius = 46;

    @Override
    public int area() {
        return (int) (radius * radius * Math.PI);
    }
}
