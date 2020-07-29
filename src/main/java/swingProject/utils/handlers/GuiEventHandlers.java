package swingProject.utils.handlers;

import swingProject.events.guiEvents.CloseApplicationEvent;
import swingProject.events.guiEvents.GuiEvent;
import swingProject.events.guiEvents.OpenAboutDialogEvent;
import swingProject.events.guiEvents.SetStartPanelEvent;
import swingProject.gui.MainFrame;

public abstract class GuiEventHandlers {            //TODO Запретить наследование от класса
    private static MainFrame mainFrame;

    public static void setMainFrame(MainFrame mainFrame) {
        GuiEventHandlers.mainFrame = mainFrame;
    }
    //Обработчик событий
    public static void parseEvent(GuiEvent event) {
        if(event != null) {
            if(event instanceof SetStartPanelEvent) {
                mainFrame.SetStartPanelEvent();
            }

            else if(event instanceof OpenAboutDialogEvent) {
                mainFrame.OpenAboutDialogEvent();
            }

            else if(event instanceof CloseApplicationEvent) {
                mainFrame.CloseApplicationEvent();
            }
        }
    }
}
