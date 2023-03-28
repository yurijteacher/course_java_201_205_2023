package lecture3.robot.body;

import lecture3.robot.base_robot.BaseRobot;
import lecture3.robot.base_robot.Body;
import org.springframework.stereotype.Component;

@Component
public class AppleBody implements Body {

    @Override
    public void base() {
        System.out.println("AppleBody");
    }
}
