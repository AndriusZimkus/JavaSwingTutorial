package Animations2D;

import MyStyle.MyStyle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel2DAnimations extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 600;
    final int PANEL_HEIGTH = 400;
    Image owl;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 7;
    int yVelocity = 3;
    int x = 0;
    int y = 0;

    public MyPanel2DAnimations() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGTH));
        this.setBackground(MyStyle.mainBackgroundColor);
        owl = new ImageIcon("src/images/owl-128.png").getImage();
        backgroundImage = new ImageIcon("src/images/forest.png").getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g); // paint background

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(owl, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (x + owl.getWidth(null) >= PANEL_WIDTH || x < 0) {

            xVelocity *= -1;
        }

        x += xVelocity;

        if (y + owl.getHeight(null) >= PANEL_HEIGTH || y < 0) {
            yVelocity *= -1;
        }
        y += yVelocity;
        repaint();
    }
}
