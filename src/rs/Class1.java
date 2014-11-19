package src.rs;
import sign.signlink;
import src.rs.stream.Stream;

public class Class1 {

	public boolean aBoolean37;
	public int anInt38;
	public int anIntArray39[];
	public int anIntArray40[];
	public int anInt41;
	public int anInt42;
	public int anInt43;
	public int anInt44;
	public int anInt45;
	public int anInt46;
	public int anInt47;
	public int anInt48;
	public static int anInt49;

	public void method148(boolean flag, Stream stream) {
		try {
			anInt43 = stream.getUnsignedByte();
			anInt41 = stream.getInt();
			anInt42 = stream.getInt();
			if (flag) {
				for (int i = 1; i > 0; i++) {
				}
			}
			method149(0, stream);
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("71989, " + flag + ", " + stream + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void method149(int i, Stream stream) {
		try {
			if (i != 0) {
				return;
			}
			anInt38 = stream.getUnsignedByte();
			anIntArray39 = new int[anInt38];
			anIntArray40 = new int[anInt38];
			for (int j = 0; j < anInt38; j++) {
				anIntArray39[j] = stream.getUnsignedLEShort();
				anIntArray40[j] = stream.getUnsignedLEShort();
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("90209, " + i + ", " + stream + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void method150(int i) {
		try {
			anInt44 = 0;
			anInt45 = 0;
			anInt46 = 0;
			anInt47 = 0;
			if (i != -9520) {
				aBoolean37 = !aBoolean37;
			}
			anInt48 = 0;
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("93961, " + i + ", "
					+ runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public int method151(int i, int j) {
		try {
			if (anInt48 >= anInt44) {
				anInt47 = anIntArray40[anInt45++] << 15;
				if (anInt45 >= anInt38) {
					anInt45 = anInt38 - 1;
				}
				anInt44 = (int) (((double) anIntArray39[anInt45] / 65536D) * (double) j);
				if (anInt44 > anInt48) {
					anInt46 = ((anIntArray40[anInt45] << 15) - anInt47)
							/ (anInt44 - anInt48);
				}
			}
			anInt47 += anInt46;
			anInt48++;
			if (i != 0) {
				for (int k = 1; k > 0; k++) {
				}
			}
			return anInt47 - anInt46 >> 15;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("76406, " + i + ", " + j + ", "
					+ runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public Class1() {
		aBoolean37 = false;
	}
}
