package swingProject.gui;

import swingProject.commons.Actions;
import swingProject.componentView.componentsMenu.ComponentsMenu;
import swingProject.componentView.powerSupplyView.PowerSupplyView;
import swingProject.entities.computerComponents.PowerSupply;
import swingProject.gui.menu.ApplicationMenu;
import swingProject.gui.startPanel.StartPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Основной фрейм
 */
public class MainFrame extends JFrame {
    private JPanel contentPanel;
    private StartPanel startPanel;
    private ComponentsMenu componentsMenu;
    private PowerSupplyView powerSupplyView;

    public MainFrame() {
        setTitle("Меню");
        setSize(new Dimension(800,600));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        contentPanel = new JPanel();
        startPanel = new StartPanel();
        componentsMenu = new ComponentsMenu();
        powerSupplyView = new PowerSupplyView();

        JLabel label = new JLabel("Версия программы 0.0.1");

        setContent(startPanel);

        add(contentPanel);
        add(new ApplicationMenu(),BorderLayout.NORTH);
        add(label,BorderLayout.PAGE_END);           // TODO:перенести label в другой угол.

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Отрисовка панели
     */
    public void setStartPanelEvent() {
        setContent(startPanel);
    }

    /**
     * Открыть окно с информацией о программе
     */
    public void openAboutDialogEvent() {
        JOptionPane.showMessageDialog(this,
                                      "Program for home using",
                                      "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Выйти из приложения
     */
    public void closeApplicationEvent() {
        System.exit(-1);
    }


    /**
     * Отрисовка панели с комплектующими
     */
    public void setComponentsChoiceEvent() {
        setContent(componentsMenu);
    }

    /**
     * Отрисовка панели с Блоками питания
     */
    public void componentActionEvent() {
        setContent(powerSupplyView);
    }


    public void powerSupplyEventRemove(int index) {

        try {
            powerSupplyView.removePowerSupply(index);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Не возможно удалить компонент, возможно он уже удалён или не выбран.",
                    "Message",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void createNewComponentEvent(PowerSupply powerSupply) {
        powerSupplyView.addNewComponentToTable(powerSupply);
    }

    /**
     * Добавить блок питания
     */
    public void powerSupplyEventAdd() {
        powerSupplyView.createPowerSupplyDialog();
    }

    /**
     * Внести изменения в существующий блок питания
     * @param powerSupply
     * @param index
     */
    public void  powerSupplyEditEvent(PowerSupply powerSupply, Actions action, int index) {
        powerSupplyView.createPowerSupplyDialogEdit(powerSupply, action, index);
    }

    /**
     * Обновление компонента в таблице
     * @param powerSupply
     * @param index
     */
    public void updateComponentEvent(PowerSupply powerSupply, int index) {
        powerSupplyView.getPowerSupplyTableModel().updateComponent(powerSupply, index);
        powerSupplyView.replaceTableModel();
    }

    /**
     * Отрисовка новой панели
     * @param panel
     */
    public void setContent(JPanel panel) {
        contentPanel.removeAll();
        contentPanel.add(panel);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

}
