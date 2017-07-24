package four.code;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel{
    public void game(int width, int height) {
        Image img = createImage(width, height);
        Graphics g = img.getGraphics();
        Graphics wg = getGraphics();

        while (true) {
            g.setColor(Color.WHITE);
            g.fillRect(0,0,width, height);

            if(Key.up){
                g.setColor(Color.BLACK);
                g.drawString("UP!",100,100);
            }
            if(Key.down){
                g.setColor(Color.BLACK);
                g.drawString("DOWN!",100,100);
            }
            if(Key.right){
                g.setColor(Color.BLACK);
                g.drawString("RIGHT",100,100);
            }
            if(Key.left){
                g.setColor(Color.BLACK);
                g.drawString("LEFT",100,100);
            }

            wg.drawImage(img, 0, 0, null);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
