package lecture2.patterns.behavioral_patterns.template_metod;

public class Football implements Game{
    @Override
    public void init() {
        System.out.println("init Football");
    }

    @Override
    public void startGame() {
        System.out.println("start Football");
    }

    @Override
    public void endGame() {
        System.out.println("end Football");
    }
}
