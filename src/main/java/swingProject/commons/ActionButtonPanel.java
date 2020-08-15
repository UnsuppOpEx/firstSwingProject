package swingProject.commons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ActionButtonPanel extends JPanel {

    private JButton backButton;
    private JButton removeButton;
    private JButton editButton;
    private JButton addButton;

    /**
     * Панель с кнопками управления для блоков питания
     * @return
     */
    public ActionButtonPanel() {

        setLayout(new FlowLayout());

        backButton = new JButton("Назад");
        removeButton = new JButton("Удалить");
        editButton = new JButton("Ред-ть");
        addButton = new JButton("Добавить");

        add(backButton);
        add(removeButton);
        add(editButton);
        add(addButton);
    }

    public void addActionListenerForBackButton(ActionListener listener) {
        backButton.addActionListener(listener);
    }

    public void addActionListenerForRemoveButton(ActionListener listener) {
        removeButton.addActionListener(listener);
    }

    public void addActionListenerForEditButton(ActionListener listener) {
        editButton.addActionListener(listener);
    }

    public void addActionListenerForAddButton(ActionListener listener) {
        addButton.addActionListener(listener);
    }
}
