package swingProject.componentView.powerSupplyView;

import net.miginfocom.swing.MigLayout;
import swingProject.commons.Actions;
import swingProject.commons.ComponentDialog;
import swingProject.entities.computerComponents.PowerSupply;
import swingProject.events.guiEvents.CreateNewComponentEvent;
import swingProject.events.guiEvents.UpdateComponentEvent;
import swingProject.utils.handlers.GuiEventHandlers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Диалоговое окно для редактирования Блоков питания
 */
public class PowerSupplyDialog extends JDialog {
    private ComponentDialog componentDialog;
    private JTextField brandTextField;
    private JTextField modelTextField;
    private JTextField yearTextField;
    private JTextField wattTextField;
    private JRadioButton kpdRadioButton;
    private JRadioButton kpdRadioButton1;
    private JRadioButton pfcRadioButton;
    private JRadioButton pfcRadioButton1;
    private PowerSupply powerSupplyEdit;
    private int indexEdit;
    private Actions actionsValue;
    private ButtonGroup kpdGroup;
    private ButtonGroup pfcGroup;


    public PowerSupplyDialog(Frame owner, String title, boolean modal, PowerSupply powerSupply, Actions actions, int index) {
        super(owner, title, modal);
        componentDialog = new ComponentDialog();
        powerSupplyEdit = powerSupply;
        actionsValue = actions;
        indexEdit = index;

        /**
         *  Создание и добавление нового элемента PowerSupply в таблицу
         */
        componentDialog.addActionListenerForButtonOk(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int year;
                int watt;

                try {
                    year = Integer.parseInt(yearTextField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Введены неправильные параметры в поле \"Год производства\"",
                            "Ошибка",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                try {
                    watt = Integer.parseInt(wattTextField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Введены неправильные параметры в поле \"Мощность\"",
                            "Ошибка",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                String brand = String.valueOf(brandTextField.getText());
                String model = String.valueOf(modelTextField.getText());

                boolean kpd = kpdRadioButton.isSelected();
                boolean pfc = pfcRadioButton.isSelected();

                if(actions == Actions.UPDATE_ACTION && !brand.isEmpty() && !model.isEmpty()) {
                    GuiEventHandlers.parseEvent(new UpdateComponentEvent(new PowerSupply(
                            brand, model, year, watt, kpd, pfc) , indexEdit));
                        dispose();
                }

                else
                    if(!brand.isEmpty() && !model.isEmpty()) {
                        GuiEventHandlers.parseEvent(new CreateNewComponentEvent(
                                new PowerSupply(
                                        brand, model, year, watt, kpd, pfc))
                        );
                        dispose();
                    }
                    else
                        return;
            }
        });

        /**
         * Закрыть диалоговое окно
         */
        componentDialog.addActionListenerForButtonNo(
                actionEvent -> {
                    setVisible(false);
                    dispose();
                }
        );

        add(createGUI());
        add(componentDialog, BorderLayout.SOUTH);

        setResizable(false);
        setSize(new Dimension(300, 400));
        setVisible(true);
    }

    /**
     * Установить поля выбранного компонента
     */
    public void setFieldsForDialog(PowerSupply powerSupplyEdit) {

        brandTextField.setText(powerSupplyEdit.getManufacturer());
        modelTextField.setText(String.valueOf(powerSupplyEdit.getModel()));
//        modelTextField.setEnabled(false);
        yearTextField.setText(String.valueOf(powerSupplyEdit.getYearRelease()));
        wattTextField.setText(String.valueOf(powerSupplyEdit.getNominalWatt()));
        kpdRadioButton.setSelected(powerSupplyEdit.isCertify80Plus());
        pfcRadioButton.setSelected(powerSupplyEdit.isPFC());

    }

    /**
     * Создание панели с элементами GUI
     * @return
     */
    private JPanel createGUI () {

        JPanel mainPanel = new JPanel (),

                componentPanel = new JPanel (new MigLayout());

        kpdGroup = new ButtonGroup();
        pfcGroup = new ButtonGroup();

        JLabel confirmLabel = new JLabel ("Блоки питания");

        JLabel brandLabel = new JLabel("Бренд");
        brandTextField = new JTextField("", 15);

        JLabel modelLabel = new JLabel("Модель");
        modelTextField = new JTextField("", 15);

        JLabel yearLabel = new JLabel("Год производ.");
        yearTextField = new JTextField("", 15);

        JLabel wattLabel = new JLabel("Мощность");
        wattTextField = new JTextField("", 15);

        JLabel kpdLabel = new JLabel("КПД 80+");
        kpdRadioButton = new JRadioButton("Да", false);
        kpdRadioButton1 = new JRadioButton("Нет", true);

        kpdGroup.add(kpdRadioButton);
        kpdGroup.add(kpdRadioButton1);

        JLabel pfcLabel = new JLabel("PFC");
        pfcRadioButton = new JRadioButton("Да", false);
        pfcRadioButton1 = new JRadioButton("Нет", true);

        pfcGroup.add(pfcRadioButton);
        pfcGroup.add(pfcRadioButton1);

        if (powerSupplyEdit != null) {
            setFieldsForDialog(powerSupplyEdit);
        }

        mainPanel.add(confirmLabel, BorderLayout.NORTH);

        componentPanel.add (brandLabel);
        componentPanel.add (brandTextField, "gaptop 15, wrap 15");
        componentPanel.add (modelLabel);
        componentPanel.add (modelTextField, "wrap 15");
        componentPanel.add (yearLabel);
        componentPanel.add (yearTextField, "wrap 15");
        componentPanel.add (wattLabel);
        componentPanel.add (wattTextField, "wrap 15");
        componentPanel.add(kpdLabel);
        componentPanel.add(kpdRadioButton, "split 2");
        componentPanel.add(kpdRadioButton1,"gapleft 50, wrap 15");
        componentPanel.add(pfcLabel);
        componentPanel.add(pfcRadioButton, "split 2");
        componentPanel.add(pfcRadioButton1,"gapleft 50, wrap 60");

        mainPanel.add(componentPanel);

        return mainPanel;

    }

//    public static void main(String[] args) {
//        new PowerSupplyDialog(null, "Редактирование компонента",true,null, null, 0);
//    }
}


