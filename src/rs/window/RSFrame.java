package src.rs.window;
import java.awt.*;

import sign.signlink;

/**
 * Sets the frame, gets the graphics, updates the graphics, and paints the graphics.
 * 
 * @author Cody
 *
 */
public class RSFrame extends Frame {

	/**
	 * Generated Serial Version UID.
	 */
	private static final long serialVersionUID = -754657267634315329L;
	
	//Represents the RSApplet.
	public RSApplet rsApplet;

	/**
	 * Sets the Game Frame.
	 * @param height
	 * 		The height of the frame.
	 * @param dummy
	 * 		A dummy used.
	 * @param width
	 * 		The width of the frame.
	 * @param applet
	 * 		The applet itself.
	 */
	@SuppressWarnings("deprecation")
	public RSFrame(int height, int dummy, int width, RSApplet applet) {
		try {
			rsApplet = applet;
			//Set the title.
			setTitle("Jagex");
			//Set the frame not resizable.
			setResizable(false);
			/*
			 * 
			 */
			if (dummy != 27016) {
				throw new NullPointerException();
			} else {
				//Show the window (frame).
				show();
				//Set the frame to the front of the screen (puts other windows behind it).
				toFront();
				//Resize the frame.
				resize(width + 8, height + 28);
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("79865, " + height + ", " + dummy + ", " + width + ", " + applet + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	/**
	 * Get the graphics.
	 */
	public Graphics getGraphics() {
		Graphics g = super.getGraphics();
		g.translate(4, 24);
		return g;
	}

	/**
	 * Update the graphics.
	 */
	public void update(Graphics g) {
		rsApplet.update(g);
	}

	/**
	 * Paint the graphics.
	 */
	public void paint(Graphics g) {
		rsApplet.paint(g);
	}
}
