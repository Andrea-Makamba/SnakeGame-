import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

public class SnakeBoard extends JComponent {
	private static final long serialVersionUID = 1L;
	private Color background = new Color(0, 141, 0); 

	public void paintComponent(Graphics gc) {
		super.paintComponent(gc);
		// set the pen colour
		gc.setColor(background);
		gc.fillRect(0, 0, 500, 500);

		// draw a snake
	}

// get the size of the drawing panel
	public Dimension getPreferredSize() {
		return new Dimension(500, 500);
	}

}

