package code.six;

import javax.swing.*;
import java.awt.*;

public class MyJPanel3 extends JPanel {
    int select = 0;
    int scene = 0; //追加
    Player player = new Player(0,0); //追加

    public void game(int width, int height) {
        Image img = createImage(width, height);
        Graphics g = img.getGraphics();
        Graphics wg = getGraphics();

        setBackground(Color.white);

        while (true) {
            //追加
            if(scene == 0) {
                title(g);
            }
            else if(scene == 1){
                play(g);
            }
            else if(scene == -1){
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

        if(select == 0) {
            g.drawString("→", 280, 425);
            g.drawString("START", 325, 425);
            g.drawString("EXIT", 325, 500);
        }
        else if(select == 1){
            g.drawString("→", 280, 500);
            g.drawString("START", 325, 425);
            g.drawString("EXIT", 325, 500);
        }

        if(Key.up){
            select = 0;
        }
        else if(Key.down){
            select = 1;
        }

        //追加
        if(Key.enter && select == 0){
            scene = 1;
        }
        else if(Key.enter && select == 1){
            scene = -1;
        }
    }

    //追加
    public void play(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 800, 600);

        player.move();
        player.draw(g);
    }
}
