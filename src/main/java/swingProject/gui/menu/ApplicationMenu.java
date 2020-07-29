package swingProject.gui.menu;

import swingProject.events.guiEvents.CloseApplicationEvent;
import swingProject.events.guiEvents.OpenAboutDialogEvent;
import swingProject.events.guiEvents.SetStartPanelEvent;
import swingProject.gui.MainFrame;
import swingProject.utils.handlers.GuiEventHandlers;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationMenu extends JMenuBar {
    public ApplicationMenu() {
        JMenu jMenuCatalog = new JMenu("Каталог");
        JMenu jMenuHelp = new JMenu("Помощь");

        JMenu jPc = new JMenu("ПК");
        JMenu jList = new JMenu("Комплектующие");
        JMenuItem jExit = new JMenuItem("Выход");
        jExit.addActionListener(e -> GuiEventHandlers.parseEvent(new CloseApplicationEvent()));
        JMenuItem jRules = new JMenuItem("Руководство пользователя");
        JMenuItem jAboutProgram = new JMenuItem("О программе");
        jAboutProgram.addActionListener(e -> GuiEventHandlers.parseEvent(new OpenAboutDialogEvent()));

        JMenuItem subMenuPc1 = new JMenuItem("Открыть");
        subMenuPc1.addActionListener(e -> GuiEventHandlers.parseEvent(new SetStartPanelEvent()));
        JMenuItem subMenuPc2 = new JMenuItem("Ранее открытое");
        JMenuItem subMenuPc3 = new JMenuItem("Сохранить");
        JMenuItem subMenuPc4 = new JMenuItem("Сохранить как");

        JMenuItem subMenuList1 = new JMenuItem("Оперативная память");
        JMenuItem subMenuList2 = new JMenuItem("Процессор");
        JMenuItem subMenuList3 = new JMenuItem("Материнская плата");
        JMenuItem subMenuList4 = new JMenuItem("Жёсткий диск");
        JMenuItem subMenuList5 = new JMenuItem("Блок питания");

        jPc.add(subMenuPc1);
        jPc.add(subMenuPc2);
        jPc.add(subMenuPc3);
        jPc.add(subMenuPc4);
        jList.add(subMenuList1);
        jList.add(subMenuList2);
        jList.add(subMenuList3);
        jList.add(subMenuList4);
        jList.add(subMenuList5);
        jMenuCatalog.add(jPc);
        jMenuCatalog.add(jList);
        jMenuCatalog.add(jExit);
        jMenuHelp.add(jRules);
        jMenuHelp.add(jAboutProgram);

        add(jMenuCatalog);
        add(jMenuHelp);


    }


}
