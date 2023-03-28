package lecture2.patterns.structural_patterns.bridge.road;

import lecture2.patterns.structural_patterns.bridge.maker.Maker;

public abstract class Car {

    Maker maker;

    public Car(Maker maker) {
        this.maker = maker;
    }

    public abstract void carDetails();


}
