package swingProject.utils.handlers;

import swingProject.events.guiEvents.*;
import swingProject.events.powerSupplyEvent.PowerSupplyAddEvent;
import swingProject.events.powerSupplyEvent.PowerSupplyEditEvent;
import swingProject.events.powerSupplyEvent.PowerSupplyRemoveEvent;
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

            else if(event instanceof PowerSupplyAddEvent) {
                mainFrame.powerSupplyEventAdd();
            }

            else if(event instanceof PowerSupplyRemoveEvent) {
                mainFrame.powerSupplyEventRemove(
                        ((PowerSupplyRemoveEvent) event).getIndex()
                );
            }

            else if(event instanceof CreateNewComponentEvent) {
                mainFrame.createNewComponentEvent(
                        ((CreateNewComponentEvent) event).getPowerSupply());
            }

            else if(event instanceof PowerSupplyEditEvent) {
                mainFrame.powerSupplyEditEvent(
                        ((PowerSupplyEditEvent) event).getPowerSupply(),
                        ((PowerSupplyEditEvent) event).getActions(),
                        ((PowerSupplyEditEvent) event).getIndex());
            }

            else if(event instanceof UpdateComponentEvent) {
                mainFrame.updateComponentEvent(
                        ((UpdateComponentEvent) event).getPowerSupply(),
                        ((UpdateComponentEvent) event).getIndex());
            }

        }
    }
}
