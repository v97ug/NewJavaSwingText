package five.code;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel{
    public void game(int width, int height) {
        Image img = createImage(width, height);
        Graphics g = img.getGraphics();
        Graphics wg = getGraphics();

        //追加！
        int x = 200;
        int y = 200;

        while (true) {
            g.setColor(Color.WHITE);
            g.fillRect(0,0,width, height);

            if(Key.up){
                y -= 5;
            }
            if(Key.down){
                y += 5;
            }
            if(Key.right){
                x += 5;
            }
            if(Key.left){
                x -= 5;
            }

            //追加！
            g.setColor(Color.GREEN);
            g.fillRect(x,y,50,50);

            wg.drawImage(img, 0, 0, null);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
