package lecture2.patterns.behavioral_patterns.state;

import javax.swing.*;
import java.awt.*;

public class UI {

    private Player player;
    private JFrame frame;
    private JTextField display;
    private JPanel buttons;
    private JButton play, stop, next, prev;

    public UI(Player player) {
        this.player = player;

        frame = new JFrame("My player");
        display = new JTextField();
        buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));

        play = new JButton("play");
        stop = new JButton("stop");
        next = new JButton("next");
        prev = new JButton("prev");

        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        play.addActionListener(e -> {display.setText(player.getState().onPlay()); });
        stop.addActionListener(e -> {display.setText(player.getState().onLock()); });
        next.addActionListener(e -> {display.setText(player.getState().onNext()); });
        prev.addActionListener(e -> {display.setText(player.getState().onPrevious()); });

        buttons.add(play);
        buttons.add(stop);
        buttons.add(next);
        buttons.add(prev);

        frame.add(display, BorderLayout.NORTH);
        frame.add(buttons, BorderLayout.CENTER);

        frame.setVisible(true);

    }
}
