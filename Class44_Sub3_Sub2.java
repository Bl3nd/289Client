import java.math.BigInteger;
import sign.signlink;

public class Class44_Sub3_Sub2 extends Class44_Sub3
{

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
    public byte aByteArray1391[];
    public int anInt1392;
    public int anInt1393;
    public static int anIntArray1394[];
    public static int anIntArray1395[] = {
        0, 1, 3, 7, 15, 31, 63, 127, 255, 511,
        1023, 2047, 4095, 8191, 16383, 32767, 65535, 0x1ffff, 0x3ffff, 0x7ffff,
        0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff,
        0x3fffffff, 0x7fffffff, -1
    };
    public Class46 aClass46_1396;
    public static int anInt1397;
    public static int anInt1398;
    public static int anInt1399;
	
	private static final BigInteger RSA_MODULUS = new BigInteger("108323657494612493309320922456177487673439820921344922715144198100962079526489575209867543229640496224646268008117008919915294216935444120166833495632834086634705637939305055948776455290208521284824664815692714403150017697750798838099109649774652563447196699417439414872639941838264314304018595177193290496069");

	private static final BigInteger RSA_EXPONENT = new BigInteger("65537");
	
    public static Class28 aClass28_1400 = new Class28(-199);
    public static Class28 aClass28_1401 = new Class28(-199);
    public static Class28 aClass28_1402 = new Class28(-199);
    public static char aCharArray1403[] = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
        'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
        'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
        'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', '+', '/'
    };
    public static int anInt1404;

    public static Class44_Sub3_Sub2 method470(int i, int j)
    {
        try
        {
            synchronized(aClass28_1401)
            {
                Class44_Sub3_Sub2 class44_sub3_sub2_2 = null;
                if(j == 0 && anInt1397 > 0)
                {
                    anInt1397--;
                    class44_sub3_sub2_2 = (Class44_Sub3_Sub2)aClass28_1400.method258();
                } else
                if(j == 1 && anInt1398 > 0)
                {
                    anInt1398--;
                    class44_sub3_sub2_2 = (Class44_Sub3_Sub2)aClass28_1401.method258();
                } else
                if(j == 2 && anInt1399 > 0)
                {
                    anInt1399--;
                    class44_sub3_sub2_2 = (Class44_Sub3_Sub2)aClass28_1402.method258();
                }
                if(class44_sub3_sub2_2 != null)
                {
                    class44_sub3_sub2_2.anInt1392 = 0;
                    Class44_Sub3_Sub2 class44_sub3_sub2 = class44_sub3_sub2_2;
                    return class44_sub3_sub2;
                }
            }
            if(i >= 0)
            {
                anInt1390 = -400;
            }
            Class44_Sub3_Sub2 class44_sub3_sub2_1 = new Class44_Sub3_Sub2((byte)8);
            class44_sub3_sub2_1.anInt1392 = 0;
            if(j == 0)
            {
                class44_sub3_sub2_1.aByteArray1391 = new byte[100];
            } else
            if(j == 1)
            {
                class44_sub3_sub2_1.aByteArray1391 = new byte[5000];
            } else
            {
                class44_sub3_sub2_1.aByteArray1391 = new byte[30000];
            }
            return class44_sub3_sub2_1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("924, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class44_Sub3_Sub2(byte byte0)
    {
        aByte1381 = 95;
        anInt1382 = -731;
        anInt1383 = 1623;
        anInt1384 = 772;
        aBoolean1385 = false;
        anInt1386 = -139;
        anInt1387 = 1;
        aBoolean1388 = false;
        aBoolean1389 = false;
        try
        {
            if(byte0 == 8)
            {
                byte0 = 0;
                return;
            } else
            {
                anInt1386 = 133;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("23990, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class44_Sub3_Sub2(byte abyte0[], int i)
    {
        aByte1381 = 95;
        anInt1382 = -731;
        anInt1383 = 1623;
        anInt1384 = 772;
        aBoolean1385 = false;
        anInt1386 = -139;
        anInt1387 = 1;
        aBoolean1388 = false;
        aBoolean1389 = false;
        try
        {
            aByteArray1391 = abyte0;
            if(i != 15787)
            {
                throw new NullPointerException();
            } else
            {
                anInt1392 = 0;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("15004, " + abyte0 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method471(int i, int j)
    {
        try
        {
            aByteArray1391[anInt1392++] = (byte)(j + aClass46_1396.method545());
            if(i != -34003)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("86638, " + i + ", " + j + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method472(int i)
    {
        aByteArray1391[anInt1392++] = (byte)i;
    }

    public void method473(int i)
    {
        aByteArray1391[anInt1392++] = (byte)(i >> 8);
        aByteArray1391[anInt1392++] = (byte)i;
    }

    public void method474(int i, boolean flag)
    {
        try
        {
            aByteArray1391[anInt1392++] = (byte)i;
            aByteArray1391[anInt1392++] = (byte)(i >> 8);
            if(flag)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("86335, " + i + ", " + flag + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method475(int i)
    {
        aByteArray1391[anInt1392++] = (byte)(i >> 16);
        aByteArray1391[anInt1392++] = (byte)(i >> 8);
        aByteArray1391[anInt1392++] = (byte)i;
    }

    public void method476(int i)
    {
        aByteArray1391[anInt1392++] = (byte)(i >> 24);
        aByteArray1391[anInt1392++] = (byte)(i >> 16);
        aByteArray1391[anInt1392++] = (byte)(i >> 8);
        aByteArray1391[anInt1392++] = (byte)i;
    }

    public void method477(int i, int j)
    {
        try
        {
            aByteArray1391[anInt1392++] = (byte)j;
            aByteArray1391[anInt1392++] = (byte)(j >> 8);
            if(i != 26965)
            {
                return;
            } else
            {
                aByteArray1391[anInt1392++] = (byte)(j >> 16);
                aByteArray1391[anInt1392++] = (byte)(j >> 24);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("41231, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method478(long l, boolean flag)
    {
        try
        {
            aByteArray1391[anInt1392++] = (byte)(int)(l >> 56);
            aByteArray1391[anInt1392++] = (byte)(int)(l >> 48);
            aByteArray1391[anInt1392++] = (byte)(int)(l >> 40);
            aByteArray1391[anInt1392++] = (byte)(int)(l >> 32);
            aByteArray1391[anInt1392++] = (byte)(int)(l >> 24);
            aByteArray1391[anInt1392++] = (byte)(int)(l >> 16);
            if(!flag)
            {
                return;
            }
            aByteArray1391[anInt1392++] = (byte)(int)(l >> 8);
            aByteArray1391[anInt1392++] = (byte)(int)l;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("85019, " + l + ", " + flag + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method479(String s)
    {
        s.getBytes(0, s.length(), aByteArray1391, anInt1392);
        anInt1392 += s.length();
        aByteArray1391[anInt1392++] = 10;
    }

    public void method480(byte abyte0[], int i, int j, boolean flag)
    {
        try
        {
            if(!flag)
            {
                anInt1386 = 371;
            }
            for(int k = j; k < j + i; k++)
            {
                aByteArray1391[anInt1392++] = abyte0[k];
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("73937, " + abyte0 + ", " + i + ", " + j + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method481(int i, int j)
    {
        try
        {
            if(j != 0)
            {
                for(int k = 1; k > 0; k++)
                {
                }
            }
            aByteArray1391[anInt1392 - i - 1] = (byte)i;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("97780, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method482()
    {
        return aByteArray1391[anInt1392++] & 0xff;
    }

    public byte method483()
    {
        return aByteArray1391[anInt1392++];
    }

    public int method484()
    {
        anInt1392 += 2;
        return ((aByteArray1391[anInt1392 - 2] & 0xff) << 8) + (aByteArray1391[anInt1392 - 1] & 0xff);
    }

    public int method485()
    {
        anInt1392 += 2;
        int i = ((aByteArray1391[anInt1392 - 2] & 0xff) << 8) + (aByteArray1391[anInt1392 - 1] & 0xff);
        if(i > 32767)
        {
            i -= 0x10000;
        }
        return i;
    }

    public int method486()
    {
        anInt1392 += 3;
        return ((aByteArray1391[anInt1392 - 3] & 0xff) << 16) + ((aByteArray1391[anInt1392 - 2] & 0xff) << 8) + (aByteArray1391[anInt1392 - 1] & 0xff);
    }

    public int method487()
    {
        anInt1392 += 4;
        return ((aByteArray1391[anInt1392 - 4] & 0xff) << 24) + ((aByteArray1391[anInt1392 - 3] & 0xff) << 16) + ((aByteArray1391[anInt1392 - 2] & 0xff) << 8) + (aByteArray1391[anInt1392 - 1] & 0xff);
    }

    public long method488(boolean flag)
    {
        try
        {
            if(!flag)
            {
                anInt1380 = 183;
            }
            long l = (long)method487() & 0xffffffffL;
            long l1 = (long)method487() & 0xffffffffL;
            return (l << 32) + l1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("82572, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public String method489()
    {
        int i = anInt1392;
        while(aByteArray1391[anInt1392++] != 10) ;
        return new String(aByteArray1391, i, anInt1392 - i - 1);
    }

    public byte[] method490(int i)
    {
        try
        {
            if(i != 44692)
            {
                anInt1390 = 448;
            }
            int j = anInt1392;
            while(aByteArray1391[anInt1392++] != 10) ;
            byte abyte0[] = new byte[anInt1392 - j - 1];
            for(int k = j; k < anInt1392 - 1; k++)
            {
                abyte0[k - j] = aByteArray1391[k];
            }
            return abyte0;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("67289, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method491(byte byte0, byte abyte0[], int i, int j)
    {
        try
        {
            if(byte0 != aByte1381)
            {
                anInt1387 = -447;
            }
            for(int k = i; k < i + j; k++)
            {
                abyte0[k] = aByteArray1391[anInt1392++];
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("99457, " + byte0 + ", " + abyte0 + ", " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method492(byte byte0)
    {
        try
        {
            if(byte0 != -51)
            {
                aBoolean1389 = !aBoolean1389;
            }
            anInt1393 = anInt1392 * 8;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("96920, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method493(int i, boolean flag)
    {
        try
        {
            if(flag)
            {
                aBoolean1389 = !aBoolean1389;
            }
            int j = anInt1393 >> 3;
            int k = 8 - (anInt1393 & 7);
            int l = 0;
            anInt1393 += i;
            for(; i > k; k = 8)
            {
                l += (aByteArray1391[j++] & anIntArray1395[k]) << i - k;
                i -= k;
            }
            if(i == k)
            {
                l += aByteArray1391[j] & anIntArray1395[k];
            } else
            {
                l += aByteArray1391[j] >> k - i & anIntArray1395[i];
            }
            return l;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("75102, " + i + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method494(byte byte0)
    {
        try
        {
            anInt1392 = (anInt1393 + 7) / 8;
            if(byte0 != 4)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("49000, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public int method495()
    {
        int i = aByteArray1391[anInt1392] & 0xff;
        if(i < 128)
        {
            return method482() - 64;
        } else
        {
            return method484() - 49152;
        }
    }

    public int method496()
    {
        int i = aByteArray1391[anInt1392] & 0xff;
        if(i < 128)
        {
            return method482();
        } else
        {
            return method484() - 32768;
        }
    }

    public void method497(/*BigInteger biginteger, BigInteger biginteger1,*/ int i)
    {
        try
        {
            int j = anInt1392;
            anInt1392 = 0;
            byte abyte0[] = new byte[j];
            method491((byte)95, abyte0, 0, j);
            BigInteger biginteger2 = new BigInteger(abyte0);
            BigInteger biginteger3 = biginteger2; //.modPow(RSA_EXPONENT, RSA_MODULUS);
            byte abyte1[] = biginteger3.toByteArray();
            anInt1392 = 0;
            method472(abyte1.length);
            method480(abyte1, abyte1.length, 0, true);
            if(i < 0 || i > 0)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            //signlink.reporterror("81066, " + biginteger + ", " + biginteger1 + ", " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    static
    {
        anIntArray1394 = new int[256];
        for(int j = 0; j < 256; j++)
        {
            int i = j;
            for(int k = 0; k < 8; k++)
            {
                if((i & 1) == 1)
                {
                    i = i >>> 1 ^ 0xedb88320;
                } else
                {
                    i >>>= 1;
                }
            }
            anIntArray1394[j] = i;
        }
    }
}
