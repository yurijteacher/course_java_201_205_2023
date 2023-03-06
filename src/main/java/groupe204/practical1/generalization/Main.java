package groupe204.practical1.generalization;

public class Main {

    public static void main(String[] args) {

        Robot robot;
       // robot = new Robot();

        RobotExt robotExt = new RobotExt(1,4,5,6);

        System.out.println(robotExt);

        robotExt.info();

    }


}
