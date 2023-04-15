package Animations2D;

import javax.swing.*;
import java.awt.*;

public class MyFrame2DAnimations extends JFrame {

    MyPanel2DAnimations panel;

    public MyFrame2DAnimations() throws HeadlessException {

        panel = new MyPanel2DAnimations();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
