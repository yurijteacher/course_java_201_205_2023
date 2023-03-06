package lecture2.patterns.creational_patterns.abstact_factory;

public class Main {

    public static void main(String[] args) {


        HandApple handApple = new HandApple();
        HeadSamsung headSamsung = new HeadSamsung();


        RobotT1000 robotT1000 = new RobotT1000(headSamsung, handApple, "t1000");

        HeadIBM headIBM = new HeadIBM();

        RobotT1000 robotT1001 = new RobotT1000(headIBM, handApple, "t1000");


    }
}
