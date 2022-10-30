package homework9.geometry;

public class Triangle implements Shape{
    int a = 25;
    int b = 15;

    @Override
    public int area() {
        return a * b / 2;
    }
}
