package swingProject.componentView.powerSupplyView;

import swingProject.commons.ActionButtonPanel;
import swingProject.componentView.powerSupplyView.tableModel.PowerSupplyTableModel;
import swingProject.entities.computerComponents.PowerSupply;
import swingProject.events.guiEvents.SetComponentsChoiceEvent;
import swingProject.events.powerSupplyEvent.PowerSupplyEventAdd;
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
    private PowerSupplyDialog dialog;

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
        //
        actionButtonPanel.addActionListenerForEditButton(
                actionEvent -> {
                    dialog = new PowerSupplyDialog(
                            null, "Редактирование элемента", true

                    );
                }
        );


        actionButtonPanel.addActionListenerForAddButton(
                actionEvent -> GuiEventHandlers.parseEvent(new PowerSupplyEventAdd())
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

    /**
     * Удаляет выбранный элемент из таблицы
     * @param index
     */
    public void removePowerSupply(int index) {
        powerSupplyTableModel.removeData(index);
        jTable.clearSelection();
        jTable.repaint();
        jTable.revalidate();
    }

    /**
     * Создает новый объект PowerSupply и добавляет в таблицу
     */
    public void addNewComponentToTable() {

//        int year = Integer.valueOf(String.valueOf(dialog.getjTextField3().getText()));
//        int watt = Integer.valueOf(String.valueOf(dialog.getjTextField4().getText()));
//        boolean KPD80 = dialog.getRadioButton().isSelected() ? true : false;
//        boolean PFC = dialog.getRadioButton2().isSelected() ? true : false;

        try {
            powerSupplyTableModel.addData(new PowerSupply(dialog.getBrand(), "WD1000",
                    2020, 1000, true, true));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Не удалось добавить компонент",
                    "Message", JOptionPane.ERROR_MESSAGE
                    );
        }
             JOptionPane.showMessageDialog(
                    this,
                    "Компонент добавлен",
                    "Message", JOptionPane.INFORMATION_MESSAGE
                    );

    }

    /**
     * Создаёт новое диалоговое окно
      */
    public void createPowerSupplyDialog() {
            dialog = new PowerSupplyDialog(null,"",true);

        }

    }

