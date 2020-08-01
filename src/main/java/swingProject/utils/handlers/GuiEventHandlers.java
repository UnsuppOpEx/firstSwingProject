package swingProject.utils.handlers;

import swingProject.events.guiEvents.CloseApplicationEvent;
import swingProject.events.guiEvents.GuiEvent;
import swingProject.events.guiEvents.OpenAboutDialogEvent;
import swingProject.gui.MainFrame;

/**
 * Обработчик событий
 */
public abstract class GuiEventHandlers {
    private static MainFrame mainFrame;

    public static void setMainFrame(MainFrame mainFrame) {
        GuiEventHandlers.mainFrame = mainFrame;
    }

    /**
     * Обработка входящих событий
     * @param event
     */
    public static void parseEvent(GuiEvent event) {
        if(event != null) {
//            if(event instanceof SetStartPanelEvent) {
//                mainFrame.setStartPanelEvent();
//            }

            if(event instanceof OpenAboutDialogEvent) {
                mainFrame.openAboutDialogEvent();
            }

            else if(event instanceof CloseApplicationEvent) {
                mainFrame.closeApplicationEvent();
            }
        }
    }
}
