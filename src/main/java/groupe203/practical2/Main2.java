package groupe203.practical2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main2 {

    public static void main(String[] args) {

        // AWT              /  Swing -> FX
        // Frame            /  JFrame
        // ManagerLayout
        //
        // Button           / JButton
        // TextInput        / JTextInput


        JFrame frame = new JFrame("My Clock");

        frame.setSize(400,60);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //
        JPanel p = new JPanel();

        JLabel l = new JLabel();

        // l.setFont(new Font("Arial", Font.ITALIC, 23));

        //l.setText("1234");
        //String text = l.getText();
        //String text2 = text + "567";

        // JTextArea
        // JTextField
        // JButton
        // JTable
        // JLabel
        // JPanel


        ClockExt clockExt =  new ClockExt(11,59, 45);

        Timer timer = new Timer(1000, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clockExt.nextSecond();
                l.setText(clockExt.toString());
            }
        });

        timer.start();

        p.add(l, BorderLayout.CENTER);
        frame.add(p, BorderLayout.NORTH);

        frame.setVisible(true);





    }

}
