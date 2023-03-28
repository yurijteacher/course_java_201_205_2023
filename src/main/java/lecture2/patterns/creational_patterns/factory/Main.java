package lecture2.patterns.creational_patterns.factory;

public class Main {

    public static void main(String[] args) {

        ShareFactory factory = new ShareFactory();

        Share circle = factory.getShare("коло");
        circle.draw(4,5);

        Share point = factory.getShare("точка");
        point.draw(3,4);

        Share square = factory.getShare("квадрат");
        square.draw(5,6);

        Share share1 = new Square();
        Share share2 = new Circle();
        Share share3 = new Point();

    }
}
