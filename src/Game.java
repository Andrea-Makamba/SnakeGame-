import java.awt.*;
import javax.swing.*;

public class Game implements Runnable {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Game());		 
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("Play Snake");
		// set the content of the window to be the game
		frame.getContentPane().add(new SnakeBoard());
		// make sure the application exits when the frame closes
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// resize the frame based on the size of the panel
		frame.pack();
		// show the frame
		frame.setVisible(true);
		
	}
	
	
}
