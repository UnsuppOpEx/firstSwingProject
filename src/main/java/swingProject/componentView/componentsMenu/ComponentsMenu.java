package swingProject.componentView.componentsMenu;

import net.miginfocom.swing.MigLayout;
import swingProject.events.guiEvents.ComponentActionEvent;
import swingProject.events.guiEvents.SetStartPanelEvent;
import swingProject.utils.handlers.GuiEventHandlers;

import javax.swing.*;

/**
 * Меню компонентов
 */
public class ComponentsMenu extends JPanel {
    private static final String BUTTON_SIZE = "wrap 20, w 250!, h 50!";

    public ComponentsMenu() {

        JButton jButton1 = new JButton("Процессор");
        JButton jButton2 = new JButton("Материнская плата");
        JButton jButton3 = new JButton("Оперативная память");
        JButton jButton4 = new JButton("Жёсткий диск");

        JButton jButton5 = new JButton("Блок питания");
        jButton5.addActionListener(e -> GuiEventHandlers.parseEvent(new ComponentActionEvent()));

        JButton jButton6 = new JButton("Назад");
        jButton6.addActionListener(e -> GuiEventHandlers.parseEvent(new SetStartPanelEvent()));


        setLayout(new MigLayout("center"));
        add(jButton1, "gaptop 50, " + BUTTON_SIZE);
        add(jButton2, BUTTON_SIZE );
        add(jButton3, BUTTON_SIZE);
        add(jButton4, BUTTON_SIZE);
        add(jButton5, BUTTON_SIZE);
        add(jButton6, BUTTON_SIZE);
    }
}

