package swingProject;

import javax.swing.UIManager.*;

import net.miginfocom.swing.MigLayout;
import swingProject.gui.MainFrame;
import swingProject.gui.startPanel.StartPanel;

import javax.swing.*;
import java.awt.*;

public class SwingProject {
    public static void main(String[] args) {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }

        MainFrame mainFrame = new MainFrame();
        mainFrame.setTitle("Меню");
        mainFrame.setSize(800, 600);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout());
        JLabel label = new JLabel("Версия программы 0.0.1");

        JButton jButton1 = new JButton();
        JButton jButton2 = new JButton();
        JButton jButton3 = new JButton();

        StartPanel panel = new StartPanel();
        panel.setLayout(new MigLayout("center"));
        panel.add(jButton1, "gaptop 150, wrap 20, w 250!, h 50!");
        panel.add(jButton2, "wrap 20, w 250!, h 50!");
        panel.add(jButton3, "wrap 20, w 250!, h 50!");


        mainFrame.add(panel);
        mainFrame.add(label,BorderLayout.PAGE_END);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);


    }
}
