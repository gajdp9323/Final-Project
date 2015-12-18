package vAlpha1;

import javax.swing.*;

public class PanDisp extends JPanel // panel definition
{
    private JLabel lblName;
    private String sLabel;
    public PanDisp() {
        //lblName = new JLabel(" Barney");
        //add(lblName); //add it to the Frame
    }

    void UpdateLabel(String _sNew) {
        sLabel = _sNew;
        lblName.setText(sLabel);
    }    
}