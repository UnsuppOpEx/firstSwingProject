package swingProject.events.powerSupplyEvent;

import swingProject.entities.computerComponents.PowerSupply;
import swingProject.events.guiEvents.GuiEvent;

public class PowerSupplyEditEvent extends GuiEvent {

    private PowerSupply powerSupply;

    public PowerSupplyEditEvent(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    @Override
    public String toString() {
        return "PowerSupplyEventEdit{" +
                "powerSupply=" + powerSupply +
                '}';
    }
}
