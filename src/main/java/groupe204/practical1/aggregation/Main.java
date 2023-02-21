package groupe204.practical1.aggregation;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(1L, "Model 3000", 2800);
        Engine engine1 = new Engine(2L, "Model 3500", 3000);

        Car car = new Car(1L, "seat3000", "sad", engine);
        Car car1 = new Car(2L, "seat3500", "sad", engine);
        Car car2 = new Car(3L, "seat3500", "sad", engine1);

        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);
    }
}
