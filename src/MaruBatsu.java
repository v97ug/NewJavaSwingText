import javax.swing.JFrame;

public class MaruBatsu {
	public static void main(String[] args){
		final int height = 300;
		final int width = 1000;
		final String titleName = "title";
		
		JFrame frame = new JFrame(titleName);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
		
		MyJPanel myJPanel = new MyJPanel();
		frame.getContentPane().add(myJPanel);
		
		myJPanel.setBounds(0,0, width, height);
		myJPanel.game(width, height);
	}
}
