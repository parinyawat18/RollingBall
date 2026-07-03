package Lib;
import java.awt.*;
import javax.swing.*;

public class RollingBall extends JPanel {
    int x = 100;
    int angle = 0;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x, 90, 80, 80);
        g.fillArc(x, 90, 80, 80, angle, 180);
    }
}
