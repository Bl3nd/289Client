import sign.signlink;

public class Class12
{

    public boolean aBoolean273;
    public int anInt274;
    public byte aByte275;
    public static int anInt276;
    public static int anIntArray277[];
    public static Stream aClass44_Sub3_Sub2_278;
    public static Class12 aClass12Array279[];
    public static int anInt280;
    public long aLong281;
    public String aString282;
    public byte aByteArray283[];
    public byte aByte284;
    public int anIntArray285[];
    public int anIntArray286[];
    public int anInt287;
    public int anInt288;
    public int anInt289;
    public int anInt290;
    public int anInt291;
    public int anIntArray292[];
    public int anIntArray293[];
    public String aStringArray294[];
    public int anInt295;
    public int anInt296;
    public int anInt297;
    public boolean aBoolean298;
    public int anInt299;
    public int anInt300;
    public int anInt301;
    public boolean aBoolean302;
    public int anInt303;
    public int anInt304;
    public int anInt305;
    public int anInt306;
    public static Class39 aClass39_307 = new Class39((byte)7, 30);

    public static void method212(Class47 class47)
    {
        aClass44_Sub3_Sub2_278 = new Stream(class47.method549("npc.dat", null), 15787);
        Stream class44_sub3_sub2 = new Stream(class47.method549("npc.idx", null), 15787);
        anInt276 = class44_sub3_sub2.getUnsignedLEShort();
        anIntArray277 = new int[anInt276];
        int i = 2;
        for(int j = 0; j < anInt276; j++)
        {
            anIntArray277[j] = i;
            i += class44_sub3_sub2.getUnsignedLEShort();
        }
        aClass12Array279 = new Class12[20];
        for(int k = 0; k < 20; k++)
        {
            aClass12Array279[k] = new Class12();
        }
    }

    public static void method213(byte byte0)
    {
        try
        {
            aClass39_307 = null;
            anIntArray277 = null;
            if(byte0 != 42)
            {
                return;
            } else
            {
                aClass12Array279 = null;
                aClass44_Sub3_Sub2_278 = null;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("45481, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static Class12 method214(int i)
    {
        for(int j = 0; j < 20; j++)
        {
            if(aClass12Array279[j].aLong281 == (long)i)
            {
                return aClass12Array279[j];
            }
        }
        anInt280 = (anInt280 + 1) % 20;
        Class12 class12 = aClass12Array279[anInt280] = new Class12();
        aClass44_Sub3_Sub2_278.currentOffset = anIntArray277[i];
        class12.aLong281 = i;
        class12.method215(false, aClass44_Sub3_Sub2_278);
        return class12;
    }

    public void method215(boolean flag, Stream class44_sub3_sub2)
    {
        try
        {
            if(flag)
            {
                for(int i = 1; i > 0; i++)
                {
                }
            }
            do
            {
                int j = class44_sub3_sub2.getUnsignedByte();
                if(j == 0)
                {
                    return;
                }
                if(j == 1)
                {
                    int k = class44_sub3_sub2.getUnsignedByte();
                    anIntArray285 = new int[k];
                    for(int j1 = 0; j1 < k; j1++)
                    {
                        anIntArray285[j1] = class44_sub3_sub2.getUnsignedLEShort();
                    }
                } else
                if(j == 2)
                {
                    aString282 = class44_sub3_sub2.getString();
                } else
                if(j == 3)
                {
                    aByteArray283 = class44_sub3_sub2.readBytes(anInt274);
                } else
                if(j == 12)
                {
                    aByte284 = class44_sub3_sub2.get();
                } else
                if(j == 13)
                {
                    anInt287 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(j == 14)
                {
                    anInt288 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(j == 17)
                {
                    anInt288 = class44_sub3_sub2.getUnsignedLEShort();
                    anInt289 = class44_sub3_sub2.getUnsignedLEShort();
                    anInt290 = class44_sub3_sub2.getUnsignedLEShort();
                    anInt291 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(j >= 30 && j < 40)
                {
                    if(aStringArray294 == null)
                    {
                        aStringArray294 = new String[5];
                    }
                    aStringArray294[j - 30] = class44_sub3_sub2.getString();
                    if(aStringArray294[j - 30].equalsIgnoreCase("hidden"))
                    {
                        aStringArray294[j - 30] = null;
                    }
                } else
                if(j == 40)
                {
                    int l = class44_sub3_sub2.getUnsignedByte();
                    anIntArray292 = new int[l];
                    anIntArray293 = new int[l];
                    for(int k1 = 0; k1 < l; k1++)
                    {
                        anIntArray292[k1] = class44_sub3_sub2.getUnsignedLEShort();
                        anIntArray293[k1] = class44_sub3_sub2.getUnsignedLEShort();
                    }
                } else
                if(j == 60)
                {
                    int i1 = class44_sub3_sub2.getUnsignedByte();
                    anIntArray286 = new int[i1];
                    for(int l1 = 0; l1 < i1; l1++)
                    {
                        anIntArray286[l1] = class44_sub3_sub2.getUnsignedLEShort();
                    }
                } else
                if(j == 90)
                {
                    anInt295 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(j == 91)
                {
                    anInt296 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(j == 92)
                {
                    anInt297 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(j == 93)
                {
                    aBoolean298 = false;
                } else
                if(j == 95)
                {
                    anInt299 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(j == 97)
                {
                    anInt300 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(j == 98)
                {
                    anInt301 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(j == 99)
                {
                    aBoolean302 = true;
                } else
                if(j == 100)
                {
                    anInt303 = class44_sub3_sub2.get();
                } else
                if(j == 101)
                {
                    anInt304 = class44_sub3_sub2.get() * 5;
                } else
                if(j == 102)
                {
                    anInt305 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(j == 103)
                {
                    anInt306 = class44_sub3_sub2.getUnsignedLEShort();
                }
            } while(true);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("19436, " + flag + ", " + class44_sub3_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class44_Sub3_Sub4_Sub4 method216(int i, int j, int k, int ai[])
    {
        try
        {
            Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = (Class44_Sub3_Sub4_Sub4)aClass39_307.method339(aLong281);
            if(i != 0)
            {
                for(int l = 1; l > 0; l++)
                {
                }
            }
            if(class44_sub3_sub4_sub4 == null)
            {
                boolean flag = false;
                for(int i1 = 0; i1 < anIntArray285.length; i1++)
                {
                    if(!Class44_Sub3_Sub4_Sub4.method507(anIntArray285[i1]))
                    {
                        flag = true;
                    }
                }
                if(flag)
                {
                    return null;
                }
                Class44_Sub3_Sub4_Sub4 aclass44_sub3_sub4_sub4[] = new Class44_Sub3_Sub4_Sub4[anIntArray285.length];
                for(int j1 = 0; j1 < anIntArray285.length; j1++)
                {
                    aclass44_sub3_sub4_sub4[j1] = Class44_Sub3_Sub4_Sub4.method506(anIntArray285[j1], aByte275);
                }
                if(aclass44_sub3_sub4_sub4.length == 1)
                {
                    class44_sub3_sub4_sub4 = aclass44_sub3_sub4_sub4[0];
                } else
                {
                    class44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4(aclass44_sub3_sub4_sub4, aclass44_sub3_sub4_sub4.length, -33019);
                }
                if(anIntArray292 != null)
                {
                    for(int k1 = 0; k1 < anIntArray292.length; k1++)
                    {
                        class44_sub3_sub4_sub4.method520(anIntArray292[k1], anIntArray293[k1]);
                    }
                }
                class44_sub3_sub4_sub4.method513((byte)3);
                class44_sub3_sub4_sub4.method523(64 + anInt303, 850 + anInt304, -30, -50, -30, true);
                aClass39_307.method340(aLong281, (byte)76, class44_sub3_sub4_sub4);
            }
            Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4_1 = Class44_Sub3_Sub4_Sub4.aClass44_Sub3_Sub4_Sub4_1530;
            class44_sub3_sub4_sub4_1.method508(Class11.method211(k, 0) & Class11.method211(j, 0), class44_sub3_sub4_sub4, 0);
            if(k != -1 && j != -1)
            {
                class44_sub3_sub4_sub4_1.method515(k, true, j, ai);
            } else
            if(k != -1)
            {
                class44_sub3_sub4_sub4_1.method514(k, 188);
            }
            if(anInt300 != 128 || anInt301 != 128)
            {
                class44_sub3_sub4_sub4_1.method522(anInt300, anInt300, anInt301, (byte)31);
            }
            class44_sub3_sub4_sub4_1.method510(-18258);
            class44_sub3_sub4_sub4_1.anIntArrayArray1567 = null;
            class44_sub3_sub4_sub4_1.anIntArrayArray1566 = null;
            if(aByte284 == 1)
            {
                class44_sub3_sub4_sub4_1.aBoolean1568 = true;
            }
            return class44_sub3_sub4_sub4_1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("77537, " + i + ", " + j + ", " + k + ", " + ai + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class44_Sub3_Sub4_Sub4 method217(byte byte0)
    {
        try
        {
            if(byte0 != 105)
            {
                throw new NullPointerException();
            }
            if(anIntArray286 == null)
            {
                return null;
            }
            boolean flag = false;
            for(int i = 0; i < anIntArray286.length; i++)
            {
                if(!Class44_Sub3_Sub4_Sub4.method507(anIntArray286[i]))
                {
                    flag = true;
                }
            }
            if(flag)
            {
                return null;
            }
            Class44_Sub3_Sub4_Sub4 aclass44_sub3_sub4_sub4[] = new Class44_Sub3_Sub4_Sub4[anIntArray286.length];
            for(int j = 0; j < anIntArray286.length; j++)
            {
                aclass44_sub3_sub4_sub4[j] = Class44_Sub3_Sub4_Sub4.method506(anIntArray286[j], aByte275);
            }
            Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4;
            if(aclass44_sub3_sub4_sub4.length == 1)
            {
                class44_sub3_sub4_sub4 = aclass44_sub3_sub4_sub4[0];
            } else
            {
                class44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4(aclass44_sub3_sub4_sub4, aclass44_sub3_sub4_sub4.length, -33019);
            }
            if(anIntArray292 != null)
            {
                for(int k = 0; k < anIntArray292.length; k++)
                {
                    class44_sub3_sub4_sub4.method520(anIntArray292[k], anIntArray293[k]);
                }
            }
            return class44_sub3_sub4_sub4;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("20491, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class12()
    {
        aBoolean273 = false;
        anInt274 = 44692;
        aByte275 = 4;
        aLong281 = -1L;
        aByte284 = 1;
        anInt287 = -1;
        anInt288 = -1;
        anInt289 = -1;
        anInt290 = -1;
        anInt291 = -1;
        anInt295 = -1;
        anInt296 = -1;
        anInt297 = -1;
        aBoolean298 = true;
        anInt299 = -1;
        anInt300 = 128;
        anInt301 = 128;
        aBoolean302 = false;
        anInt305 = -1;
        anInt306 = 32;
    }

}
