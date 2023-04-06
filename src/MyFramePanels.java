import javax.swing.*;
import java.awt.*;

public class MyFramePanels extends JFrame {
    MyFramePanels() {

        this.setTitle("Panel title 2023-04-06");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLayout(null);
        this.setLocationRelativeTo(null); // center frame
        this.getContentPane().setBackground(new Color(244, 239, 226));

        ImageIcon icon = new ImageIcon("images/iconSmall.png");
        JLabel label = new JLabel();
        label.setText("2023-04-06");
        label.setIcon(icon);
//        label.setVerticalAlignment(JLabel.BOTTOM);
//        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0, 0, 150, 90);


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 200, 150);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(200, 0, 200, 150);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 150, 400, 150);
        greenPanel.setLayout(null);

        redPanel.add(label);


        this.add(redPanel);
        this.add(bluePanel);
        this.add(greenPanel);

        this.setVisible(true);


    }

}
