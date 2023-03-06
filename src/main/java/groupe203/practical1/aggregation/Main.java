package groupe203.practical1.aggregation;

public class Main {

    public static void main(String[] args) {

        Engine engine1 = new Engine(1, "model-3000", Power.l3000);
        Engine engine2 = new Engine(2, "model-2500", Power.l2500);

        // Car car = new Car(1,"seat", "sad sad sad", engine1);

        Car car1 = new Car(2,"seat-2500", "sad sad sad", engine1);

        car1.setEngine(engine2);
        car1.setEngine(engine1);




    }
}
