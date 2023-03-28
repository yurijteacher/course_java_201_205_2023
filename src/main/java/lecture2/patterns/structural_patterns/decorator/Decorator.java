package lecture2.patterns.structural_patterns.decorator;

public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }

    public abstract void afterDraw();


}
