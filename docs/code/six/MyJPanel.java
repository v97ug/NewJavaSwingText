package code.six;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel {
    public void game(int width, int height) {
        Image img = createImage(width, height);
        Graphics g = img.getGraphics();
        Graphics wg = getGraphics();

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

        g.setColor(Color.lightGray);
        g.setFont(new Font("Arial", Font.BOLD, 12));

        g.drawString("→", 280, 425);
        g.drawString("START", 325, 425);
        g.drawString("EXIT", 325, 500);

    }
}
