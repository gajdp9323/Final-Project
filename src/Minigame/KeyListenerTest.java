package Minigame;

//Philip G
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics;
import java.awt.Color;
//import java.awt.Image;
//import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class KeyListenerTester extends JFrame implements KeyListener {
    JLabel label;
    static int nX1 = 300, nY1 = 300, nX2 = 100, nY2 = 100, nScore = 0, nX1Temp = nX1, nX2Temp = nX2, nY1Temp = nY1, nY2Temp = nY2;
    public KeyListenerTester(String s) {
        JPanel p = new JPanel();
        label = new JLabel("Key Listener!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.add(label);
        add(p);
        addKeyListener(this);
        setSize(400, 400);
        setMinimumSize(new Dimension(400, 400));
        setVisible(true);

    }
///the keyTyped code is nessessary for KeyListenerTester to work but nothing is needed inside it
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            //System.out.println("Right key pressed");   //debug code
            nX1 +=1; //to move right
            //System.out.println("Object 1 at (" + nX1 + ", " + nY1 + ")");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            //System.out.println("Left key pressed");
            nX1 -=1; //to move left
            //System.out.println("Object 1 at (" + nX1 + ", " + nY1 + ")");
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            //System.out.println("Up key pressed");
            nY1 -=1; //to move up
            //System.out.println("Object 1 at (" + nX1 + ", " + nY1 + ")");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            //System.out.println("Down key pressed");
            nY1 +=1; //to move down
            //System.out.println("Object 1 at (" + nX1 + ", " + nY1 + ")");
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            //System.out.println("W key pressed");
            nY2 -=1; //to move up
            //System.out.println("Object 2 at (" + nX2 + ", " + nY2 + ")");
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            //System.out.println("A key pressed");
            nX2 -=1; //to move right
            //System.out.println("Object 2 at (" + nX2 + ", " + nY2 + ")");
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            //System.out.println("S key pressed");
            nY2 +=1; //to move down
            //System.out.println("Object 2 at (" + nX2 + ", " + nY2 + ")");
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            //System.out.println("D key pressed");
            nX2 +=1; //to move left
            //System.out.println("Object 2 at (" + nX2 + ", " + nY2 + ")");
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key Released");
            System.out.println("Object 1 at (" + nX1 + ", " + nY1 + ")");
            System.out.println("Object 2 at (" + nX2 + ", " + nY2 + ")");
            System.out.println("Score: " + nScore);
            if (nX1Temp<(nX1-5) || nX1Temp>(nX1+5) || nX2Temp<(nX2-5) || nX2Temp>(nX2+5)) {
                nScore+=100;
                nX1Temp = nX1; nX2Temp = nX2; nY1Temp = nY1; nY2Temp = nY2; //to shorten code since this in repeated alot
            }
            else nX1Temp = nX1; nX2Temp = nX2; nY1Temp = nY1; nY2Temp = nY2;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key Released");
            System.out.println("Object 1 at (" + nX1 + ", " + nY1 + ")");
            System.out.println("Object 2 at (" + nX2 + ", " + nY2 + ")");
            System.out.println("Score: " + nScore);
            if (nX1Temp<(nX1-5) || nX1Temp>(nX1+5) || nX2Temp<(nX2-5) || nX2Temp>(nX2+5)) {
                nScore+=100;
                nX1Temp = nX1; nX2Temp = nX2; nY1Temp = nY1; nY2Temp = nY2;
            }
            else nX1Temp = nX1; nX2Temp = nX2; nY1Temp = nY1; nY2Temp = nY2;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("Up key Released");
            System.out.println("Object 1 at (" + nX1 + ", " + nY1 + ")");
            System.out.println("Object 2 at (" + nX2 + ", " + nY2 + ")");
            System.out.println("Score: " + nScore);
            if (nX1Temp<(nX1-5) || nX1Temp>(nX1+5) || nX2Temp<(nX2-5) || nX2Temp>(nX2+5)) {
                nScore+=100;
                nX1Temp = nX1; nX2Temp = nX2; nY1Temp = nY1; nY2Temp = nY2;
            }
            else nX1Temp = nX1; nX2Temp = nX2; nY1Temp = nY1; nY2Temp = nY2;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("Down key Released");
            System.out.println("Object 1 at (" + nX1 + ", " + nY1 + ")");
            System.out.println("Object 2 at (" + nX2 + ", " + nY2 + ")");
            System.out.println("Score: " + nScore);
            if (nX1Temp<(nX1-5) || nX1Temp>(nX1+5) || nX2Temp<(nX2-5) || nX2Temp>(nX2+5)) {
                nScore+=100;
                nX1Temp = nX1; nX2Temp = nX2; nY1Temp = nY1; nY2Temp = nY2;
            }
            else nX1Temp = nX1; nX2Temp = nX2; nY1Temp = nY1; nY2Temp = nY2;
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            System.out.println("W key Released");
            System.out.println("Object 1 at (" + nX1 + ", " + nY1 + ")");
            System.out.println("Object 2 at (" + nX2 + ", " + nY2 + ")");
            System.out.println("Score: " + nScore);
            if (nY1Temp<(nY1-5) || nY1Temp>(nY1+5) || nY2Temp<(nY2-5) || nY2Temp>(nY2+5)) {
                nScore+=100;
                nX1Temp = nX1; nX2Temp = nX2; nY1Temp = nY1; nY2Temp = nY2;
            }
            else nX1Temp = nX1; nX2Temp = nX2; nY1Temp = nY1; nY2Temp = nY2;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            System.out.println("A key Released");
            System.out.println("Object 1 at (" + nX1 + ", " + nY1 + ")");
            System.out.println("Object 2 at (" + nX2 + ", " + nY2 + ")");
            System.out.println("Score: " + nScore);
            if (nY1Temp<(nY1-5) || nY1Temp>(nY1+5) || nY2Temp<(nY2-5) || nY2Temp>(nY2+5)) {
                nScore+=100;
                nX1Temp = nX1; nX2Temp = nX2; nY1Temp = nY1; nY2Temp = nY2;
            }
            else nX1Temp = nX1; nX2Temp = nX2; nY1Temp = nY1; nY2Temp = nY2;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            System.out.println("S key Released");
            System.out.println("Object 1 at (" + nX1 + ", " + nY1 + ")");
            System.out.println("Object 2 at (" + nX2 + ", " + nY2 + ")");
            System.out.println("Score: " + nScore);
            if (nY1Temp<(nY1-5) || nY1Temp>(nY1+5) || nY2Temp<(nY2-5) || nY2Temp>(nY2+5)) {
                nScore+=100;
                nX1Temp = nX1; nX2Temp = nX2; nY1Temp = nY1; nY2Temp = nY2;
            }
            else nX1Temp = nX1; nX2Temp = nX2; nY1Temp = nY1; nY2Temp = nY2;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            System.out.println("D key Released");
            System.out.println("Object 1 at (" + nX1 + ", " + nY1 + ")");
            System.out.println("Object 2 at (" + nX2 + ", " + nY2 + ")");
            System.out.println("Score: " + nScore);
            if (nY1Temp<(nY1-5) || nY1Temp>(nY1+5) || nY2Temp<(nY2-5) || nY2Temp>(nY2+5)) {
                nScore+=100;
                nX1Temp = nX1; nX2Temp = nX2; nY1Temp = nY1; nY2Temp = nY2;
            }
            else nX1Temp = nX1; nX2Temp = nX2; nY1Temp = nY1; nY2Temp = nY2; 
        }
    }
    public void paint(Graphics g) {
        //Image imgPlayer1 = Toolkit.getDefaultToolkit().createImage("JavaShipP1.png"); //Tried to import images but drawing them failed
        //Image imgPlayer2 = Toolkit.getDefaultToolkit().createImage("JavaShipP2.png"); //comented out to hopefully use in the future
        revalidate();
        repaint();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(Color.RED);
        g.fillRect (nX1, nY1, 5, 5);
        g.setColor(Color.BLUE);
        g.fillRect (nX2, nY2, 5, 5);
        //g.drawImage(imgPlayer2, nX2, nY2, null); //image was not displayed
        //g.drawImage(imgPlayer1, nX1, nY1, null); //image was not displayed
  }
    public static void main(String[] args) {
        new KeyListenerTester("Key Listener Tester");
    }
}