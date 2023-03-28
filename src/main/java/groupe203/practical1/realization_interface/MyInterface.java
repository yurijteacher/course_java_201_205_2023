package groupe203.practical1.realization_interface;

public interface MyInterface {

    final int a = 5;
    static int a2 = 6;

    public double add(double x, double y);

    double sub(double x, double y);

    default double div(double x, double y){

//        double c = 0;
//
//        if(y!=0){
//            c = x/y;
//        }
//
//        return c;

//        double z = (y!=0) ? x/y : 0;
//
//        return z;

        return (y!=0) ? x/y : 0;
    }


    static double mul(double x, double y){
        return x * y;
    }






}
