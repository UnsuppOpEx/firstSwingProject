package swingProject.gui.menu;

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
        JMenuItem jRules = new JMenuItem("Руководство пользователя");
        JMenuItem jAboutProgram = new JMenuItem("О программе");

        JMenuItem subMenuPc1 = new JMenuItem("Открыть");
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
