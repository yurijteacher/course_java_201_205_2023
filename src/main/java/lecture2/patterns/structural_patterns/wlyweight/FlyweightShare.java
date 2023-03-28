package lecture2.patterns.structural_patterns.wlyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightShare {

    public static final Map<String, Shape> shares = new HashMap<>();
    public Shape getShare(String name){

        Shape shape = shares.get(name);

        if(shape == null){

            switch (name){

                case ("point"):
                    shape = new Point();
                break;
                case ("square"):
                    shape = new Square();
                    break;
                case ("circle"):
                    shape = new Circle();
                    break;
            }

            shares.put(name, shape);
        }


        return  shape;
    }



}
