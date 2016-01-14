package FinalVersion;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author gajdp9323
 */

public class PanGame extends JPanel // panel definition
{
    Image img = Toolkit.getDefaultToolkit().createImage("background.jpg");
    Image imgPlayer1 = Toolkit.getDefaultToolkit().createImage("JavaShipP1.jpg");
    Image imgPlayer2 = Toolkit.getDefaultToolkit().createImage("JavaShipP2.jpg");
    public PanGame() {
        //add(lblName); //add it to the Frame
    }
    public void paint(Graphics g)
    {
        revalidate();
        repaint();
        // Draws the img to the BackgroundPanel.
        g.drawImage(img, 0, 0, null);
        g.drawImage(imgPlayer1, ship-(imgPlayer1.getWidth(rootPane)/2), nY1-(imgPlayer1.getHeight(rootPane)/2), null);
        g.drawImage(imgPlayer2, nX2-(imgPlayer2.getWidth(rootPane)/2), nY2-(imgPlayer2.getHeight(rootPane)/2), null);
        
    }

    /*void UpdateLabel(String _sNew) {
        sLabel = _sNew;
        lblName.setText(sLabel);
    }    */
}