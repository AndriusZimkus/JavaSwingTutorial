import javax.swing.*;
import java.awt.*;

public class MyFrameFlowLayout extends JFrame {
    MyFrameFlowLayout() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null); // Center window


        FlowLayout myFlowLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
        this.setLayout(myFlowLayout);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));

        this.add(panel);

        this.setVisible(true);
    }

}
