package swingProject.entities.computerComponents;

import java.util.Objects;

public class Processor extends Component {
    private int frequencyCPU;
    private int countCore;
    private int TDP;
    private Socket socket;
    private String typeSupportRAM;

    public Processor(String manufacturer, String model, int yearRelease, int frequency, int countCore, int TDP, Socket socket, String typeSupportRAM) {
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

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
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
        Processor processor = (Processor) o;
        return frequencyCPU == processor.frequencyCPU &&
                countCore == processor.countCore &&
                TDP == processor.TDP &&
                socket == processor.socket &&
                Objects.equals(typeSupportRAM, processor.typeSupportRAM);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), frequencyCPU, countCore, TDP, socket, typeSupportRAM);
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequencyCPU=" + frequencyCPU +
                ", countCore=" + countCore +
                ", TDP=" + TDP +
                ", socket=" + socket +
                ", typeSupportRAM='" + typeSupportRAM + '\'' +
                '}';
    }
}
