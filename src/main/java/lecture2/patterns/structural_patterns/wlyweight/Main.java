package lecture2.patterns.structural_patterns.wlyweight;

import java.util.Arrays;

public class Main
{


    public static void main(String[] args) {

        FlyweightShare flyweight = new FlyweightShare();

        Shape shape1 = flyweight.getShare("point");
        Shape shape2 = flyweight.getShare("circle");
        Shape shape3 = flyweight.getShare("square");

        Shape shape4 = flyweight.getShare("square");
        Shape shape5 = flyweight.getShare("square");
        Shape shape6 = flyweight.getShare("square");

        System.out.println(shape3);
        System.out.println(shape4);
        System.out.println(shape5);
        System.out.println(shape6);

    }

}
