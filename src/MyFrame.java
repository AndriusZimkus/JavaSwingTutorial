import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("Temporary title v2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420, 420);
//        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("skull.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(244, 239, 226));

    }

}
