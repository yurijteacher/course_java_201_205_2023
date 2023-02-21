package lecture1.unit7;

public class RobotLine {

    private double oldX;
    private double oldY;
    private double oldCourse;
    private double oldDist;

    public RobotLine() {
    }

    public RobotLine(double oldX, double oldY, double oldCourse, double oldDist) {
        this.oldX = oldX;
        this.oldY = oldY;
        this.oldCourse = oldCourse;
        this.oldDist = oldDist;
    }

    public double getOldX() {
        return oldX;
    }

    public void setOldX(double oldX) {
        this.oldX = oldX;
    }

    public double getOldY() {
        return oldY;
    }

    public void setOldY(double oldY) {
        this.oldY = oldY;
    }

    public double getOldCourse() {
        return oldCourse;
    }

    public void setOldCourse(double oldCourse) {
        this.oldCourse = oldCourse;
    }

    public double getOldDist() {
        return oldDist;
    }

    public void setOldDist(double oldDist) {
        this.oldDist = oldDist;
    }

    @Override
    public String toString() {
        return "RobotLine{" +
                "oldX=" + oldX +
                ", oldY=" + oldY +
                ", oldCourse=" + oldCourse +
                ", oldDist=" + oldDist +
                '}';
    }
}
