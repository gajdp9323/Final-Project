package vAlpha2;
// here, I have the colours changing, and the labels changing from one event listener - each. No hard code.

import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.Rectangle;

public class FraMain extends JFrame {

    
    FraMain() {
        revalidate();
        repaint();
        PanMain panMain = new PanMain();
        setSize(600, 400);
        setTitle("Space Battle (By: Philip G. and Samuel M.)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(640, 360));
        add(panMain);
        setVisible(true);

    }
    public void componentResized(ComponentEvent arg0) {
        int nOldHeight=0, nOldWidth=0, nWIDTH_RATIO=16, nHEIGHT_RATIO=9;
        boolean isHeightChanged=false, isWidthChanged=false;
        int nSetHeight = arg0.getComponent().getHeight();
        int nSetWidth = arg0.getComponent().getWidth();
        double dNewWidth = 0;
        double dNewHeight = 0;
        if(nSetHeight != nOldHeight) {
            isHeightChanged = true;
        }
        if(nSetWidth != nOldWidth) {
            isWidthChanged = true;
        }
        if(isWidthChanged == true && isHeightChanged == false) {
            dNewWidth = nSetWidth;
            dNewHeight = nSetWidth*nHEIGHT_RATIO;
        }
        else if(isWidthChanged == false && isHeightChanged == true) {
            dNewWidth = nSetHeight * nWIDTH_RATIO;
            dNewHeight = nSetHeight;
        }
        else if(isWidthChanged == true && isHeightChanged == true) {
            dNewWidth = nSetWidth;
            dNewHeight = nSetWidth*nHEIGHT_RATIO;
        }
        int x1 = (int) dNewWidth;
        int y1 = (int) dNewHeight;
        System.out.println("W: " + x1 + " H: " + y1);
        Rectangle r = arg0.getComponent().getBounds();
        arg0.getComponent().setBounds(r.x, r.y, x1, y1);
        isWidthChanged = false;
        isHeightChanged = false;
        nOldWidth = x1;
        nOldHeight = y1;
    }
}