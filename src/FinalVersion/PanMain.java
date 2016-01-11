package FinalVersion;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel // panel definition
{
    PanDisp panDisp = new PanDisp();
    PanStats panStats = new PanStats(panDisp);

    public PanMain() {
        // this next line tells PanMain that it has a border layout.
        setLayout(new BorderLayout());
        add(panStats, BorderLayout.NORTH);
        add(panDisp, BorderLayout.CENTER);       
    }
}