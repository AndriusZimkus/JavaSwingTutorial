package DragAndDrop;

import javax.swing.*;
import java.awt.*;

public class MyFrameDragAndDrop extends JFrame {

    DragPanel dragPanel = new DragPanel();
    JLabel label;

    public MyFrameDragAndDrop() throws HeadlessException {

//        label = new JLabel();
//        label.setBounds(300, 300, 150, 150);
//        label.setBackground(Color.black);
//        label.setOpaque(true);

//        this.add(label);
        this.add(dragPanel);
        this.setTitle("Drag & Drop demo");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.setVisible(true);
    }
}
