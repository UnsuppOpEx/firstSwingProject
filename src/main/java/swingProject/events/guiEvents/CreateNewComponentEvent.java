package swingProject.events.guiEvents;

import swingProject.entities.computerComponents.PowerSupply;

public class CreateNewComponentEvent extends GuiEvent {
   private PowerSupply powerSupply;

    public CreateNewComponentEvent(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }
}
