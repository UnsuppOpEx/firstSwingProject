package swingProject.gui.menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationMenu extends JMenuBar {
    public ApplicationMenu() {
        JMenu jMenuSettings = new JMenu("Настройки");
        JMenu jMenuAboutProgram = new JMenu("О программе");
        JMenu jMenuExit = new JMenu("Выход");

        add(jMenuSettings);
        add(jMenuAboutProgram);
        add(jMenuExit);
    }
}
