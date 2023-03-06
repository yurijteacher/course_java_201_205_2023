package groupe201.practical1.my_interface.robot_interface;

public class RobotT2000{
    private ElRobot elRobot;
    private Leg leg;
    private Hand hand;
    private Head head;
    private Body body;

    public RobotT2000(ElRobot elRobot, Leg leg, Hand hand, Head head, Body body) {
        this.elRobot = elRobot;
        this.leg = leg;
        this.hand = hand;
        this.head = head;
        this.body = body;
    }
}
