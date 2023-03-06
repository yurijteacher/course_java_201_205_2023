package lecture2.patterns.creational_patterns.factory;

public class Square implements Share{

    double s = 6;
    @Override
    public void draw(double x, double y) {
        System.out.println("Square: " + x +", " + y + ", " + s);
    }
}
