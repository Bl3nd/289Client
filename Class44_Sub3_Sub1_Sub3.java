import sign.signlink;

public class Class44_Sub3_Sub1_Sub3 extends DrawingArea
{

    public boolean aBoolean1455;
    public boolean aBoolean1456;
    public int anInt1457;
    public byte imagePixels[];
    public int anIntArray1459[];
    public int imageWidth;
    public int anInt1461;
    public int anInt1462;
    public int anInt1463;
    public int libWidth;
    public int anInt1465;

    public Class44_Sub3_Sub1_Sub3(Class47 class47, String s, int i)
    {
        aBoolean1455 = false;
        aBoolean1456 = false;
        anInt1457 = 9;
        Stream class44_sub3_sub2 = new Stream(class47.method549(s + ".dat", null), 15787);
        Stream class44_sub3_sub2_1 = new Stream(class47.method549("index.dat", null), 15787);
        class44_sub3_sub2_1.currentOffset = class44_sub3_sub2.getUnsignedLEShort();
        libWidth = class44_sub3_sub2_1.getUnsignedLEShort();
        anInt1465 = class44_sub3_sub2_1.getUnsignedLEShort();
        int j = class44_sub3_sub2_1.getUnsignedByte();
        anIntArray1459 = new int[j];
        for(int k = 0; k < j - 1; k++)
        {
            anIntArray1459[k + 1] = class44_sub3_sub2_1.get24BitInt();
        }
        for(int l = 0; l < i; l++)
        {
            class44_sub3_sub2_1.currentOffset += 2;
            class44_sub3_sub2.currentOffset += class44_sub3_sub2_1.getUnsignedLEShort() * class44_sub3_sub2_1.getUnsignedLEShort();
            class44_sub3_sub2_1.currentOffset++;
        }
        anInt1462 = class44_sub3_sub2_1.getUnsignedByte();
        anInt1463 = class44_sub3_sub2_1.getUnsignedByte();
        imageWidth = class44_sub3_sub2_1.getUnsignedLEShort();
        anInt1461 = class44_sub3_sub2_1.getUnsignedLEShort();
        int i1 = class44_sub3_sub2_1.getUnsignedByte();
        int j1 = imageWidth * anInt1461;
        imagePixels = new byte[j1];
        if(i1 == 0)
        {
            for(int k1 = 0; k1 < j1; k1++)
            {
                imagePixels[k1] = class44_sub3_sub2.get();
            }
            return;
        }
        if(i1 == 1)
        {
            for(int l1 = 0; l1 < imageWidth; l1++)
            {
                for(int i2 = 0; i2 < anInt1461; i2++)
                {
                    imagePixels[l1 + i2 * imageWidth] = class44_sub3_sub2.get();
                }
            }
        }
    }

    public void method448(int i)
    {
        try
        {
            libWidth /= 2;
            anInt1465 /= 2;
            byte abyte0[] = new byte[libWidth * anInt1465];
            int j = 0;
            for(int k = 0; k < anInt1461; k++)
            {
                for(int l = 0; l < imageWidth; l++)
                {
                    abyte0[(l + anInt1462 >> 1) + (k + anInt1463 >> 1) * libWidth] = imagePixels[j++];
                }
            }
            imagePixels = abyte0;
            imageWidth = libWidth;
            if(i != 0)
            {
                aBoolean1455 = !aBoolean1455;
            }
            anInt1461 = anInt1465;
            anInt1462 = 0;
            anInt1463 = 0;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("96890, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method449(int i)
    {
        try
        {
            if(imageWidth == libWidth && anInt1461 == anInt1465)
            {
                return;
            }
            byte abyte0[] = new byte[libWidth * anInt1465];
            int j = 0;
            for(int k = 0; k < anInt1461; k++)
            {
                for(int l = 0; l < imageWidth; l++)
                {
                    abyte0[l + anInt1462 + (k + anInt1463) * libWidth] = imagePixels[j++];
                }
            }
            imagePixels = abyte0;
            imageWidth = libWidth;
            anInt1461 = anInt1465;
            anInt1462 = 0;
            anInt1463 = 0;
            if(i < 9 || i > 9)
            {
                aBoolean1456 = !aBoolean1456;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("81667, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method450(int i)
    {
        try
        {
            byte abyte0[] = new byte[imageWidth * anInt1461];
            int j = 0;
            for(int k = 0; k < anInt1461; k++)
            {
                for(int l = imageWidth - 1; l >= 0; l--)
                {
                    abyte0[j++] = imagePixels[l + k * imageWidth];
                }
            }
            imagePixels = abyte0;
            if(i != 6)
            {
                anInt1457 = 352;
            }
            anInt1462 = libWidth - imageWidth - anInt1462;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("28636, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method451(int i)
    {
        try
        {
            byte abyte0[] = new byte[imageWidth * anInt1461];
            int j = 0;
            for(int k = anInt1461 - 1; k >= 0; k--)
            {
                for(int l = 0; l < imageWidth; l++)
                {
                    abyte0[j++] = imagePixels[l + k * imageWidth];
                }
            }
            if(i != 35509)
            {
                return;
            } else
            {
                imagePixels = abyte0;
                anInt1463 = anInt1465 - anInt1461 - anInt1463;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("83103, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method452(int i, byte byte0, int j, int k)
    {
        try
        {
            if(byte0 != 3)
            {
                for(int l = 1; l > 0; l++)
                {
                }
            }
            for(int i1 = 0; i1 < anIntArray1459.length; i1++)
            {
                int j1 = anIntArray1459[i1] >> 16 & 0xff;
                j1 += i;
                if(j1 < 0)
                {
                    j1 = 0;
                } else
                if(j1 > 255)
                {
                    j1 = 255;
                }
                int k1 = anIntArray1459[i1] >> 8 & 0xff;
                k1 += j;
                if(k1 < 0)
                {
                    k1 = 0;
                } else
                if(k1 > 255)
                {
                    k1 = 255;
                }
                int l1 = anIntArray1459[i1] & 0xff;
                l1 += k;
                if(l1 < 0)
                {
                    l1 = 0;
                } else
                if(l1 > 255)
                {
                    l1 = 255;
                }
                anIntArray1459[i1] = (j1 << 16) + (k1 << 8) + l1;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("28455, " + i + ", " + byte0 + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method453(int i, byte byte0, int j)
    {
        try
        {
            j += anInt1462;
            i += anInt1463;
            if(byte0 != 1)
            {
                return;
            }
            int k = j + i * DrawingArea.width;
            int l = 0;
            int i1 = anInt1461;
            int j1 = imageWidth;
            int k1 = DrawingArea.width - j1;
            int l1 = 0;
            if(i < DrawingArea.topY)
            {
                int i2 = DrawingArea.topY - i;
                i1 -= i2;
                i = DrawingArea.topY;
                l += i2 * j1;
                k += i2 * DrawingArea.width;
            }
            if(i + i1 > DrawingArea.bottomY)
            {
                i1 -= (i + i1) - DrawingArea.bottomY;
            }
            if(j < DrawingArea.topX)
            {
                int j2 = DrawingArea.topX - j;
                j1 -= j2;
                j = DrawingArea.topX;
                l += j2;
                k += j2;
                l1 += j2;
                k1 += j2;
            }
            if(j + j1 > DrawingArea.bottomX)
            {
                int k2 = (j + j1) - DrawingArea.bottomX;
                j1 -= k2;
                l1 += k2;
                k1 += k2;
            }
            if(j1 <= 0 || i1 <= 0)
            {
                return;
            } else
            {
                method454(i1, anIntArray1459, k, DrawingArea.pixels, l1, k1, (byte)34, imagePixels, j1, l);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("29131, " + i + ", " + byte0 + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method454(int i, int ai[], int j, int ai1[], int k, int l, byte byte0,
            byte abyte0[], int i1, int j1)
    {
        try
        {
            int k1 = -(i1 >> 2);
            i1 = -(i1 & 3);
            for(int l1 = -i; l1 < 0; l1++)
            {
                for(int i2 = k1; i2 < 0; i2++)
                {
                    byte byte1 = abyte0[j1++];
                    if(byte1 != 0)
                    {
                        ai1[j++] = ai[byte1 & 0xff];
                    } else
                    {
                        j++;
                    }
                    byte1 = abyte0[j1++];
                    if(byte1 != 0)
                    {
                        ai1[j++] = ai[byte1 & 0xff];
                    } else
                    {
                        j++;
                    }
                    byte1 = abyte0[j1++];
                    if(byte1 != 0)
                    {
                        ai1[j++] = ai[byte1 & 0xff];
                    } else
                    {
                        j++;
                    }
                    byte1 = abyte0[j1++];
                    if(byte1 != 0)
                    {
                        ai1[j++] = ai[byte1 & 0xff];
                    } else
                    {
                        j++;
                    }
                }
                for(int j2 = i1; j2 < 0; j2++)
                {
                    byte byte2 = abyte0[j1++];
                    if(byte2 != 0)
                    {
                        ai1[j++] = ai[byte2 & 0xff];
                    } else
                    {
                        j++;
                    }
                }
                j += l;
                j1 += k;
            }
            if(byte0 != 34)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("42705, " + i + ", " + ai + ", " + j + ", " + ai1 + ", " + k + ", " + l + ", " + byte0 + ", " + abyte0 + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }
}
