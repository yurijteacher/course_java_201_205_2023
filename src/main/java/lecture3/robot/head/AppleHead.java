package lecture3.robot.head;

import lecture3.robot.base_robot.Head;
import org.springframework.stereotype.Component;

@Component
public class AppleHead implements Head {
    @Override
    public void calculationN() {
        System.out.println("AppleHead");
    }
}
