package swingProject.commons;

import javax.swing.*;
import java.awt.*;

public class GuiHelper {

    public static void setComponentSize(JComponent component, Dimension dimension) {
        component.setSize(dimension);
        component.setPreferredSize(dimension);
        component.setMaximumSize(dimension);
        component.setMaximumSize(dimension);
    }
}
