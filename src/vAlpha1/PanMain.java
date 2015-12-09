package vAlpha1;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel // panel definition
{
    PanDisp panDisp = new PanDisp();
    PanLabelChange panLabelChange = new PanLabelChange(panDisp);

    public PanMain() {
        // this next line tells PanMain that it has a border layout.
        setLayout(new BorderLayout());
        add(panLabelChange, BorderLayout.SOUTH);
        add(panDisp, BorderLayout.CENTER);       
    }
}