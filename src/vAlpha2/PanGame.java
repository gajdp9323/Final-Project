package vAlpha2;

import vAlpha1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author gajdp9323
 */

public class PanGame extends JPanel // panel definition
{
    Image img = Toolkit.getDefaultToolkit().createImage("background.jpg");
    public PanGame() {
        //add(lblName); //add it to the Frame
    }
    public void paint(Graphics g)
    {
        // Draws the img to the BackgroundPanel.
        g.drawImage(img, 0, 0, null);
        JButton btn1 = new JButton("Start");
        add(btn1);
    }
    
    class LabelChangeListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                JButton btn1 = (JButton) event.getSource();
            }
    }

    /*void UpdateLabel(String _sNew) {
        sLabel = _sNew;
        lblName.setText(sLabel);
    }    */
}