

package vAlpha1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
/**
 *
 * @author gajdp9323
 */
public class Player1Ship {
    Image imgPlayer1 = Toolkit.getDefaultToolkit().createImage("JavaShipP1.png");
    int nAccel, nMaxSpeed, nRotateNegativeAccel, nRotateSpeed;
    Graphics g;
    public Player1Ship(KeyEvent e) {
        //KeyEvent event
        int KeyCode =e.getKeyCode();
        while (1 == 1) {
            g.drawImage(imgPlayer1, 0, 0, null);
            if(KeyCode == KeyEvent.VK_W){
                
            }
            if(KeyCode == KeyEvent.VK_S){
           	 
            }
            if(KeyCode == KeyEvent.VK_A){
           	 
            }
            if(KeyCode == KeyEvent.VK_D){
           	 
            }
            //if (key 'w' pressed)
        }
    }
}
