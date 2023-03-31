package lecture2.patterns.behavioral_patterns.template_metod;

public class Basketball implements Game {
    @Override
    public void init() {
        System.out.println("init Basketball");
    }

    @Override
    public void startGame() {
        System.out.println("start Basketball");
    }

    @Override
    public void endGame() {
        System.out.println("end Basketball");
    }
}
