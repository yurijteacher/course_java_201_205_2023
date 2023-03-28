package lecture2.patterns.structural_patterns.wlyweight;

public class Square implements Shape {

    double s = 6;
    @Override
    public void draw(double x, double y) {
        System.out.println("Square: " + x +", " + y + ", " + s);
    }
}
