package swingProject.componentView.powerSupplyView;

import swingProject.commons.ActionButtonPanel;
import swingProject.componentView.powerSupplyView.tableModel.PowerSupplyTableModel;
import swingProject.entities.computerComponents.PowerSupply;
import swingProject.events.guiEvents.SetComponentsChoiceEvent;
import swingProject.events.powerSupplyEvent.PowerSupplyAddEvent;
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

    private JTable PowerSupplyTable;

    public JTable getPowerSupplyTable() {
        return PowerSupplyTable;
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

        //Удаляем выбранный блок питания из таблицы
        actionButtonPanel.addActionListenerForRemoveButton(
                actionEvent -> GuiEventHandlers.parseEvent(
                        new PowerSupplyRemoveEvent(
                                PowerSupplyTable.getSelectedRow()
                        )
                )
        );

        //Создаем диалоговое окно для редактирования выбранного блока питания
        actionButtonPanel.addActionListenerForEditButton(
                actionEvent -> {
                    dialog = new PowerSupplyDialog(
                            null, "Редактирование элемента", true

                    );
                }
        );


        actionButtonPanel.addActionListenerForAddButton(
                actionEvent -> GuiEventHandlers.parseEvent(new PowerSupplyAddEvent())
                    );

        PowerSupplyTable = new JTable(powerSupplyTableModel);

        JScrollPane scrollPanel = new JScrollPane(PowerSupplyTable);
        scrollPanel.setPreferredSize(new Dimension(750, 450));
        scrollPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        JLabel jLabel = new JLabel("Блоки питания");

        setLayout(new BorderLayout());

        add(jLabel, BorderLayout.NORTH);
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
     * Создаёт новое диалоговое окно
     */
    public void createPowerSupplyDialog() {
            dialog = new PowerSupplyDialog(null,"Добавление элемента",true);

        }

    /**
     * Обновление значений таблицы
     */
    public void replaceTableModel() {
        PowerSupplyTable.clearSelection();
        PowerSupplyTable.repaint();
        PowerSupplyTable.revalidate();
    }

}

