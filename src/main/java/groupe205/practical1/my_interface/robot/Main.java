package groupe205.practical1.my_interface.robot;

public class Main {

    public static void main(String[] args) {

      // Robot robot = new Robot();

      AppleLeg appleLeg = new AppleLeg();
      IBMHand ibmHand = new IBMHand();
      SonyBody sonyBody = new SonyBody();
      SamsungHead samsungHead = new SamsungHead();

      RobotT1000 t1000 = new RobotT1000(sonyBody, samsungHead, appleLeg, ibmHand, "red","T1000");
      System.out.println(t1000);


      SonyLeg sonyLeg = new SonyLeg();
      RobotT2000 t2000 = new RobotT2000(sonyBody, samsungHead, sonyLeg, ibmHand, "red");

    }
}
