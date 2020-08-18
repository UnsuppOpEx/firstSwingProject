package swingProject.componentView.powerSupplyView;

import swingProject.commons.ComponentDialog;
import swingProject.events.guiEvents.CreateNewComponentEvent;
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
    private JPanel jPanel;
    private String brand;
    private JTextField jTextField;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JRadioButton radioButton;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    public String line = "Samsung";

    private ButtonGroup group;
    private ButtonGroup group1;

    public String getBrand() {
        return brand;
    }

    public PowerSupplyDialog(Frame owner, String title, boolean modal) {
        super(owner, title, modal);

        componentDialog = new ComponentDialog();
        jPanel = new JPanel();
        group = new ButtonGroup();
        group1 = new ButtonGroup();

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
        componentDialog.addActionListenerForButtonOk(
                e -> GuiEventHandlers.parseEvent(new CreateNewComponentEvent())
        );

        jPanel.setLayout(null);

        JLabel jLabel0 = new JLabel("Блок питания");
        jLabel0.setBounds(100, 5, 260, 20);

        JLabel jLabel = new JLabel("Бренд");
        jLabel.setBounds(20, 55, 260, 20);
        jTextField = new JTextField();
        jTextField.setBounds(120, 55, 150, 20);
        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                brand = jTextField.getText();
            }
        });

        JLabel jLabe2 = new JLabel("Модель");
        jLabe2.setBounds(20, 95, 260, 20);
        jTextField2 = new JTextField();
        jTextField2.setBounds(120, 95, 150, 20);

        JLabel jLabe3 = new JLabel("Год производства");
        jLabe3.setBounds(20, 135, 260, 20);
        jTextField3 = new JTextField();
        jTextField3.setBounds(120, 135, 150, 20);

        JLabel jLabe4 = new JLabel("Мощность");
        jLabe4.setBounds(20, 175, 260, 20);
        jTextField4 = new JTextField();
        jTextField4.setBounds(120, 175, 150, 20);

        JLabel jLabe5 = new JLabel("КПД 80+");
        jLabe5.setBounds(20, 215, 260, 20);
        radioButton = new JRadioButton("Да", false);
        radioButton1 = new JRadioButton("Нет", true);


                group.add(radioButton);
                group.add(radioButton1);
                radioButton.setBounds(130, 215, 60, 20);
                radioButton1.setBounds(200, 215, 60, 20);

                JLabel jLabe6 = new JLabel("PFC");
                jLabe6.setBounds(20, 255, 260, 20);
                radioButton2 = new JRadioButton("Да", false);
                radioButton3 = new JRadioButton("Нет", true);

                group1.add(radioButton2);
                group1.add(radioButton3);
                radioButton2.setBounds(130, 255, 60, 20);
                radioButton3.setBounds(200, 255, 60, 20);

                jPanel.add(radioButton);
                jPanel.add(radioButton1);
                jPanel.add(radioButton2);
                jPanel.add(radioButton3);

                jPanel.add(jTextField);
                jPanel.add(jTextField2);
                jPanel.add(jTextField3);
                jPanel.add(jTextField4);

                jPanel.add(jLabel0);
                jPanel.add(jLabel);
                jPanel.add(jLabe2);
                jPanel.add(jLabe3);
                jPanel.add(jLabe4);
                jPanel.add(jLabe5);
                jPanel.add(jLabe6);

                add(jPanel);
                add(componentDialog, BorderLayout.SOUTH);

                setResizable(false);
                setSize(new Dimension(300, 400));
                setVisible(true);
            }


            public static void main(String[] args) {
                new PowerSupplyDialog(null, "", true);

            }

    public JTextField getjTextField() {
        return jTextField;
    }

    public JTextField getjTextField2() {
        return jTextField2;
    }

    public JTextField getjTextField3() {
        return jTextField3;
    }

    public JTextField getjTextField4() {
        return jTextField4;
    }

    public JRadioButton getRadioButton() {
        return radioButton;
    }

    public JRadioButton getRadioButton2() {
        return radioButton2;
    }

}


