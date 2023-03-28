package lecture2.patterns.structural_patterns.wlyweight;


public class Circle implements Shape {

    int r = 5;
    @Override
    public void draw(double x, double y) {
        System.out.println("Circle: " + x +", " + y+", " + r);
    }
}
