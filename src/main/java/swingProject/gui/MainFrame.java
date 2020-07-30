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
        JLabel label = new JLabel("Версия программы 0.0.1");

        add(contentPanel);
        add(new ApplicationMenu(),BorderLayout.NORTH);
        add(label,BorderLayout.PAGE_END);           // TODO:перенести label в другой угол.

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    //Отрисовка панели
    public void setStartPanelEvent() {
        setContent(new StartPanel());

    }

    //Открыть окно с информацие о программе
    public void openAboutDialogEvent() {
        JOptionPane.showMessageDialog(this, "Program for home using", "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    //Выйти из приложения
    public void closeApplicationEvent() {
        System.exit(-1);
    }

    //Отрисовка новой панели
    public void setContent(JPanel panel) {
        contentPanel.removeAll();
        contentPanel.add(panel);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
}
