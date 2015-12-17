package vAlpha1;
// here, I have the colours changing, and the labels changing from one event listener - each. No hard code.

import javax.swing.JFrame;
import java.awt.Dimension;

public class FraMain extends JFrame {

    FraMain() {
        PanMain panMain = new PanMain();
        setSize(400, 400);
        setTitle("Space Battle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(600, 400));
        setMaximumSize(new Dimension(800, 800));
        add(panMain);
        setVisible(true);

    }
}