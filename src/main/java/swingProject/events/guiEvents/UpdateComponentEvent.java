package swingProject.events.guiEvents;

import swingProject.entities.computerComponents.PowerSupply;

public class UpdateComponentEvent extends GuiEvent {

    private PowerSupply powerSupply;
    private int index;

    public UpdateComponentEvent(PowerSupply powerSupply, int index) {
        this.powerSupply = powerSupply;
        this.index = index;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "UpdateComponentEvent{" +
                "powerSupply=" + powerSupply +
                ", index=" + index +
                '}';
    }
}
