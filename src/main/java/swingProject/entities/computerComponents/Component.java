package swingProject.entities.computerComponents;

public abstract class Component {
    private String manufacturer;
    private String model;
    private int yearRelease;

    public Component(String manufacturer, String model, int yearRelease) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearRelease = yearRelease;
    }
}
