package groupe204.practical1.realization_interface.my_interface;

public interface Calc {


    final double x = 5;

    public double add(double a, double b);

    double sub(double a, double b);

    default double div(double a, double b){

//        double c = 0;
//
//        if(b!=0){
//            c = a/b;
//        }
//
//        return c;

//        double c = (b!=0) ? a/b : 0;

        return (b!=0) ? a/b : 0;
    };

    static double mul(double a, double b){
        return a*b;
    }



}
