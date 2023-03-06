package groupe203.practical1.composition;

public class Car {

    private int id;
    private String name;

    private String desc;

    private Engine engine;

    public Car(int id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.engine = new Engine(1, "model-2500", Power.l3000);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", engine=" + engine +
                '}';
    }
}
