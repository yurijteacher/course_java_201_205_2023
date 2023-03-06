package groupe201.practical1.composition;

public class Engine {

    private Long id;
    private String model;
    private int power;


    public Engine() {
    }

    public Engine(Long id, String model, int power) {
        this.id = id;
        this.model = model;
        this.power = power;
    }

    //Get/Set

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}
