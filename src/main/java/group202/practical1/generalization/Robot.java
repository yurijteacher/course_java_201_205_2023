package group202.practical1.generalization;

public abstract class Robot extends Info{

    private String name;
    private double x;
    private double y;

    private double forward(){
        return 0;
    }

    public abstract void dance();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Robot() {
    }

    public Robot(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y;
    }
}
