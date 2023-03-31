package lecture2.patterns.behavioral_patterns.strategy;

public class StrategyMul implements Strategy{
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}
