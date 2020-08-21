package swingProject.componentView.powerSupplyView.tableModel;

import swingProject.entities.computerComponents.PowerSupply;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

/**
 * Модель таблицы для Блоков питания
 */
public class PowerSupplyTableModel implements TableModel {

    private ArrayList<PowerSupply> list;


    public PowerSupplyTableModel() {
        list = new ArrayList<>();
    }

    public void addData(PowerSupply component) {
        list.add(component);
    }

    public void removeData(int i) {
        list.remove(i);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int columnIndex) {

        switch (columnIndex) {
            case 0: return "Бренд";
            case 1: return "Модель";
            case 2: return "Год релиза";
            case 3: return "Мощность";
            case 4: return "КПД 80+";
            case 5: return "PFC";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        PowerSupply component = list.get(rowIndex);

        switch (columnIndex) {
            case 0: return component.getManufacturer();
            case 1: return component.getModel();
            case 2: return component.getYearRelease();
            case 3: return component.getNominalWatt();
            case 4: return component.isCertify80Plus();
            case 5: return component.isPFC();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public PowerSupply getList(int index) {
        PowerSupply powerSupply = list.get(index);
        return powerSupply;
    }

}
