package lecture2.patterns.behavioral_patterns.strategy;

public class ContextStrategy implements Strategy{

    private Strategy strategy;
    public ContextStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public double execute(double a, double b) {
        return strategy.execute(a, b);
    }
}
