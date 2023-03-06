package groupe203.practical1.realization_interface.realization_abst_class;

public abstract class Calc {

    public abstract double add(double x, double y);

    public abstract double sub(double x, double y);

    double div(double x, double y){
        return (y!=0) ? x/y : 0;
    }

    static double mul(double x, double y){
        return x * y;
    }



}
