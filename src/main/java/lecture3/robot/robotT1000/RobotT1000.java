package lecture3.robot.robotT1000;

import lecture3.robot.base_robot.*;
import lecture3.robot.hand.SamsungHand;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class RobotT1000 extends BaseRobot {

    private String color;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String model;

    @Override
    public void active() {

    }

    public RobotT1000() {
    }

    public RobotT1000(Body body, Leg leg, Hand hand, Head head) {
        super(body, leg, hand, head);
    }

    public RobotT1000(String color, Date date, String model) {
        this.color = color;
        this.date = date;
        this.model = model;
    }

    public RobotT1000(String color, String model) {
        this.color = color;
        this.model = model;
        this.date = new Date();
    }

    public RobotT1000(Body body, Leg leg, Hand hand, Head head, String color, Date date, String model) {
        super(body, leg, hand, head);
        this.color = color;
        this.date = date;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "RobotT1000{" +
                "body=" + getBody() +
                ", leg=" + getLeg() +
                ", hand=" + getHand() +
                ", head=" + getHead() +
                ", color='" + color + '\'' +
                ", date=" + date +
                ", model='" + model + '\'' +
                '}';
    }
}
