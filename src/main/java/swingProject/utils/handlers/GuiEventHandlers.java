package swingProject.utils.handlers;

import swingProject.events.guiEvents.*;
import swingProject.events.powerSupplyEvent.PowerSupplyEventRemove;
import swingProject.gui.MainFrame;

/**
 * Обработчик событий
 */
public abstract class GuiEventHandlers {
    private static MainFrame mainFrame;

    public static void setMainFrame(MainFrame mainFrame) {
        GuiEventHandlers.mainFrame = mainFrame;
    }

    public static MainFrame getMainFrame() {
        return mainFrame;
    }

    /**
     * Обработка входящих событий
     * @param event
     */
    public static void parseEvent(GuiEvent event) {
        if(event != null) {
            if(event instanceof SetStartPanelEvent) {
                mainFrame.setStartPanelEvent();
            }

            else if(event instanceof OpenAboutDialogEvent) {
                mainFrame.openAboutDialogEvent();
            }

            else if(event instanceof CloseApplicationEvent) {
                mainFrame.closeApplicationEvent();
            }

            else if(event instanceof SetComponentsChoiceEvent) {
                mainFrame.setComponentsChoiceEvent();
            }

            else if(event instanceof ComponentActionEvent) {
                mainFrame.componentActionEvent();
            }

            else if(event instanceof OpenPowerSupplyDialog) {
                mainFrame.openPowerSupplyDialog();
            }

            else if(event instanceof PowerSupplyEventRemove) {
                mainFrame.powerSupplyEventRemove();
            }

            else if(event instanceof GetSelectedComponent) {
                mainFrame.getSelectedComponent();
            }

//            else if(event instanceof powerSupplyEventAdd) {
//                mainFrame.powerSupplyEventAdd();
//            }

        }
    }
}
