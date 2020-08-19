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

        JButton complectButton = new JButton("Комплектующие");
        complectButton.addActionListener(e -> GuiEventHandlers.parseEvent(new SetComponentsChoiceEvent()));

        JButton pcButton = new JButton("ПК");

        try {
            complectButton.setIcon(new ImageIcon(StartPanel.class.getResource("/icons/Components.png")));  //TODO Сместить в левый угол
            pcButton.setIcon(new ImageIcon(StartPanel.class.getResource("/icons/PC.png")));        //TODO Сместить в левый угол
        } catch (Exception e) {
            e.printStackTrace();
        }


        setLayout(new MigLayout("center"));
        add(complectButton, "gaptop 175, wrap 20, w 250!, h 50!");
        add(pcButton, "wrap 20, w 250!, h 50!");
    }
}
