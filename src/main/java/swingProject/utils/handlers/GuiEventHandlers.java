package swingProject.utils.handlers;

import swingProject.events.guiEvents.GuiEvent;
import swingProject.gui.MainFrame;

public abstract class GuiEventHandlers {            //TODO Запретить наследование от класса
    private static MainFrame mainFrame;

    public static void setMainFrame(MainFrame mainFrame) {
        GuiEventHandlers.mainFrame = mainFrame;
    }

    public static void pasreEvent(GuiEvent event) {}
}
