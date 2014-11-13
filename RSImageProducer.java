import java.awt.*;
import java.awt.image.*;
import java.io.PrintStream;
import sign.signlink;

public class RSImageProducer implements ImageProducer, ImageObserver {

	public int anInt581;
	public int framePixels[];
	public int frameWidth;
	public int frameHeight;
	public ColorModel colorModel;
	public ImageConsumer imageConsumer;
	public Image image;

	public RSImageProducer(Component component, int width, int height, int k) {
		anInt581 = 831;
		try {
			frameWidth = width;
			frameHeight = height;
			framePixels = new int[width * height];
			colorModel = new DirectColorModel(32, 0xff0000, 65280, 255);
			image = component.createImage(this);
			setPixelsForImage();
			if (k < 2 || k > 2) {
				anInt581 = 205;
			}
			component.prepareImage(image, this);
			setPixelsForImage();
			component.prepareImage(image, this);
			setPixelsForImage();
			component.prepareImage(image, this);
			initializeDrawingArea((byte) 5);
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("48102, " + component + ", " + width + ", " + height + ", " + k + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void initializeDrawingArea(byte b) {
		try {
			Class44_Sub3_Sub1.initializeDrawingArea(-78, framePixels, frameWidth, frameHeight);
			if (b != 5) {
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("43640, " + b + ", " + runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	public void method273(int i, int j, int k, Graphics g) {
		try {
			setPixelsForImage();
			while (i >= 0) {
				for (int l = 1; l > 0; l++) {
				}
			}
			g.drawImage(image, j, k, this);
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("14457, " + i + ", " + j + ", " + k + ", " + g
					+ ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public synchronized void addConsumer(ImageConsumer imageconsumer) {
		imageConsumer = imageconsumer;
		imageconsumer.setDimensions(frameWidth, frameHeight);
		imageconsumer.setProperties(null);
		imageconsumer.setColorModel(colorModel);
		imageconsumer.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer imageconsumer) {
		return imageConsumer == imageconsumer;
	}

	public synchronized void removeConsumer(ImageConsumer imageconsumer) {
		if (imageConsumer == imageconsumer) {
			imageConsumer = null;
		}
	}

	public void startProduction(ImageConsumer imageconsumer) {
		addConsumer(imageconsumer);
	}

	public void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
		System.out.println("TDLR");
	}

	public synchronized void setPixelsForImage() {
		if (imageConsumer == null) {
			return;
		} else {
			imageConsumer.setPixels(0, 0, frameWidth, frameHeight, colorModel, framePixels, 0, frameWidth);
			imageConsumer.imageComplete(2);
			return;
		}
	}

	public boolean imageUpdate(Image image, int i, int j, int k, int l, int i1) {
		return true;
	}
}
