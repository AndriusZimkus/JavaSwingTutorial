import MyStyle.MyStyle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBarDemo implements ActionListener {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 100);
    JButton button;
    Timer timer;

    public ProgressBarDemo() {

        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("Garamond", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.BLACK);

        button = new JButton("Progress Bar");
        button.addActionListener(this);

        frame.add(bar);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(420, 420);

        frame.setBackground(MyStyle.mainBackgroundColor);
        frame.setLayout(new FlowLayout());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


//        fill();
    }

//    public void fill() {
//        int counter = 0;
//        while (counter <= 100) {
//            bar.setValue(counter);
//
////            try {
////                Thread.sleep(50);
////            } catch (InterruptedException e) {
////                throw new RuntimeException(e);
////            }
//            counter += 10;
//        }
//        bar.setString("Done!");
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            timer = new Timer(100, this);
            timer.start();
        } else if (e.getSource() == timer) {
            bar.setValue(bar.getValue() + 10);

            if (bar.getValue() >= 100) {
                timer.stop();
                bar.setString("Done!");
            }
        }
    }
}
