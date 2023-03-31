package lecture2.patterns.behavioral_patterns.strategy;

public class StrategyDiv implements Strategy{
    @Override
    public double execute(double a, double b) {
//        double c = 0;
//        if(b!=0){
//            c = a/b;
//        }
        // else { c = 0; }
        // c = (b!=0) ? a/b :0 ;

        return (b!=0) ? a/b : 0;
    }
}
