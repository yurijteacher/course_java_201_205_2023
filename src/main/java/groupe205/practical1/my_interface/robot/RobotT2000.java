package groupe205.practical1.my_interface.robot;

public class RobotT2000 extends Robot{

    private String name = "Name-T2000";
    @Override
    public void dance() {
        System.out.println("dance T2000");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RobotT2000() {
    }

    public RobotT2000(String name) {
        this.name = name;
    }

    public RobotT2000(Body body, Head head, Leg leg, Hand hand, String name) {
        super(body, head, leg, hand);
        this.name = name;
    }

    @Override
    public String toString() {
        return "RobotT2000{" +
                super.toString() +
                "name='" + name + '\'' +
                '}';
    }
}
