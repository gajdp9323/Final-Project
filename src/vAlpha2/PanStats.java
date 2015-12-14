//Philip
package vAlpha2;

import vAlpha1.*;
import java.awt.Color;
import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class PanStats extends JPanel // panel definition
{
    //PanDisp panDisp;
    //String sName;
    private JLabel Player1;
    private JLabel Player2;

    public PanStats(PanDisp _panDisp) {
        setBackground(Color.red);
        Player1 = new JLabel("Player1: ");
        Player2  = new JLabel("Player2: ");
        add(Player1);
        add(Player2);
        /*panDisp = _panDisp;
        JButton btn1 = new JButton("Fred");
        JButton btn2 = new JButton("Ethyl");
        add(btn1);
        add(btn2);

        /*class LabelChangeListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                JButton btn = (JButton) event.getSource();
                sName = btn.getText(); // gets the text value of the button
                panDisp.UpdateLabel(sName);
            }
        }
        ActionListener labelChangeListener = new LabelChangeListener();
        btn1.addActionListener(labelChangeListener);
        btn2.addActionListener(labelChangeListener);*/
    }
}