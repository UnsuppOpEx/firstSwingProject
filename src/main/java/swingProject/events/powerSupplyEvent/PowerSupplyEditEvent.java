package swingProject.events.powerSupplyEvent;

import swingProject.commons.Actions;
import swingProject.entities.computerComponents.PowerSupply;
import swingProject.events.guiEvents.GuiEvent;

public class PowerSupplyEditEvent extends GuiEvent {

    private PowerSupply powerSupply;
    private Actions actions;

    public PowerSupplyEditEvent(PowerSupply powerSupply, Actions actions) {
        this.powerSupply = powerSupply;
        this.actions = actions;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public Actions getActions() {
        return actions;
    }

    @Override
    public String toString() {
        return "PowerSupplyEditEvent{" +
                "powerSupply=" + powerSupply +
                ", actions=" + actions +
                '}';
    }
}
