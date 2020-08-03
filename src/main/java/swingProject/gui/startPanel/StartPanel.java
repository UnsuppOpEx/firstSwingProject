package swingProject.gui.startPanel;

import net.miginfocom.swing.MigLayout;
import swingProject.componentView.componentsMenu.ComponentsMenu;
import swingProject.events.guiEvents.SetComponentsChoiceEvent;
import swingProject.gui.MainFrame;
import swingProject.utils.handlers.GuiEventHandlers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Стартовая панель
 */
public class StartPanel extends JPanel {

    public StartPanel() {

        JButton jButton1 = new JButton("Комплектующие");
        jButton1.addActionListener(e -> GuiEventHandlers.parseEvent(new SetComponentsChoiceEvent()));

        JButton jButton2 = new JButton("ПК");

        jButton1.setIcon(new ImageIcon("src/main/resources/icons/Components.png"));  //TODO Сместить в левый угол
        jButton2.setIcon(new ImageIcon("src/main/resources/icons/PC.png"));        //TODO Сместить в левый угол


        setLayout(new MigLayout("center"));
        add(jButton1, "gaptop 175, wrap 20, w 250!, h 50!");
        add(jButton2, "wrap 20, w 250!, h 50!");
    }
}
