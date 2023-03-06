package lecture2.patterns.creational_patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot("t1000", "t1", Power.l2500);

        Robot robot1 = (Robot) robot.clone("t1000", "t1", Power.l2500);

        System.out.println(robot1 == robot);
        System.out.println(robot1.getClass().getName().equals(robot.getClass().getName()));

        System.out.println(robot1);
        System.out.println(robot);

        List<Robot> robotList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
           robotList.add((Robot) robot.clone("base" + i , "model" + i, Power.l3500 ));
        }


        for (Robot el : robotList
             ) {
            System.out.println(el);
        }



    }
}
