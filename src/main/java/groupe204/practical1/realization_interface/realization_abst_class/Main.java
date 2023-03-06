package groupe204.practical1.realization_interface.realization_abst_class;

public class Main {

    public static void main(String[] args) {

     // Abst class
     //    Calculation calculation = new Calculation();


        Calc calculation = new Calc();
        calculation.sub(4,5);
        calculation.add(5,6);
        calculation.div(10, 0);

        // calculation.mul
        Calculation.mul(3,3);

        calculation.info();

    }
}
