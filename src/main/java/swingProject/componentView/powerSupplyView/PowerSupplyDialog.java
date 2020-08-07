package swingProject.componentView.powerSupplyView;

import swingProject.events.guiEvents.ComponentActionEvent;
import swingProject.events.guiEvents.GuiEvent;
import swingProject.utils.handlers.GuiEventHandlers;

import javax.swing.*;
import java.awt.*;

/**
 * Диалоговое окно для редактирования Блоков питания
 */
public class PowerSupplyDialog extends JDialog {

    public PowerSupplyDialog(Frame owner, String title, boolean modal) {
        super(owner, title, modal);

        JButton jButton = new JButton("Отмена");
        jButton.addActionListener(e -> GuiEventHandlers.parseEvent(new ComponentActionEvent()));
        JButton jButton1 = new JButton("Ок");

        setLayout(new FlowLayout());
        add(jButton);
        add(jButton1);

        setResizable(false);
        setSize(new Dimension(350, 250));
        setVisible(true);
    }
}
