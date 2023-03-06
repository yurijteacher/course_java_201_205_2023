package groupe203.practical1.generalization;

public abstract class Robot extends Info{

    private double x = 0;
    private double y = 0;


    public abstract void dance();
    public Robot() {
    }

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y;
    }
}
