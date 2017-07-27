package five.code;

import javax.swing.*;
import java.awt.*;

public class MyJPanel2 extends JPanel {
    Player player = new Player(0,0); //追加

    public void game(int width, int height){
        Image img = createImage(width, height);
        Graphics g = img.getGraphics();
        Graphics wg = getGraphics();

        while(true){
            g.setColor(Color.WHITE);
            g.fillRect(0,0,width, height);

            //追加！
            player.move();
            player.draw(g);

            wg.drawImage(img, 0, 0, this);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
