package group202.practical1.aggregation;

public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine();
        engine.setId(1L);
        engine.setName("Honda-3500");
        engine.setPower(Power.l3500);


        Car car = new Car(1L, "HondaCLR", engine);

        System.out.println(car);

        Car car1 = new Car(2L, "Opel-RS", engine);
    }
}
