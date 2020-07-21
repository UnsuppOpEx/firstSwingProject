package swingProject.gui.startPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class StartPanel extends JPanel {
    public StartPanel() {
        JButton jButton1 = new JButton();
        JButton jButton2 = new JButton();
        JButton jButton3 = new JButton();

        setLayout(new MigLayout("center"));
        add(jButton1, "gaptop 150, wrap 20, w 250!, h 50!");
        add(jButton2, "wrap 20, w 250!, h 50!");
        add(jButton3, "wrap 20, w 250!, h 50!");
    }
}
