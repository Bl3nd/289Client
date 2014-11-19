package src.rs.drawing.impl;
import java.awt.*;
import java.awt.image.PixelGrabber;

import sign.signlink;
import src.rs.Class47;
import src.rs.drawing.DrawingArea;
import src.rs.stream.Stream;

public class Sprite extends DrawingArea {

	public int anInt1441;
	public boolean aBoolean1442;
	public int anInt1443;
	public int anInt1444;
	public int anInt1445;
	public byte aByte1446;
	public boolean aBoolean1447;
	public int pixels[];
	public int width;
	public int height;
	public int xOffset;
	public int yOffset;
	public int maxWidth;
	public int maxHeight;

	public Sprite(int i, int j) {
		aBoolean1442 = false;
		anInt1443 = 387;
		anInt1445 = 9;
		aByte1446 = 8;
		aBoolean1447 = true;
		pixels = new int[i * j];
		width = maxWidth = i;
		height = maxHeight = j;
		xOffset = yOffset = 0;
	}

	public Sprite(byte buf[], Component component) {
		aBoolean1442 = false;
		anInt1443 = 387;
		anInt1445 = 9;
		aByte1446 = 8;
		aBoolean1447 = true;
		try {
			Image image = Toolkit.getDefaultToolkit().createImage(buf);
			MediaTracker mediaTracker = new MediaTracker(component);
			mediaTracker.addImage(image, 0);
			mediaTracker.waitForAll();
			width = image.getWidth(component);
			height = image.getHeight(component);
			maxWidth = width;
			maxHeight = height;
			xOffset = 0;
			yOffset = 0;
			pixels = new int[width * height];
			PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, width, height, pixels, 0, width);
			pixelGrabber.grabPixels();
			return;
		} catch (Exception _ex) {
			System.out.println("Error converting jpg");
		}
	}

	public Sprite(Class47 class47, String s, int i) {//Archive
		aBoolean1442 = false;
		anInt1443 = 387;
		anInt1445 = 9;
		aByte1446 = 8;
		aBoolean1447 = true;
		Stream dataStream = new Stream(class47.method549(s + ".dat", null), 15787);
		Stream indexStream = new Stream(class47.method549("index.dat", null), 15787);
		indexStream.currentOffset = dataStream.getUnsignedLEShort();
		maxWidth = indexStream.getUnsignedLEShort();
		maxHeight = indexStream.getUnsignedLEShort();
		int length = indexStream.getUnsignedByte();
		int spritePixels[] = new int[length];
		for (int k = 0; k < length - 1; k++) {
			spritePixels[k + 1] = indexStream.get24BitInt();
			if (spritePixels[k + 1] == 0) {
				spritePixels[k + 1] = 1;
			}
		}
		for (int l = 0; l < i; l++) {
			indexStream.currentOffset += 2;
			dataStream.currentOffset += indexStream.getUnsignedLEShort() * indexStream.getUnsignedLEShort();
			indexStream.currentOffset++;
		}
		xOffset = indexStream.getUnsignedByte();
		yOffset = indexStream.getUnsignedByte();
		width = indexStream.getUnsignedLEShort();
		height = indexStream.getUnsignedLEShort();
		int type = indexStream.getUnsignedByte();
		int pixelCount = width * height;
		pixels = new int[pixelCount];
		if (type == 0) {
			for (int k1 = 0; k1 < pixelCount; k1++) {
				pixels[k1] = spritePixels[dataStream.getUnsignedByte()];
			}
			return;
		}
		if (type == 1) {
			for (int x = 0; x < width; x++) {
				for (int y = 0; y < height; y++) {
					pixels[x + y * width] = spritePixels[dataStream.getUnsignedByte()];
				}
			}
		}
	}

	public void initializeDrawingArea(byte b) {
		try {
			DrawingArea.initializeDrawingArea(-78, pixels, width, height);
			if (b == 5) {
				b = 0;
				return;
			} else {
				anInt1441 = 4;
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("24805, " + b + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void adjustRGB(int redAdjustment, byte b, int greenAdjustment, int blueAdjustment) {
		try {
			for (int pixel = 0; pixel < pixels.length; pixel++) {
				int originalColor = pixels[pixel];
				if (originalColor != 0) {
					int red = originalColor >> 16 & 0xff;
					red += redAdjustment;
					if (red < 1) {
						red = 1;
					} else if (red > 255) {
						red = 255;
					}
					int green = originalColor >> 8 & 0xff;
					green += greenAdjustment;
					if (green < 1) {
						green = 1;
					} else if (green > 255) {
						green = 255;
					}
					int blue = originalColor & 0xff;
					blue += blueAdjustment;
					if (blue < 1) {
						blue = 1;
					} else if (blue > 255) {
						blue = 255;
					}
					pixels[pixel] = (red << 16) + (green << 8) + blue;
				}
			}
			if (b == 3) {
				b = 0;
				return;
			} else {
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("40145, " + redAdjustment + ", " + b + ", " + greenAdjustment + ", " + blueAdjustment + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void trim(int i) {
		try {
			int targetPixels[] = new int[maxWidth * maxHeight];
			for (int y = 0; y < height; y++) {
				for (int x = 0; x < width; x++) {
					targetPixels[(y + yOffset) * maxWidth + (x + xOffset)] = pixels[y * width + x];
				}
			}
			pixels = targetPixels;
			width = maxWidth;
			height = maxHeight;
			xOffset = 0;
			yOffset = 0;
			if (i != -15744) {
				aBoolean1442 = !aBoolean1442;
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("30731, " + i + ", " + runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	public void drawInverse(int x, int y, int k) {
		try {
			x += xOffset;
			y += yOffset;
			int destPointer = x + y * DrawingArea.width;
			int source = 0;
			int drawHeight = height;
			int drawWidth = width;
			int l1 = DrawingArea.width - drawWidth;
			int i2 = 0;
			if (k != 8) {
				for (int j2 = 1; j2 > 0; j2++) {
				}
			}
			if (y < DrawingArea.topY) {
				int k2 = DrawingArea.topY - y;
				drawHeight -= k2;
				y = DrawingArea.topY;
				source += k2 * drawWidth;
				destPointer += k2 * DrawingArea.width;
			}
			if (y + drawHeight > DrawingArea.bottomY) {
				drawHeight -= (y + drawHeight) - DrawingArea.bottomY;
			}
			if (x < DrawingArea.topX) {
				int l2 = DrawingArea.topX - x;
				drawWidth -= l2;
				x = DrawingArea.topX;
				source += l2;
				destPointer += l2;
				i2 += l2;
				l1 += l2;
			}
			if (x + drawWidth > DrawingArea.bottomX) {
				int i3 = (x + drawWidth) - DrawingArea.bottomX;
				drawWidth -= i3;
				i2 += i3;
				l1 += i3;
			}
			if (drawWidth <= 0 || drawHeight <= 0) {
				return;
			} else {
				blockCopy(source, DrawingArea.pixels, pixels, destPointer, drawWidth, drawHeight, true, l1, i2);
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("29381, " + x + ", " + y + ", " + k + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void blockCopy(int sourcePointer, int destination[], int source[], int destinationPointer, int copyLength, int l, boolean flag, int i1, int j1) {
		try {
			int blockCount = -(copyLength >> 2);
			copyLength = -(copyLength & 3);
			if (!flag) {
				for (int l1 = 1; l1 > 0; l1++) {
				}
			}
			for (int i2 = -l; i2 < 0; i2++) {
				for (int ptr = blockCount; ptr < 0; ptr++) {
					destination[destinationPointer++] = source[sourcePointer++];
					destination[destinationPointer++] = source[sourcePointer++];
					destination[destinationPointer++] = source[sourcePointer++];
					destination[destinationPointer++] = source[sourcePointer++];
				}
				for (int ptr = copyLength; ptr < 0; ptr++) {
					destination[destinationPointer++] = source[sourcePointer++];
				}
				destinationPointer += i1;
				sourcePointer += j1;
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("72719, " + sourcePointer + ", " + destination + ", " + source + ", " + destinationPointer + ", " + copyLength + ", " + l + ", " + flag + ", " 
					+ i1 + ", " + j1 + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void drawImage(int y, byte b, int x) {
		try {
			x += xOffset;
			y += yOffset;
			int destinationOffset = x + y * DrawingArea.width;
			int sourceOffset = 0;
			int rowCount = height;
			int columnCount = width;
			int lineDestinationOffset = DrawingArea.width - columnCount;
			int lineSourceOffset = 0;
			if (b != 1) {
				return;
			}
			if (y < DrawingArea.topY) {
				int clipHeight = DrawingArea.topY - y;
				rowCount -= clipHeight;
				y = DrawingArea.topY;
				sourceOffset += clipHeight * columnCount;
				destinationOffset += clipHeight * DrawingArea.width;
			}
			if (y + rowCount > DrawingArea.bottomY) {
				rowCount -= (y + rowCount) - DrawingArea.bottomY;
			}
			if (x < DrawingArea.topX) {
				int clipWidth = DrawingArea.topX - x;
				columnCount -= clipWidth;
				x = DrawingArea.topX;
				sourceOffset += clipWidth;
				destinationOffset += clipWidth;
				lineSourceOffset += clipWidth;
				lineDestinationOffset += clipWidth;
			}
			if (x + columnCount > DrawingArea.bottomX) {
				int clipWidth = (x + columnCount) - DrawingArea.bottomX;
				columnCount -= clipWidth;
				lineSourceOffset += clipWidth;
				lineDestinationOffset += clipWidth;
			}
			if (columnCount <= 0 || rowCount <= 0) {
				return;
			} else {
				blockCopyTransparent(DrawingArea.pixels, pixels, 0, sourceOffset, destinationOffset, columnCount, rowCount, lineDestinationOffset, lineSourceOffset);
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("37524, " + y + ", " + b + ", " + x + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void blockCopyTransparent(int destination[], int source[], int value, int sourcePointer, int destinationPointer, int copyLength, int i1, int j1, int k1) {
		int blockCount = -(copyLength >> 2);
		copyLength = -(copyLength & 3);
		for (int i2 = -i1; i2 < 0; i2++) {
			for (int ptr = blockCount; ptr < 0; ptr++) {
				value = source[sourcePointer++];
				if (value != 0) {
					destination[destinationPointer++] = value;
				} else {
					destinationPointer++;
				}
				value = source[sourcePointer++];
				if (value != 0) {
					destination[destinationPointer++] = value;
				} else {
					destinationPointer++;
				}
				value = source[sourcePointer++];
				if (value != 0) {
					destination[destinationPointer++] = value;
				} else {
					destinationPointer++;
				}
				value = source[sourcePointer++];
				if (value != 0) {
					destination[destinationPointer++] = value;
				} else {
					destinationPointer++;
				}
			}
			for (int ptr = copyLength; ptr < 0; ptr++) {
				value = source[sourcePointer++];
				if (value != 0) {
					destination[destinationPointer++] = value;
				} else {
					destinationPointer++;
				}
			}
			destinationPointer += j1;
			sourcePointer += k1;
		}
	}

	public void drawImageAlpha(int alpha, int j, int y, int x) {
		try {
			x += xOffset;
			j = 15 / j;
			y += yOffset;
			int destinationPointer = x + y * DrawingArea.width;
			int sourcePointer = 0;
			int imageHeight = height;
			int imageWidth = width;
			int i2 = DrawingArea.width - imageWidth;
			int j2 = 0;
			if (y < DrawingArea.topY) {
				int k2 = DrawingArea.topY - y;
				imageHeight -= k2;
				y = DrawingArea.topY;
				sourcePointer += k2 * imageWidth;
				destinationPointer += k2 * DrawingArea.width;
			}
			if (y + imageHeight > DrawingArea.bottomY) {
				imageHeight -= (y + imageHeight) - DrawingArea.bottomY;
			}
			if (x < DrawingArea.topX) {
				int l2 = DrawingArea.topX - x;
				imageWidth -= l2;
				x = DrawingArea.topX;
				sourcePointer += l2;
				destinationPointer += l2;
				j2 += l2;
				i2 += l2;
			}
			if (x + imageWidth > DrawingArea.bottomX) {
				int i3 = (x + imageWidth) - DrawingArea.bottomX;
				imageWidth -= i3;
				j2 += i3;
				i2 += i3;
			}
			if (imageWidth <= 0 || imageHeight <= 0) {
				return;
			} else {
				blockCopyAlpha(sourcePointer, alpha, destinationPointer, imageHeight, DrawingArea.pixels, pixels, i2, j2, 0, imageWidth, false);
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("12746, " + alpha + ", " + j + ", " + y + ", " + x + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void blockCopyAlpha(int sourcePointer, int alpha, int destinationPointer, int height, int destination[], int source[], int i1, int j1, int sourceValue, int width, 
			boolean flag) {
		try {
			if (flag) {
				return;
			}
			int destinationAlpha = 256 - alpha;
			for (int j2 = -height; j2 < 0; j2++) {
				for (int ptr = -width; ptr < 0; ptr++) {
					sourceValue = source[sourcePointer++];
					if (sourceValue != 0) {
						int destinationValue = destination[destinationPointer];
						destination[destinationPointer++] = ((sourceValue & 0xff00ff) * alpha + (destinationValue & 0xff00ff) * destinationAlpha & 0xff00ff00)
								+ ((sourceValue & 0xff00) * alpha + (destinationValue & 0xff00) * destinationAlpha & 0xff0000) >> 8;
					} else {
						destinationPointer++;
					}
				}
				destinationPointer += i1;
				sourcePointer += j1;
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("94839, " + sourcePointer + ", " + alpha + ", " + destinationPointer + ", " + height + ", " + destination + ", " + source + ", " + i1 + ", " 
					+ j1 + ", " + sourceValue + ", " + width + ", " + flag + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void rotate(int ai[], int y, int centerY, int hingeSize, int l, int spriteHeight, int widthMap[], int spriteWidth, int k1, int centerX, int x) {
		try {
			while (k1 >= 0) {
				return;
			}
			try {
				int negativeCenterX = -spriteWidth / 2;
				int negativeCenterY = -spriteHeight / 2;
				int yOffset = (int) (Math.sin((double) l / 326.11000000000001D) * 65536D);
				int xOffset = (int) (Math.cos((double) l / 326.11000000000001D) * 65536D);
				yOffset = yOffset * hingeSize >> 8;
				xOffset = xOffset * hingeSize >> 8;
				int j3 = (centerX << 16) + (negativeCenterY * yOffset + negativeCenterX * xOffset);
				int k3 = (centerY << 16) + (negativeCenterY * xOffset - negativeCenterX * yOffset);
				int l3 = x + y * DrawingArea.width;
				for (y = 0; y < spriteHeight; y++) {
					int i4 = ai[y];
					int j4 = l3 + i4;
					int k4 = j3 + xOffset * i4;
					int l4 = k3 - yOffset * i4;
					for (x = -widthMap[y]; x < 0; x++) {
						DrawingArea.pixels[j4++] = pixels[(k4 >> 16) + (l4 >> 16) * width];
						k4 += xOffset;
						l4 -= yOffset;
					}
					j3 += yOffset;
					k3 += xOffset;
					l3 += DrawingArea.width;
				}
				return;
			} catch (Exception _ex) {
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("82769, " + ai + ", " + y + ", " + centerY + ", " + hingeSize + ", " + l + ", " + spriteHeight + ", " + widthMap + ", " + spriteWidth + ", "
					+ k1 + ", " + centerX + ", " + x + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void rotate(int centerX, double rotation, int spriteWidth, int hingeSize, int centerY, int x, byte b, int spriteHeight, int y) {
		try {
			if (b == aByte1446) {
				b = 0;
			} else {
				anInt1444 = -392;
			}
			try {
				int l1 = -spriteWidth / 2;
				int i2 = -spriteHeight / 2;
				int j2 = (int) (Math.sin(rotation) * 65536D);
				int k2 = (int) (Math.cos(rotation) * 65536D);
				j2 = j2 * hingeSize >> 8;
				k2 = k2 * hingeSize >> 8;
				int l2 = (centerX << 16) + (i2 * j2 + l1 * k2);
				int i3 = (centerY << 16) + (i2 * k2 - l1 * j2);
				int j3 = x + y * DrawingArea.width;
				for (y = 0; y < spriteHeight; y++) {
					int k3 = j3;
					int l3 = l2;
					int i4 = i3;
					for (x = -spriteWidth; x < 0; x++) {
						int j4 = pixels[(l3 >> 16) + (i4 >> 16) * width];
						if (j4 != 0) {
							DrawingArea.pixels[k3++] = j4;
						} else {
							k3++;
						}
						l3 += k2;
						i4 -= j2;
					}
					l2 += j2;
					i3 += k2;
					j3 += DrawingArea.width;
				}
				return;
			} catch (Exception _ex) {
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("35641, " + centerX + ", " + rotation + ", " + spriteWidth + ", " + hingeSize + ", " + centerY + ", " + x + ", " + b + ", " 
					+ spriteHeight + ", " + y + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void method446(int x, Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3, boolean flag, int y) {
		try {
			x += xOffset;
			y += yOffset;
			int k = x + y * DrawingArea.width;
			int l = 0;
			int i1 = height;
			int j1 = width;
			int k1 = DrawingArea.width - j1;
			int l1 = 0;
			if (!flag) {
				aBoolean1447 = !aBoolean1447;
			}
			if (y < DrawingArea.topY) {
				int i2 = DrawingArea.topY - y;
				i1 -= i2;
				y = DrawingArea.topY;
				l += i2 * j1;
				k += i2 * DrawingArea.width;
			}
			if (y + i1 > DrawingArea.bottomY) {
				i1 -= (y + i1) - DrawingArea.bottomY;
			}
			if (x < DrawingArea.topX) {
				int j2 = DrawingArea.topX - x;
				j1 -= j2;
				x = DrawingArea.topX;
				l += j2;
				k += j2;
				l1 += j2;
				k1 += j2;
			}
			if (x + j1 > DrawingArea.bottomX) {
				int k2 = (x + j1) - DrawingArea.bottomX;
				j1 -= k2;
				l1 += k2;
				k1 += k2;
			}
			if (j1 <= 0 || i1 <= 0) {
				return;
			} else {
				method447(l, k, l1, class44_sub3_sub1_sub3.imagePixels, j1, k1, 0, i1, pixels, true, DrawingArea.pixels);
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("46753, " + x + ", " + class44_sub3_sub1_sub3 + ", " + flag + ", " + y + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void method447(int i, int j, int k, byte buf[], int l, int i1, int j1, int k1, int ai[], boolean flag, int ai1[]) {
		try {
			if (!flag) {
				anInt1445 = 207;
			}
			int l1 = -(l >> 2);
			l = -(l & 3);
			for (int i2 = -k1; i2 < 0; i2++) {
				for (int j2 = l1; j2 < 0; j2++) {
					j1 = ai[i++];
					if (j1 != 0 && buf[j] == 0) {
						ai1[j++] = j1;
					} else {
						j++;
					}
					j1 = ai[i++];
					if (j1 != 0 && buf[j] == 0) {
						ai1[j++] = j1;
					} else {
						j++;
					}
					j1 = ai[i++];
					if (j1 != 0 && buf[j] == 0) {
						ai1[j++] = j1;
					} else {
						j++;
					}
					j1 = ai[i++];
					if (j1 != 0 && buf[j] == 0) {
						ai1[j++] = j1;
					} else {
						j++;
					}
				}
				for (int k2 = l; k2 < 0; k2++) {
					j1 = ai[i++];
					if (j1 != 0 && buf[j] == 0) {
						ai1[j++] = j1;
					} else {
						j++;
					}
				}
				j += i1;
				i += k;
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("52031, " + i + ", " + j + ", " + k + ", " + buf + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + ai + ", " + flag + ", " 
					+ ai1 + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}
}
