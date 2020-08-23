package swingProject.events.guiEvents;

import swingProject.entities.computerComponents.PowerSupply;

public class UpdateComponentEvent extends GuiEvent {

    private PowerSupply powerSupply;

    public UpdateComponentEvent(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    @Override
    public String toString() {
        return "UpdateComponentEvent{" +
                "powerSupply=" + powerSupply +
                '}';
    }
}
