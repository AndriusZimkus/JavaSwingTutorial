import MyStyle.MyStyle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameButtons extends JFrame implements ActionListener {

    JButton button;
    JLabel labelAfterClick;

    MyFrameButtons() {

        ImageIcon icon = new ImageIcon("src/images/iconSmall.png");

        labelAfterClick = new JLabel();
        ImageIcon labelIcon = new ImageIcon("src/images/skull.png");
        labelAfterClick.setIcon(labelIcon);
        labelAfterClick.setBounds(100, 400, 360, 360);
        labelAfterClick.setVisible(false);

        button = new JButton();
        button.setBounds(200, 150, 200, 150);
        button.addActionListener(this);
        button.setFont(new Font("Arial", Font.BOLD, 15));
        button.setText("2023-04-07 Button");
        button.setFocusable(false); // remove border around text
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setIconTextGap(5);
        button.setForeground(MyStyle.buttonTextColor);
        button.setBackground(MyStyle.buttonColor);
        button.setBorder(BorderFactory.createEtchedBorder());
//        button.setEnabled(false);

        // Lambda expression
//        button.addActionListener(e -> System.out.println("Button pressed lambda"));


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // Layout manager
        this.setSize(600, 1000);
        this.getContentPane().setBackground(MyStyle.mainBackgroundColor);
        this.setVisible(true);
        this.add(button);
        this.add(labelAfterClick);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Button pressed");
//            button.setEnabled(false); // Once pressed --> Disabled
            labelAfterClick.setVisible(true);
        }
    }
}
