package groupe201.practical1.my_interface.robot_interface;

public class RobotT1000 extends Robot{

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public RobotT1000() {}

    @Override
    public void dance() {
        System.out.println("dance!!!");
    }

    public RobotT1000(String model) {
        this.model = model;
    }

    public RobotT1000(Leg leg, Hand hand, Head head, Body body, String model) {
        super(leg, hand, head, body);
        this.model = model;
    }

    @Override
    public String toString() {
        return "RobotT1000{" +
                super.toString() +
                " ,model='" + model + '\'' +
                '}';
    }
}
