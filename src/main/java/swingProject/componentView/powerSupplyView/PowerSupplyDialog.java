package swingProject.componentView.powerSupplyView;

import net.miginfocom.swing.MigLayout;
import swingProject.entities.computerComponents.PowerSupply;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Диалоговое окно для редактирования Блоков питания
 */
public class PowerSupplyDialog extends JDialog {
    public static final String LABEL_SIZE = "gapleft 20, wrap 35";
    private PowerSupply powerSupply;

    public PowerSupplyDialog(Frame owner, String title, boolean modal) {
        super(owner, title, modal);

        JLabel jLabe0 = new JLabel("Добавить блок питания");
        JLabel jLabel = new JLabel("Бренд");
        JLabel jLabe2 = new JLabel("Модель");
        JLabel jLabe3 = new JLabel("Год релиза");
        JLabel jLabe4 = new JLabel("Мощность");
        JLabel jLabe5 = new JLabel("КПД80+");
        JLabel jLabe6 = new JLabel("PFC");


        JPanel jPanel = new JPanel();
        setLayout(new MigLayout());
        jPanel.setLayout(new MigLayout());


//         
        jPanel.add(jLabel, LABEL_SIZE);
        jPanel.add(jLabe2, LABEL_SIZE);
        jPanel.add(jLabe3, LABEL_SIZE);
        jPanel.add(jLabe4, LABEL_SIZE);
        jPanel.add(jLabe5, LABEL_SIZE);
        jPanel.add(jLabe6, LABEL_SIZE);
        add(jPanel);
        add(createPanel(), "gaptop 400");

        setResizable(false);
        setSize(new Dimension(380, 500));
        setVisible(true);
    }

    /**
     * Панель с кнопками управления для Диалогового окна
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
