package swingProject.commons;

import swingProject.events.guiEvents.SetComponentsChoiceEvent;
import swingProject.events.powerSupplyEvent.PowerSupplyEventAdd;
import swingProject.events.powerSupplyEvent.PowerSupplyEventEdit;
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
        jButton3.addActionListener(e -> GuiEventHandlers.parseEvent(new PowerSupplyEventEdit()));

        JButton jButton4 = new JButton("Добавить");
        jButton4.addActionListener(e -> GuiEventHandlers.parseEvent(new PowerSupplyEventAdd()));

        add(jButton1);
        add(jButton2);
        add(jButton3);
        add(jButton4);
    }
}
