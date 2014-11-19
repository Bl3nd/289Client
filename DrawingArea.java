import sign.signlink;

public class DrawingArea extends SubNode {

	public static int anInt1363 = 1623;
	public static boolean aBoolean1364;
	public static boolean aBoolean1365 = true;
	public static byte aByte1366 = 8;
	public static int anInt1367 = 1;
	public static byte aByte1368 = 35;
	public static int pixels[];
	public static int width;
	public static int height;
	public static int topY;
	public static int bottomY;
	public static int topX;
	public static int bottomX;
	public static int centerX;
	public static int viewportCenterX;
	public static int viewportCenterY;
	public static int anInt1379;

	public static void initializeDrawingArea(int i, int framePixels[], int frameWidth, int frameHeight) {
		try {
			pixels = framePixels;
			width = frameWidth;
			for (height = frameHeight; i >= 0;) {
				return;
			}
			setDrawingArea(aByte1366, frameHeight, frameWidth, 0, 0);
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("83567, " + i + ", " + framePixels + ", " + frameWidth + ", " + frameHeight + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public static void defaultDrawingAreaSize(byte byte0) {
		try {
			topX = 0;
			topY = 0;
			bottomX = width;
			bottomY = height;
			if (byte0 != -92) {
				aBoolean1364 = !aBoolean1364;
			}
			centerX = bottomX - 1;
			viewportCenterX = bottomX / 2;
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("75622, " + byte0 + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public static void setDrawingArea(byte b, int frameHeight, int frameWidth, int k, int l) {
		try {
			if (l < 0) {
				l = 0;
			}
			if (k < 0) {
				k = 0;
			}
			if (frameWidth > width) {
				frameWidth = width;
			}
			if (frameHeight > height) {
				frameHeight = height;
			}
			topX = l;
			topY = k;
			if (b == 8) {
				b = 0;
			} else {
				return;
			}
			bottomX = frameWidth;
			bottomY = frameHeight;
			centerX = bottomX - 1;
			viewportCenterX = bottomX / 2;
			viewportCenterY = bottomY / 2;
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("52567, " + b + ", " + frameHeight + ", " + frameWidth + ", " + k + ", " + l + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public static void clear(byte b) {
		try {
			if (b != 127) {
				return;
			}
			int i = width * height;
			for (int j = 0; j < i; j++) {
				pixels[j] = 0;
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("10068, " + b + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public static void drawFilledRectangleAlpha(int i, int j, int k, int l, int i1, int j1, boolean flag) {
		try {
			if (j1 < topX) {
				i1 -= topX - j1;
				j1 = topX;
			}
			if (i < topY) {
				j -= topY - i;
				i = topY;
			}
			if (j1 + i1 > bottomX) {
				i1 = bottomX - j1;
			}
			if (i + j > bottomY) {
				j = bottomY - i;
			}
			int k1 = 256 - k;
			int l1 = (l >> 16 & 0xff) * k;
			int i2 = (l >> 8 & 0xff) * k;
			int j2 = (l & 0xff) * k;
			if (flag) {
				anInt1363 = 122;
			}
			int j3 = width - i1;
			int k3 = j1 + i * width;
			for (int l3 = 0; l3 < j; l3++) {
				for (int i4 = -i1; i4 < 0; i4++) {
					int k2 = (pixels[k3] >> 16 & 0xff) * k1;
					int l2 = (pixels[k3] >> 8 & 0xff) * k1;
					int i3 = (pixels[k3] & 0xff) * k1;
					int j4 = ((l1 + k2 >> 8) << 16) + ((i2 + l2 >> 8) << 8) + (j2 + i3 >> 8);
					pixels[k3++] = j4;
				}
				k3 += j3;
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("68601, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + flag + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public static void method411(int i, int j, int k, int l, int i1, int j1) {
		try {
			if (i1 < topX) {
				j1 -= topX - i1;
				i1 = topX;
			}
			if (k < topY) {
				l -= topY - k;
				k = topY;
			}
			if (i1 + j1 > bottomX) {
				j1 = bottomX - i1;
			}
			if (k + l > bottomY) {
				l = bottomY - k;
			}
			int k1 = width - j1;
			j = 83 / j;
			int l1 = i1 + k * width;
			for (int i2 = -l; i2 < 0; i2++) {
				for (int j2 = -j1; j2 < 0; j2++) {
					pixels[l1++] = i;
				}
				l1 += k1;
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("43392, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public static void drawUnfilledRectangle(int i, int j, int k, int l, int i1, int j1) {
		try {
			drawHorizontalLine(k, j, l, true, i1);
			drawHorizontalLine(k, j, l, true, (i1 + j1) - 1);
			drawVerticalLine(i1, j, l, j1, 0);
			if (i < anInt1367 || i > anInt1367) {
				aBoolean1364 = !aBoolean1364;
			}
			drawVerticalLine(i1, (j + k) - 1, l, j1, 0);
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("9711, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public static void drawUnfilledRectangleAlpha(int i, int j, int k, int l, int i1, int j1, int k1) {
		try {
			method415(-985, k, j, i1, j1, l);
			method415(-985, k, j, i1, (j1 + i) - 1, l);
			if (k1 != 0) {
				anInt1363 = -232;
			}
			if (i >= 3) {
				method417(i - 2, j, j1 + 1, i1, 454, k);
				method417(i - 2, j, j1 + 1, i1, 454, (k + l) - 1);
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("90957, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	public static void drawHorizontalLine(int frameWidth, int y, int k, boolean flag, int x) {
		try {
			if (!flag) {
				return;
			}
			if (x < topY || x >= bottomY) {
				return;
			}
			if (y < topX) {
				frameWidth -= topX - y;
				y = topX;
			}
			if (y + frameWidth > bottomX) {
				frameWidth = bottomX - y;
			}
			int pointer = y + x * width;
			for (int j1 = 0; j1 < frameWidth; j1++) {
				pixels[pointer + j1] = k;
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("26422, " + frameWidth + ", " + y + ", " + k + ", " + flag + ", " + x + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public static void method415(int i, int j, int k, int l, int i1, int j1) {
		try {
			if (i1 < topY || i1 >= bottomY) {
				return;
			}
			if (j < topX) {
				j1 -= topX - j;
				j = topX;
			}
			if (j + j1 > bottomX) {
				j1 = bottomX - j;
			}
			int k1 = 256 - l;
			while (i >= 0) {
				for (int l1 = 1; l1 > 0; l1++) {
				}
			}
			int i2 = (k >> 16 & 0xff) * l;
			int j2 = (k >> 8 & 0xff) * l;
			int k2 = (k & 0xff) * l;
			int k3 = j + i1 * width;
			for (int l3 = 0; l3 < j1; l3++) {
				int l2 = (pixels[k3] >> 16 & 0xff) * k1;
				int i3 = (pixels[k3] >> 8 & 0xff) * k1;
				int j3 = (pixels[k3] & 0xff) * k1;
				int i4 = ((i2 + l2 >> 8) << 16) + ((j2 + i3 >> 8) << 8)
						+ (k2 + j3 >> 8);
				pixels[k3++] = i4;
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("78053, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public static void drawVerticalLine(int y, int x, int k, int frameHeight, int i1) {
		try {
			if (i1 != 0) {
				aBoolean1365 = !aBoolean1365;
			}
			if (x < topX || x >= bottomX) {
				return;
			}
			if (y < topY) {
				frameHeight -= topY - y;
				y = topY;
			}
			if (y + frameHeight > bottomY) {
				frameHeight = bottomY - y;
			}
			int pointer = x + y * width;
			for (int k1 = 0; k1 < frameHeight; k1++) {
				pixels[pointer + k1 * width] = k;
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("94910, " + y + ", " + x + ", " + k + ", " + frameHeight + ", " + i1 + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public static void method417(int i, int j, int k, int l, int i1, int j1) {
		try {
			if (j1 < topX || j1 >= bottomX) {
				return;
			}
			if (k < topY) {
				i -= topY - k;
				k = topY;
			}
			if (k + i > bottomY) {
				i = bottomY - k;
			}
			int k1 = 256 - l;
			i1 = 37 / i1;
			int l1 = (j >> 16 & 0xff) * l;
			int i2 = (j >> 8 & 0xff) * l;
			int j2 = (j & 0xff) * l;
			int j3 = j1 + k * width;
			for (int k3 = 0; k3 < i; k3++) {
				int k2 = (pixels[j3] >> 16 & 0xff) * k1;
				int l2 = (pixels[j3] >> 8 & 0xff) * k1;
				int i3 = (pixels[j3] & 0xff) * k1;
				int l3 = ((l1 + k2 >> 8) << 16) + ((i2 + l2 >> 8) << 8)
						+ (j2 + i3 >> 8);
				pixels[j3] = l3;
				j3 += width;
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("35599, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public DrawingArea() {
	}

}
