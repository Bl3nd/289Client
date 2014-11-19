package src.rs.drawing.impl;
import sign.signlink;
import src.rs.Class47;
import src.rs.drawing.DrawingArea;

public class Rasterizer extends DrawingArea {

	public static int anInt1414 = 8;
	public static int anInt1415;
	public static boolean aBoolean1416 = true;
	public static boolean aBoolean1417 = true;
	public static boolean lowMemory = true;
	public static boolean restrictEdges;
	public static boolean aBoolean1420;
	public static boolean textured = true;
	public static int alpha;
	public static int centerX;
	public static int centerY;
	public static int anIntArray1425[];
	public static int anIntArray1426[];
	public static int anIntArray1427[];
	public static int anIntArray1428[];
	public static int lineOffsets[];
	public static int loadedTextureCount;
	public static Class44_Sub3_Sub1_Sub3 textureImages[] = new Class44_Sub3_Sub1_Sub3[50];
	public static boolean transparent[] = new boolean[50];
	public static int averageTextureColor[] = new int[50];
	public static int texturePoolPointer;
	public static int textureArrayPool[][];
	public static int textureCache[][] = new int[50][];
	public static int textureLastUsed[] = new int[50];
	public static int getTextureCount;
	public static int HSL_TO_RGB[] = new int[0x10000];
	public static int texturePalettes[][] = new int[50][];

	public static void nullLoader(byte b) {
		try {
			anIntArray1425 = null;
			anIntArray1425 = null;
			anIntArray1427 = null;
			anIntArray1428 = null;
			lineOffsets = null;
			textureImages = null;
			transparent = null;
			if (b != 42) {
				for (int i = 1; i > 0; i++) {
				}
			}
			averageTextureColor = null;
			textureArrayPool = null;
			textureCache = null;
			textureLastUsed = null;
			HSL_TO_RGB = null;
			texturePalettes = null;
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("39311, " + b + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public static void setDefaultBounds(byte b) {
		try {
			lineOffsets = new int[DrawingArea.height];
			if (b == 3) {
				b = 0;
			} else {
				anInt1415 = 340;
			}
			for (int y = 0; y < DrawingArea.height; y++) {
				lineOffsets[y] = DrawingArea.width * y;
			}
			centerX = DrawingArea.width / 2;
			centerY = DrawingArea.height / 2;
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("80083, " + b + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public static void setBounds(int height, int width, int k) {
		try {
			if (k != anInt1414) {
				aBoolean1416 = !aBoolean1416;
			}
			lineOffsets = new int[height];
			for (int y = 0; y < height; y++) {
				lineOffsets[y] = width * y;
			}
			centerX = width / 2;
			centerY = height / 2;
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("87374, " + height + ", " + width + ", " + k + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public static void clearTextureCache(boolean flag) {
		try {
			textureArrayPool = null;
			if (flag) {
				return;
			}
			for (int i = 0; i < 50; i++) {
				textureCache[i] = null;
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("51784, " + flag + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public static void resetTextures(int i, int j) {
		try {
			if (i < 1 || i > 1) {
				anInt1415 = 245;
			}
			if (textureArrayPool == null) {
				texturePoolPointer = j;
				if (lowMemory) {
					textureArrayPool = new int[texturePoolPointer][16384];
				} else {
					textureArrayPool = new int[texturePoolPointer][0x10000];
				}
				for (int k = 0; k < 50; k++) {
					textureCache[k] = null;
				}
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("73856, " + i + ", " + j + ", " + runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	public static void unpackTextures(Class47 class47, boolean flag) {//Archive
		try {
			loadedTextureCount = 0;
			for (int i = 0; i < 50; i++) {
				try {
					textureImages[i] = new Class44_Sub3_Sub1_Sub3(class47, String.valueOf(i), 0);//new Background
					if (lowMemory && textureImages[i].libWidth == 128) {
						textureImages[i].method448(0);
					} else {
						textureImages[i].method449(9);
					}
					loadedTextureCount++;
				} catch (Exception _ex) {
				}
			}
			if (flag) {
				aBoolean1416 = !aBoolean1416;
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("81199, " + class47 + ", " + flag + ", " + runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	public static int getAverageTextureColor(int i, int textureId) {
		try {
			if (averageTextureColor[textureId] != 0) {
				return averageTextureColor[textureId];
			}
			int red = 0;
			int green = 0;
			int blue = 0;
			int colorCount = texturePalettes[textureId].length;
			for (int k1 = 0; k1 < colorCount; k1++) {
				red += texturePalettes[textureId][k1] >> 16 & 0xff;
				green += texturePalettes[textureId][k1] >> 8 & 0xff;
				blue += texturePalettes[textureId][k1] & 0xff;
			}
			int rgb = (red / colorCount << 16) + (green / colorCount << 8) + blue / colorCount;
			rgb = adjustBrightness(rgb, 1.3999999999999999D);
			if (i != 0) {
				aBoolean1417 = !aBoolean1417;
			}
			if (rgb == 0) {
				rgb = 1;
			}
			averageTextureColor[textureId] = rgb;
			return rgb;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("39848, " + i + ", " + textureId + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public static void resetTexture(int i, int textureId) {
		try {
			if (textureCache[textureId] == null) {
				return;
			}
			textureArrayPool[texturePoolPointer++] = textureCache[textureId];
			if (i < 9 || i > 9) {
				return;
			} else {
				textureCache[textureId] = null;
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("83909, " + i + ", " + textureId + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public static int[] getTexturePixels(int textureId) {
		textureLastUsed[textureId] = getTextureCount++;
		if (textureCache[textureId] != null) {
			return textureCache[textureId];
		}
		int textures[];
		if (texturePoolPointer > 0) {
			textures = textureArrayPool[--texturePoolPointer];
			textureArrayPool[texturePoolPointer] = null;
		} else {
			int lastUsed = 0;
			int target = -1;
			for (int l = 0; l < loadedTextureCount; l++) {
				if (textureCache[l] != null && (textureLastUsed[l] < lastUsed || target == -1)) {
					lastUsed = textureLastUsed[l];
					target = l;
				}
			}
			textures = textureCache[target];
			textureCache[target] = null;
		}
		textureCache[textureId] = textures;
		Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3 = textureImages[textureId];//Background
		int texturePalette[] = texturePalettes[textureId];
		if (lowMemory) {
			transparent[textureId] = false;
			for (int texturePointer = 0; texturePointer < 4096; texturePointer++) {
				int texture = textures[texturePointer] = texturePalette[class44_sub3_sub1_sub3.imagePixels[texturePointer]] & 0xf8f8ff;
				if (texture == 0) {
					transparent[textureId] = true;
				}
				textures[4096 + texturePointer] = texture - (texture >>> 3) & 0xf8f8ff;
				textures[8192 + texturePointer] = texture - (texture >>> 2) & 0xf8f8ff;
				textures[12288 + texturePointer] = texture - (texture >>> 2) - (texture >>> 3) & 0xf8f8ff;
			}
		} else {
			if (class44_sub3_sub1_sub3.imageWidth == 64) {
				for (int y = 0; y < 128; y++) {
					for (int x = 0; x < 128; x++) {
						textures[x + (y << 7)] = texturePalette[class44_sub3_sub1_sub3.imagePixels[(x >> 1) + ((y >> 1) << 6)]];
					}
				}
			} else {
				for (int texturePointer = 0; texturePointer < 16384; texturePointer++) {
					textures[texturePointer] = texturePalette[class44_sub3_sub1_sub3.imagePixels[texturePointer]];
				}
			}
			transparent[textureId] = false;
			for (int texturePointer = 0; texturePointer < 16384; texturePointer++) {
				textures[texturePointer] &= 0xf8f8ff;
				int texture = textures[texturePointer];
				if (texture == 0) {
					transparent[textureId] = true;
				}
				textures[16384 + texturePointer] = texture - (texture >>> 3) & 0xf8f8ff;
				textures[32768 + texturePointer] = texture - (texture >>> 2) & 0xf8f8ff;
				textures[49152 + texturePointer] = texture - (texture >>> 2) - (texture >>> 3) & 0xf8f8ff;
			}
		}
		return textures;
	}

	public static void calculatePalette(double brightness, int i) {
		try {
			brightness += Math.random() * 0.029999999999999999D - 0.014999999999999999D;
			int hsl = 0;
			if (i != 0) {
				for (int k = 1; k > 0; k++) {
				}
			}
			for (int l = 0; l < 512; l++) {
				double d1 = (double) (l / 8) / 64D + 0.0078125D;
				double d2 = (double) (l & 7) / 8D + 0.0625D;
				for (int l1 = 0; l1 < 128; l1++) {
					double d3 = (double) l1 / 128D;
					double d4 = d3;
					double d5 = d3;
					double d6 = d3;
					if (d2 != 0.0D) {
						double d7;
						if (d3 < 0.5D) {
							d7 = d3 * (1.0D + d2);
						} else {
							d7 = (d3 + d2) - d3 * d2;
						}
						double d8 = 2D * d3 - d7;
						double d9 = d1 + 0.33333333333333331D;
						if (d9 > 1.0D) {
							d9--;
						}
						double d10 = d1;
						double d11 = d1 - 0.33333333333333331D;
						if (d11 < 0.0D) {
							d11++;
						}
						if (6D * d9 < 1.0D) {
							d4 = d8 + (d7 - d8) * 6D * d9;
						} else if (2D * d9 < 1.0D) {
							d4 = d7;
						} else if (3D * d9 < 2D) {
							d4 = d8 + (d7 - d8) * (0.66666666666666663D - d9)
									* 6D;
						} else {
							d4 = d8;
						}
						if (6D * d10 < 1.0D) {
							d5 = d8 + (d7 - d8) * 6D * d10;
						} else if (2D * d10 < 1.0D) {
							d5 = d7;
						} else if (3D * d10 < 2D) {
							d5 = d8 + (d7 - d8) * (0.66666666666666663D - d10)
									* 6D;
						} else {
							d5 = d8;
						}
						if (6D * d11 < 1.0D) {
							d6 = d8 + (d7 - d8) * 6D * d11;
						} else if (2D * d11 < 1.0D) {
							d6 = d7;
						} else if (3D * d11 < 2D) {
							d6 = d8 + (d7 - d8) * (0.66666666666666663D - d11)
									* 6D;
						} else {
							d6 = d8;
						}
					}
					int byteR = (int) (d4 * 256D);
					int byteG = (int) (d5 * 256D);
					int byteB = (int) (d6 * 256D);
					int rgb = (byteR << 16) + (byteG << 8) + byteB;
					rgb = adjustBrightness(rgb, brightness);
					HSL_TO_RGB[hsl++] = rgb;
				}
			}
			for (int textureId = 0; textureId < 50; textureId++) {
				if (textureImages[textureId] != null) {
					int palette[] = textureImages[textureId].anIntArray1459;
					texturePalettes[textureId] = new int[palette.length];
					for (int color = 0; color < palette.length; color++) {
						texturePalettes[textureId][color] = adjustBrightness(palette[color], brightness);
						if ((texturePalettes[textureId][color] & 0xf8f8ff) == 0 && color != 0) {
							texturePalettes[textureId][color] = 1;
						}
					}
				}
			}
			for (int texture = 0; texture < 50; texture++) {
				resetTexture(9, texture);
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("64743, " + brightness + ", " + i + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public static int adjustBrightness(int rgb, double intensity) {
		double r = (double) (rgb >> 16) / 256D;
		double g = (double) (rgb >> 8 & 0xff) / 256D;
		double b = (double) (rgb & 0xff) / 256D;
		r = Math.pow(r, intensity);
		g = Math.pow(g, intensity);
		b = Math.pow(b, intensity);
		int byteR = (int) (r * 256D);
		int byteG = (int) (g * 256D);
		int byteB = (int) (b * 256D);
		return (byteR << 16) + (byteG << 8) + byteB;
	}

	public static void drawShadedTriangle(int yA, int yB, int yC, int xA, int xB, int xC, int zA, int zB, int zC) {
		int j2 = 0;
		int k2 = 0;
		if (yB != yA) {
			j2 = (xB - xA << 16) / (yB - yA);
			k2 = (zB - zA << 15) / (yB - yA);
		}
		int l2 = 0;
		int i3 = 0;
		if (yC != yB) {
			l2 = (xC - xB << 16) / (yC - yB);
			i3 = (zC - zB << 15) / (yC - yB);
		}
		int j3 = 0;
		int k3 = 0;
		if (yC != yA) {
			j3 = (xA - xC << 16) / (yA - yC);
			k3 = (zA - zC << 15) / (yA - yC);
		}
		if (yA <= yB && yA <= yC) {
			if (yA >= DrawingArea.bottomY) {
				return;
			}
			if (yB > DrawingArea.bottomY) {
				yB = DrawingArea.bottomY;
			}
			if (yC > DrawingArea.bottomY) {
				yC = DrawingArea.bottomY;
			}
			if (yB < yC) {
				xC = xA <<= 16;
				zC = zA <<= 15;
				if (yA < 0) {
					xC -= j3 * yA;
					xA -= j2 * yA;
					zC -= k3 * yA;
					zA -= k2 * yA;
					yA = 0;
				}
				xB <<= 16;
				zB <<= 15;
				if (yB < 0) {
					xB -= l2 * yB;
					zB -= i3 * yB;
					yB = 0;
				}
				if (yA != yB && j3 < j2 || yA == yB && j3 > l2) {
					yC -= yB;
					yB -= yA;
					for (yA = lineOffsets[yA]; --yB >= 0; yA += DrawingArea.width) {
						method430(DrawingArea.pixels, yA, 0, 0, xC >> 16, xA >> 16, zC >> 7, zA >> 7);
						xC += j3;
						xA += j2;
						zC += k3;
						zA += k2;
					}
					while (--yC >= 0) {
						method430(DrawingArea.pixels, yA, 0, 0, xC >> 16, xB >> 16, zC >> 7, zB >> 7);
						xC += j3;
						xB += l2;
						zC += k3;
						zB += i3;
						yA += DrawingArea.width;
					}
					return;
				}
				yC -= yB;
				yB -= yA;
				for (yA = lineOffsets[yA]; --yB >= 0; yA += DrawingArea.width) {
					method430(DrawingArea.pixels, yA, 0, 0, xA >> 16, xC >> 16, zA >> 7, zC >> 7);
					xC += j3;
					xA += j2;
					zC += k3;
					zA += k2;
				}
				while (--yC >= 0) {
					method430(DrawingArea.pixels, yA, 0, 0, xB >> 16, xC >> 16, zB >> 7, zC >> 7);
					xC += j3;
					xB += l2;
					zC += k3;
					zB += i3;
					yA += DrawingArea.width;
				}
				return;
			}
			xB = xA <<= 16;
			zB = zA <<= 15;
			if (yA < 0) {
				xB -= j3 * yA;
				xA -= j2 * yA;
				zB -= k3 * yA;
				zA -= k2 * yA;
				yA = 0;
			}
			xC <<= 16;
			zC <<= 15;
			if (yC < 0) {
				xC -= l2 * yC;
				zC -= i3 * yC;
				yC = 0;
			}
			if (yA != yC && j3 < j2 || yA == yC && l2 > j2) {
				yB -= yC;
				yC -= yA;
				for (yA = lineOffsets[yA]; --yC >= 0; yA += DrawingArea.width) {
					method430(DrawingArea.pixels, yA, 0, 0, xB >> 16, xA >> 16, zB >> 7, zA >> 7);
					xB += j3;
					xA += j2;
					zB += k3;
					zA += k2;
				}
				while (--yB >= 0) {
					method430(DrawingArea.pixels, yA, 0, 0, xC >> 16, xA >> 16, zC >> 7, zA >> 7);
					xC += l2;
					xA += j2;
					zC += i3;
					zA += k2;
					yA += DrawingArea.width;
				}
				return;
			}
			yB -= yC;
			yC -= yA;
			for (yA = lineOffsets[yA]; --yC >= 0; yA += DrawingArea.width) {
				method430(DrawingArea.pixels, yA, 0, 0, xA >> 16, xB >> 16, zA >> 7, zB >> 7);
				xB += j3;
				xA += j2;
				zB += k3;
				zA += k2;
			}
			while (--yB >= 0) {
				method430(DrawingArea.pixels, yA, 0, 0, xA >> 16, xC >> 16, zA >> 7, zC >> 7);
				xC += l2;
				xA += j2;
				zC += i3;
				zA += k2;
				yA += DrawingArea.width;
			}
			return;
		}
		if (yB <= yC) {
			if (yB >= DrawingArea.bottomY) {
				return;
			}
			if (yC > DrawingArea.bottomY) {
				yC = DrawingArea.bottomY;
			}
			if (yA > DrawingArea.bottomY) {
				yA = DrawingArea.bottomY;
			}
			if (yC < yA) {
				xA = xB <<= 16;
				zA = zB <<= 15;
				if (yB < 0) {
					xA -= j2 * yB;
					xB -= l2 * yB;
					zA -= k2 * yB;
					zB -= i3 * yB;
					yB = 0;
				}
				xC <<= 16;
				zC <<= 15;
				if (yC < 0) {
					xC -= j3 * yC;
					zC -= k3 * yC;
					yC = 0;
				}
				if (yB != yC && j2 < l2 || yB == yC && j2 > j3) {
					yA -= yC;
					yC -= yB;
					for (yB = lineOffsets[yB]; --yC >= 0; yB += DrawingArea.width) {
						method430(DrawingArea.pixels, yB, 0, 0, xA >> 16, xB >> 16, zA >> 7, zB >> 7);
						xA += j2;
						xB += l2;
						zA += k2;
						zB += i3;
					}
					while (--yA >= 0) {
						method430(DrawingArea.pixels, yB, 0, 0, xA >> 16, xC >> 16, zA >> 7, zC >> 7);
						xA += j2;
						xC += j3;
						zA += k2;
						zC += k3;
						yB += DrawingArea.width;
					}
					return;
				}
				yA -= yC;
				yC -= yB;
				for (yB = lineOffsets[yB]; --yC >= 0; yB += DrawingArea.width) {
					method430(DrawingArea.pixels, yB, 0, 0, xB >> 16, xA >> 16, zB >> 7, zA >> 7);
					xA += j2;
					xB += l2;
					zA += k2;
					zB += i3;
				}
				while (--yA >= 0) {
					method430(DrawingArea.pixels, yB, 0, 0, xC >> 16, xA >> 16, zC >> 7, zA >> 7);
					xA += j2;
					xC += j3;
					zA += k2;
					zC += k3;
					yB += DrawingArea.width;
				}
				return;
			}
			xC = xB <<= 16;
			zC = zB <<= 15;
			if (yB < 0) {
				xC -= j2 * yB;
				xB -= l2 * yB;
				zC -= k2 * yB;
				zB -= i3 * yB;
				yB = 0;
			}
			xA <<= 16;
			zA <<= 15;
			if (yA < 0) {
				xA -= j3 * yA;
				zA -= k3 * yA;
				yA = 0;
			}
			if (j2 < l2) {
				yC -= yA;
				yA -= yB;
				for (yB = lineOffsets[yB]; --yA >= 0; yB += DrawingArea.width) {
					method430(DrawingArea.pixels, yB, 0, 0, xC >> 16, xB >> 16, zC >> 7, zB >> 7);
					xC += j2;
					xB += l2;
					zC += k2;
					zB += i3;
				}
				while (--yC >= 0) {
					method430(DrawingArea.pixels, yB, 0, 0, xA >> 16, xB >> 16, zA >> 7, zB >> 7);
					xA += j3;
					xB += l2;
					zA += k3;
					zB += i3;
					yB += DrawingArea.width;
				}
				return;
			}
			yC -= yA;
			yA -= yB;
			for (yB = lineOffsets[yB]; --yA >= 0; yB += DrawingArea.width) {
				method430(DrawingArea.pixels, yB, 0, 0, xB >> 16, xC >> 16, zB >> 7, zC >> 7);
				xC += j2;
				xB += l2;
				zC += k2;
				zB += i3;
			}
			while (--yC >= 0) {
				method430(DrawingArea.pixels, yB, 0, 0, xB >> 16, xA >> 16, zB >> 7, zA >> 7);
				xA += j3;
				xB += l2;
				zA += k3;
				zB += i3;
				yB += DrawingArea.width;
			}
			return;
		}
		if (yC >= DrawingArea.bottomY) {
			return;
		}
		if (yA > DrawingArea.bottomY) {
			yA = DrawingArea.bottomY;
		}
		if (yB > DrawingArea.bottomY) {
			yB = DrawingArea.bottomY;
		}
		if (yA < yB) {
			xB = xC <<= 16;
			zB = zC <<= 15;
			if (yC < 0) {
				xB -= l2 * yC;
				xC -= j3 * yC;
				zB -= i3 * yC;
				zC -= k3 * yC;
				yC = 0;
			}
			xA <<= 16;
			zA <<= 15;
			if (yA < 0) {
				xA -= j2 * yA;
				zA -= k2 * yA;
				yA = 0;
			}
			if (l2 < j3) {
				yB -= yA;
				yA -= yC;
				for (yC = lineOffsets[yC]; --yA >= 0; yC += DrawingArea.width) {
					method430(DrawingArea.pixels, yC, 0, 0, xB >> 16, xC >> 16, zB >> 7, zC >> 7);
					xB += l2;
					xC += j3;
					zB += i3;
					zC += k3;
				}
				while (--yB >= 0) {
					method430(DrawingArea.pixels, yC, 0, 0, xB >> 16, xA >> 16, zB >> 7, zA >> 7);
					xB += l2;
					xA += j2;
					zB += i3;
					zA += k2;
					yC += DrawingArea.width;
				}
				return;
			}
			yB -= yA;
			yA -= yC;
			for (yC = lineOffsets[yC]; --yA >= 0; yC += DrawingArea.width) {
				method430(DrawingArea.pixels, yC, 0, 0, xC >> 16, xB >> 16, zC >> 7, zB >> 7);
				xB += l2;
				xC += j3;
				zB += i3;
				zC += k3;
			}
			while (--yB >= 0) {
				method430(DrawingArea.pixels, yC, 0, 0, xA >> 16, xB >> 16, zA >> 7, zB >> 7);
				xB += l2;
				xA += j2;
				zB += i3;
				zA += k2;
				yC += DrawingArea.width;
			}
			return;
		}
		xA = xC <<= 16;
		zA = zC <<= 15;
		if (yC < 0) {
			xA -= l2 * yC;
			xC -= j3 * yC;
			zA -= i3 * yC;
			zC -= k3 * yC;
			yC = 0;
		}
		xB <<= 16;
		zB <<= 15;
		if (yB < 0) {
			xB -= j2 * yB;
			zB -= k2 * yB;
			yB = 0;
		}
		if (l2 < j3) {
			yA -= yB;
			yB -= yC;
			for (yC = lineOffsets[yC]; --yB >= 0; yC += DrawingArea.width) {
				method430(DrawingArea.pixels, yC, 0, 0, xA >> 16, xC >> 16, zA >> 7, zC >> 7);
				xA += l2;
				xC += j3;
				zA += i3;
				zC += k3;
			}
			while (--yA >= 0) {
				method430(DrawingArea.pixels, yC, 0, 0, xB >> 16, xC >> 16, zB >> 7, zC >> 7);
				xB += j2;
				xC += j3;
				zB += k2;
				zC += k3;
				yC += DrawingArea.width;
			}
			return;
		}
		yA -= yB;
		yB -= yC;
		for (yC = lineOffsets[yC]; --yB >= 0; yC += DrawingArea.width) {
			method430(DrawingArea.pixels, yC, 0, 0, xC >> 16, xA >> 16, zC >> 7, zA >> 7);
			xA += l2;
			xC += j3;
			zA += i3;
			zC += k3;
		}
		while (--yA >= 0) {
			method430(DrawingArea.pixels, yC, 0, 0, xC >> 16, xB >> 16, zC >> 7, zB >> 7);
			xB += j2;
			xC += j3;
			zB += k2;
			zC += k3;
			yC += DrawingArea.width;
		}
	}

	public static void method430(int ai[], int i, int j, int k, int l, int i1, int j1, int k1) {
		if (textured) {
			int l1;
			if (restrictEdges) {
				if (i1 - l > 3) {
					l1 = (k1 - j1) / (i1 - l);
				} else {
					l1 = 0;
				}
				if (i1 > DrawingArea.centerX) {
					i1 = DrawingArea.centerX;
				}
				if (l < 0) {
					j1 -= l * l1;
					l = 0;
				}
				if (l >= i1) {
					return;
				}
				i += l;
				k = i1 - l >> 2;
				l1 <<= 2;
			} else {
				if (l >= i1) {
					return;
				}
				i += l;
				k = i1 - l >> 2;
				if (k > 0) {
					l1 = (k1 - j1) * anIntArray1425[k] >> 15;
				} else {
					l1 = 0;
				}
			}
			if (alpha == 0) {
				while (--k >= 0) {
					j = HSL_TO_RGB[j1 >> 8];
					j1 += l1;
					ai[i++] = j;
					ai[i++] = j;
					ai[i++] = j;
					ai[i++] = j;
				}
				k = i1 - l & 3;
				if (k > 0) {
					j = HSL_TO_RGB[j1 >> 8];
					do {
						ai[i++] = j;
					} while (--k > 0);
					return;
				}
			} else {
				int j2 = alpha;
				int l2 = 256 - alpha;
				while (--k >= 0) {
					j = HSL_TO_RGB[j1 >> 8];
					j1 += l1;
					j = ((j & 0xff00ff) * l2 >> 8 & 0xff00ff) + ((j & 0xff00) * l2 >> 8 & 0xff00);
					ai[i++] = j + ((ai[i] & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j2 >> 8 & 0xff00);
					ai[i++] = j + ((ai[i] & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j2 >> 8 & 0xff00);
					ai[i++] = j + ((ai[i] & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j2 >> 8 & 0xff00);
					ai[i++] = j + ((ai[i] & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j2 >> 8 & 0xff00);
				}
				k = i1 - l & 3;
				if (k > 0) {
					j = HSL_TO_RGB[j1 >> 8];
					j = ((j & 0xff00ff) * l2 >> 8 & 0xff00ff) + ((j & 0xff00) * l2 >> 8 & 0xff00);
					do {
						ai[i++] = j + ((ai[i] & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j2 >> 8 & 0xff00);
					} while (--k > 0);
				}
			}
			return;
		}
		if (l >= i1) {
			return;
		}
		int i2 = (k1 - j1) / (i1 - l);
		if (restrictEdges) {
			if (i1 > DrawingArea.centerX) {
				i1 = DrawingArea.centerX;
			}
			if (l < 0) {
				j1 -= l * i2;
				l = 0;
			}
			if (l >= i1) {
				return;
			}
		}
		i += l;
		k = i1 - l;
		if (alpha == 0) {
			do {
				ai[i++] = HSL_TO_RGB[j1 >> 8];
				j1 += i2;
			} while (--k > 0);
			return;
		}
		int k2 = alpha;
		int i3 = 256 - alpha;
		do {
			j = HSL_TO_RGB[j1 >> 8];
			j1 += i2;
			j = ((j & 0xff00ff) * i3 >> 8 & 0xff00ff) + ((j & 0xff00) * i3 >> 8 & 0xff00);
			ai[i++] = j + ((ai[i] & 0xff00ff) * k2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * k2 >> 8 & 0xff00);
		} while (--k > 0);
	}

	public static void method431(int i, int j, int k, int l, int i1, int j1, int k1) {
		int l1 = 0;
		if (j != i) {
			l1 = (i1 - l << 16) / (j - i);
		}
		int i2 = 0;
		if (k != j) {
			i2 = (j1 - i1 << 16) / (k - j);
		}
		int j2 = 0;
		if (k != i) {
			j2 = (l - j1 << 16) / (i - k);
		}
		if (i <= j && i <= k) {
			if (i >= DrawingArea.bottomY) {
				return;
			}
			if (j > DrawingArea.bottomY) {
				j = DrawingArea.bottomY;
			}
			if (k > DrawingArea.bottomY) {
				k = DrawingArea.bottomY;
			}
			if (j < k) {
				j1 = l <<= 16;
				if (i < 0) {
					j1 -= j2 * i;
					l -= l1 * i;
					i = 0;
				}
				i1 <<= 16;
				if (j < 0) {
					i1 -= i2 * j;
					j = 0;
				}
				if (i != j && j2 < l1 || i == j && j2 > i2) {
					k -= j;
					j -= i;
					for (i = lineOffsets[i]; --j >= 0; i += DrawingArea.width) {
						method432(DrawingArea.pixels, i, k1, 0, j1 >> 16,
								l >> 16);
						j1 += j2;
						l += l1;
					}
					while (--k >= 0) {
						method432(DrawingArea.pixels, i, k1, 0, j1 >> 16,
								i1 >> 16);
						j1 += j2;
						i1 += i2;
						i += DrawingArea.width;
					}
					return;
				}
				k -= j;
				j -= i;
				for (i = lineOffsets[i]; --j >= 0; i += DrawingArea.width) {
					method432(DrawingArea.pixels, i, k1, 0, l >> 16, j1 >> 16);
					j1 += j2;
					l += l1;
				}
				while (--k >= 0) {
					method432(DrawingArea.pixels, i, k1, 0, i1 >> 16, j1 >> 16);
					j1 += j2;
					i1 += i2;
					i += DrawingArea.width;
				}
				return;
			}
			i1 = l <<= 16;
			if (i < 0) {
				i1 -= j2 * i;
				l -= l1 * i;
				i = 0;
			}
			j1 <<= 16;
			if (k < 0) {
				j1 -= i2 * k;
				k = 0;
			}
			if (i != k && j2 < l1 || i == k && i2 > l1) {
				j -= k;
				k -= i;
				for (i = lineOffsets[i]; --k >= 0; i += DrawingArea.width) {
					method432(DrawingArea.pixels, i, k1, 0, i1 >> 16, l >> 16);
					i1 += j2;
					l += l1;
				}
				while (--j >= 0) {
					method432(DrawingArea.pixels, i, k1, 0, j1 >> 16, l >> 16);
					j1 += i2;
					l += l1;
					i += DrawingArea.width;
				}
				return;
			}
			j -= k;
			k -= i;
			for (i = lineOffsets[i]; --k >= 0; i += DrawingArea.width) {
				method432(DrawingArea.pixels, i, k1, 0, l >> 16, i1 >> 16);
				i1 += j2;
				l += l1;
			}
			while (--j >= 0) {
				method432(DrawingArea.pixels, i, k1, 0, l >> 16, j1 >> 16);
				j1 += i2;
				l += l1;
				i += DrawingArea.width;
			}
			return;
		}
		if (j <= k) {
			if (j >= DrawingArea.bottomY) {
				return;
			}
			if (k > DrawingArea.bottomY) {
				k = DrawingArea.bottomY;
			}
			if (i > DrawingArea.bottomY) {
				i = DrawingArea.bottomY;
			}
			if (k < i) {
				l = i1 <<= 16;
				if (j < 0) {
					l -= l1 * j;
					i1 -= i2 * j;
					j = 0;
				}
				j1 <<= 16;
				if (k < 0) {
					j1 -= j2 * k;
					k = 0;
				}
				if (j != k && l1 < i2 || j == k && l1 > j2) {
					i -= k;
					k -= j;
					for (j = lineOffsets[j]; --k >= 0; j += DrawingArea.width) {
						method432(DrawingArea.pixels, j, k1, 0, l >> 16,
								i1 >> 16);
						l += l1;
						i1 += i2;
					}
					while (--i >= 0) {
						method432(DrawingArea.pixels, j, k1, 0, l >> 16,
								j1 >> 16);
						l += l1;
						j1 += j2;
						j += DrawingArea.width;
					}
					return;
				}
				i -= k;
				k -= j;
				for (j = lineOffsets[j]; --k >= 0; j += DrawingArea.width) {
					method432(DrawingArea.pixels, j, k1, 0, i1 >> 16, l >> 16);
					l += l1;
					i1 += i2;
				}
				while (--i >= 0) {
					method432(DrawingArea.pixels, j, k1, 0, j1 >> 16, l >> 16);
					l += l1;
					j1 += j2;
					j += DrawingArea.width;
				}
				return;
			}
			j1 = i1 <<= 16;
			if (j < 0) {
				j1 -= l1 * j;
				i1 -= i2 * j;
				j = 0;
			}
			l <<= 16;
			if (i < 0) {
				l -= j2 * i;
				i = 0;
			}
			if (l1 < i2) {
				k -= i;
				i -= j;
				for (j = lineOffsets[j]; --i >= 0; j += DrawingArea.width) {
					method432(DrawingArea.pixels, j, k1, 0, j1 >> 16, i1 >> 16);
					j1 += l1;
					i1 += i2;
				}
				while (--k >= 0) {
					method432(DrawingArea.pixels, j, k1, 0, l >> 16, i1 >> 16);
					l += j2;
					i1 += i2;
					j += DrawingArea.width;
				}
				return;
			}
			k -= i;
			i -= j;
			for (j = lineOffsets[j]; --i >= 0; j += DrawingArea.width) {
				method432(DrawingArea.pixels, j, k1, 0, i1 >> 16, j1 >> 16);
				j1 += l1;
				i1 += i2;
			}
			while (--k >= 0) {
				method432(DrawingArea.pixels, j, k1, 0, i1 >> 16, l >> 16);
				l += j2;
				i1 += i2;
				j += DrawingArea.width;
			}
			return;
		}
		if (k >= DrawingArea.bottomY) {
			return;
		}
		if (i > DrawingArea.bottomY) {
			i = DrawingArea.bottomY;
		}
		if (j > DrawingArea.bottomY) {
			j = DrawingArea.bottomY;
		}
		if (i < j) {
			i1 = j1 <<= 16;
			if (k < 0) {
				i1 -= i2 * k;
				j1 -= j2 * k;
				k = 0;
			}
			l <<= 16;
			if (i < 0) {
				l -= l1 * i;
				i = 0;
			}
			if (i2 < j2) {
				j -= i;
				i -= k;
				for (k = lineOffsets[k]; --i >= 0; k += DrawingArea.width) {
					method432(DrawingArea.pixels, k, k1, 0, i1 >> 16, j1 >> 16);
					i1 += i2;
					j1 += j2;
				}
				while (--j >= 0) {
					method432(DrawingArea.pixels, k, k1, 0, i1 >> 16, l >> 16);
					i1 += i2;
					l += l1;
					k += DrawingArea.width;
				}
				return;
			}
			j -= i;
			i -= k;
			for (k = lineOffsets[k]; --i >= 0; k += DrawingArea.width) {
				method432(DrawingArea.pixels, k, k1, 0, j1 >> 16, i1 >> 16);
				i1 += i2;
				j1 += j2;
			}
			while (--j >= 0) {
				method432(DrawingArea.pixels, k, k1, 0, l >> 16, i1 >> 16);
				i1 += i2;
				l += l1;
				k += DrawingArea.width;
			}
			return;
		}
		l = j1 <<= 16;
		if (k < 0) {
			l -= i2 * k;
			j1 -= j2 * k;
			k = 0;
		}
		i1 <<= 16;
		if (j < 0) {
			i1 -= l1 * j;
			j = 0;
		}
		if (i2 < j2) {
			i -= j;
			j -= k;
			for (k = lineOffsets[k]; --j >= 0; k += DrawingArea.width) {
				method432(DrawingArea.pixels, k, k1, 0, l >> 16, j1 >> 16);
				l += i2;
				j1 += j2;
			}
			while (--i >= 0) {
				method432(DrawingArea.pixels, k, k1, 0, i1 >> 16, j1 >> 16);
				i1 += l1;
				j1 += j2;
				k += DrawingArea.width;
			}
			return;
		}
		i -= j;
		j -= k;
		for (k = lineOffsets[k]; --j >= 0; k += DrawingArea.width) {
			method432(DrawingArea.pixels, k, k1, 0, j1 >> 16, l >> 16);
			l += i2;
			j1 += j2;
		}
		while (--i >= 0) {
			method432(DrawingArea.pixels, k, k1, 0, j1 >> 16, i1 >> 16);
			i1 += l1;
			j1 += j2;
			k += DrawingArea.width;
		}
	}

	public static void method432(int ai[], int i, int j, int k, int l, int i1) {
		if (restrictEdges) {
			if (i1 > DrawingArea.centerX) {
				i1 = DrawingArea.centerX;
			}
			if (l < 0) {
				l = 0;
			}
		}
		if (l >= i1) {
			return;
		}
		i += l;
		k = i1 - l >> 2;
		if (alpha == 0) {
			while (--k >= 0) {
				ai[i++] = j;
				ai[i++] = j;
				ai[i++] = j;
				ai[i++] = j;
			}
			for (k = i1 - l & 3; --k >= 0;) {
				ai[i++] = j;
			}
			return;
		}
		int j1 = alpha;
		int k1 = 256 - alpha;
		j = ((j & 0xff00ff) * k1 >> 8 & 0xff00ff)
				+ ((j & 0xff00) * k1 >> 8 & 0xff00);
		while (--k >= 0) {
			ai[i++] = j + ((ai[i] & 0xff00ff) * j1 >> 8 & 0xff00ff)
					+ ((ai[i] & 0xff00) * j1 >> 8 & 0xff00);
			ai[i++] = j + ((ai[i] & 0xff00ff) * j1 >> 8 & 0xff00ff)
					+ ((ai[i] & 0xff00) * j1 >> 8 & 0xff00);
			ai[i++] = j + ((ai[i] & 0xff00ff) * j1 >> 8 & 0xff00ff)
					+ ((ai[i] & 0xff00) * j1 >> 8 & 0xff00);
			ai[i++] = j + ((ai[i] & 0xff00ff) * j1 >> 8 & 0xff00ff)
					+ ((ai[i] & 0xff00) * j1 >> 8 & 0xff00);
		}
		for (k = i1 - l & 3; --k >= 0;) {
			ai[i++] = j + ((ai[i] & 0xff00ff) * j1 >> 8 & 0xff00ff)
					+ ((ai[i] & 0xff00) * j1 >> 8 & 0xff00);
		}
	}

	public static void method433(int i, int j, int k, int l, int i1, int j1,
			int k1, int l1, int i2, int j2, int k2, int l2, int i3, int j3,
			int k3, int l3, int i4, int j4, int k4) {
		int ai[] = getTexturePixels(k4);
		aBoolean1420 = !transparent[k4];
		k2 = j2 - k2;
		j3 = i3 - j3;
		i4 = l3 - i4;
		l2 -= j2;
		k3 -= i3;
		j4 -= l3;
		int l4 = l2 * i3 - k3 * j2 << 14;
		int i5 = k3 * l3 - j4 * i3 << 8;
		int j5 = j4 * j2 - l2 * l3 << 5;
		int k5 = k2 * i3 - j3 * j2 << 14;
		int l5 = j3 * l3 - i4 * i3 << 8;
		int i6 = i4 * j2 - k2 * l3 << 5;
		int j6 = j3 * l2 - k2 * k3 << 14;
		int k6 = i4 * k3 - j3 * j4 << 8;
		int l6 = k2 * j4 - i4 * l2 << 5;
		int i7 = 0;
		int j7 = 0;
		if (j != i) {
			i7 = (i1 - l << 16) / (j - i);
			j7 = (l1 - k1 << 16) / (j - i);
		}
		int k7 = 0;
		int l7 = 0;
		if (k != j) {
			k7 = (j1 - i1 << 16) / (k - j);
			l7 = (i2 - l1 << 16) / (k - j);
		}
		int i8 = 0;
		int j8 = 0;
		if (k != i) {
			i8 = (l - j1 << 16) / (i - k);
			j8 = (k1 - i2 << 16) / (i - k);
		}
		if (i <= j && i <= k) {
			if (i >= DrawingArea.bottomY) {
				return;
			}
			if (j > DrawingArea.bottomY) {
				j = DrawingArea.bottomY;
			}
			if (k > DrawingArea.bottomY) {
				k = DrawingArea.bottomY;
			}
			if (j < k) {
				j1 = l <<= 16;
				i2 = k1 <<= 16;
				if (i < 0) {
					j1 -= i8 * i;
					l -= i7 * i;
					i2 -= j8 * i;
					k1 -= j7 * i;
					i = 0;
				}
				i1 <<= 16;
				l1 <<= 16;
				if (j < 0) {
					i1 -= k7 * j;
					l1 -= l7 * j;
					j = 0;
				}
				int k8 = i - centerY;
				l4 += j5 * k8;
				k5 += i6 * k8;
				j6 += l6 * k8;
				if (i != j && i8 < i7 || i == j && i8 > k7) {
					k -= j;
					j -= i;
					i = lineOffsets[i];
					while (--j >= 0) {
						method434(DrawingArea.pixels, ai, 0, 0, i, j1 >> 16,
								l >> 16, i2 >> 8, k1 >> 8, l4, k5, j6, i5, l5,
								k6);
						j1 += i8;
						l += i7;
						i2 += j8;
						k1 += j7;
						i += DrawingArea.width;
						l4 += j5;
						k5 += i6;
						j6 += l6;
					}
					while (--k >= 0) {
						method434(DrawingArea.pixels, ai, 0, 0, i, j1 >> 16,
								i1 >> 16, i2 >> 8, l1 >> 8, l4, k5, j6, i5, l5,
								k6);
						j1 += i8;
						i1 += k7;
						i2 += j8;
						l1 += l7;
						i += DrawingArea.width;
						l4 += j5;
						k5 += i6;
						j6 += l6;
					}
					return;
				}
				k -= j;
				j -= i;
				i = lineOffsets[i];
				while (--j >= 0) {
					method434(DrawingArea.pixels, ai, 0, 0, i, l >> 16,
							j1 >> 16, k1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
					j1 += i8;
					l += i7;
					i2 += j8;
					k1 += j7;
					i += DrawingArea.width;
					l4 += j5;
					k5 += i6;
					j6 += l6;
				}
				while (--k >= 0) {
					method434(DrawingArea.pixels, ai, 0, 0, i, i1 >> 16,
							j1 >> 16, l1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
					j1 += i8;
					i1 += k7;
					i2 += j8;
					l1 += l7;
					i += DrawingArea.width;
					l4 += j5;
					k5 += i6;
					j6 += l6;
				}
				return;
			}
			i1 = l <<= 16;
			l1 = k1 <<= 16;
			if (i < 0) {
				i1 -= i8 * i;
				l -= i7 * i;
				l1 -= j8 * i;
				k1 -= j7 * i;
				i = 0;
			}
			j1 <<= 16;
			i2 <<= 16;
			if (k < 0) {
				j1 -= k7 * k;
				i2 -= l7 * k;
				k = 0;
			}
			int l8 = i - centerY;
			l4 += j5 * l8;
			k5 += i6 * l8;
			j6 += l6 * l8;
			if (i != k && i8 < i7 || i == k && k7 > i7) {
				j -= k;
				k -= i;
				i = lineOffsets[i];
				while (--k >= 0) {
					method434(DrawingArea.pixels, ai, 0, 0, i, i1 >> 16,
							l >> 16, l1 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
					i1 += i8;
					l += i7;
					l1 += j8;
					k1 += j7;
					i += DrawingArea.width;
					l4 += j5;
					k5 += i6;
					j6 += l6;
				}
				while (--j >= 0) {
					method434(DrawingArea.pixels, ai, 0, 0, i, j1 >> 16,
							l >> 16, i2 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
					j1 += k7;
					l += i7;
					i2 += l7;
					k1 += j7;
					i += DrawingArea.width;
					l4 += j5;
					k5 += i6;
					j6 += l6;
				}
				return;
			}
			j -= k;
			k -= i;
			i = lineOffsets[i];
			while (--k >= 0) {
				method434(DrawingArea.pixels, ai, 0, 0, i, l >> 16, i1 >> 16,
						k1 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
				i1 += i8;
				l += i7;
				l1 += j8;
				k1 += j7;
				i += DrawingArea.width;
				l4 += j5;
				k5 += i6;
				j6 += l6;
			}
			while (--j >= 0) {
				method434(DrawingArea.pixels, ai, 0, 0, i, l >> 16, j1 >> 16,
						k1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
				j1 += k7;
				l += i7;
				i2 += l7;
				k1 += j7;
				i += DrawingArea.width;
				l4 += j5;
				k5 += i6;
				j6 += l6;
			}
			return;
		}
		if (j <= k) {
			if (j >= DrawingArea.bottomY) {
				return;
			}
			if (k > DrawingArea.bottomY) {
				k = DrawingArea.bottomY;
			}
			if (i > DrawingArea.bottomY) {
				i = DrawingArea.bottomY;
			}
			if (k < i) {
				l = i1 <<= 16;
				k1 = l1 <<= 16;
				if (j < 0) {
					l -= i7 * j;
					i1 -= k7 * j;
					k1 -= j7 * j;
					l1 -= l7 * j;
					j = 0;
				}
				j1 <<= 16;
				i2 <<= 16;
				if (k < 0) {
					j1 -= i8 * k;
					i2 -= j8 * k;
					k = 0;
				}
				int i9 = j - centerY;
				l4 += j5 * i9;
				k5 += i6 * i9;
				j6 += l6 * i9;
				if (j != k && i7 < k7 || j == k && i7 > i8) {
					i -= k;
					k -= j;
					j = lineOffsets[j];
					while (--k >= 0) {
						method434(DrawingArea.pixels, ai, 0, 0, j, l >> 16,
								i1 >> 16, k1 >> 8, l1 >> 8, l4, k5, j6, i5, l5,
								k6);
						l += i7;
						i1 += k7;
						k1 += j7;
						l1 += l7;
						j += DrawingArea.width;
						l4 += j5;
						k5 += i6;
						j6 += l6;
					}
					while (--i >= 0) {
						method434(DrawingArea.pixels, ai, 0, 0, j, l >> 16,
								j1 >> 16, k1 >> 8, i2 >> 8, l4, k5, j6, i5, l5,
								k6);
						l += i7;
						j1 += i8;
						k1 += j7;
						i2 += j8;
						j += DrawingArea.width;
						l4 += j5;
						k5 += i6;
						j6 += l6;
					}
					return;
				}
				i -= k;
				k -= j;
				j = lineOffsets[j];
				while (--k >= 0) {
					method434(DrawingArea.pixels, ai, 0, 0, j, i1 >> 16,
							l >> 16, l1 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
					l += i7;
					i1 += k7;
					k1 += j7;
					l1 += l7;
					j += DrawingArea.width;
					l4 += j5;
					k5 += i6;
					j6 += l6;
				}
				while (--i >= 0) {
					method434(DrawingArea.pixels, ai, 0, 0, j, j1 >> 16,
							l >> 16, i2 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
					l += i7;
					j1 += i8;
					k1 += j7;
					i2 += j8;
					j += DrawingArea.width;
					l4 += j5;
					k5 += i6;
					j6 += l6;
				}
				return;
			}
			j1 = i1 <<= 16;
			i2 = l1 <<= 16;
			if (j < 0) {
				j1 -= i7 * j;
				i1 -= k7 * j;
				i2 -= j7 * j;
				l1 -= l7 * j;
				j = 0;
			}
			l <<= 16;
			k1 <<= 16;
			if (i < 0) {
				l -= i8 * i;
				k1 -= j8 * i;
				i = 0;
			}
			int j9 = j - centerY;
			l4 += j5 * j9;
			k5 += i6 * j9;
			j6 += l6 * j9;
			if (i7 < k7) {
				k -= i;
				i -= j;
				j = lineOffsets[j];
				while (--i >= 0) {
					method434(DrawingArea.pixels, ai, 0, 0, j, j1 >> 16,
							i1 >> 16, i2 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
					j1 += i7;
					i1 += k7;
					i2 += j7;
					l1 += l7;
					j += DrawingArea.width;
					l4 += j5;
					k5 += i6;
					j6 += l6;
				}
				while (--k >= 0) {
					method434(DrawingArea.pixels, ai, 0, 0, j, l >> 16,
							i1 >> 16, k1 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
					l += i8;
					i1 += k7;
					k1 += j8;
					l1 += l7;
					j += DrawingArea.width;
					l4 += j5;
					k5 += i6;
					j6 += l6;
				}
				return;
			}
			k -= i;
			i -= j;
			j = lineOffsets[j];
			while (--i >= 0) {
				method434(DrawingArea.pixels, ai, 0, 0, j, i1 >> 16, j1 >> 16,
						l1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
				j1 += i7;
				i1 += k7;
				i2 += j7;
				l1 += l7;
				j += DrawingArea.width;
				l4 += j5;
				k5 += i6;
				j6 += l6;
			}
			while (--k >= 0) {
				method434(DrawingArea.pixels, ai, 0, 0, j, i1 >> 16, l >> 16,
						l1 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
				l += i8;
				i1 += k7;
				k1 += j8;
				l1 += l7;
				j += DrawingArea.width;
				l4 += j5;
				k5 += i6;
				j6 += l6;
			}
			return;
		}
		if (k >= DrawingArea.bottomY) {
			return;
		}
		if (i > DrawingArea.bottomY) {
			i = DrawingArea.bottomY;
		}
		if (j > DrawingArea.bottomY) {
			j = DrawingArea.bottomY;
		}
		if (i < j) {
			i1 = j1 <<= 16;
			l1 = i2 <<= 16;
			if (k < 0) {
				i1 -= k7 * k;
				j1 -= i8 * k;
				l1 -= l7 * k;
				i2 -= j8 * k;
				k = 0;
			}
			l <<= 16;
			k1 <<= 16;
			if (i < 0) {
				l -= i7 * i;
				k1 -= j7 * i;
				i = 0;
			}
			int k9 = k - centerY;
			l4 += j5 * k9;
			k5 += i6 * k9;
			j6 += l6 * k9;
			if (k7 < i8) {
				j -= i;
				i -= k;
				k = lineOffsets[k];
				while (--i >= 0) {
					method434(DrawingArea.pixels, ai, 0, 0, k, i1 >> 16,
							j1 >> 16, l1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
					i1 += k7;
					j1 += i8;
					l1 += l7;
					i2 += j8;
					k += DrawingArea.width;
					l4 += j5;
					k5 += i6;
					j6 += l6;
				}
				while (--j >= 0) {
					method434(DrawingArea.pixels, ai, 0, 0, k, i1 >> 16,
							l >> 16, l1 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
					i1 += k7;
					l += i7;
					l1 += l7;
					k1 += j7;
					k += DrawingArea.width;
					l4 += j5;
					k5 += i6;
					j6 += l6;
				}
				return;
			}
			j -= i;
			i -= k;
			k = lineOffsets[k];
			while (--i >= 0) {
				method434(DrawingArea.pixels, ai, 0, 0, k, j1 >> 16, i1 >> 16,
						i2 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
				i1 += k7;
				j1 += i8;
				l1 += l7;
				i2 += j8;
				k += DrawingArea.width;
				l4 += j5;
				k5 += i6;
				j6 += l6;
			}
			while (--j >= 0) {
				method434(DrawingArea.pixels, ai, 0, 0, k, l >> 16, i1 >> 16,
						k1 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
				i1 += k7;
				l += i7;
				l1 += l7;
				k1 += j7;
				k += DrawingArea.width;
				l4 += j5;
				k5 += i6;
				j6 += l6;
			}
			return;
		}
		l = j1 <<= 16;
		k1 = i2 <<= 16;
		if (k < 0) {
			l -= k7 * k;
			j1 -= i8 * k;
			k1 -= l7 * k;
			i2 -= j8 * k;
			k = 0;
		}
		i1 <<= 16;
		l1 <<= 16;
		if (j < 0) {
			i1 -= i7 * j;
			l1 -= j7 * j;
			j = 0;
		}
		int l9 = k - centerY;
		l4 += j5 * l9;
		k5 += i6 * l9;
		j6 += l6 * l9;
		if (k7 < i8) {
			i -= j;
			j -= k;
			k = lineOffsets[k];
			while (--j >= 0) {
				method434(DrawingArea.pixels, ai, 0, 0, k, l >> 16, j1 >> 16,
						k1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
				l += k7;
				j1 += i8;
				k1 += l7;
				i2 += j8;
				k += DrawingArea.width;
				l4 += j5;
				k5 += i6;
				j6 += l6;
			}
			while (--i >= 0) {
				method434(DrawingArea.pixels, ai, 0, 0, k, i1 >> 16, j1 >> 16,
						l1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
				i1 += i7;
				j1 += i8;
				l1 += j7;
				i2 += j8;
				k += DrawingArea.width;
				l4 += j5;
				k5 += i6;
				j6 += l6;
			}
			return;
		}
		i -= j;
		j -= k;
		k = lineOffsets[k];
		while (--j >= 0) {
			method434(DrawingArea.pixels, ai, 0, 0, k, j1 >> 16, l >> 16,
					i2 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
			l += k7;
			j1 += i8;
			k1 += l7;
			i2 += j8;
			k += DrawingArea.width;
			l4 += j5;
			k5 += i6;
			j6 += l6;
		}
		while (--i >= 0) {
			method434(DrawingArea.pixels, ai, 0, 0, k, j1 >> 16, i1 >> 16,
					i2 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
			i1 += i7;
			j1 += i8;
			l1 += j7;
			i2 += j8;
			k += DrawingArea.width;
			l4 += j5;
			k5 += i6;
			j6 += l6;
		}
	}

	public static void method434(int ai[], int ai1[], int i, int j, int k,
			int l, int i1, int j1, int k1, int l1, int i2, int j2, int k2,
			int l2, int i3) {
		if (l >= i1) {
			return;
		}
		int j3;
		int k3;
		if (restrictEdges) {
			j3 = (k1 - j1) / (i1 - l);
			if (i1 > DrawingArea.centerX) {
				i1 = DrawingArea.centerX;
			}
			if (l < 0) {
				j1 -= l * j3;
				l = 0;
			}
			if (l >= i1) {
				return;
			}
			k3 = i1 - l >> 3;
			j3 <<= 12;
			j1 <<= 9;
		} else {
			if (i1 - l > 7) {
				k3 = i1 - l >> 3;
				j3 = (k1 - j1) * anIntArray1425[k3] >> 6;
			} else {
				k3 = 0;
				j3 = 0;
			}
			j1 <<= 9;
		}
		k += l;
		if (lowMemory) {
			int i4 = 0;
			int k4 = 0;
			int k6 = l - centerX;
			l1 += (k2 >> 3) * k6;
			i2 += (l2 >> 3) * k6;
			j2 += (i3 >> 3) * k6;
			int i5 = j2 >> 12;
			if (i5 != 0) {
				i = l1 / i5;
				j = i2 / i5;
				if (i < 0) {
					i = 0;
				} else if (i > 4032) {
					i = 4032;
				}
			}
			l1 += k2;
			i2 += l2;
			j2 += i3;
			i5 = j2 >> 12;
			if (i5 != 0) {
				i4 = l1 / i5;
				k4 = i2 / i5;
				if (i4 < 7) {
					i4 = 7;
				} else if (i4 > 4032) {
					i4 = 4032;
				}
			}
			int i7 = i4 - i >> 3;
			int k7 = k4 - j >> 3;
			i += (j1 & 0x600000) >> 3;
			int i8 = j1 >> 23;
			if (aBoolean1420) {
				while (k3-- > 0) {
					ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
					i += i7;
					j += k7;
					ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
					i += i7;
					j += k7;
					ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
					i += i7;
					j += k7;
					ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
					i += i7;
					j += k7;
					ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
					i += i7;
					j += k7;
					ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
					i += i7;
					j += k7;
					ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
					i += i7;
					j += k7;
					ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
					i = i4;
					j = k4;
					l1 += k2;
					i2 += l2;
					j2 += i3;
					int j5 = j2 >> 12;
					if (j5 != 0) {
						i4 = l1 / j5;
						k4 = i2 / j5;
						if (i4 < 7) {
							i4 = 7;
						} else if (i4 > 4032) {
							i4 = 4032;
						}
					}
					i7 = i4 - i >> 3;
					k7 = k4 - j >> 3;
					j1 += j3;
					i += (j1 & 0x600000) >> 3;
					i8 = j1 >> 23;
				}
				for (k3 = i1 - l & 7; k3-- > 0;) {
					ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
					i += i7;
					j += k7;
				}
				return;
			}
			while (k3-- > 0) {
				int k8;
				if ((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0) {
					ai[k] = k8;
				}
				k++;
				i += i7;
				j += k7;
				if ((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0) {
					ai[k] = k8;
				}
				k++;
				i += i7;
				j += k7;
				if ((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0) {
					ai[k] = k8;
				}
				k++;
				i += i7;
				j += k7;
				if ((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0) {
					ai[k] = k8;
				}
				k++;
				i += i7;
				j += k7;
				if ((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0) {
					ai[k] = k8;
				}
				k++;
				i += i7;
				j += k7;
				if ((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0) {
					ai[k] = k8;
				}
				k++;
				i += i7;
				j += k7;
				if ((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0) {
					ai[k] = k8;
				}
				k++;
				i += i7;
				j += k7;
				if ((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0) {
					ai[k] = k8;
				}
				k++;
				i = i4;
				j = k4;
				l1 += k2;
				i2 += l2;
				j2 += i3;
				int k5 = j2 >> 12;
				if (k5 != 0) {
					i4 = l1 / k5;
					k4 = i2 / k5;
					if (i4 < 7) {
						i4 = 7;
					} else if (i4 > 4032) {
						i4 = 4032;
					}
				}
				i7 = i4 - i >> 3;
				k7 = k4 - j >> 3;
				j1 += j3;
				i += (j1 & 0x600000) >> 3;
				i8 = j1 >> 23;
			}
			for (k3 = i1 - l & 7; k3-- > 0;) {
				int l8;
				if ((l8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0) {
					ai[k] = l8;
				}
				k++;
				i += i7;
				j += k7;
			}
			return;
		}
		int j4 = 0;
		int l4 = 0;
		int l6 = l - centerX;
		l1 += (k2 >> 3) * l6;
		i2 += (l2 >> 3) * l6;
		j2 += (i3 >> 3) * l6;
		int l5 = j2 >> 14;
		if (l5 != 0) {
			i = l1 / l5;
			j = i2 / l5;
			if (i < 0) {
				i = 0;
			} else if (i > 16256) {
				i = 16256;
			}
		}
		l1 += k2;
		i2 += l2;
		j2 += i3;
		l5 = j2 >> 14;
		if (l5 != 0) {
			j4 = l1 / l5;
			l4 = i2 / l5;
			if (j4 < 7) {
				j4 = 7;
			} else if (j4 > 16256) {
				j4 = 16256;
			}
		}
		int j7 = j4 - i >> 3;
		int l7 = l4 - j >> 3;
		i += j1 & 0x600000;
		int j8 = j1 >> 23;
		if (aBoolean1420) {
			while (k3-- > 0) {
				ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
				i += j7;
				j += l7;
				ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
				i += j7;
				j += l7;
				ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
				i += j7;
				j += l7;
				ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
				i += j7;
				j += l7;
				ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
				i += j7;
				j += l7;
				ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
				i += j7;
				j += l7;
				ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
				i += j7;
				j += l7;
				ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
				i = j4;
				j = l4;
				l1 += k2;
				i2 += l2;
				j2 += i3;
				int i6 = j2 >> 14;
				if (i6 != 0) {
					j4 = l1 / i6;
					l4 = i2 / i6;
					if (j4 < 7) {
						j4 = 7;
					} else if (j4 > 16256) {
						j4 = 16256;
					}
				}
				j7 = j4 - i >> 3;
				l7 = l4 - j >> 3;
				j1 += j3;
				i += j1 & 0x600000;
				j8 = j1 >> 23;
			}
			for (k3 = i1 - l & 7; k3-- > 0;) {
				ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
				i += j7;
				j += l7;
			}
			return;
		}
		while (k3-- > 0) {
			int i9;
			if ((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0) {
				ai[k] = i9;
			}
			k++;
			i += j7;
			j += l7;
			if ((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0) {
				ai[k] = i9;
			}
			k++;
			i += j7;
			j += l7;
			if ((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0) {
				ai[k] = i9;
			}
			k++;
			i += j7;
			j += l7;
			if ((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0) {
				ai[k] = i9;
			}
			k++;
			i += j7;
			j += l7;
			if ((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0) {
				ai[k] = i9;
			}
			k++;
			i += j7;
			j += l7;
			if ((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0) {
				ai[k] = i9;
			}
			k++;
			i += j7;
			j += l7;
			if ((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0) {
				ai[k] = i9;
			}
			k++;
			i += j7;
			j += l7;
			if ((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0) {
				ai[k] = i9;
			}
			k++;
			i = j4;
			j = l4;
			l1 += k2;
			i2 += l2;
			j2 += i3;
			int j6 = j2 >> 14;
			if (j6 != 0) {
				j4 = l1 / j6;
				l4 = i2 / j6;
				if (j4 < 7) {
					j4 = 7;
				} else if (j4 > 16256) {
					j4 = 16256;
				}
			}
			j7 = j4 - i >> 3;
			l7 = l4 - j >> 3;
			j1 += j3;
			i += j1 & 0x600000;
			j8 = j1 >> 23;
		}
		for (int l3 = i1 - l & 7; l3-- > 0;) {
			int j9;
			if ((j9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0) {
				ai[k] = j9;
			}
			k++;
			i += j7;
			j += l7;
		}
	}

	static {
		anIntArray1425 = new int[512];
		anIntArray1426 = new int[2048];
		anIntArray1427 = new int[2048];
		anIntArray1428 = new int[2048];
		for (int i = 1; i < 512; i++) {
			anIntArray1425[i] = 32768 / i;
		}
		for (int j = 1; j < 2048; j++) {
			anIntArray1426[j] = 0x10000 / j;
		}
		for (int k = 0; k < 2048; k++) {
			anIntArray1427[k] = (int) (65536D * Math
					.sin((double) k * 0.0030679614999999999D));
			anIntArray1428[k] = (int) (65536D * Math
					.cos((double) k * 0.0030679614999999999D));
		}
	}
}
