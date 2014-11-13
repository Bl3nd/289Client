import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import sign.signlink;

public class RSApplet extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	/**
	 * Generated Serial Version UID.
	 */
	private static final long serialVersionUID = 7057250077257273707L;
	public boolean aBoolean1;
	public int anInt2;
	public int anInt3;
	public int anInt4;
	public int anInt5;
	public int delayTime;
	public int minDelay;
	public long aLongArray8[];
	public int fps;
	public boolean debug;
	public int frameWidth;
	public int frameHeight;
	public Graphics graphics;
	public RSImageProducer fullGameScreen;
	public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2Array15[];
	public Frame_Sub1 rsFrame;
	public boolean clearScreen;
	public boolean awtFocus;
	public int idleTime;
	public int clickMode2;
	public int mouseX;
	public int mouseY;
	public int clickMode1;
	public int clickX;
	public int clickY;
	public long clickTime;
	public int clickMode3;
	public int saveClickX;
	public int saveClickY;
	public long aLong30;
	public int keyArray[];
	public int charQueue[];
	public int readIndex;
	public int writeIndex;
	public static boolean aBoolean35;

	public void createGameFrame(int height, int width, int dummy) {
		try {
			frameWidth = width;
			frameHeight = height;
			rsFrame = new Frame_Sub1(frameHeight, 27016, frameWidth, this);
			graphics = getFrame(7).getGraphics();
			if (dummy != 0) {
				anInt4 = -480;
			}
			fullGameScreen = new RSImageProducer(getFrame(7), frameWidth, frameHeight, 2);
			startThread(this, 1);
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("84735, " + height + ", " + width + ", " + dummy + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void initializeGameFrame(boolean flag, int width, int height) {
		try {
			frameWidth = width;
			if (!flag) {
				anInt3 = 4;
			}
			frameHeight = height;
			graphics = getFrame(7).getGraphics();
			fullGameScreen = new RSImageProducer(getFrame(7), frameWidth, frameHeight, 2);
			startThread(this, 1);
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("72806, " + flag + ", " + width + ", " + height + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void run() {
		getFrame(7).addMouseListener(this);
		getFrame(7).addMouseMotionListener(this);
		getFrame(7).addKeyListener(this);
		getFrame(7).addFocusListener(this);
		if (rsFrame != null) {
			rsFrame.addWindowListener(this);
		}
		drawLoadupText(false, 0, "Loading...");
		startUp();
		int oPos = 0;
		int ratio = 256;
		int delay = 1;
		int i1 = 0;
		int intex = 0;
		for (int k1 = 0; k1 < 10; k1++) {
			aLongArray8[k1] = System.currentTimeMillis();
		}
		@SuppressWarnings("unused")
		long l = System.currentTimeMillis();
		while (anInt5 >= 0) {
			if (anInt5 > 0) {
				anInt5--;
				if (anInt5 == 0) {
					exit(0);
					return;
				}
			}
			int i2 = ratio;
			int j2 = delay;
			ratio = 300;
			delay = 1;
			long nTime = System.currentTimeMillis();
			if (aLongArray8[oPos] == 0L) {
				ratio = i2;
				delay = j2;
			} else if (nTime > aLongArray8[oPos]) {
				ratio = (int) ((long) (2560 * delayTime) / (nTime - aLongArray8[oPos]));
			}
			if (ratio < 25) {
				ratio = 25;
			}
			if (ratio > 256) {
				ratio = 256;
				delay = (int) ((long) delayTime - (nTime - aLongArray8[oPos]) / 10L);
			}
			if (delay > delayTime) {
				delay = delayTime;
			}
			aLongArray8[oPos] = nTime;
			oPos = (oPos + 1) % 10;
			if (delay > 1) {
				for (int k2 = 0; k2 < 10; k2++) {
					if (aLongArray8[k2] != 0L) {
						aLongArray8[k2] += delay;
					}
				}
			}
			if (delay < minDelay) {
				delay = minDelay;
			}
			try {
				Thread.sleep(delay);
			} catch (InterruptedException _ex) {
				intex++;
			}
			for (; i1 < 256; i1 += ratio) {
				clickMode3 = clickMode1;
				saveClickX = clickX;
				saveClickY = clickY;
				aLong30 = clickTime;
				clickMode1 = 0;
				processGameLoop(9);
				readIndex = writeIndex;
			}
			i1 &= 0xff;
			if (delayTime > 0) {
				fps = (1000 * ratio) / (delayTime * 256);
			}
			processDrawing((byte) 1);
			if (debug) {
				System.out.println("ntime:" + nTime);
				for (int l2 = 0; l2 < 10; l2++) {
					int oTim = ((oPos - l2 - 1) + 20) % 10;
					System.out.println("otim" + oTim + ":" + aLongArray8[oTim]);
				}
				System.out.println("fps:" + fps + " ratio:" + ratio + " count:" + i1);
				System.out.println("del:" + delay + " deltime:" + delayTime + " mindel:" + minDelay);
				System.out.println("intex:" + intex + " opos:" + oPos);
				debug = false;
				intex = 0;
			}
		}
		if (anInt5 == -1) {
			exit(0);
		}
	}

	public void exit(int i) {
		try {
			anInt5 = -2;
			cleanUpForQuit(874);
			if (i != 0) {
				return;
			}
			if (rsFrame != null) {
				try {
					Thread.sleep(1000L);
				} catch (Exception _ex) {
				}
				try {
					System.exit(0);
					return;
				} catch (Throwable _ex) {
					return;
				}
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("66676, " + i + ", " + runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	public void method4(int i, int j) {
		try {
			if (j <= 0) {
				return;
			} else {
				delayTime = 1000 / i;
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("19917, " + i + ", " + j + ", "
					+ runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void start() {
		if (anInt5 >= 0) {
			anInt5 = 0;
		}
	}

	public void stop() {
		if (anInt5 >= 0) {
			anInt5 = 4000 / delayTime;
		}
	}

	public void destroy() {
		anInt5 = -1;
		try {
			Thread.sleep(5000L);
		} catch (Exception _ex) {
		}
		if (anInt5 == -1) {
			exit(0);
		}
	}

	public void update(Graphics g) {
		if (graphics == null) {
			graphics = g;
		}
		clearScreen = true;
		raiseWelcomeScreen(false);
	}

	public void paint(Graphics g) {
		if (graphics == null) {
			graphics = g;
		}
		clearScreen = true;
		raiseWelcomeScreen(false);
	}

	public void mousePressed(MouseEvent mouseevent) {
		int x = mouseevent.getX();
		int y = mouseevent.getY();
		if (rsFrame != null) {
			x -= 4;
			y -= 22;
		}
		idleTime = 0;
		clickX = x;
		clickY = y;
		clickTime = System.currentTimeMillis();
		if (mouseevent.isMetaDown()) {
			clickMode1 = 2;
			clickMode2 = 2;
			return;
		} else {
			clickMode1 = 1;
			clickMode2 = 1;
			return;
		}
	}

	public void mouseReleased(MouseEvent mouseevent) {
		idleTime = 0;
		clickMode2 = 0;
	}

	public void mouseClicked(MouseEvent mouseevent) {
	}

	public void mouseEntered(MouseEvent mouseevent) {
	}

	public void mouseExited(MouseEvent mouseevent) {
		idleTime = 0;
		mouseX = -1;
		mouseY = -1;
	}

	public void mouseDragged(MouseEvent mouseevent) {
		int x = mouseevent.getX();
		int y = mouseevent.getY();
		if (rsFrame != null) {
			x -= 4;
			y -= 22;
		}
		idleTime = 0;
		mouseX = x;
		mouseY = y;
	}

	public void mouseMoved(MouseEvent mouseevent) {
		int x = mouseevent.getX();
		int y = mouseevent.getY();
		if (rsFrame != null) {
			x -= 4;
			y -= 22;
		}
		idleTime = 0;
		mouseX = x;
		mouseY = y;
	}

	public void keyPressed(KeyEvent keyevent) {
		idleTime = 0;
		int keyCode = keyevent.getKeyCode();
		int keyCharacter = keyevent.getKeyChar();
		if (keyCharacter < 30) {
			keyCharacter = 0;
		}
		if (keyCode == 37) {
			keyCharacter = 1;
		}
		if (keyCode == 39) {
			keyCharacter = 2;
		}
		if (keyCode == 38) {
			keyCharacter = 3;
		}
		if (keyCode == 40) {
			keyCharacter = 4;
		}
		if (keyCode == 17) {
			keyCharacter = 5;
		}
		if (keyCode == 8) {
			keyCharacter = 8;
		}
		if (keyCode == 127) {
			keyCharacter = 8;
		}
		if (keyCode == 9) {
			keyCharacter = 9;
		}
		if (keyCode == 10) {
			keyCharacter = 10;
		}
		if (keyCode >= 112 && keyCode <= 123) {
			keyCharacter = (1008 + keyCode) - 112;
		}
		if (keyCode == 36) {
			keyCharacter = 1000;
		}
		if (keyCode == 35) {
			keyCharacter = 1001;
		}
		if (keyCode == 33) {
			keyCharacter = 1002;
		}
		if (keyCode == 34) {
			keyCharacter = 1003;
		}
		if (keyCharacter > 0 && keyCharacter < 128) {
			keyArray[keyCharacter] = 1;
		}
		if (keyCharacter > 4) {
			charQueue[writeIndex] = keyCharacter;
			writeIndex = writeIndex + 1 & 0x7f;
		}
	}

	public void keyReleased(KeyEvent keyevent) {
		idleTime = 0;
		int keyCode = keyevent.getKeyCode();
		char keyCharacter = keyevent.getKeyChar();
		if (keyCharacter < '\036') {
			keyCharacter = '\0';
		}
		if (keyCode == 37) {
			keyCharacter = '\001';
		}
		if (keyCode == 39) {
			keyCharacter = '\002';
		}
		if (keyCode == 38) {
			keyCharacter = '\003';
		}
		if (keyCode == 40) {
			keyCharacter = '\004';
		}
		if (keyCode == 17) {
			keyCharacter = '\005';
		}
		if (keyCode == 8) {
			keyCharacter = '\b';
		}
		if (keyCode == 127) {
			keyCharacter = '\b';
		}
		if (keyCode == 9) {
			keyCharacter = '\t';
		}
		if (keyCode == 10) {
			keyCharacter = '\n';
		}
		if (keyCharacter > 0 && keyCharacter < '\200') {
			keyArray[keyCharacter] = 0;
		}
	}

	public void keyTyped(KeyEvent keyevent) {
	}

	public int readCharacter(int i) {
		try {
			int j = -1;
			if (i >= 0) {
				aBoolean1 = !aBoolean1;
			}
			if (writeIndex != readIndex) {
				j = charQueue[readIndex];
				readIndex = readIndex + 1 & 0x7f;
			}
			return j;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("9078, " + i + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void focusGained(FocusEvent focusevent) {
		awtFocus = true;
		clearScreen = true;
		raiseWelcomeScreen(false);
	}

	public void focusLost(FocusEvent focusevent) {
		awtFocus = false;
		for (int i = 0; i < 128; i++) {
			keyArray[i] = 0;
		}
	}

	public void windowActivated(WindowEvent windowevent) {
	}

	public void windowClosed(WindowEvent windowevent) {
	}

	public void windowClosing(WindowEvent windowevent) {
		destroy();
	}

	public void windowDeactivated(WindowEvent windowevent) {
	}

	public void windowDeiconified(WindowEvent windowevent) {
	}

	public void windowIconified(WindowEvent windowevent) {
	}

	public void windowOpened(WindowEvent windowevent) {
	}

	public void startUp() {
	}

	public void processGameLoop(int i) {
		try {
			if (i != 9) {
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("72813, " + i + ", " + runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	public void cleanUpForQuit(int i) {
		try {
			i = 38 / i;
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("23302, " + i + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void processDrawing(byte b) {
		try {
			if (b != 1) {
				aBoolean1 = !aBoolean1;
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("64489, " + b + ", " + runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	public void raiseWelcomeScreen(boolean flag) {
		try {
			if (flag) {
				anInt3 = 244;
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("4586, " + flag + ", "
					+ runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	public Component getFrame(int i) {
		try {
			if (i != 7) {
				throw new NullPointerException();
			}
			if (rsFrame != null) {
				return rsFrame;
			} else {
				return this;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("96176, " + i + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void startThread(Runnable runnable, int priority) {
		Thread thread = new Thread(runnable);
		thread.start();
		thread.setPriority(priority);
	}

	public void drawLoadupText(boolean flag, int i, String s) {
		try {
			while (graphics == null) {
				graphics = getFrame(7).getGraphics();
				try {
					getFrame(7).repaint();
				} catch (Exception _ex) {
				}
				try {
					Thread.sleep(1000L);
				} catch (Exception _ex) {
				}
			}
			Font font = new Font("Helvetica", 1, 13);
			FontMetrics fontmetrics = getFrame(7).getFontMetrics(font);
			Font font1 = new Font("Helvetica", 0, 13);
			getFrame(7).getFontMetrics(font1);
			if (clearScreen) {
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, frameWidth, frameHeight);
				clearScreen = false;
			}
			Color color = new Color(140, 17, 17);
			int j = frameHeight / 2 - 18;
			graphics.setColor(color);
			graphics.drawRect(frameWidth / 2 - 152, j, 304, 34);
			graphics.fillRect(frameWidth / 2 - 150, j + 2, i * 3, 30);
			graphics.setColor(Color.black);
			graphics.fillRect((frameWidth / 2 - 150) + i * 3, j + 2, 300 - i * 3, 30);
			graphics.setFont(font);
			graphics.setColor(Color.white);
			graphics.drawString(s, (frameWidth - fontmetrics.stringWidth(s)) / 2, j + 22);
			if (flag) {
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("88163, " + flag + ", " + i + ", " + s + ", " + runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	public RSApplet() {
		aBoolean1 = false;
		anInt2 = -128;
		anInt3 = 37395;
		anInt4 = -6002;
		delayTime = 20;
		minDelay = 1;
		aLongArray8 = new long[10];
		debug = false;
		aClass44_Sub3_Sub1_Sub2Array15 = new Class44_Sub3_Sub1_Sub2[6];
		clearScreen = true;
		awtFocus = true;
		keyArray = new int[128];
		charQueue = new int[128];
	}
}
