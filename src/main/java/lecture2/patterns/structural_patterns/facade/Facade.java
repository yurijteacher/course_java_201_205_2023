package lecture2.patterns.structural_patterns.facade;

import lecture2.patterns.structural_patterns.composite.Robot;

public class Facade {


    public void print(){

        Hello h = new Hello();
        World w = new World();

        h.print();
        w.print();

    }

}
