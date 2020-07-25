package swingProject.gui;

import swingProject.gui.startPanel.StartPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JPanel contentPanel;

    public MainFrame() {
        setTitle("Меню");
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JLabel label = new JLabel("Версия программы 0.0.1");

        add(new StartPanel());
        add(label,BorderLayout.PAGE_END); // TODO:перенести label в другой угол.
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
