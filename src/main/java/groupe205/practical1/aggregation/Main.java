package groupe205.practical1.aggregation;

public class Main {

    public static void main(String[] args) {

        Engine engine1 = new Engine(1L,"engite-2500",2560);
        Engine engine2 = new Engine(1L,"engite-2000",3560);


        Car car1 = new Car(1L, "seat-2000", engine1);
        Car car2 = new Car(2L, "seat-2000", engine2);
        Car car3 = new Car(3L, "seat-2500", engine1);

        groupe205.practical1.composition.Car car = new groupe205.practical1.composition.Car(1L,"sa","SAD SAD ASD");
    }

}
