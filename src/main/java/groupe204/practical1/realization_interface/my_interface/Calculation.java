package groupe204.practical1.realization_interface.my_interface;

public class Calculation implements Calc, Information{
    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double sub(double a, double b) {
        return a-b;
    }

    @Override
    public void info() {
        System.out.println("It is a my calculation");
    }
}
