import MyStyle.MyStyle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class StartWindow extends JFrame implements ActionListener {

    JButton button;
    HashMap<String, ExampleInvoker> exampleHashMap;

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();

        this.dispose(); // Close first window
        exampleHashMap.get(source.getText()).invokeExample();
    }

    StartWindow() {

        exampleHashMap = ExamplesHashMapAbstractClass.ExamplesHashMap();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setSize(800, 800);

        this.getContentPane().setBackground(MyStyle.mainBackgroundColor);

        this.getContentPane().setLayout(new FlowLayout());

        JPanel helperPanel = new JPanel();
        helperPanel.setOpaque(false);

        helperPanel.setLayout(new BoxLayout(helperPanel, BoxLayout.Y_AXIS));

        for (String x : exampleHashMap.keySet()) {
            button = new JButton(x);
            button.setFocusable(false);
            button.setPreferredSize(new Dimension(150, 50));
            button.setAlignmentX(Component.CENTER_ALIGNMENT);

            button.addActionListener(this);

            helperPanel.add(button);
            helperPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        }

        this.getContentPane().add(helperPanel);
        this.pack();
        this.setLocationRelativeTo(null); // Center window
        this.setVisible(true);
    }


}
