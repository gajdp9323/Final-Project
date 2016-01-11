/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalVersion;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.image.AffineTransformOp;
import java.awt.geom.AffineTransform;
import javax.swing.*;

/**
 *
 * @author gajdp9323
 * 
 * ImageIcon i = new ImageIcon("src\image");
            Image image = i.getImage();
            int x = 0;
            int y = 0;
            g.drawImage(image, x, y, 100,100,null);
 * 
 */
public class Player2Ship extends JPanel{
    Image imgPlayer2 = Toolkit.getDefaultToolkit().createImage("JavaShipP2.png");
    double dAccel, dMaxSpeed, dRotateNegativeAccel, dRotateSpeed = 0.1, dShipAngle=0, nP2X, nP2Y, dMovementSpeed = 1, dX=188, dY=188;
    Graphics g;
    public Player2Ship() {
        //KeyEvent event;
        //while (true) {
            System.out.println("hello");
            int KeyCode = KeyEvent.KEY_PRESSED;
            if (dShipAngle>=360) dShipAngle-=360;
            else if (dShipAngle<0) dShipAngle+=360;
            double dRotReq = Math.toRadians(dShipAngle);
            double nP2XImg = imgPlayer2.getWidth(null)/2;
            double nP2YImg = imgPlayer2.getHeight(null)/2;
            AffineTransform tx = new AffineTransform();
            tx.translate(dX+nP2XImg, dY+nP2YImg);
            tx.rotate(dRotReq);
            tx.translate(-dX+nP2XImg,-dY+nP2YImg);
            AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
            //g.drawImage(imgPlayer2, (int)dX, (int)dY, null);
            if(KeyCode == KeyEvent.VK_UP){
                if (dShipAngle>=0 && dShipAngle<90) {
                    //double dRot=90-dShipAngle;
                    //double dXMov=(45-dRot)/90;
                    //double dYMov=
                    double dDegrees1 = dShipAngle;
                    double dDegrees2 = 90-dShipAngle;
                    double dTotalDegrees = dDegrees1 + dDegrees2;
                    double dXMove = (dTotalDegrees/dDegrees1)*dMovementSpeed;
                    double dYMove = (dTotalDegrees/dDegrees2)*dMovementSpeed;
                    dX+=dXMove;
                    dY+=dYMove;
                }
                else if (dShipAngle>=90 && dShipAngle<180) {
                    
                }
                else if (dShipAngle>=180 && dShipAngle<270) {
                    
                }
                else if (dShipAngle>=270 && dShipAngle<360) {
                    
                }
            }
            if(KeyCode == KeyEvent.VK_DOWN){
           	if (dShipAngle>=0 && dShipAngle<90) {
                    
                }
                else if (dShipAngle>=90 && dShipAngle<180) {
                    
                }
                else if (dShipAngle>=180 && dShipAngle<270) {
                    
                }
                else if (dShipAngle>=270 && dShipAngle<360) {
                    
                }
            }
            if(KeyCode == KeyEvent.VK_LEFT){
           	dShipAngle -= dRotateSpeed;
            }
            if(KeyCode == KeyEvent.VK_RIGHT){
                dShipAngle += dRotateSpeed;
            }
            if(KeyCode == KeyEvent.VK_P){
                
            }
            System.out.println("P2 " + dShipAngle);
        }
    }
//}
