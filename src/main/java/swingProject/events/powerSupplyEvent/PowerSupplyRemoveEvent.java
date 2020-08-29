package swingProject.events.powerSupplyEvent;

import swingProject.events.guiEvents.GuiEvent;

/**
 * Удалить выбранный Блок питания
 */
public final class PowerSupplyRemoveEvent extends GuiEvent {

    private int index;

    public PowerSupplyRemoveEvent(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "PowerSupplyRemoveEvent{" +
                "index=" + index +
                '}';
    }
}
