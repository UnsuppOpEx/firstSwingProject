package swingProject.componentView.powerSupplyView;

import swingProject.componentView.powerSupplyView.tableModel.PowerSupplyTableModel;
import swingProject.events.guiEvents.SetComponentsChoiceEvent;
import swingProject.utils.handlers.GuiEventHandlers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Таблица с Блоками питания
 */
public class PowerSupplyView extends JPanel {
    private PowerSupplyTableModel powerSupplyTableModel;

    public PowerSupplyView() {

        powerSupplyTableModel = new PowerSupplyTableModel();

        JTable jTable = new JTable(powerSupplyTableModel);

        JScrollPane jScrollPane = new JScrollPane(jTable);
        jScrollPane.setPreferredSize(new Dimension(750, 450));
        jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        JLabel jLabel = new JLabel("Блоки питания");

        setLayout(new BorderLayout());

        add(jLabel,BorderLayout.PAGE_START);
        add(jScrollPane, BorderLayout.CENTER);
        add(createPanel(), BorderLayout.PAGE_END);

    }

    /**
     * Панель с кнопками управления для блоков питания
     * @return
     */
    public JPanel createPanel() {

        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

        JButton jButton1 = new JButton("Назад");
        jButton1.addActionListener(e -> GuiEventHandlers.parseEvent(new SetComponentsChoiceEvent()));
        JButton jButton2 = new JButton("Удалить");
        JButton jButton3 = new JButton("Ред-ть");
        JButton jButton4 = new JButton("Добавить");
        jButton4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PowerSupplyDialog(GuiEventHandlers.getMainFrame(), "Добавление компонентов", true);
            }
        });

        panel.add(jButton1);
        panel.add(jButton2);
        panel.add(jButton3);
        panel.add(jButton4);

        return panel;
    }
}
