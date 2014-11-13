import java.math.BigInteger;
import sign.signlink;

public class Stream extends Class44_Sub3 {

	public int anInt1380;
	public byte aByte1381;
	public int anInt1382;
	public int anInt1383;
	public int anInt1384;
	public boolean aBoolean1385;
	public int anInt1386;
	public int anInt1387;
	public boolean aBoolean1388;
	public boolean aBoolean1389;
	public static int anInt1390 = 8;
	public byte buffer[];
	public int currentOffset;
	public int anInt1393;
	public static int anIntArray1394[];
	public static int anIntArray1395[] = { 0, 1, 3, 7, 15, 31, 63, 127, 255,
			511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 0x1ffff, 0x3ffff,
			0x7ffff, 0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff,
			0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff, 0x3fffffff,
			0x7fffffff, -1 };
	public Class46 aClass46_1396;
	public static int anInt1397;
	public static int anInt1398;
	public static int anInt1399;

	private static final BigInteger RSA_MODULUS = new BigInteger(
			"108323657494612493309320922456177487673439820921344922715144198100962079526489575209867543229640496224646268008117008919915294216935444120166833495632834086634705637939305055948776455290208521284824664815692714403150017697750798838099109649774652563447196699417439414872639941838264314304018595177193290496069");

	private static final BigInteger RSA_EXPONENT = new BigInteger("65537");

	public static Class28 aClass28_1400 = new Class28(-199);
	public static Class28 aClass28_1401 = new Class28(-199);
	public static Class28 aClass28_1402 = new Class28(-199);
	public static char aCharArray1403[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G',
			'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
			'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
			'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
			'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6',
			'7', '8', '9', '+', '/' };
	public static int anInt1404;

	public static Stream create(int i, int j) {
		try {
			synchronized (aClass28_1401) {
				Stream stream = null;
				if (j == 0 && anInt1397 > 0) {
					anInt1397--;
					stream = (Stream) aClass28_1400.method258();
				} else if (j == 1 && anInt1398 > 0) {
					anInt1398--;
					stream = (Stream) aClass28_1401.method258();
				} else if (j == 2 && anInt1399 > 0) {
					anInt1399--;
					stream = (Stream) aClass28_1402.method258();
				}
				if (stream != null) {
					stream.currentOffset = 0;
					Stream stream_1 = stream;
					return stream_1;
				}
			}
			if (i >= 0) {
				anInt1390 = -400;
			}
			Stream stream_1 = new Stream((byte) 8);
			stream_1.currentOffset = 0;
			if (j == 0) {
				stream_1.buffer = new byte[100];
			} else if (j == 1) {
				stream_1.buffer = new byte[5000];
			} else {
				stream_1.buffer = new byte[30000];
			}
			return stream_1;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("924, " + i + ", " + j + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public Stream(byte byte0) {
		aByte1381 = 95;
		anInt1382 = -731;
		anInt1383 = 1623;
		anInt1384 = 772;
		aBoolean1385 = false;
		anInt1386 = -139;
		anInt1387 = 1;
		aBoolean1388 = false;
		aBoolean1389 = false;
		try {
			if (byte0 == 8) {
				byte0 = 0;
				return;
			} else {
				anInt1386 = 133;
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("23990, " + byte0 + ", "
					+ runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public Stream(byte abyte0[], int i) {
		aByte1381 = 95;
		anInt1382 = -731;
		anInt1383 = 1623;
		anInt1384 = 772;
		aBoolean1385 = false;
		anInt1386 = -139;
		anInt1387 = 1;
		aBoolean1388 = false;
		aBoolean1389 = false;
		try {
			buffer = abyte0;
			if (i != 15787) {
				throw new NullPointerException();
			} else {
				currentOffset = 0;
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("15004, " + abyte0 + ", " + i + ", "
					+ runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void method471(int i, int j) {
		try {
			buffer[currentOffset++] = (byte) (j + aClass46_1396.method545());
			if (i != -34003) {
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("86638, " + i + ", " + j + ", "
					+ runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	public void method472(int i) {
		buffer[currentOffset++] = (byte) i;
	}

	public void method473(int i) {
		buffer[currentOffset++] = (byte) (i >> 8);
		buffer[currentOffset++] = (byte) i;
	}

	public void method474(int i, boolean flag) {
		try {
			buffer[currentOffset++] = (byte) i;
			buffer[currentOffset++] = (byte) (i >> 8);
			if (flag) {
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("86335, " + i + ", " + flag + ", "
					+ runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	public void method475(int i) {
		buffer[currentOffset++] = (byte) (i >> 16);
		buffer[currentOffset++] = (byte) (i >> 8);
		buffer[currentOffset++] = (byte) i;
	}

	public void method476(int i) {
		buffer[currentOffset++] = (byte) (i >> 24);
		buffer[currentOffset++] = (byte) (i >> 16);
		buffer[currentOffset++] = (byte) (i >> 8);
		buffer[currentOffset++] = (byte) i;
	}

	public void method477(int i, int j) {
		try {
			buffer[currentOffset++] = (byte) j;
			buffer[currentOffset++] = (byte) (j >> 8);
			if (i != 26965) {
				return;
			} else {
				buffer[currentOffset++] = (byte) (j >> 16);
				buffer[currentOffset++] = (byte) (j >> 24);
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("41231, " + i + ", " + j + ", "
					+ runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void method478(long l, boolean flag) {
		try {
			buffer[currentOffset++] = (byte) (int) (l >> 56);
			buffer[currentOffset++] = (byte) (int) (l >> 48);
			buffer[currentOffset++] = (byte) (int) (l >> 40);
			buffer[currentOffset++] = (byte) (int) (l >> 32);
			buffer[currentOffset++] = (byte) (int) (l >> 24);
			buffer[currentOffset++] = (byte) (int) (l >> 16);
			if (!flag) {
				return;
			}
			buffer[currentOffset++] = (byte) (int) (l >> 8);
			buffer[currentOffset++] = (byte) (int) l;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("85019, " + l + ", " + flag + ", "
					+ runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	public void method479(String s) {
		s.getBytes(0, s.length(), buffer, currentOffset);
		currentOffset += s.length();
		buffer[currentOffset++] = 10;
	}

	public void method480(byte abyte0[], int i, int j, boolean flag) {
		try {
			if (!flag) {
				anInt1386 = 371;
			}
			for (int k = j; k < j + i; k++) {
				buffer[currentOffset++] = abyte0[k];
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("73937, " + abyte0 + ", " + i + ", " + j
					+ ", " + flag + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void method481(int i, int j) {
		try {
			if (j != 0) {
				for (int k = 1; k > 0; k++) {
				}
			}
			buffer[currentOffset - i - 1] = (byte) i;
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("97780, " + i + ", " + j + ", "
					+ runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public int readUnsignedByte() {
		return buffer[currentOffset++] & 0xff;
	}

	public byte method483() {
		return buffer[currentOffset++];
	}

	public int readUnsignedWord() {
		currentOffset += 2;
		return ((buffer[currentOffset - 2] & 0xff) << 8) + (buffer[currentOffset - 1] & 0xff);
	}

	public int method485() {
		currentOffset += 2;
		int i = ((buffer[currentOffset - 2] & 0xff) << 8)
				+ (buffer[currentOffset - 1] & 0xff);
		if (i > 32767) {
			i -= 0x10000;
		}
		return i;
	}

	public int method486() {
		currentOffset += 3;
		return ((buffer[currentOffset - 3] & 0xff) << 16)
				+ ((buffer[currentOffset - 2] & 0xff) << 8)
				+ (buffer[currentOffset - 1] & 0xff);
	}

	public int readDWord() {
		currentOffset += 4;
		return ((buffer[currentOffset - 4] & 0xff) << 24) + ((buffer[currentOffset - 3] & 0xff) << 16) + ((buffer[currentOffset - 2] & 0xff) << 8) + (buffer[currentOffset - 1] & 0xff);
	}

	public long method488(boolean flag) {
		try {
			if (!flag) {
				anInt1380 = 183;
			}
			long l = (long) readDWord() & 0xffffffffL;
			long l1 = (long) readDWord() & 0xffffffffL;
			return (l << 32) + l1;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("82572, " + flag + ", "
					+ runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public String method489() {
		int i = currentOffset;
		while (buffer[currentOffset++] != 10)
			;
		return new String(buffer, i, currentOffset - i - 1);
	}

	public byte[] method490(int i) {
		try {
			if (i != 44692) {
				anInt1390 = 448;
			}
			int j = currentOffset;
			while (buffer[currentOffset++] != 10)
				;
			byte abyte0[] = new byte[currentOffset - j - 1];
			for (int k = j; k < currentOffset - 1; k++) {
				abyte0[k - j] = buffer[k];
			}
			return abyte0;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("67289, " + i + ", "
					+ runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void method491(byte byte0, byte abyte0[], int i, int j) {
		try {
			if (byte0 != aByte1381) {
				anInt1387 = -447;
			}
			for (int k = i; k < i + j; k++) {
				abyte0[k] = buffer[currentOffset++];
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("99457, " + byte0 + ", " + abyte0 + ", " + i
					+ ", " + j + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void method492(byte byte0) {
		try {
			if (byte0 != -51) {
				aBoolean1389 = !aBoolean1389;
			}
			anInt1393 = currentOffset * 8;
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("96920, " + byte0 + ", "
					+ runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public int method493(int i, boolean flag) {
		try {
			if (flag) {
				aBoolean1389 = !aBoolean1389;
			}
			int j = anInt1393 >> 3;
			int k = 8 - (anInt1393 & 7);
			int l = 0;
			anInt1393 += i;
			for (; i > k; k = 8) {
				l += (buffer[j++] & anIntArray1395[k]) << i - k;
				i -= k;
			}
			if (i == k) {
				l += buffer[j] & anIntArray1395[k];
			} else {
				l += buffer[j] >> k - i & anIntArray1395[i];
			}
			return l;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("75102, " + i + ", " + flag + ", "
					+ runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void method494(byte byte0) {
		try {
			currentOffset = (anInt1393 + 7) / 8;
			if (byte0 != 4) {
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("49000, " + byte0 + ", "
					+ runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	public int method495() {
		int i = buffer[currentOffset] & 0xff;
		if (i < 128) {
			return readUnsignedByte() - 64;
		} else {
			return readUnsignedWord() - 49152;
		}
	}

	public int method496() {
		int i = buffer[currentOffset] & 0xff;
		if (i < 128) {
			return readUnsignedByte();
		} else {
			return readUnsignedWord() - 32768;
		}
	}

	public void method497(
			/* BigInteger biginteger, BigInteger biginteger1, */int i) {
		try {
			int j = currentOffset;
			currentOffset = 0;
			byte abyte0[] = new byte[j];
			method491((byte) 95, abyte0, 0, j);
			BigInteger biginteger2 = new BigInteger(abyte0);
			BigInteger biginteger3 = biginteger2; // .modPow(RSA_EXPONENT,
													// RSA_MODULUS);
			byte abyte1[] = biginteger3.toByteArray();
			currentOffset = 0;
			method472(abyte1.length);
			method480(abyte1, abyte1.length, 0, true);
			if (i < 0 || i > 0) {
				return;
			}
		} catch (RuntimeException runtimeexception) {
			// signlink.reporterror("81066, " + biginteger + ", " + biginteger1
			// + ", " + i + ", " + runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	static {
		anIntArray1394 = new int[256];
		for (int j = 0; j < 256; j++) {
			int i = j;
			for (int k = 0; k < 8; k++) {
				if ((i & 1) == 1) {
					i = i >>> 1 ^ 0xedb88320;
				} else {
					i >>>= 1;
				}
			}
			anIntArray1394[j] = i;
		}
	}
}
