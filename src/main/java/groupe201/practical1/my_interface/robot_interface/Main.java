package groupe201.practical1.my_interface.robot_interface;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       // Robot robot = new Robot();

        Robot robot = new RobotT1000();

        HandSony handSony = new HandSony();
        HeadApple headApple = new HeadApple();
        LegSony legSony = new LegSony();
        BodySamsung bodySamsung = new BodySamsung();

        robot.setBody(bodySamsung);
        robot.setHand(handSony);
        robot.setLeg(legSony);
        robot.setHead(headApple);


        RobotT1000 robotT1000 = new RobotT1000();
        robotT1000.setModel("t1000");
        robotT1000.setBody(bodySamsung);
        robotT1000.setHand(handSony);
        robotT1000.setLeg(legSony);
        robotT1000.setHead(headApple);

        RobotT1000 robotT2000 = new RobotT1000(legSony, handSony, headApple, bodySamsung, "t2000");

        List<RobotT1000> robots =  new ArrayList<>();
        robots.add(robotT2000);
        robots.add(robotT1000);

        for (Robot el : robots) {
            System.out.println(el);
        }

        robots.stream().forEach(System.out::println);
        robots.stream().forEach(e->System.out.println(e));

        HeadSamsung headSamsung = new HeadSamsung();

        RobotT1000 robotT2001 = new RobotT1000(legSony, handSony, headSamsung, bodySamsung, "t2000");
        robotT2000.setHead(headSamsung);


    }
}
