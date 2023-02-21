package lecture1.unit4.robot;

public class Robot {

    protected double x = 0;
    protected double y = 0;
    protected double distance = 0;
    protected double course = 0;

    public static void main(String[] args) {

        RobotDefault robot1 = new RobotDefault();
        robot1.x = 10;

        RobotPublic robotPublic = new RobotPublic();
        robotPublic.x = 10;

        RobotPrivate robotPrivate = new RobotPrivate();
        // robotPrivate.x=

        RobotExt robotExt = new RobotExt();
        robotExt.x = 10;

    }



}
