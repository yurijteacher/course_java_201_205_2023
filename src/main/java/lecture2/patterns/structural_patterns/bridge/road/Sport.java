package lecture2.patterns.structural_patterns.bridge.road;

import lecture2.patterns.structural_patterns.bridge.maker.Maker;

public class Sport extends Car{
    public Sport(Maker maker) {
        super(maker);
    }

    @Override
    public void carDetails() {
        maker.setMaker();
        System.out.println("This is a sport car");
    }


}
