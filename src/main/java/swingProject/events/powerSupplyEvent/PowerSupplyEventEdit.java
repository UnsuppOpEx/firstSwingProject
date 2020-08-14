package swingProject.events.powerSupplyEvent;

import swingProject.entities.computerComponents.PowerSupply;
import swingProject.events.guiEvents.GuiEvent;

public class PowerSupplyEventEdit extends GuiEvent {

    private PowerSupply powerSupply;

    public PowerSupplyEventEdit(PowerSupply powerSupply) {
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
