import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameTextFields extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;

    MyFrameTextFields() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(Color.green);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("username");
//        textField.setEditable(false);

        this.add(button);
        this.add(textField);

        this.pack();
        this.setLocationRelativeTo(null); // Center window

//        this.addWindowListener(
//                new WindowAdapter() {
//                    public void windowClosing(WindowEvent e) {
//                        onExit();
//                    }
//                }
//        );


        this.setVisible(true);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(textField.getText());
            textField.setEditable(false);
            button.setEnabled(false);
        }
    }

//    public void onExit() {
//        this.dispose();
//        new StartWindow();
//    }
}
