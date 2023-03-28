package lecture2.patterns.structural_patterns.composite;

public class Main {

    public static void main(String[] args) {

        RobotT1000 t1000 = new RobotT1000();
        RobotT2000 t2000 = new RobotT2000();
        RobotT3000 t3000 = new RobotT3000();

        CompositeRobot composite1 = new CompositeRobot();
        composite1.addComposite(t1000);
        composite1.addComposite(t2000);

        CompositeRobot composite2 = new CompositeRobot();
        composite2.addComposite(composite1);
        composite2.addComposite(t3000);

        composite2.action();

    }
}
