package groupe203.practical1.realization_interface;

public class Calculation implements MyInterface, Information{
    @Override
    public double add(double x, double y) {
        return x + y;
    }

    @Override
    public double sub(double x, double y) {
        return x - y;
    }

    @Override
    public void print() {
        System.out.println("info");
    }
}
