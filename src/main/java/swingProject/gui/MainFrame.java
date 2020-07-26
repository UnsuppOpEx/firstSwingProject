package swingProject.gui;

import swingProject.gui.menu.ApplicationMenu;
import swingProject.gui.startPanel.StartPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JPanel contentPanel;

    public MainFrame() {
        setTitle("Меню");
        setSize(new Dimension(800,600));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        contentPanel = new JPanel();
        add(contentPanel);
        add(new ApplicationMenu(),BorderLayout.NORTH);
        JLabel label = new JLabel("Версия программы 0.0.1");
        add(label,BorderLayout.PAGE_END); // TODO:перенести label в другой угол.
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void setContent(JPanel panel) {
        contentPanel.removeAll();
        contentPanel.add(panel);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
}
