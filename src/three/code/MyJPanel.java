package three.code;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel{
	public void game(int width, int height){
		Image img  = createImage(width, height);
		Graphics g = img.getGraphics();
		Graphics wg = getGraphics();
		
		while(true){
		    wg.drawImage(img, 0, 0, null);
		}
	}
}
