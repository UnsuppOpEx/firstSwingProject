package swingProject.gui.startPanel;

import net.miginfocom.swing.MigLayout;
import swingProject.events.guiEvents.SetComponentsChoiceEvent;
import swingProject.utils.handlers.GuiEventHandlers;

import javax.swing.*;

/**
 * Стартовая панель
 */
public class StartPanel extends JPanel {

    public StartPanel() {

        JButton jButton1 = new JButton("Комплектующие");
        jButton1.addActionListener(e -> GuiEventHandlers.parseEvent(new SetComponentsChoiceEvent()));

        JButton jButton2 = new JButton("ПК");

        try {
            jButton1.setIcon(new ImageIcon(StartPanel.class.getResource("/icons/Components.png")));  //TODO Сместить в левый угол
            jButton2.setIcon(new ImageIcon(StartPanel.class.getResource("/icons/PC.png")));        //TODO Сместить в левый угол
        } catch (Exception e) {
            e.printStackTrace();
        }


        setLayout(new MigLayout("center"));
        add(jButton1, "gaptop 175, wrap 20, w 250!, h 50!");
        add(jButton2, "wrap 20, w 250!, h 50!");
    }
}
