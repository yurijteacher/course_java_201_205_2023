package groupe205.practical1.my_interface.robot;

public abstract class Robot {
    private Body body;
    private Head head;
    private Leg leg;
    private Hand hand;

    public Robot() {}
    public Robot(Body body, Head head, Leg leg, Hand hand) {
        this.body = body;
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public abstract void dance();

    @Override
    public String toString() {
        return "body=" + body +
                ", head=" + head +
                ", leg=" + leg +
                ", hand=" + hand;
    }
}
