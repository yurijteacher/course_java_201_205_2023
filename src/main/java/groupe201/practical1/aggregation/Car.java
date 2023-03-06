package groupe201.practical1.aggregation;

public class Car {

    private Long id;
    private String name;
    private String description;
    private Engine engine;

    public Car() {
    }

    public Car(Long id, String name, String description, Engine engine) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.engine = engine;
    }

    //Get


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", engine=" + engine +
                '}';
    }

    public static void main(String[] args) {
        Engine engine1 = new Engine(1L, "Power-2500", 2500);

        Car car = new Car(1L, "seat-2000","sad sadf as", engine1);
        Car car1 = new Car(2L, "seat-2500","asd sadf as", engine1);

        System.out.println(car1.toString());
        System.out.println(car);

        Engine engine2 = new Engine(2L, "Power-4500", 4500);
        Car car2 = new Car(2L, "seat-2500","asd sadf as", engine2);

    }
}
