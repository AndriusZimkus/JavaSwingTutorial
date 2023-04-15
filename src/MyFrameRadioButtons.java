import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameRadioButtons extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;

    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;

    MyFrameRadioButtons() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIcon = new ImageIcon("src/images/brain-3-48.png");
        hamburgerIcon = new ImageIcon("src/images/x-mark-48.png");
        hotdogIcon = new ImageIcon("src/images/checkmark-48.png");

        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotdogButton = new JRadioButton("hotdog");

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(pizzaButton);
        buttonGroup.add(hamburgerButton);
        buttonGroup.add(hotdogButton);

        // Action listener is this class
//        pizzaButton.addActionListener(this);
//        hamburgerButton.addActionListener(this);
//        hotdogButton.addActionListener(this);

        // Action listener is RadioButtonActionListener - but does not feel right - second reference in constructor parameter
//        pizzaButton.addActionListener(new RadioButtonActionListener(pizzaButton));
//        hamburgerButton.addActionListener(new RadioButtonActionListener(hamburgerButton));
//        hotdogButton.addActionListener(new RadioButtonActionListener(hotdogButton));

        // Same as above but in method
        AddActionListenerToRadioButton(pizzaButton);
        AddActionListenerToRadioButton(hamburgerButton);
        AddActionListenerToRadioButton(hotdogButton);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        this.pack();
        this.setLocationRelativeTo(null); // Center window
        this.setVisible(true);

    }

    private class RadioButtonActionListener implements ActionListener {

        private JRadioButton button;

        RadioButtonActionListener(JRadioButton button) {
            this.button = button;
        }

        public void actionPerformed(ActionEvent e) {
            String text = button.getText();
            System.out.println("You ordered " + text);
        }
    }

    private void AddActionListenerToRadioButton(JRadioButton button) {
        button.addActionListener(new RadioButtonActionListener(button));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            System.out.println("You ordered pizza!" + e.getSource());
        } else if (e.getSource() == hamburgerButton) {
            System.out.println("You ordered a hamburger!");
        } else if (e.getSource() == hotdogButton) {
            System.out.println("You ordered a hotdog!");
        }
    }
}
