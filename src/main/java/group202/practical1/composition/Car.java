package group202.practical1.composition;

public class Car {

    private Long id;
    private String name;

    private Engine engine;


    public Car() {}

    public Car(Long id, String name) {
        this.id = id;
        this.name = name;
        this.engine = new Engine(1L, "model-2500", Power.l2500);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
