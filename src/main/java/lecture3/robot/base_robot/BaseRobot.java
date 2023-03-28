package lecture3.robot.base_robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class BaseRobot {
    @Autowired
    @Qualifier("appleBody")
    private Body body;
    @Autowired
    @Qualifier("ibmLeg")
    private Leg leg;
    @Autowired
    @Qualifier("appleHand")
    private Hand hand;
    @Autowired
    @Qualifier("appleHead")
    private Head head;


    public abstract void active();

    public BaseRobot() {
    }

    public BaseRobot(Body body, Leg leg, Hand hand, Head head) {
        this.body = body;
        this.leg = leg;
        this.hand = hand;
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

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

    @Override
    public String toString() {
        return "BaseRobot{" +
                "body=" + body +
                ", leg=" + leg +
                ", hand=" + hand +
                ", head=" + head +
                '}';
    }
}
