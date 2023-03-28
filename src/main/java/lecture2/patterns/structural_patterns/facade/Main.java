package lecture2.patterns.structural_patterns.facade;

public class Main {


    public static void main(String[] args) {

        Hello h = new Hello();
        World w = new World();
        h.print();
        w.print();

        new Facade().print();
    }
}
