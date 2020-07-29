package swingProject.entities.computerComponents;

public class Processor extends Component {
    private int frequencyCPU;
    private int countCore;
    private int TDP;
    private String socket;
    private String typeSupportRAM;

    public Processor(String manufacturer, String model, int yearRelease, int frequency, int countCore, int TDP, String socket, String typeSupportRAM) {
        super(manufacturer, model, yearRelease);
        this.frequencyCPU = frequency;
        this.countCore = countCore;
        this.TDP = TDP;
        this.socket = socket;
        this.typeSupportRAM = typeSupportRAM;
    }

    public int getFrequency() {
        return frequencyCPU;
    }

    public void setFrequency(int frequency) {
        this.frequencyCPU = frequency;
    }

    public int getCountCore() {
        return countCore;
    }

    public void setCountCore(int countCore) {
        this.countCore = countCore;
    }

    public int getTDP() {
        return TDP;
    }

    public void setTDP(int TDP) {
        this.TDP = TDP;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getTypeSupportRAM() {
        return typeSupportRAM;
    }

    public void setTypeSupportRAM(String typeSupportRAM) {
        this.typeSupportRAM = typeSupportRAM;
    }
}
