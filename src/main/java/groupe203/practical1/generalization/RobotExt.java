package groupe203.practical1.generalization;

public class RobotExt extends Robot {

    private double course = 0;
    private double distance = 0;

    public RobotExt() {
    }

    public RobotExt(double course, double distance) {
        this.course = course;
        this.distance = distance;
    }

    public RobotExt(double x, double y, double course, double distance) {
        super(x, y);
        this.course = course;
        this.distance = distance;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    @Override
    public void dance() {
        System.out.println("dance");
    }

    @Override
    public String toString() {
        return "RobotExt{" +
                super.toString() +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }
}
