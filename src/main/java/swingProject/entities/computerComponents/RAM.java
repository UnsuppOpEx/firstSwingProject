package swingProject.entities.computerComponents;

import java.util.Objects;

/**
 * Класс Оперативная память
 */

public class RAM extends Component {
    private int frequencyRAM;
    private int volume;
    private String formFactorRAM;
    private boolean radiator;
    private double voltage;

    public RAM(String manufacturer, String model, int yearRelease, int frequencyRAM, int volume, String formFactorRAM, boolean radiator, double voltage) {
        super(manufacturer, model, yearRelease);
        this.frequencyRAM = frequencyRAM;
        this.volume = volume;
        this.formFactorRAM = formFactorRAM;
        this.radiator = radiator;
        this.voltage = voltage;
    }

    public int getFrequencyRAM() {
        return frequencyRAM;
    }

    public void setFrequencyRAM(int frequencyRAM) {
        this.frequencyRAM = frequencyRAM;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getFormFactorRAM() {
        return formFactorRAM;
    }

    public void setFormFactorRAM(String formFactorRAM) {
        this.formFactorRAM = formFactorRAM;
    }

    public boolean isRadiator() {
        return radiator;
    }

    public void setRadiator(boolean radiator) {
        this.radiator = radiator;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RAM ram = (RAM) o;
        return frequencyRAM == ram.frequencyRAM &&
                volume == ram.volume &&
                radiator == ram.radiator &&
                Double.compare(ram.voltage, voltage) == 0 &&
                Objects.equals(formFactorRAM, ram.formFactorRAM);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), frequencyRAM, volume, formFactorRAM, radiator, voltage);
    }

    @Override
    public String toString() {
        return "RAM{" +
                "frequencyRAM=" + frequencyRAM +
                ", volume=" + volume +
                ", formFactorRAM='" + formFactorRAM + '\'' +
                ", radiator=" + radiator +
                ", voltage=" + voltage +
                '}';
    }
}
