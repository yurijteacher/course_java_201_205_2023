package groupe201.practical1.my_interface.calculation;

public interface Calculation {

    final double c = 0;


    double add(double a, double b);
    double sub(double a, double b);
    default double mul(double a, double b){
//        double c = a * b;
//        return c;
        return a * b;
    };
    static double div(double a, double b){

//        double c = 0;
//        if(b!=0){
//            c = a/b;
//        }
//        return c;

        return (b!=0) ? a/b : 0;
    };

}
