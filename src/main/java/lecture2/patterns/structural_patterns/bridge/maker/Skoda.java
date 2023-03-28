package lecture2.patterns.structural_patterns.bridge.maker;

public class Skoda implements Maker{
    @Override
    public void setMaker() {
        System.out.println("Skoda car");
    }
}
