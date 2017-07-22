package three.code;

import javax.swing.*;
import java.awt.*;

public class MyJPanelString extends JPanel{
    public void game(int width, int height) {
        Image img = createImage(width, height);
        Graphics g = img.getGraphics();
        Graphics wg = getGraphics();

        while (true) {
            g.setFont(new Font("Arial", Font.BOLD, 24));
            g.drawString("hello world", 100, 100);

            wg.drawImage(img, 0, 0, null);
        }
    }
}
