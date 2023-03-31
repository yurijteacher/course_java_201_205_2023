package lecture2.patterns.behavioral_patterns.strategy;

public class Main {

    public static void main(String[] args) {

        StrategyAdd add = new StrategyAdd();

        ContextStrategy context = new ContextStrategy(add);
        System.out.println(context.execute(5, 6));

        StrategyDiv div = new StrategyDiv();
        context.setStrategy(div);

        System.out.println(context.execute(5, 0));
    }
}
