package vAlpha1;
// here, I have the colours changing, and the labels changing from one event listener - each. No hard code.

import javax.swing.JFrame;

public class FraMain extends JFrame {

    FraMain() {
        PanMain panMain = new PanMain();
        setSize(400, 400);
        setTitle("Space Battle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panMain);
        setVisible(true);

    }
}