import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameButtons extends JFrame implements ActionListener {

    JButton button;

    MyFrameButtons() {

        button = new JButton();
        button.setBounds(200, 150, 200, 75);
        button.addActionListener(this);
        button.setText("2023-04-07 Button");
        button.setFocusable(false); // remove border around text


        // Lambda expression
//        button.addActionListener(e -> System.out.println("Button pressed lambda"));


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // Layout manager
        this.setSize(600, 600);
        this.setVisible(true);

        this.add(button);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Button pressed");
        }
    }
}
