package groupe204.practical1.realization_interface.realization_abst_class;

public abstract class Calculation extends Information{

    final double x = 5;

    public abstract double add(double a, double b);

    public abstract double sub(double a, double b);

    public double div(double a, double b){
        return (b!=0) ? a/b : 0;
    };

    static double mul(double a, double b){
        return a*b;
    }

}
