package lecture1.unit7;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;
import static java.lang.Math.PI;

public class Robot {

    private double x = 0;
    private double y = 0;
    private double distance = 0;
    private double course;

    private List<RobotLine> robotLineList = new ArrayList<>();

    //

    public Robot() {}

    public Robot(double x, double y, double distance, double course) {
        this.x = x;
        this.y = y;
        this.distance = distance;
        this.course = course;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double getDistance() {
        return distance;
    }
    public double getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", distance=" + distance +
                ", course=" + course +
                '}';
    }

    public void forward(){
        x += distance * cos(course * PI / 180);
        y += distance * sin(course * PI / 180);

        robotLineList.add(new RobotLine(x, y, distance, course));
    }

    public List<RobotLine> getRobotLineList() {
        return robotLineList;
    }
    public void setRobotLineList(List<RobotLine> robotLineList) {
        this.robotLineList = robotLineList;
    }
}
