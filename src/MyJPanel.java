import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class MyJPanel extends JPanel{
	public void game(int width, int height){
		Image img  = createImage(width, height);
		Graphics g = img.getGraphics();
		Graphics wg = getGraphics();
		
		int x = 0;
		
		while(true){
			g.setColor(Color.WHITE);
			g.fillRect(0,0,300,300);
			g.setColor(Color.CYAN);
			g.fillRect(x, 0, 100, 100);
			
			x++;

			wg.drawImage(img, 0, 0, null);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
