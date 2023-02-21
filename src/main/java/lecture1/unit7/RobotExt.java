package lecture1.unit7;

public class RobotExt extends Robot {

    private double totalDistance = 0;


    public RobotExt() {
    }

    public RobotExt(double x, double y, double distance, double course) {
        super(x, y, distance, course);
    }


    public static void main(String[] args) {

        RobotExt robotExt = new RobotExt(1,2,3,4);

        System.out.println(robotExt);


        robotExt.setCourse(90);
        robotExt.setDistance(1000);
        robotExt.forward();

        System.out.println(robotExt);

        robotExt.setCourse(45);
        robotExt.setDistance(500);
        robotExt.forward();

        System.out.println(robotExt);

        for (RobotLine el : robotExt.getRobotLineList()
             ) {
            System.out.println(el);
        }


    }

    @Override
    public void forward(){
        super.forward();
        getTotalDistance();
    }

    public void getTotalDistance(){
        totalDistance += getDistance();
    }


    @Override
    public String toString() {
        return "RobotExt{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", distance=" + getDistance() +
                ", course=" + getCourse() +
                ", totalDistance=" + totalDistance +
                '}';
    }
}
