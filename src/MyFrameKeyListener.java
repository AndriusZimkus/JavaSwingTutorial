import MyStyle.MyStyle;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrameKeyListener extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    MyFrameKeyListener() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);
        this.setLocationRelativeTo(null); // Center window

        icon = new ImageIcon("src/images/exit-32.png");

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setIcon(icon);
//        label.setBackground(Color.red);
//        label.setOpaque(true);

        this.getContentPane().setBackground(MyStyle.mainBackgroundColor);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped - Invoked when a key is typed. Uses KeyChar, char output
        int stepSize = 10;
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - stepSize, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - stepSize);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + stepSize);
                break;
            case 'd':
                label.setLocation(label.getX() + stepSize, label.getY());
                break;

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keyPressed - Invoked when a physical key is pressed down. Used KeyCode, int output
        int stepSize = 10;
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - stepSize, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - stepSize);
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + stepSize);
                break;
            case 39:
                label.setLocation(label.getX() + stepSize, label.getY());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //keyReleased - called whenever a button is released
//        System.out.println("You released key char: " + e.getKeyChar());
//        System.out.println ("You released key code: " + e.getKeyCode());

    }
}
