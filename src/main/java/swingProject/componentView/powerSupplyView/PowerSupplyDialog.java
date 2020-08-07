package swingProject.componentView.powerSupplyView;

import swingProject.events.guiEvents.ComponentActionEvent;
import swingProject.events.guiEvents.GuiEvent;
import swingProject.utils.handlers.GuiEventHandlers;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

/**
 * Диалоговое окно для редактирования Блоков питания
 */
public class PowerSupplyDialog extends JDialog {

    public PowerSupplyDialog(Frame owner, String title, boolean modal) {
        super(owner, title, modal);

        JLabel jLabel = new JLabel("Добавить блок питания");

        add(jLabel, BorderLayout.NORTH);
        add(createPanel(), BorderLayout.SOUTH);

        setResizable(false);
        setSize(new Dimension(350, 250));
        setVisible(true);
    }

    /**
     * Панель с кнопками управления для Диалогового окна
     * @return
     */
    public JPanel createPanel() {

        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

        JButton jButton = new JButton("Отмена");
        jButton.addActionListener(e -> GuiEventHandlers.parseEvent(new ComponentActionEvent()));
        JButton jButton1 = new JButton("Ок");

        panel.add(jButton);
        panel.add(jButton1);

        return panel;
    }
}
