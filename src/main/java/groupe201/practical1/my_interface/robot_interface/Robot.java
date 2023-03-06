package groupe201.practical1.my_interface.robot_interface;

import java.util.Objects;

public abstract class Robot {

    private Leg leg;
    private Hand hand;
    private Head head;
    private Body body;

    public Robot() {}

    public Robot(Leg leg, Hand hand, Head head, Body body) {
        this.leg = leg;
        this.hand = hand;
        this.head = head;
        this.body = body;
    }

    public abstract void dance();

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return ", hand=" + hand +
                ", head=" + head +
                ", body=" + body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Robot robot)) return false;
        return getLeg().equals(robot.getLeg()) && getHand().equals(robot.getHand()) && getHead().equals(robot.getHead()) && getBody().equals(robot.getBody());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLeg(), getHand(), getHead(), getBody());
    }
}
