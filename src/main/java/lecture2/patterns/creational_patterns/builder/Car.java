package lecture2.patterns.creational_patterns.builder;

public class Car {


    private String name;
    private Engine engine;
    private Transmission transmission;
    private RoadType roadType;
    private SizeCar sizeCar;

    public Car() {
    }

    public Car(String name, Engine engine, Transmission transmission, RoadType roadType, SizeCar sizeCar) {
        this.name = name;
        this.engine = engine;
        this.transmission = transmission;
        this.roadType = roadType;
        this.sizeCar = sizeCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public RoadType getRoadType() {
        return roadType;
    }

    public void setRoadType(RoadType roadType) {
        this.roadType = roadType;
    }

    public SizeCar getSizeCar() {
        return sizeCar;
    }

    public void setSizeCar(SizeCar sizeCar) {
        this.sizeCar = sizeCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", roadType=" + roadType +
                ", sizeCar=" + sizeCar +
                '}';
    }
}
