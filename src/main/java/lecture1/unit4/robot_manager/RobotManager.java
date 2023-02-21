package lecture1.unit4.robot_manager;

import lecture1.unit4.robot.RobotDefault;
import lecture1.unit4.robot.RobotExt;
import lecture1.unit4.robot.RobotPrivate;
import lecture1.unit4.robot.RobotPublic;

public class RobotManager {
    public static void main(String[] args) {

        //
        RobotDefault robot1 = new RobotDefault();
//         robot1.x = 10; - відсутній

        RobotPublic robotPublic = new RobotPublic();
        robotPublic.x = 10;

        RobotPrivate robotPrivate = new RobotPrivate();
        // robotPrivate.x=10; - відсутній

        RobotExt robotExt = new RobotExt();
        // robotExt.x = 10; - відсутній

    }
}
