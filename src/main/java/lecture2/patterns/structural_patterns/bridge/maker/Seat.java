package lecture2.patterns.structural_patterns.bridge.maker;

public class Seat implements Maker{
    @Override
    public void setMaker() {
        System.out.println("Seat car");
    }
}
