package lecture2.patterns.creational_patterns.abstact_factory;

public abstract class Robot {

    private Head head;
    private Hand hand;

    public Robot() {
    }

    public Robot(Head head, Hand hand) {
        this.head = head;
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
