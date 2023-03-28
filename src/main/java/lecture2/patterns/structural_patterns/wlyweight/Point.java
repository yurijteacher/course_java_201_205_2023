package lecture2.patterns.structural_patterns.wlyweight;


public class Point implements Shape {
    @Override
    public void draw(double x, double y) {
        System.out.println("Point: " + x +", " + y);
    }
}
