package lecture1.unit5;

import static java.lang.Math.*;

public class Robot {

    private double x = 0;
    private double y = 0;
    private double distance = 0;
    private double course = 0;


    public void Robot(){}

    // Cтворення різноманітних конструкторів
    public Robot() {}

    public Robot(double distance) {
        this.distance = distance;
    }

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

//    public Robot(double distance, double course) {
//        this.distance = distance;
//        this.course = course;
//    }

    public Robot(double x, double y, double distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }

    public Robot(double x, double y, double distance, double course) {
        this.x = x;
        this.y = y;
        this.distance = distance;
        this.course = course;
    }


    // Розрахунок нових координа (x,y) з урахуванням курсу та дистанції
    public void forward(){
        x += (distance * cos(course * PI / 180));
        y = y + distance * sin(course * PI / 180);
    }


    public static void main(String[] args) {
        Robot robot = new Robot();

        System.out.println(robot);

        robot.distance = 100;
        robot.course = 90;

        robot.forward();

        System.out.println(robot);

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

//    public void setX(double x1){
//        x = x1;
//    }


    public void setX(double x){
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
}
