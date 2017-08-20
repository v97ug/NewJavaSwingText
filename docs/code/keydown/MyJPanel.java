package code.keydown;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel {
    int select = 0;
    Scene scene = Scene.TITLE; //変更
    Player player = new Player(0, 0);

    public void game(int width, int height) {
        Image img = createImage(width, height);
        Graphics g = img.getGraphics();
        Graphics wg = getGraphics();

        setBackground(Color.white);

        while (true) {
            if (scene == Scene.TITLE) {
                title(g);
            } else if (scene == Scene.PLAY) {
                play(g);
            } else if (scene == Scene.EXIT) {
                System.exit(0);
            }

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

        g.setColor(Color.lightGray);
        g.setFont(new Font("Arial", Font.BOLD, 12));

        //変更
        g.drawString("→", 280, 425 + 50 * select);
        g.drawString("START", 325, 425);
        g.drawString("HOW TO PLAY", 325, 475);
        g.drawString("EXIT", 325, 525);

        //変更
        if (KeyDown.isUp() && select > 0) {
            select--;
        }
        else if (KeyDown.isDown() && select < 2) {
            select++;
            System.out.println("main : " + Key.down);
        }

        if (Key.enter && select == 0) {
            scene = Scene.PLAY;
        }
        else if (Key.enter && select == 1) {
            scene = Scene.HOW_TO_PLAY;
        }
        else if(Key.enter && select == 2){
            scene = Scene.EXIT;
        }
    }

    public void play(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 800, 600);

        player.move();
        player.draw(g);
    }
}
