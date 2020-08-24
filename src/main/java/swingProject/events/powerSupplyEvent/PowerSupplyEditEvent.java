package swingProject.events.powerSupplyEvent;

import swingProject.commons.Actions;
import swingProject.entities.computerComponents.PowerSupply;
import swingProject.events.guiEvents.GuiEvent;

public class PowerSupplyEditEvent extends GuiEvent {

    private PowerSupply powerSupply;
    private Actions actions;
    private int index;

    public PowerSupplyEditEvent(PowerSupply powerSupply, Actions actions, int index) {
        this.powerSupply = powerSupply;
        this.actions = actions;
        this.index = index;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public Actions getActions() {
        return actions;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "PowerSupplyEditEvent{" +
                "powerSupply=" + powerSupply +
                ", actions=" + actions +
                ", index=" + index +
                '}';
    }
}
