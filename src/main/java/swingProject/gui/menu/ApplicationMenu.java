package swingProject.gui.menu;

import swingProject.events.guiEvents.CloseApplicationEvent;
import swingProject.events.guiEvents.OpenAboutDialogEvent;
import swingProject.events.guiEvents.SetStartPanelEvent;
import swingProject.utils.handlers.GuiEventHandlers;

import javax.swing.*;

/**
 * МенюБар с добавлением слушателей
 */
public class ApplicationMenu extends JMenuBar {

    public ApplicationMenu() {
        JMenu catalogMenu = new JMenu("Каталог");
        JMenu helpMenu = new JMenu("Помощь");

        JMenu pcMenu = new JMenu("ПК");
        JMenu complectMenu = new JMenu("Комплектующие");

        JMenuItem exitMenu = new JMenuItem("Выход");
        exitMenu.addActionListener(e -> GuiEventHandlers.parseEvent(new CloseApplicationEvent()));

        JMenuItem rulesItem = new JMenuItem("Руководство пользователя");

        JMenuItem AboutProgramItem = new JMenuItem("О программе");
        AboutProgramItem.addActionListener(e -> GuiEventHandlers.parseEvent(new OpenAboutDialogEvent()));

        JMenuItem openSubMenu = new JMenuItem("Открыть");
        JMenuItem beforeOpenSubMenu = new JMenuItem("Ранее открытое");
        JMenuItem saveSubMenu = new JMenuItem("Сохранить");
        JMenuItem saveAsSubMenu = new JMenuItem("Сохранить как");

        JMenuItem ramSubMenu = new JMenuItem("Оперативная память");
        JMenuItem processorSubMenu = new JMenuItem("Процессор");
        JMenuItem mboardSubMenu = new JMenuItem("Материнская плата");
        JMenuItem hardDiskSubMenu = new JMenuItem("Жёсткий диск");
        JMenuItem powSupplySubMenu = new JMenuItem("Блок питания");

        pcMenu.add(openSubMenu);
        pcMenu.add(beforeOpenSubMenu);
        pcMenu.add(saveSubMenu);
        pcMenu.add(saveAsSubMenu);

        complectMenu.add(ramSubMenu);
        complectMenu.add(processorSubMenu);
        complectMenu.add(mboardSubMenu);
        complectMenu.add(hardDiskSubMenu);
        complectMenu.add(powSupplySubMenu);

        catalogMenu.add(pcMenu);
        catalogMenu.add(complectMenu);
        catalogMenu.addSeparator();
        catalogMenu.add(exitMenu);
        helpMenu.add(rulesItem);
        helpMenu.add(AboutProgramItem);

        add(catalogMenu);
        add(helpMenu);
    }


}
