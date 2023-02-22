package groupe205.practical1.composition;

public class Car {

    private long id;
    private String name;
    private String description;
    private Engine engine;

    public Car() {}

    public Car(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.engine = new Engine(1L,"aw", 200);
    }
}
