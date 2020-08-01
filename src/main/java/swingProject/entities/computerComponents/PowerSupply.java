package swingProject.entities.computerComponents;

import java.util.Objects;

/**
 * Класс Блок питания
 */

public class PowerSupply extends Component {
    private int nominalWatt;
    private boolean certify80Plus;
    private boolean PFC;

    public PowerSupply(String manufacturer, String model, int yearRelease, int nominalWatt, boolean certify80Plus, boolean PFC) {
        super(manufacturer, model, yearRelease);
        this.nominalWatt = nominalWatt;
        this.certify80Plus = certify80Plus;
        this.PFC = PFC;
    }

    public int getNominalWatt() {
        return nominalWatt;
    }

    public void setNominalWatt(int nominalWatt) {
        this.nominalWatt = nominalWatt;
    }

    public boolean isCertify80Plus() {
        return certify80Plus;
    }

    public void setCertify80Plus(boolean certify80Plus) {
        this.certify80Plus = certify80Plus;
    }

    public boolean isPFC() {
        return PFC;
    }

    public void setPFC(boolean PFC) {
        this.PFC = PFC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PowerSupply that = (PowerSupply) o;
        return nominalWatt == that.nominalWatt &&
                certify80Plus == that.certify80Plus &&
                PFC == that.PFC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nominalWatt, certify80Plus, PFC);
    }

    @Override
    public String toString() {
        return "PowerSupply{" +
                "nominalWatt=" + nominalWatt +
                ", certify80Plus=" + certify80Plus +
                ", PFC=" + PFC +
                '}';
    }
}
