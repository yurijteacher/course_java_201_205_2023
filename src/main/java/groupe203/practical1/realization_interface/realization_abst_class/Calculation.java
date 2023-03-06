package groupe203.practical1.realization_interface.realization_abst_class;

public class Calculation extends Calc{
    @Override
    public double add(double x, double y) {
        return x+y;
    }

    @Override
    public double sub(double x, double y) {
        return x-y;
    }
}
