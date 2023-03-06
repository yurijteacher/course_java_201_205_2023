package lecture2.patterns.creational_patterns.factory;

public class Circle implements Share{

    int r = 5;
    @Override
    public void draw(double x, double y) {
        System.out.println("Circle: " + x +", " + y+", " + r);
    }
}
