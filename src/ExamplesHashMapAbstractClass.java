import DragAndDrop.MyFrameDragAndDrop;
import NewWindow.LaunchPage;

import java.io.IOException;
import java.util.HashMap;

public abstract class ExamplesHashMapAbstractClass {

    public static HashMap<String, ExampleInvoker> ExamplesHashMap() {
        HashMap<String, ExampleInvoker> examplesHashMap = new HashMap<String, ExampleInvoker>();

        examplesHashMap.put("DragAndDrop", () -> new MyFrameDragAndDrop());

        examplesHashMap.put("MouseListener", () -> {
            try {
                new MyFrameMouseListener();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        examplesHashMap.put("TextFields", () -> new MyFrameTextFields());
        examplesHashMap.put("NewWindow", () -> new LaunchPage());
        examplesHashMap.put("JOptionPane", () -> JOptionPaneTutorial.JOptionPaneTutorialMethod("testing"));
        examplesHashMap.put("BorderLayout", () -> new MyFrameBorderLayout());
        examplesHashMap.put("Buttons", () -> new MyFrameButtons());
        examplesHashMap.put("Checkbox", () -> new MyFrameCheckbox());
        examplesHashMap.put("ColorChooser", () -> new MyFrameColorChooser());
        examplesHashMap.put("ComboBox", () -> new MyFrameComboBox());
        examplesHashMap.put("FileChooser", () -> new MyFrameFileChooser());
        examplesHashMap.put("FlowLayout", () -> new MyFrameFlowLayout());
        examplesHashMap.put("GridLayout", () -> new MyFrameGridLayout());
        examplesHashMap.put("JLayeredPane", () -> new MyFrameJLayeredPane());
        examplesHashMap.put("KeyListener", () -> new MyFrameKeyListener());
        examplesHashMap.put("Labels", () -> new MyFrameLabels());
        examplesHashMap.put("MenuBars", () -> new MyFrameMenuBars());
        examplesHashMap.put("Panels", () -> new MyFramePanels());
        examplesHashMap.put("RadioButtons", () -> new MyFrameRadioButtons());
        examplesHashMap.put("ProgressBar", () -> new ProgressBarDemo());
        examplesHashMap.put("Slider", () -> new SliderDemo());
        examplesHashMap.put("KeyBindings", () -> new KeyBindingsDemo());

        return examplesHashMap;
    }
}
