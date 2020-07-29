package swingProject.entities.computerComponents;


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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
