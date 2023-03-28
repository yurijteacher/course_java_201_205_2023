package lecture3;

import lecture3.robot.robotT1000.RobotT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("all-config.xml");

        RobotT1000 robotT1000 = (RobotT1000) context.getBean("t1000");
        System.out.println(robotT1000);

        System.out.println(new Date());

        RobotT1000 robotT2000 = (RobotT1000) context.getBean("t2000");
        System.out.println(robotT2000);

        RobotT1000 robotT3000 = (RobotT1000) context.getBean("t3000");
        System.out.println(robotT3000);
    }
}
