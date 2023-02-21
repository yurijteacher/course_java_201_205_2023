package groupe204.practical1.composition;

public class Car {

    private Long id;
    private String model;
    private String name;
    private Engine engine;

    public Car() {
    }
    public Car(Long id, String model, String name) {
        this.id = id;
        this.model = model;
        this.name = name;
        engine = new Engine(1L, "Engine 2500",2500);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
