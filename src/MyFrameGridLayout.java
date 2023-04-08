import javax.swing.*;
import java.awt.*;

public class MyFrameGridLayout extends JFrame {
    MyFrameGridLayout() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null); // Center window

        GridLayout myGridLayout = new GridLayout(4, 3, 10, 5);
        this.setLayout(myGridLayout);

        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));
        this.add(new JButton("10"));

        this.setVisible(true);
    }

}
