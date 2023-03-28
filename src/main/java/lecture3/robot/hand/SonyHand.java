package lecture3.robot.hand;

import lecture3.robot.base_robot.Hand;

public class SonyHand implements Hand {
    @Override
    public void takeSomething() {
        System.out.println("SonyHand");
    }
}
