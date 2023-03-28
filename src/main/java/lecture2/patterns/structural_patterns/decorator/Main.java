package lecture2.patterns.structural_patterns.decorator;

public class Main {

    public static void main(String[] args) {

        Component component = new PanelDecorator(new ColorDecorator(new PanelDecorator(new PanelDecorator(new TextComponent()))));

        component.draw();


    }
}
