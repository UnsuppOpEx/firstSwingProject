package swingProject.gui.startPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

/**
 * Стартовая панель
 */
public class StartPanel extends JPanel {

    public StartPanel() {
        JButton jButton1 = new JButton("Комплектующие");
        JButton jButton2 = new JButton("ПК");

        jButton1.setIcon(new ImageIcon("src/main/resources/icons/Complect.png"));
        jButton2.setIcon(new ImageIcon("src/main/resources/icons/PC.png"));


        setLayout(new MigLayout("center"));
        add(jButton1, "gaptop 175, wrap 20, w 250!, h 50!");
        add(jButton2, "wrap 20, w 250!, h 50!");
    }
}
