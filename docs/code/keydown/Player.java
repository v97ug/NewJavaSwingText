package code.keydown;

import java.awt.*;

public class Player {
    int x;
    int y;

    Player(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move(){
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
    }

    // 追加！
    public void draw(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(x,y,50,50);
    }
}
