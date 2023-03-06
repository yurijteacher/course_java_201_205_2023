package lecture2.patterns.creational_patterns.builder;

public class Main {


    public static void main(String[] args) {

        BuilderCar builderCar = new BuilderCar();
        builderCar.builderEngine(Engine.l3000);
        builderCar.builderTransmission(Transmission.manual);
        builderCar.builderRoadType(RoadType.sport);
        Car car = builderCar.builder();

        System.out.println(car);


        Car car1 = new BuilderCar()
                .builderSizeCar(SizeCar.l3000)
                .builderEngine(Engine.l2000)
                .builderRoadType(RoadType.city)
                .builderName("Seat-Sport")
                .builder();

    }
}
