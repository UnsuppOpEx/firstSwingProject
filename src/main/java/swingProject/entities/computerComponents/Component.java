package swingProject.entities.computerComponents;

import java.util.Objects;

/**
 * Расширяемый класс компонентов
 */

public abstract class Component {
    private String manufacturer;
    private String model;
    private int yearRelease;

    public Component(String manufacturer, String model, int yearRelease) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearRelease = yearRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return yearRelease == component.yearRelease &&
                Objects.equals(manufacturer, component.manufacturer) &&
                Objects.equals(model, component.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, yearRelease);
    }

    @Override
    public String toString() {
        return "Component{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearRelease=" + yearRelease +
                '}';
    }
}
