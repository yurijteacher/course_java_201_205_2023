package lecture1.unit3;

public class Robot {
    double x = 0;
    double y = 0;
    double distance = 0;
    double course = 0;

    public Robot() {}

    public static void main(String[] args) {

     Robot robot = new Robot();
     robot.x = 5;
     robot.y = 5;
     robot.course = 10;
     robot.distance = 200;

        System.out.println(robot);

     //  System.out.println(robot.toString());

     robot.print();

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


    public void print(){
        System.out.println(
              "x:" +  x + ", y:" + y + "," + "course:" +course+ "," + "disctance:" +distance
        );
    }
}
