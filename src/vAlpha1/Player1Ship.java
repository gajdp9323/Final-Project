

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
    double dAccel, dMaxSpeed, dRotateNegativeAccel, dRotateSpeed = 0.1, dShipAngle;
    Graphics g;
    public Player1Ship(KeyEvent e) {
        //KeyEvent event
        int KeyCode =e.getKeyCode();
        while (true) {
            if (dShipAngle>=360) dShipAngle-=360;
            else if (dShipAngle<0) dShipAngle+=360;
            g.drawImage(imgPlayer1, 0, 0, null);
            if(KeyCode == KeyEvent.VK_W){
                if (dShipAngle>=0 && dShipAngle<90) {
                    
                }
                else if (dShipAngle>270) {
                    
                }
            }
            if(KeyCode == KeyEvent.VK_S){
           	if (dShipAngle!=270) {
                    
                }
            }
            if(KeyCode == KeyEvent.VK_A){
           	dShipAngle += dRotateSpeed;
            }
            if(KeyCode == KeyEvent.VK_D){
                dShipAngle -= dRotateSpeed;
            }
            //if (key 'w' pressed)
        }
    }
}
