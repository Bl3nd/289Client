import java.awt.*;

import sign.signlink;

/**
 * Fully renamed 11/18/14 2:49PM
 * 
 * @author Cody
 *
 */
public class RSFrame extends Frame {

	/**
	 * Generated Serial Version UID.
	 */
	private static final long serialVersionUID = -754657267634315329L;
	public RSApplet rsApplet;

	@SuppressWarnings("deprecation")
	public RSFrame(int height, int dummy, int width, RSApplet applet) {
		try {
			rsApplet = applet;
			setTitle("Jagex");
			setResizable(false);
			if (dummy != 27016) {
				throw new NullPointerException();
			} else {
				show();
				toFront();
				resize(width + 8, height + 28);
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("79865, " + height + ", " + dummy + ", " + width + ", " + applet + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public Graphics getGraphics() {
		Graphics g = super.getGraphics();
		g.translate(4, 24);
		return g;
	}

	public void update(Graphics g) {
		rsApplet.update(g);
	}

	public void paint(Graphics g) {
		rsApplet.paint(g);
	}
}
