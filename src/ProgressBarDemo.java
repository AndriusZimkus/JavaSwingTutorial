import MyStyle.MyStyle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBarDemo implements ActionListener {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 100);

    public ProgressBarDemo() {

        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("Garamond", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.BLACK);

        JButton button = new JButton("Progress Bar");
        button.addActionListener(this);

        frame.add(bar);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLocationRelativeTo(null);
        frame.setBackground(MyStyle.mainBackgroundColor);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);


    }

    public void fill() {
        int counter = 0;
        while (counter <= 100) {
            bar.setValue(counter);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter += 10;
        }
        bar.setString("Done!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        fill();
    }
}
