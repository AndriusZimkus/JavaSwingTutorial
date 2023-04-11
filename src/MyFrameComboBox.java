import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameComboBox extends JFrame implements ActionListener {
    // 2023-04-11

    JComboBox comboBox;

    MyFrameComboBox() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};
        Integer[] numbers = {1, 2, 3};
        comboBox = new JComboBox(numbers);
        comboBox.addActionListener(this);
//        comboBox.setEditable(true);
//        System.out.println(comboBox.getItemCount());
//        comboBox.addItem("horse");
//        comboBox.insertItemAt("pig", 0);
//        comboBox.setSelectedIndex(0);
//        comboBox.removeItem("cat");
//        comboBox.removeItemAt(2);
//        comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setLocationRelativeTo(null); // Center window
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedIndex()
                    + " " + comboBox.getSelectedItem());
        }

    }
}
