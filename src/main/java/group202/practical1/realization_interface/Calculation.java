package group202.practical1.realization_interface;

public class Calculation implements MyInterface, Information{
    @Override
    public double add(double a, double b) {
        return a+b;
    }
    @Override
    public double sub(double a, double b) {
        return a-b;
    }

    public static void main(String[] args) {

        Calculation calculation = new Calculation();
        calculation.mul(4,5);
        calculation.add(4,5);
        calculation.sub(3,4);

        // calculation.div
        MyInterface.div(5,0);
    }

    @Override
    public void info() {
        System.out.println("It is a calc");
    }
}
