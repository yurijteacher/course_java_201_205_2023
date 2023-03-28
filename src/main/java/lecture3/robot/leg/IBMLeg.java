package lecture3.robot.leg;

import lecture3.robot.base_robot.Leg;
import org.springframework.stereotype.Component;

@Component
public class IBMLeg implements Leg {
    @Override
    public void go() {
        System.out.println("IBMLeg");
    }
}
