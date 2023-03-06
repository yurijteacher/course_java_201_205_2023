package groupe204.practical1.realization_interface.realization_abst_class;

public class Calc extends Calculation{
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public void info() {
        System.out.println("info");
    }
}
