package vAlpha2;

import vAlpha1.*;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanDisp extends JPanel // panel definition
{
    PanGame panGame = new PanGame();
    public PanDisp() {
        JButton btn1 = new JButton("Start");
        add(btn1);
        setLayout(new BorderLayout());
        add(panGame, BorderLayout.CENTER);
        //lblName = new JLabel(" Barney");
        //add(lblName); //add it to the Frame
    }

    class LabelChangeListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                JButton btn1 = (JButton) event.getSource();
            }
    }   
}