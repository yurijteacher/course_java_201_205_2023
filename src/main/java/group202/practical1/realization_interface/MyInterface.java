package group202.practical1.realization_interface;

public interface MyInterface {
    public double add(double a, double b);
    double sub(double a, double b);

    default double mul(double a, double b){
//        double c = 0;
//        c = a*b;
//        return c;

        return a*b;
    }

    static double div(double a, double b){

//        double c = 0;
//        if(b!=0){
//            c = a/b;
//        }

        return (b!=0) ? a/b : 0;
    }



}
