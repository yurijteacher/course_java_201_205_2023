package groupe201.lab1;

public class Attribute {
    private Long id;
    private String name;
    private double unit;


    public Attribute() {
    }

    public Attribute(Long id, String name, double unit) {
        this.id = id;
        this.name = name;
        this.unit = unit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnit() {
        return unit;
    }

    public void setUnit(double unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unit=" + unit +
                '}';
    }
}
