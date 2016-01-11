//Philip
package FinalVersion;

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
    int nPlayer1Lives = 5, nPlayer2Lives = 5, nPlayer1Score = 0,nPlayer2Score = 0;
    //int nTimeMin = 1, nTimeSec = 15;
    
    //private JLabel Timer;

    public PanStats(PanDisp _panDisp) {
        setBackground(Color.red);
        Player1Lives = new JLabel(" Player1 Lives: "+ nPlayer1Lives);
        Player1Score = new JLabel(" Player1 Score: "+ nPlayer1Score);
        //Timer  = new JLabel (" Time "+ nTimeMin + ":" + nTimeSec);
        Player2Score  = new JLabel(" Player2 Score: "+ nPlayer2Score);
        Player2Lives  = new JLabel(" Player2 Lives: "+ nPlayer2Lives);
        add(Player1Lives);
        add(Player1Score);
        //add(Timer);
        add(Player2Score);
        add(Player2Lives);
    }
}