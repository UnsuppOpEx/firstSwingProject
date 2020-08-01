package swingProject.entities.computerComponents;


import java.util.Objects;

public class Motherboard extends Component {
    private String formFactorMB;
    private Socket socket;
    private String chipset;
    private String typeSupportRAM;

    public Motherboard(String manufacturer, String model, int yearRelease, String formFactorMB, Socket socket, String chipset, String typeSupportRAM) {
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

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motherboard that = (Motherboard) o;
        return Objects.equals(formFactorMB, that.formFactorMB) &&
                socket == that.socket &&
                Objects.equals(chipset, that.chipset) &&
                Objects.equals(typeSupportRAM, that.typeSupportRAM);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), formFactorMB, socket, chipset, typeSupportRAM);
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "formFactorMB='" + formFactorMB + '\'' +
                ", socket=" + socket +
                ", chipset='" + chipset + '\'' +
                ", typeSupportRAM='" + typeSupportRAM + '\'' +
                '}';
    }
}
