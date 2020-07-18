package swingProject;

import javax.swing.UIManager.*;

import net.miginfocom.swing.MigLayout;
import swingProject.gui.MainFrame;
import swingProject.gui.startPanel.StartPanel;

import javax.swing.*;
import java.awt.*;

public class SwingProject {
    public static void main(String[] args) {
//TODO Не получилось прицепить Нимбус
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
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        StartPanel startPanel1 = new StartPanel(new MigLayout());

        JButton jButton1 = new JButton("first");
        JButton jButton2 = new JButton("second");
        JButton jButton3 = new JButton("third");

        startPanel1.add(jButton1, "grow 100, wrap");
        startPanel1.add(jButton2, "grow 100, wrap");
        startPanel1.add(jButton3, "grow 100, wrap");

        StartPanel startPanel = new StartPanel(new MigLayout());
        startPanel.add(startPanel1);
        mainFrame.setContentPane(startPanel);


        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension demension = toolkit.getScreenSize();
        mainFrame.setBounds(demension.width/2 - 375, demension.height/2 - 300,800,600);
        mainFrame.setVisible(true);


    }
}
