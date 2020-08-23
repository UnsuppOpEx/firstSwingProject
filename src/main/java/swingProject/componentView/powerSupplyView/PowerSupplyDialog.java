package swingProject.componentView.powerSupplyView;

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
    private JPanel panel;
    private JTextField brandTextField;
    private JTextField modelTextField;
    private JTextField yearTextField;
    private JTextField wattTextField;
    private JRadioButton kpdRadioButton;
    private JRadioButton kpdRadioButton1;
    private JRadioButton pfcRadioButton;
    private JRadioButton pfcRadioButton1;
    private PowerSupply powerSupplyEdit;
    private Actions actionsValue;
    private ButtonGroup kpdGroup;
    private ButtonGroup pfcGroup;


    public PowerSupplyDialog(Frame owner, String title, boolean modal, PowerSupply powerSupply, Actions actions) {
        super(owner, title, modal);
        powerSupplyEdit = powerSupply;
        actionsValue = actions;

        componentDialog = new ComponentDialog();
        panel = new JPanel();
        kpdGroup = new ButtonGroup();
        pfcGroup = new ButtonGroup();

        /**
         * Закрыть диалоговое окно
         */
        componentDialog.addActionListenerForButtonNo(
                actionEvent -> {
                    setVisible(false);
                    dispose();
                }
        );

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
                    watt = Integer.parseInt(wattTextField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Введены неправильные параметры",
                            "Message",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                String brand = String.valueOf(brandTextField.getText());
                String model = String.valueOf(brandTextField.getText());

                boolean kpd = kpdRadioButton.isSelected();
                boolean pfc = pfcRadioButton.isSelected();

                if(actions == Actions.UPDATE_ACTION) {
                    GuiEventHandlers.parseEvent(new UpdateComponentEvent(powerSupplyEdit));
                }

                else
                    GuiEventHandlers.parseEvent(new CreateNewComponentEvent(
                        new PowerSupply(
                                brand, model, year, watt, kpd, pfc))
                );
                setVisible(false);
                dispose();
            }
        });

        panel.setLayout(null);
        panel.setMinimumSize(new Dimension(350, 450));

        JLabel powSupplyLabel = new JLabel("Блок питания");
        powSupplyLabel.setBounds(100, 5, 260, 20);

        JLabel brandLabel = new JLabel("Бренд");
        brandLabel.setBounds(20, 55, 260, 20);
        brandTextField = new JTextField();
        brandTextField.setBounds(120, 55, 150, 20);

        JLabel modelLabel = new JLabel("Модель");
        modelLabel.setBounds(20, 95, 260, 20);
        modelTextField = new JTextField();
        modelTextField.setBounds(120, 95, 150, 20);

        JLabel yearLabel = new JLabel("Год производ.");
        yearLabel.setBounds(20, 135, 260, 20);
        yearTextField = new JTextField();
        yearTextField.setBounds(120, 135, 150, 20);

        JLabel wattLabel = new JLabel("Мощность");
        wattLabel.setBounds(20, 175, 260, 20);
        wattTextField = new JTextField();
        wattTextField.setBounds(120, 175, 150, 20);

        JLabel kpdLabel = new JLabel("КПД 80+");
        kpdLabel.setBounds(20, 215, 260, 20);
        kpdRadioButton = new JRadioButton("Да", false);
        kpdRadioButton1 = new JRadioButton("Нет", true);

        kpdGroup.add(kpdRadioButton);
        kpdGroup.add(kpdRadioButton1);
        kpdRadioButton.setBounds(130, 215, 60, 20);
        kpdRadioButton1.setBounds(200, 215, 60, 20);

        JLabel pfcLabel = new JLabel("PFC");
        pfcLabel.setBounds(20, 255, 260, 20);
        pfcRadioButton = new JRadioButton("Да", false);
        pfcRadioButton1 = new JRadioButton("Нет", true);

        pfcGroup.add(pfcRadioButton);
        pfcGroup.add(pfcRadioButton1);
        pfcRadioButton.setBounds(130, 255, 60, 20);
        pfcRadioButton1.setBounds(200, 255, 60, 20);

        if (powerSupplyEdit != null) {
            setFieldsForDialog(powerSupplyEdit);
        }

        panel.add(kpdRadioButton);
        panel.add(kpdRadioButton1);
        panel.add(pfcRadioButton);
        panel.add(pfcRadioButton1);

        panel.add(brandTextField);
        panel.add(modelTextField);
        panel.add(yearTextField);
        panel.add(wattTextField);

        panel.add(powSupplyLabel);
        panel.add(brandLabel);
        panel.add(modelLabel);
        panel.add(yearLabel);
        panel.add(wattLabel);
        panel.add(kpdLabel);
        panel.add(pfcLabel);

        add(panel);
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
        modelTextField.setText(powerSupplyEdit.getModel());
        modelTextField.setEnabled(false);
        yearTextField.setText(String.valueOf(powerSupplyEdit.getYearRelease()));
        wattTextField.setText(String.valueOf(powerSupplyEdit.getNominalWatt()));
        kpdRadioButton.setSelected(powerSupplyEdit.isCertify80Plus());
        pfcRadioButton.setSelected(powerSupplyEdit.isPFC());

//    public static void main(String[] args) {
//                new PowerSupplyDialog(null, "", true);
//
//            }

    }
}


