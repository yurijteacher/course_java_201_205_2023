package lecture2.patterns.structural_patterns.bridge;

import lecture2.patterns.structural_patterns.bridge.maker.Seat;
import lecture2.patterns.structural_patterns.bridge.maker.Skoda;
import lecture2.patterns.structural_patterns.bridge.road.Car;
import lecture2.patterns.structural_patterns.bridge.road.City;
import lecture2.patterns.structural_patterns.bridge.road.Sport;

public class Main {

    public static void main(String[] args) {

        Car skodaRX = new Sport(new Skoda());
        Car skoda2000 = new City(new Skoda());

        Car seat1000 = new City(new Seat());

        skodaRX.carDetails();
        skoda2000.carDetails();
        seat1000.carDetails();
    }

}
