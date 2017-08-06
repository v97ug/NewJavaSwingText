package three.code;

import javax.swing.*;
import java.awt.*;

public class MyJPanel2 extends JPanel{
    public void game(int width, int height){
        Image img  = createImage(width, height);
        Graphics g = img.getGraphics();
        Graphics wg = getGraphics();

        while(true){
            g.setColor(Color.BLUE);
            g.fillOval(0, 0, 100, 100);

            g.setColor(Color.BLACK);
            g.drawRect(0, 0, 300, 100);

            g.setColor(Color.GREEN);
            g.drawLine(150, 100, 150, 300);

            g.setColor(Color.YELLOW);
            g.fillArc(200, 200, 100, 100, 30, 300);

            wg.drawImage(img, 0, 0, null);
        }
    }
}
