package groupe204.practical1.realization_interface.my_interface;

public class Main {

    public static void main(String[] args) {

        Calculation calculation = new Calculation();

        System.out.println(calculation.add(5, 4));
        System.out.println(calculation.sub(6, 4));
        System.out.println(calculation.div(10, 0));
        // calculation.mul

        System.out.println(Calc.mul(10, 10));


    }
}
