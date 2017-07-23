package three.code;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by takeyuki on 17/07/23.
 */
public class MyJPanelImage extends JPanel{
    public void game(int width, int height) {
        Image img = createImage(width, height);
        Graphics g = img.getGraphics();
        Graphics wg = getGraphics();

        //追加！
        Image image = null;
        try {
            image = ImageIO.read(new File("img/aizu.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            g.drawImage(image, 0, 0, this); //追加！

            wg.drawImage(img, 0, 0, null);
        }
    }
}
