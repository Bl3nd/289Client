package src.rs.image;
import java.awt.*;
import java.awt.image.*;

import sign.signlink;
import src.rs.drawing.DrawingArea;

/**
 * Produce an image component.
 * 
 * @author Cody
 *
 */
public class RSImageProducer implements ImageProducer, ImageObserver {

	public int anInt581;
	//The frame pixels.
	public int framePixels[];
	//The frame width.
	public int frameWidth;
	//The frame height.
	public int frameHeight;
	
	public ColorModel colorModel;
	public ImageConsumer imageConsumer;
	public Image image;

	/**
	 * Sets the components width and height.
	 * @param component
	 * 		The component.
	 * @param width
	 * 		The width of the component.
	 * @param height
	 * 		The height of the component.
	 * @param k
	 * 		A dummy.
	 */
	public RSImageProducer(Component component, int width, int height, int k) {
		anInt581 = 831;
		try {
			//Make sure the width/height match.
			frameWidth = width;
			frameHeight = height;
			//Set the frame pixels array.
			framePixels = new int[width * height];
			//Set the color model.
			colorModel = new DirectColorModel(32, 0xff0000, 65280, 255);
			//Set the image.
			image = component.createImage(this);
			//Set the pixels for the image.
			setPixelsForImage();
			
			if (k < 2 || k > 2) {
				anInt581 = 205;
			}
			//Prepare the image and set the pixels for that image.
			component.prepareImage(image, this);
			setPixelsForImage();
			component.prepareImage(image, this);
			setPixelsForImage();
			component.prepareImage(image, this);
			//Initialize the drawing area.
			initializeDrawingArea((byte) 5);
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("48102, " + component + ", " + width + ", " + height + ", " + k + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	/**
	 * Initializes the area for drawing.
	 * @param b
	 * 		A dummy.
	 */
	public void initializeDrawingArea(byte b) {
		try {
			//Initialize the drawing area with the width, height, and amount a pixels.
			DrawingArea.initializeDrawingArea(-78, framePixels, frameWidth, frameHeight);
			
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
			signlink.reporterror("14457, " + i + ", " + j + ", " + k + ", " + g + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	/**
	 * Add the image consumer.
	 */
	public synchronized void addConsumer(ImageConsumer imageconsumer) {
		imageConsumer = imageconsumer;
		imageconsumer.setDimensions(frameWidth, frameHeight);
		imageconsumer.setProperties(null);
		imageconsumer.setColorModel(colorModel);
		imageconsumer.setHints(14);
	}

	/**
	 * Is the image consumer the actual image consumer?
	 */
	public synchronized boolean isConsumer(ImageConsumer imageconsumer) {
		return imageConsumer == imageconsumer;
	}

	/**
	 * Remove the image consumer.
	 */
	public synchronized void removeConsumer(ImageConsumer imageconsumer) {
		if (imageConsumer == imageconsumer) {
			imageConsumer = null;
		}
	}

	/**
	 * Start the production of the image consumer.
	 */
	public void startProduction(ImageConsumer imageconsumer) {
		addConsumer(imageconsumer);
	}

	/**
	 * Request image re-send.
	 */
	public void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
		System.out.println("TDLR");
	}

	/**
	 * Set the pixels for an image.
	 */
	public synchronized void setPixelsForImage() {
		if (imageConsumer == null) {
			return;
		} else {
			imageConsumer.setPixels(0, 0, frameWidth, frameHeight, colorModel, framePixels, 0, frameWidth);
			imageConsumer.imageComplete(2);
			return;
		}
	}

	/**
	 * Should update the image?
	 */
	public boolean imageUpdate(Image image, int i, int j, int k, int l, int i1) {
		return true;
	}
}
