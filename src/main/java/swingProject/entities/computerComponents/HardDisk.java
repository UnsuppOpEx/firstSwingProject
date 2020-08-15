package swingProject.entities.computerComponents;

import java.util.Objects;

/**
 * Класс Жёсткий диск
 */
public class HardDisk extends Component {
    private int capacity;
    private int cash;
    private int spinInMin;
    private int maxSpeedRead;
    private double formFactorHdd;

    public HardDisk(String manufacture, String model, int yearRelease, int capacity, int cash, int spinInMin, int maxSpeedRead, double formFactorHdd) {
        super(manufacture, model, yearRelease);
        this.capacity = capacity;
        this.formFactorHdd = formFactorHdd;
        this.maxSpeedRead = maxSpeedRead;
        this.spinInMin = spinInMin;
        this.cash = cash;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getSpinInMin() {
        return spinInMin;
    }

    public void setSpinInMin(int spinInMin) {
        this.spinInMin = spinInMin;
    }

    public int getMaxSpeedRead() {
        return maxSpeedRead;
    }

    public void setMaxSpeedRead(int maxSpeedRead) {
        this.maxSpeedRead = maxSpeedRead;
    }

    public double getFormFactorHdd() {
        return formFactorHdd;
    }

    public void setFormFactorHdd(double formFactorHdd) {
        this.formFactorHdd = formFactorHdd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HardDisk hardDisk = (HardDisk) o;
        return cash == hardDisk.cash &&
                spinInMin == hardDisk.spinInMin &&
                maxSpeedRead == hardDisk.maxSpeedRead &&
                Double.compare(hardDisk.formFactorHdd, formFactorHdd) == 0 &&
                Objects.equals(capacity, hardDisk.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, cash, spinInMin, maxSpeedRead, formFactorHdd);
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "capacity='" + capacity + '\'' +
                ", maxWatt=" + cash +
                ", minSpeed=" + spinInMin +
                ", maxSpeed=" + maxSpeedRead +
                ", formFactorHdd=" + formFactorHdd +
                '}';
    }
}
