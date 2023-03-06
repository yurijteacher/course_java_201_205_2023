package groupe201.practical1.my_interface.calculation;

public class Main {

    public static void main(String[] args) {


        Calculation calculation = new Calc();

        calculation.mul(3,4);
        calculation.add(5,5);
        calculation.sub(4,5);

        Calculation.div(10,0);




    }

}
