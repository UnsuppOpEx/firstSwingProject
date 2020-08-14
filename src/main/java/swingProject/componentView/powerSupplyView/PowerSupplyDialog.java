package swingProject.componentView.powerSupplyView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Диалоговое окно для редактирования Блоков питания
 */
public class PowerSupplyDialog extends JDialog {

    public PowerSupplyDialog(Frame owner, String title, boolean modal) {
        super(owner, title, modal);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);

        ButtonGroup group = new ButtonGroup();
        ButtonGroup group1 = new ButtonGroup();

        JLabel jLabel0 = new JLabel("Блок питания");
        jLabel0.setBounds(100, 5, 260, 20);

        JLabel jLabel = new JLabel("Бренд");
        jLabel.setBounds(20, 55, 260, 20);
        JTextField jTextField = new JTextField();
        jTextField.setBounds(120, 55, 150, 20);

        JLabel jLabe2 = new JLabel("Модель");
        jLabe2.setBounds(20, 95, 260, 20);
        JTextField jTextField2 = new JTextField();
        jTextField2.setBounds(120, 95, 150, 20);

        JLabel jLabe3 = new JLabel("Год производства");
        jLabe3.setBounds(20, 135, 260, 20);
        JTextField jTextField3 = new JTextField();
        jTextField3.setBounds(120, 135, 150, 20);

        JLabel jLabe4 = new JLabel("Мощность");
        jLabe4.setBounds(20, 175, 260, 20);
        JTextField jTextField4 = new JTextField();
        jTextField4.setBounds(120, 175, 150, 20);

        JLabel jLabe5 = new JLabel("КПД 80+");
        jLabe5.setBounds(20, 215, 260, 20);
        JRadioButton radioButton = new JRadioButton("Да", false);
        JRadioButton radioButton1 = new JRadioButton("Нет", true);


                group.add(radioButton);
                group.add(radioButton1);
                radioButton.setBounds(130, 215, 60, 20);
                radioButton1.setBounds(200, 215, 60, 20);

                JLabel jLabe6 = new JLabel("PFC");
                jLabe6.setBounds(20, 255, 260, 20);
                JRadioButton radioButton2 = new JRadioButton("Да", false);

                JRadioButton radioButton3 = new JRadioButton("Нет", true);

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
                add(createPanel(), BorderLayout.SOUTH);

                setResizable(false);
                setSize(new Dimension(300, 400));
                setVisible(true);
            }

            /**
             * Панель с кнопками управления для Диалогового окна
             *
             * @return
             */
            public JPanel createPanel() {

                JPanel panel = new JPanel();

                panel.setLayout(new FlowLayout());

                JButton jButton = new JButton("Отмена");
                jButton.addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setVisible(false);
                        dispose();
                    }
                });

                JButton jButton1 = new JButton("Ок");

                panel.add(jButton);
                panel.add(jButton1);

                return panel;
            }

            public static void main(String[] args) {
                new PowerSupplyDialog(null, "", true);

            }
        }


