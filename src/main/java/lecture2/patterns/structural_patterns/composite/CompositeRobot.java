package lecture2.patterns.structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeRobot implements Robot {


    public List<Robot> robots = new ArrayList<>();


    public void addComposite(Robot robot){
        robots.add(robot);
    }

    public void removeComposite(Robot robot){
        robots.remove(robot);
    }


    @Override
    public void action() {
        for (Robot el : robots) {
            el.action();
        }
    }
}
