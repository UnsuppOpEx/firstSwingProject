package swingProject.commons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Панель с кнопками управления для Диалогового окна
 *
 * @return
 */
public class ComponentDialog extends JPanel {
    private JButton noButton;
    private JButton okButton;

    public ComponentDialog() {

        setLayout(new FlowLayout());

        noButton = new JButton("Отмена");
        okButton = new JButton("Ок");

        add(noButton);
        add(okButton);

    }

    public void addActionListenerForButtonNo(ActionListener listener) {
        noButton.addActionListener(listener);

    }

    public void addActionListenerForButtonOk(ActionListener listener) {
        okButton.addActionListener(listener);
    }
}
