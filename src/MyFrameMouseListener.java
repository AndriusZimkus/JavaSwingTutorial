import MyStyle.MyStyle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class MyFrameMouseListener extends JFrame implements MouseListener {

    JLabel label;

    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;

    MyFrameMouseListener() throws IOException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout());
        this.setSize(250, 250);
//        this.pack();
        this.setLocationRelativeTo(null); // Center window
        this.getContentPane().setBackground(MyStyle.mainBackgroundColor);
        

        // https://stackoverflow.com/questions/4301329/java-class-getresource-returns-null
        java.net.URL imageURL = this.getClass().getClassLoader().getResource("images/folder-7-32.png");
        if (imageURL != null) {
            smile = new ImageIcon(imageURL);
        }
        imageURL = this.getClass().getClassLoader().getResource("images/save-32.png");
        if (imageURL != null) {
            nervous = new ImageIcon(imageURL);
        }
        imageURL = this.getClass().getResource("images/exit-32.png");
        if (imageURL != null) {
            pain = new ImageIcon(imageURL);
        }
        imageURL = this.getClass().getResource("images/star-22-32.png");
        if (imageURL != null) {
            dizzy = new ImageIcon(imageURL);
        }
//        System.out.println(smile);
//        System.out.println("aa");

        label = new JLabel();
        label.setIcon(smile);
        label.addMouseListener(this);

//        label.setBounds(0, 0, 100, 100);
//        label.setBackground(MyStyle.MyStyle.buttonColor);
//        label.setOpaque(true);
//        this.addMouseListener(this);


        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        System.out.println("You clicked the mouse");

    }

    @Override
    public void mousePressed(MouseEvent e) {
//        System.out.println("You pressed the mouse");
//        label.setBackground(Color.lightGray);
        label.setIcon(pain);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        System.out.println("You released the mouse");
//        label.setBackground(Color.pink);
        label.setIcon(dizzy);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        System.out.println("You entered the component");
//        label.setBackground(Color.blue);
        label.setIcon(nervous);
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        System.out.println("You exited the component");
//        label.setBackground(Color.red);
        label.setIcon(smile);

    }
}
