package groupe203.practical1.realization_interface;

public class Main {

    public static void main(String[] args) {

        Calculation calculation = new Calculation();

        System.out.println(calculation.sub(3, 5));

        System.out.println(calculation.add(10, 5));

        System.out.println(calculation.div(10, 0));

        System.out.println(MyInterface.mul(5, 4));



    }
}
