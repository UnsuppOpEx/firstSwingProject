package swingProject;

import swingProject.gui.MainFrame;
import swingProject.gui.startPanel.StartPanel;
import swingProject.utils.handlers.GuiEventHandlers;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class SwingProject {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }

        MainFrame mainFrame = new MainFrame();
        GuiEventHandlers.setMainFrame(mainFrame);

    }
}
