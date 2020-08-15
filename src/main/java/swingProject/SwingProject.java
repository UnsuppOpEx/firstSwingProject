package swingProject;

import swingProject.gui.MainFrame;
import swingProject.utils.handlers.GuiEventHandlers;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * Основной класс.
 * Применяет тему Nimbus и производит запуск приложения.
 */
public class SwingProject {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        /**
         * Создание объекта, установка стартовой панели, передача объекта в GuiEventHandler
         */
        MainFrame mainFrame = new MainFrame();
        GuiEventHandlers.setMainFrame(mainFrame);

    }
}
