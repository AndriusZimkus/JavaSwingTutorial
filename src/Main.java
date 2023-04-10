import NewWindow.LaunchPage;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        MyFrameLabels myFrameLabels = new MyFrameLabels();
//        MyFramePanels myFramePanels = new MyFramePanels();
//        MyFrameButtons myFrameButtons = new MyFrameButtons();
//        MyFrameBorderLayout myFrameBorderLayout = new MyFrameBorderLayout();
//        MyFrameFlowLayout myFrameFlowLayout = new MyFrameFlowLayout();
//        MyFrameGridLayout myFrameGridLayoutLayout = new MyFrameGridLayout();
//        MyFrameJLayeredPane myFrameJLayeredPane = new MyFrameJLayeredPane();
//

        // New window tutorial 2023-04-09
        if (false) {
            LaunchPage launchPage = new LaunchPage();
        }


        if (true) {
            JOptionPaneTutorial("testing");
        }
    }

    /**
     * Testing documentation of method
     *
     * @param testString testing
     * @return nothing
     * @see <a href="https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html">JavaDoc Tool</a>
     */
    private static void JOptionPaneTutorial(String testString) {
        // JOptionPane tutorial 2023-04-10
        // JOptionPane.showMessageDialog(null, "Plain message", "Title 2023-04-10", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Information message", "Title 2023-04-10", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Question message", "Title 2023-04-10", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Warning message", "Title 2023-04-10", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Error Message", "Title 2023-04-10", JOptionPane.ERROR_MESSAGE);
        // int answer = JOptionPane.showConfirmDialog(null, "Confirm Dialog", "Title 2023-04-10 dialog", JOptionPane.YES_NO_CANCEL_OPTION);
//        String name = JOptionPane.showInputDialog("What is your name?");
//        System.out.println("Hello " + name);

        String[] responses = {"first option", "second option"};
        ImageIcon icon = new ImageIcon("images/iconSmall.png");
//        JOptionPane.showOptionDialog(null, "Option Dialog", "title od", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, 0);
        JOptionPane.showOptionDialog(null,
                "Option Dialog", "title od",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon, responses, 0);

    }
}
