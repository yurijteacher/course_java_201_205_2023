package lecture3.robot.hand;

import lecture3.robot.base_robot.Hand;
import org.springframework.stereotype.Component;

@Component
public class AppleHand implements Hand {
    @Override
    public void takeSomething() {
        System.out.println("AppleHand");
    }
}
