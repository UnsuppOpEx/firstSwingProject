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

        JButton processorButton = new JButton("Процессор");
        JButton mBoardButton = new JButton("Материнская плата");
        JButton ramButton = new JButton("Оперативная память");
        JButton hardDiskButton = new JButton("Жёсткий диск");

        JButton powSupButton = new JButton("Блок питания");
        powSupButton.addActionListener(e -> GuiEventHandlers.parseEvent(new ComponentActionEvent()));

        JButton backButton = new JButton("Назад");
        backButton.addActionListener(e -> GuiEventHandlers.parseEvent(new SetStartPanelEvent()));


        setLayout(new MigLayout("center"));
        add(processorButton, "gaptop 50, " + BUTTON_SIZE);
        add(mBoardButton, BUTTON_SIZE );
        add(ramButton, BUTTON_SIZE);
        add(hardDiskButton, BUTTON_SIZE);
        add(powSupButton, BUTTON_SIZE);
        add(backButton, BUTTON_SIZE);
    }
}

