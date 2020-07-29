package swingProject.entities.computerComponents;

import java.util.PrimitiveIterator;

public class Motherboard extends Component {
    private String formFactorMB;
    private String socket;
    private String chipset;
    private String typeSupportRAM;

    public Motherboard(String manufacturer, String model, int yearRelease, String formFactorMB, String socket, String chipset, String typeSupportRAM) {
        super(manufacturer, model, yearRelease);
        this.formFactorMB = formFactorMB;
        this.socket = socket;
        this.chipset = chipset;
        this.typeSupportRAM = typeSupportRAM;
    }

    public String getFormFactorMB() {
        return formFactorMB;
    }

    public void setFormFactorMB(String formFactorMB) {
        this.formFactorMB = formFactorMB;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getTypeSupportRAM() {
        return typeSupportRAM;
    }

    public void setTypeSupportRAM(String typeSupportRAM) {
        this.typeSupportRAM = typeSupportRAM;
    }
}
