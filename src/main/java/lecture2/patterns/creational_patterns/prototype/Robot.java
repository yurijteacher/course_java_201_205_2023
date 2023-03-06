package lecture2.patterns.creational_patterns.prototype;

public class Robot implements Cloneable {

   private String name;
   private String model;
   private Power power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Robot() {
    }

    public Robot(String name, String model, Power power) {
        this.name = name;
        this.model = model;
        this.power = power;
    }

    @Override
    public Object clone(String name, String model, Power power) {
        return new Robot(name, model, power);
    }

//    @Override
//    public String toString() {
//        return "Robot{" +
//                "name='" + name + '\'' +
//                ", model='" + model + '\'' +
//                ", power=" + power +
//                '}';
//    }
}
