package code.sound;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MyJPanel extends JPanel {
    public void game(int width, int height) {
        Image img = createImage(width, height);
        Graphics g = img.getGraphics();
        Graphics wg = getGraphics();

        //追加
        Sound sound = new Sound("history_main_off.wav");
        sound.play();

        while (true) {
            title(g);

            wg.drawImage(img, 0, 0, null);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void title(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 800, 600);
    }
}
