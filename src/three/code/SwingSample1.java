package three.code;

import javax.swing.*;

public class SwingSample1 {
    public static void main(String[] args){
        final int height = 600;
        final int width = 600;
        final String titleName = "title";

        JFrame frame = new JFrame(titleName);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);

        MyJPanelImage myJPanel = new MyJPanelImage();
        frame.getContentPane().add(myJPanel);

        myJPanel.setBounds(0,0, width, height);
        myJPanel.game(width, height);
    }
}
