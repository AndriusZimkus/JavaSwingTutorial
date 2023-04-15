package Graphics2D;

import javax.swing.*;
import java.awt.*;

public class MyFrame2DGraphics extends JFrame {

    MyPanel panel;

    public MyFrame2DGraphics() throws HeadlessException {

        panel = new MyPanel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
