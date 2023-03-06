package groupe205.practical1.my_interface.robot;

public class RobotT1000 extends Robot{

    private String color;
    private String model;

    public RobotT1000() {
    }

    public RobotT1000(Body body, Head head, Leg leg, Hand hand) {
        super(body, head, leg, hand);
    }
    public RobotT1000(Body body, Head head, Leg leg, Hand hand, String color, String model) {
        super(body, head, leg, hand);
        this.color = color;
        this.model = model;
    }

    @Override
    public void dance() {
        System.out.println("dance T1000");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "RobotT2000{" +
                super.toString() +", " +
                "model='" + model + ", " +
                "color='" + color  +
                '}';
    }
}
