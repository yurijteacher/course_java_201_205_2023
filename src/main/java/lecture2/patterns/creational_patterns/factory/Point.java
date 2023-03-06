package lecture2.patterns.creational_patterns.factory;

public class Point implements Share{
    @Override
    public void draw(double x, double y) {
        System.out.println("Point: " + x +", " + y);
    }
}
