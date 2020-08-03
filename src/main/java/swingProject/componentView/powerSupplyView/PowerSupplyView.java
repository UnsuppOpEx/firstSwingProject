package swingProject.componentView.powerSupplyView;

import swingProject.componentView.powerSupplyView.tableModel.PowerSupplyTableModel;

import javax.swing.*;

public class PowerSupplyView extends JTable {
    public PowerSupplyView powerSupplyView;
    public JScrollPane jScrollPane;

    public PowerSupplyView() {
        powerSupplyView = new PowerSupplyView();

        jScrollPane = new JScrollPane(powerSupplyView);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);





    }
}
