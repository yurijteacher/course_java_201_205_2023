package lecture2.patterns.structural_patterns.bridge.road;

import lecture2.patterns.structural_patterns.bridge.maker.Maker;

public class City extends Car{
    public City(Maker maker) {
        super(maker);
    }

    @Override
    public void carDetails() {
        maker.setMaker();
        System.out.println("This is a city car");
    }
}
