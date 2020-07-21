package swingProject;

import swingProject.gui.MainFrame;
import swingProject.gui.menu.ApplicationMenu;
import swingProject.gui.startPanel.StartPanel;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class SwingProject {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }

        MainFrame mainFrame = new MainFrame();
        mainFrame.setTitle("Меню");
        mainFrame.setSize(800, 600);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout());
        JLabel label = new JLabel("Версия программы 0.0.1");

        mainFrame.add(new StartPanel());
        mainFrame.add(label,BorderLayout.PAGE_END); // TODO:перенести label в другой угол.
        mainFrame.add(new ApplicationMenu(), BorderLayout.NORTH);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }
}
