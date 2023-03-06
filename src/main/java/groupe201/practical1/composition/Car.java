package groupe201.practical1.composition;

public class Car {

    private Long id;
    private String name;
    private String description;
    private Engine engine;


    public Car() {
    }

    public Car(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.engine = new Engine(1L, "seat-2399", 3500);
    }

    public static void main(String[] args) {

        Car car = new Car(1L, "asd","sdf dsf");

        Car car1 = new Car(2L, "asd","sdf dsf");
    }

}
