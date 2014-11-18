import sign.signlink;

public class Class11
{

    public static int anInt262;
    public static int anInt263 = 2;
    public static Class11 aClass11Array264[];
    public int anInt265;
    public Class9 aClass9_266;
    public int anInt267;
    public int anIntArray268[];
    public int anIntArray269[];
    public int anIntArray270[];
    public int anIntArray271[];
    public static boolean aBooleanArray272[];

    public static void method207(int i)
    {
        aClass11Array264 = new Class11[i + 1];
        aBooleanArray272 = new boolean[i + 1];
        for(int j = 0; j < i + 1; j++)
        {
            aBooleanArray272[j] = true;
        }
    }

    public static void method208(int i, byte abyte0[])
    {
        try
        {
            Stream class44_sub3_sub2 = new Stream(abyte0, 15787);
            class44_sub3_sub2.currentOffset = abyte0.length - 8;
            int j = class44_sub3_sub2.getUnsignedLEShort();
            int k = class44_sub3_sub2.getUnsignedLEShort();
            int l = class44_sub3_sub2.getUnsignedLEShort();
            int i1 = class44_sub3_sub2.getUnsignedLEShort();
            int j1 = 0;
            Stream class44_sub3_sub2_1 = new Stream(abyte0, 15787);
            class44_sub3_sub2_1.currentOffset = j1;
            j1 += j + 2;
            Stream class44_sub3_sub2_2 = new Stream(abyte0, 15787);
            class44_sub3_sub2_2.currentOffset = j1;
            j1 += k;
            Stream class44_sub3_sub2_3 = new Stream(abyte0, 15787);
            class44_sub3_sub2_3.currentOffset = j1;
            j1 += l;
            Stream class44_sub3_sub2_4 = new Stream(abyte0, 15787);
            class44_sub3_sub2_4.currentOffset = j1;
            j1 += i1;
            Stream class44_sub3_sub2_5 = new Stream(abyte0, 15787);
            class44_sub3_sub2_5.currentOffset = j1;
            Class9 class9 = new Class9(class44_sub3_sub2_5, anInt262);
            int k1 = class44_sub3_sub2_1.getUnsignedLEShort();
            if(i != 2)
            {
                return;
            }
            int ai[] = new int[500];
            int ai1[] = new int[500];
            int ai2[] = new int[500];
            int ai3[] = new int[500];
            for(int l1 = 0; l1 < k1; l1++)
            {
                int i2 = class44_sub3_sub2_1.getUnsignedLEShort();
                Class11 class11 = aClass11Array264[i2] = new Class11();
                class11.anInt265 = class44_sub3_sub2_4.getUnsignedByte();
                class11.aClass9_266 = class9;
                int j2 = class44_sub3_sub2_1.getUnsignedByte();
                int k2 = -1;
                int l2 = 0;
                for(int i3 = 0; i3 < j2; i3++)
                {
                    int j3 = class44_sub3_sub2_2.getUnsignedByte();
                    if(j3 > 0)
                    {
                        if(class9.anIntArray254[i3] != 0)
                        {
                            for(int l3 = i3 - 1; l3 > k2; l3--)
                            {
                                if(class9.anIntArray254[l3] != 0)
                                {
                                    continue;
                                }
                                ai[l2] = l3;
                                ai1[l2] = 0;
                                ai2[l2] = 0;
                                ai3[l2] = 0;
                                l2++;
                                break;
                            }
                        }
                        ai[l2] = i3;
                        char c = '\0';
                        if(class9.anIntArray254[i3] == 3)
                        {
                            c = '\200';
                        }
                        if((j3 & 1) != 0)
                        {
                            ai1[l2] = class44_sub3_sub2_3.getSmartA();
                        } else
                        {
                            ai1[l2] = c;
                        }
                        if((j3 & 2) != 0)
                        {
                            ai2[l2] = class44_sub3_sub2_3.getSmartA();
                        } else
                        {
                            ai2[l2] = c;
                        }
                        if((j3 & 4) != 0)
                        {
                            ai3[l2] = class44_sub3_sub2_3.getSmartA();
                        } else
                        {
                            ai3[l2] = c;
                        }
                        k2 = i3;
                        l2++;
                        if(class9.anIntArray254[i3] == 5)
                        {
                            aBooleanArray272[i2] = false;
                        }
                    }
                }
                class11.anInt267 = l2;
                class11.anIntArray268 = new int[l2];
                class11.anIntArray269 = new int[l2];
                class11.anIntArray270 = new int[l2];
                class11.anIntArray271 = new int[l2];
                for(int k3 = 0; k3 < l2; k3++)
                {
                    class11.anIntArray268[k3] = ai[k3];
                    class11.anIntArray269[k3] = ai1[k3];
                    class11.anIntArray270[k3] = ai2[k3];
                    class11.anIntArray271[k3] = ai3[k3];
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("77261, " + i + ", " + abyte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method209(byte byte0)
    {
        try
        {
            if(byte0 != 42)
            {
                anInt262 = 423;
            }
            aClass11Array264 = null;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("94238, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static Class11 method210(int i, byte byte0)
    {
        try
        {
            if(byte0 == 4)
            {
                byte0 = 0;
            } else
            {
                anInt263 = -60;
            }
            if(aClass11Array264 == null)
            {
                return null;
            } else
            {
                return aClass11Array264[i];
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("52733, " + i + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method211(int i, int j)
    {
        try
        {
            if(j != 0)
            {
                anInt263 = 271;
            }
            return i == -1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("34856, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class11()
    {
    }

}
