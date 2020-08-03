package swingProject.componentView.componentsMenu;

import net.miginfocom.swing.MigLayout;
import swingProject.events.guiEvents.ComponentActionEvent;
import swingProject.events.guiEvents.SetStartPanelEvent;
import swingProject.utils.handlers.GuiEventHandlers;

import javax.swing.*;
import java.awt.*;

public class ComponentsMenu extends JPanel {

    public ComponentsMenu() {

        JButton jButton1 = new JButton("Процессор");
        JButton jButton2 = new JButton("Материнская плата");
        JButton jButton3 = new JButton("Оперативная память");
        JButton jButton4 = new JButton("Жёсткий диск");
        JButton jButton5 = new JButton("Блок питания");
        jButton5.addActionListener(e -> GuiEventHandlers.parseEvent(new ComponentActionEvent()));
        JButton jButton6 = new JButton("Назад");
        jButton6.addActionListener(e -> GuiEventHandlers.parseEvent(new SetStartPanelEvent()));


        setLayout(new MigLayout("center"));
        add(jButton1, "gaptop 50, wrap 20, w 250!, h 50!");
        add(jButton2, "wrap 20, w 250!, h 50!");
        add(jButton3, "wrap 20, w 250!, h 50!");
        add(jButton4, "wrap 20, w 250!, h 50!");
        add(jButton5, "wrap 20, w 250!, h 50!");
        add(jButton6, "wrap 20, w 250!, h 50!");
    }

//    public static void main(String[] args) {
//        JFrame jFrame = new JFrame();
//        jFrame.setSize(new Dimension(800, 600));
//        jFrame.setResizable(false);
//        jFrame.setLocationRelativeTo(null);
//        jFrame.add(new ComponentsMenu());
//        jFrame.setVisible(true);
//
//    }
}

