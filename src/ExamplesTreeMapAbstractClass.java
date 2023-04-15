import Animations2D.MyFrame2DAnimations;
import DragAndDrop.MyFrameDragAndDrop;
import Graphics2D.MyFrame2DGraphics;
import NewWindow.LaunchPage;

import java.io.IOException;
import java.util.TreeMap;

/**
 * Examples with their functionality calls are stored in this class
 * <p>
 * The examples are paired in a TreeMap
 * <p>
 * Key: String - name of the function
 * <p>
 * Value: Instance of Example Invoker implemented through lambda expression of ExampleInvoker interface
 * <p>
 * TreeMap is used over HashMap for sorted keys
 */
public class ExamplesTreeMapAbstractClass {

    public static TreeMap<String, ExampleInvoker> ExamplesTreeMap() {
        TreeMap<String, ExampleInvoker> examplesTreeMap = new TreeMap<String, ExampleInvoker>();

        examplesTreeMap.put("DragAndDrop", () -> new MyFrameDragAndDrop());

        examplesTreeMap.put("MouseListener", () -> {
            try {
                new MyFrameMouseListener();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        examplesTreeMap.put("TextFields", () -> new MyFrameTextFields());
        examplesTreeMap.put("NewWindow", () -> new LaunchPage());
        examplesTreeMap.put("JOptionPane", () -> JOptionPaneTutorial.JOptionPaneTutorialMethod("testing"));
        examplesTreeMap.put("BorderLayout", () -> new MyFrameBorderLayout());
        examplesTreeMap.put("Buttons", () -> new MyFrameButtons());
        examplesTreeMap.put("Checkbox", () -> new MyFrameCheckbox());
        examplesTreeMap.put("ColorChooser", () -> new MyFrameColorChooser());
        examplesTreeMap.put("ComboBox", () -> new MyFrameComboBox());
        examplesTreeMap.put("FileChooser", () -> new MyFrameFileChooser());
        examplesTreeMap.put("FlowLayout", () -> new MyFrameFlowLayout());
        examplesTreeMap.put("GridLayout", () -> new MyFrameGridLayout());
        examplesTreeMap.put("JLayeredPane", () -> new MyFrameJLayeredPane());
        examplesTreeMap.put("KeyListener", () -> new MyFrameKeyListener());
        examplesTreeMap.put("Labels", () -> new MyFrameLabels());
        examplesTreeMap.put("MenuBars", () -> new MyFrameMenuBars());
        examplesTreeMap.put("Panels", () -> new MyFramePanels());
        examplesTreeMap.put("RadioButtons", () -> new MyFrameRadioButtons());
        examplesTreeMap.put("ProgressBar", () -> new ProgressBarDemo());
        examplesTreeMap.put("Slider", () -> new SliderDemo());
        examplesTreeMap.put("KeyBindings", () -> new KeyBindingsDemo());
        examplesTreeMap.put("2DGraphics", () -> new MyFrame2DGraphics());
        examplesTreeMap.put("2DAnimations", () -> new MyFrame2DAnimations());

        return examplesTreeMap;
    }
}
