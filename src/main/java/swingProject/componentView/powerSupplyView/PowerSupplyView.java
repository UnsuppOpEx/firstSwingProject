package swingProject.componentView.powerSupplyView;

import swingProject.commons.ActionButtonPanel;
import swingProject.commons.Actions;
import swingProject.componentView.powerSupplyView.tableModel.PowerSupplyTableModel;
import swingProject.entities.computerComponents.PowerSupply;
import swingProject.events.guiEvents.SetComponentsChoiceEvent;
import swingProject.events.powerSupplyEvent.PowerSupplyAddEvent;
import swingProject.events.powerSupplyEvent.PowerSupplyEditEvent;
import swingProject.events.powerSupplyEvent.PowerSupplyRemoveEvent;
import swingProject.utils.handlers.GuiEventHandlers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Таблица с Блоками питания
 */
public class PowerSupplyView extends JPanel {
    private PowerSupplyTableModel powerSupplyTableModel;
    private ActionButtonPanel actionButtonPanel;
    private PowerSupplyDialog dialog;

    private JTable powerSupplyTable;

    public JTable getPowerSupplyTable() {
        return powerSupplyTable;
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

        /**
         * Удаляет выбранный блок питания из таблицы
         */
        actionButtonPanel.addActionListenerForRemoveButton(
                actionEvent -> GuiEventHandlers.parseEvent(
                        new PowerSupplyRemoveEvent(
                                powerSupplyTable.getSelectedRow()
                        )
                )
        );

        /**
         * Создает диалоговое окно для редактирования выбранного блока питания
         */
        actionButtonPanel.addActionListenerForEditButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiEventHandlers.parseEvent(
                        new PowerSupplyEditEvent(
                                powerSupplyTableModel.getList(
                                        powerSupplyTable.getSelectedRow()),
                                            Actions.UPDATE_ACTION)
                );
            }
        });

        /**
         * Создает диалоговое окно для добавления нового компонента
         */
        actionButtonPanel.addActionListenerForAddButton(
                actionEvent -> GuiEventHandlers.parseEvent(new PowerSupplyAddEvent())
                    );


        powerSupplyTable = new JTable(powerSupplyTableModel);

        JScrollPane scrollPanel = new JScrollPane(powerSupplyTable);
        scrollPanel.setPreferredSize(new Dimension(750, 450));
        scrollPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        JLabel headLineLabel = new JLabel("Блоки питания");

        setLayout(new BorderLayout());

        add(headLineLabel, BorderLayout.NORTH);
        add(scrollPanel, BorderLayout.CENTER);
        add(actionButtonPanel, BorderLayout.PAGE_END);

    }

    /**
     * Удаляет выбранный элемент из таблицы
     * @param index
     */
    public void removePowerSupply(int index) {
        powerSupplyTableModel.removeData(index);
        replaceTableModel();
    }

    /**
     * Создает новый объект PowerSupply и добавляет в таблицу
     * @param powerSupply
     */
    public void addNewComponentToTable(PowerSupply powerSupply) {

        try {
            powerSupplyTableModel.addData(powerSupply);
            replaceTableModel();
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
     * Создаёт новое диалоговое окно для добавления компонента
     */
    public void createPowerSupplyDialog() {
        dialog = new PowerSupplyDialog(null,"Добавление компонента",true, null, null);

        }

    /**
     * Создаёт новое диалоговое окно для редактирования компонента
     * @param powerSupply
     * @param action
     */
    public void createPowerSupplyDialogEdit(PowerSupply powerSupply, Actions action) {
        dialog = new PowerSupplyDialog(null,"Редактирование компонента",true, powerSupply, action);
//
    }

    /**
     * Обновление значений таблицы
     */
    public void replaceTableModel() {
        powerSupplyTable.clearSelection();
        powerSupplyTable.repaint();
        powerSupplyTable.revalidate();
    }


}

