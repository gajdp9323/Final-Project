

package vAlpha1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 *
 * @author gajdp9323
 */
public class Player1Ship {
    Image imgPlayer1 = Toolkit.getDefaultToolkit().createImage("JavaShipP1.png");
    int nAccel, nMaxSpeed, nRotateNegativeAccel, nRotateSpeed;
    Graphics g;
    public Player1Ship() {
        //KeyEvent event
        while (1 == 1) {
            g.drawImage(imgPlayer1, 0, 0, null);
            //if (key 'w' pressed)
        }
    }
}
