package group202.practical1.generalization;

public class RobotExt extends Robot{
    private double course;
    private double distance;

    @Override
    public void dance() {
        System.out.println("dance");
    }

    public RobotExt() {}

    public RobotExt(double course, double distance) {
        this.course = course;
        this.distance = distance;
    }

    public RobotExt(String name, double x, double y, double course, double distance) {
        super(name, x, y);
        this.course = course;
        this.distance = distance;
    }

    public void print(){

        System.out.println("RobotExt{" +
                super.toString() +", " +
                "course=" + course +
                ", distance=" + distance +"}");
    }


    public static void main(String[] args) {

        RobotExt robotExt = new RobotExt("t1000", 5,6.5,7.3,8.5);

        robotExt.print();

        robotExt.dance();

        System.out.println(
                robotExt.getX() +", " +  robotExt.getY()
        );

        robotExt.info();

        // robotExt.forward();

    }

}
