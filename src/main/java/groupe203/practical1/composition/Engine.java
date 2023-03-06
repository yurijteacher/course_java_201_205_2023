package groupe203.practical1.composition;

public class Engine {

    private int id;

    private String model = "def";

    private Power power = Power.l3000;

    public Engine() {
    }

    public Engine(int id, String model, Power power) {
        this.id = id;
        this.model = model;
        this.power = power;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Power getPower() {
        return power;
    }

    public void setPower(Power power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}
