//Philip
package vAlpha1;

import java.awt.Color;
import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class PanStats extends JPanel // panel definition
{
    //PanDisp panDisp;
    //String sName;
    private JLabel Player1Lives;
    private JLabel Player2Lives;
    private JLabel Player1Score;
    private JLabel Player2Score;
    
    private JLabel Timer;

    public PanStats(PanDisp _panDisp) {
        setBackground(Color.red);
        Player1Lives = new JLabel(" Player1 Lives: 4 ");
        Player1Score = new JLabel(" Player1 Score: 750 ");
        Timer  = new JLabel (" Time 1:15 ");
        Player2Score  = new JLabel(" Player2 Score: 1750 ");
        Player2Lives  = new JLabel(" Player2 Lives: 5 ");
        add(Player1Lives);
        add(Player1Score);
        add(Timer);
        add(Player2Score);
        add(Player2Lives);
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