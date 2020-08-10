package swingProject.commons;

import swingProject.events.guiEvents.OpenPowerSupplyDialog;
import swingProject.events.guiEvents.SetComponentsChoiceEvent;
import swingProject.events.powerSupplyEvent.PowerSupplyEventRemove;
import swingProject.utils.handlers.GuiEventHandlers;

import javax.swing.*;
import java.awt.*;

public class ActionButtonPanel extends JPanel {

    /**
     * Панель с кнопками управления для блоков питания
     * @return
     */
    public ActionButtonPanel() {

        setLayout(new FlowLayout());

        JButton jButton1 = new JButton("Назад");
        jButton1.addActionListener(e -> GuiEventHandlers.parseEvent(new SetComponentsChoiceEvent()));

        JButton jButton2 = new JButton("Удалить");
        jButton2.addActionListener(e -> GuiEventHandlers.parseEvent(new PowerSupplyEventRemove()));
        JButton jButton3 = new JButton("Ред-ть");

        JButton jButton4 = new JButton("Добавить");
        jButton4.addActionListener(e -> GuiEventHandlers.parseEvent(new OpenPowerSupplyDialog()));

        add(jButton1);
        add(jButton2);
        add(jButton3);
        add(jButton4);
    }
}
