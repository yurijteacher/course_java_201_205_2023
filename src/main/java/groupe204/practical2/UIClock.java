package groupe204.practical2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIClock {

    JFrame frame;
    JPanel panel;
    JLabel label;
    /* JTextArea area;
     JTextField field;
    */


    public UIClock() {

        //   AWT   /   Swing
        //  Frame  /  JFrame
        // Button  /  JButton
        // Label   /  JLabel
        // Table   /  JTable
        // ManagerLayout
        // Listener
        // AWT   +   Swing   = FX

        frame = new JFrame("My Clock");
        panel = new JPanel();
        label = new JLabel();

        frame.setSize(400, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ClockExt2 clockExt2 = new ClockExt2(23,59,59,00);

//        Timer timer = new Timer(100, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });

        Timer timer = new Timer(100, e -> {
            clockExt2.nextMillisecond();
            label.setText(clockExt2.toString());
        });

        timer.start();


        panel.add(label, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.NORTH);

        frame.setVisible(true);




    }

    public static void main(String[] args) {
       // UIClock uiClock = new UIClock();
                          new UIClock();

    }
}
