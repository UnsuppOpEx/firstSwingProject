package swingProject.entities.computerComponents;

import java.util.Objects;

/**
 * Класс Жёсткий диск
 */
public class HardDisk extends Component {
    private String capacity;
    private int maxWatt;
    private int minSpeed;
    private int maxSpeed;
    private double formFactorHdd;

    public HardDisk(String manufacture, String model, int yearRelease, String capacity, int maxWatt, int minSpeed, int maxSpeed, double formFactorHdd) {
        super(manufacture, model, yearRelease);
        this.capacity = capacity;
        this.formFactorHdd = formFactorHdd;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.maxWatt = maxWatt;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public int getMaxWatt() {
        return maxWatt;
    }

    public void setMaxWatt(int maxWatt) {
        this.maxWatt = maxWatt;
    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
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
        return maxWatt == hardDisk.maxWatt &&
                minSpeed == hardDisk.minSpeed &&
                maxSpeed == hardDisk.maxSpeed &&
                Double.compare(hardDisk.formFactorHdd, formFactorHdd) == 0 &&
                Objects.equals(capacity, hardDisk.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, maxWatt, minSpeed, maxSpeed, formFactorHdd);
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "capacity='" + capacity + '\'' +
                ", maxWatt=" + maxWatt +
                ", minSpeed=" + minSpeed +
                ", maxSpeed=" + maxSpeed +
                ", formFactorHdd=" + formFactorHdd +
                '}';
    }
}
