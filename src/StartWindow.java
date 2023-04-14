import DragAndDrop.MyFrameDragAndDrop;
import MyStyle.MyStyle;
import NewWindow.LaunchPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class StartWindow extends JFrame implements ActionListener {

    JButton button;
    String[] availableFunctions = {"DragAndDrop", "MouseListener", "TextFields", "NewWindow", "JOptionPane", "BorderLayout",
            "Buttons", "Checkbox", "ColorChooser", "ComboBox", "FileChooser", "FlowLayout", "GridLayout", "JLayeredPane", "KeyListener",
            "Labels", "MenuBars", "Panels", "RadioButtons", "ProgressBar", "Slider", "KeyBindings"};

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();

        this.dispose(); // Close first window

        switch (source.getText()) {
            case "DragAndDrop":
                new MyFrameDragAndDrop();
                break;
            case "MouseListener":
                try {
                    new MyFrameMouseListener();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                break;
            case "TextFields":
                new MyFrameTextFields();
                break;
            case "NewWindow":
                new LaunchPage();
                break;
            case "JOptionPane":
                JOptionPaneTutorial.JOptionPaneTutorialMethod("testing");
                break;
            case "BorderLayout":
                new MyFrameBorderLayout();
                break;
            case "Buttons":
                new MyFrameButtons();
                break;
            case "Checkbox":
                new MyFrameCheckbox();
                break;
            case "ColorChooser":
                new MyFrameColorChooser();
                break;
            case "ComboBox":
                new MyFrameComboBox();
                break;
            case "FileChooser":
                new MyFrameFileChooser();
                break;
            case "FlowLayout":
                new MyFrameFlowLayout();
                break;
            case "GridLayout":
                new MyFrameGridLayout();
                break;
            case "JLayeredPane":
                new MyFrameJLayeredPane();
                break;
            case "KeyListener":
                new MyFrameKeyListener();
                break;
            case "Labels":
                new MyFrameLabels();
                break;
            case "MenuBars":
                new MyFrameMenuBars();
                break;
            case "Panels":
                new MyFramePanels();
                break;
            case "RadioButtons":
                new MyFrameRadioButtons();
                break;
            case "ProgressBar":
                new ProgressBarDemo();
                break;
            case "Slider":
                new SliderDemo();
                break;
            case "KeyBindings":
                new KeyBindingsDemo();
                break;
        }
    }

    StartWindow() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setLocationRelativeTo(null); // Center window
        this.getContentPane().setBackground(MyStyle.mainBackgroundColor);

        this.getContentPane().setLayout(new FlowLayout());

        JPanel helperPanel = new JPanel();
        helperPanel.setOpaque(false);

        helperPanel.setLayout(new BoxLayout(helperPanel, BoxLayout.Y_AXIS));

        for (String x : availableFunctions) {
            button = new JButton(x);
            button.setFocusable(false);
            button.setPreferredSize(new Dimension(150, 50));
            button.setAlignmentX(Component.CENTER_ALIGNMENT);

            button.addActionListener(this);
//            this.getContentPane().add(button);
            helperPanel.add(button);
            helperPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        }

        this.getContentPane().add(helperPanel);
        this.setVisible(true);
    }


}
