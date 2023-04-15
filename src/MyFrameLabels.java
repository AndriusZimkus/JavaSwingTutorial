import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyFrameLabels extends JFrame {
    MyFrameLabels() {

        ImageIcon image = new ImageIcon("src/images/skull.png");
        ImageIcon icon = new ImageIcon("src/images/icon.png");

        this.setTitle("Temporary title v2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setResizable(false);
        this.setSize(600, 600);

        this.setLocationRelativeTo(null);

        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(244, 239, 226));


        Border border = BorderFactory.createLineBorder(Color.blue, 3);
        JLabel label = new JLabel();
        label.setText("Test label 2023-04-06");

        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(155, 100, 120));
        label.setFont(new Font("Helvetica", Font.PLAIN, 18));
        label.setIconTextGap(-3);
        label.setBackground(Color.black);
        label.setOpaque(true); // Needed to apply background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        int width = 250;
        int height = 250;

        label.setBounds((this.getWidth() - width) / 2, (this.getHeight() - height) / 2, width, height);
        this.setLayout(null);

        this.setVisible(true);

        this.add(label);
//        this.pack();


    }

}
