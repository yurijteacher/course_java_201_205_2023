package lecture1.unit5;

public class RobotExt extends Robot{

    public RobotExt(double x, double y, double distance, double course) {
        super(x, y, distance, course);
    }

    public static void main(String[] args) {

        Robot robot = new Robot();
        // ініціалізація даних за допомогою методів set()
        robot.setX(10);
        robot.setY(10);
        robot.setCourse(45);
        robot.setDistance(100);

        robot.forward();

        System.out.println(robot);


        // Використання пустого конструктора
        Robot robot1 = new Robot();
        System.out.println(">>" + robot1);

        // Використання коструктора з одим аргументом
        Robot robot2 = new Robot(100);
        System.out.println(">>" + robot2);

        Robot robot3 = new Robot(10, 10);
        System.out.println(">>" + robot3);

        Robot robot4 = new Robot(8,8,8);
        System.out.println(">>" + robot4);

        Robot robot5 = new Robot(1,2,3,4);

        System.out.println(">>" + robot5);
        // Використання повного коструктора
        RobotExt robotExt = new RobotExt(10,11,12,13);

        System.out.println(robotExt.toString());


        Robot robot6 = new Robot();
        robot6.setX(100);
        robot6.setY(100);
        robot6.setCourse(45);
        robot6.setDistance(1000);

        System.out.println(robot6);




    }

}
