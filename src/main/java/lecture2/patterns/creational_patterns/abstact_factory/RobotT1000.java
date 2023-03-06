package lecture2.patterns.creational_patterns.abstact_factory;

public class RobotT1000 extends Robot {

    private String model;

    public RobotT1000() {
    }

    public RobotT1000(Head head, Hand hand, String model) {
        super(head, hand);
        this.model = model;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
