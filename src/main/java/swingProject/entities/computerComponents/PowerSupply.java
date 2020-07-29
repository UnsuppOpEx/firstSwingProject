package swingProject.entities.computerComponents;

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
}
