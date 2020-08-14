package swingProject.componentView.powerSupplyView;

import swingProject.commons.ActionButtonPanel;
import swingProject.componentView.powerSupplyView.tableModel.PowerSupplyTableModel;
import swingProject.events.guiEvents.SetComponentsChoiceEvent;
import swingProject.events.powerSupplyEvent.PowerSupplyRemoveEvent;
import swingProject.utils.handlers.GuiEventHandlers;

import javax.swing.*;
import java.awt.*;

/**
 * Таблица с Блоками питания
 */
public class PowerSupplyView extends JPanel {
    private PowerSupplyTableModel powerSupplyTableModel;
    private ActionButtonPanel actionButtonPanel;
    private JTable jTable;

    public JTable getjTable() {
        return jTable;
    }

    public PowerSupplyTableModel getPowerSupplyTableModel() {
        return powerSupplyTableModel;
    }

    public PowerSupplyView() {

        powerSupplyTableModel = new PowerSupplyTableModel();
        actionButtonPanel = new ActionButtonPanel();

        actionButtonPanel.addActionListenerForBackButton(
                actionEvent -> GuiEventHandlers.parseEvent(new SetComponentsChoiceEvent())
        );

        actionButtonPanel.addActionListenerForRemoveButton(
                actionEvent -> GuiEventHandlers.parseEvent(
                        new PowerSupplyRemoveEvent(
                                jTable.getSelectedRow()
                        )
                )
        );

        actionButtonPanel.addActionListenerForEditButton(
                actionEvent -> {
                    PowerSupplyDialog dialog = new PowerSupplyDialog(
                            null, "Редактирование элемента", true

                    );
                }
        );

        jTable = new JTable(powerSupplyTableModel);

        JScrollPane jScrollPane = new JScrollPane(jTable);
        jScrollPane.setPreferredSize(new Dimension(750, 450));
        jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        JLabel jLabel = new JLabel("Блоки питания");

        setLayout(new BorderLayout());

        add(jLabel, BorderLayout.NORTH);
        add(jScrollPane, BorderLayout.CENTER);
        add(actionButtonPanel, BorderLayout.PAGE_END);

    }

    public void removePowerSupply(int index) {
        powerSupplyTableModel.removeData(index);
        jTable.clearSelection();
        jTable.repaint();
        jTable.revalidate();
    }

}
