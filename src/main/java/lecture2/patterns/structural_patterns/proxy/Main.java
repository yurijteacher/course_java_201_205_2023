package lecture2.patterns.structural_patterns.proxy;

public class Main {

    public static void main(String[] args) {

        Image myImage = new MyImage("\\1.jpg");
        myImage.display();

        Image proxy = new Proxy("\\1.jpg");
        proxy.display();

    }
}
