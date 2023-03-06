package lecture2.patterns.creational_patterns.builder;

public class BuilderCar {

    private String name = "seat-200";
    private Engine engine = Engine.l2500;
    private Transmission transmission =Transmission.auto;
    private RoadType roadType = RoadType.city;
    private SizeCar sizeCar = SizeCar.l2700;


    BuilderCar builderName(String name){
        this.name = name;
        return this;
    }
    BuilderCar builderEngine(Engine e){
        this.engine = e;
        return this;
    }

    BuilderCar builderTransmission(Transmission t){
        this.transmission =t;
        return this;
    }

    BuilderCar builderRoadType(RoadType rt){
        this.roadType = rt;
        return this;
    }

    BuilderCar builderSizeCar(SizeCar sc){
        this.sizeCar = sc;
        return this;
    }


    public Car builder(){
        Car car = new Car();

        car.setName(name);
        car.setSizeCar(sizeCar);
        car.setTransmission(transmission);
        car.setEngine(engine);
        car.setRoadType(roadType);

        return car;
    }

}
