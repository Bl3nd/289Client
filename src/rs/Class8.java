package src.rs;
import sign.signlink;
import src.rs.animable.Animable;
import src.rs.animable.impl.Model;
import src.rs.stream.Stream;

public class Class8
{

    public boolean aBoolean203;
    public int anInt204;
    public byte aByte205;
    public int anInt206;
    public int anInt207;
    public int anInt208;
    public static int anInt209;
    public static int anIntArray210[];
    public static Stream aClass44_Sub3_Sub2_211;
    public static Class8 aClass8Array212[];
    public static int anInt213;
    public static Model aClass44_Sub3_Sub4_Sub4Array214[] = new Model[4];
    public int anInt215;
    public int anIntArray216[];
    public int anIntArray217[];
    public String aString218;
    public byte aByteArray219[];
    public int anIntArray220[];
    public int anIntArray221[];
    public int anInt222;
    public int anInt223;
    public boolean aBoolean224;
    public boolean aBoolean225;
    public boolean aBoolean226;
    public boolean aBoolean227;
    public boolean aBoolean228;
    public boolean aBoolean229;
    public int anInt230;
    public int anInt231;
    public byte aByte232;
    public byte aByte233;
    public String aStringArray234[];
    public int anInt235;
    public int anInt236;
    public boolean aBoolean237;
    public boolean aBoolean238;
    public int anInt239;
    public int anInt240;
    public int anInt241;
    public int anInt242;
    public int anInt243;
    public int anInt244;
    public int anInt245;
    public boolean aBoolean246;
    public boolean aBoolean247;
    public int anInt248;
    public int anInt249;
    public int anIntArray250[];
    public static Class39 aClass39_251 = new Class39((byte)7, 500);
    public static Class39 aClass39_252 = new Class39((byte)7, 30);

    public static void method197(Class47 class47)
    {
        aClass44_Sub3_Sub2_211 = new Stream(class47.method549("loc.dat", null), 15787);
        Stream class44_sub3_sub2 = new Stream(class47.method549("loc.idx", null), 15787);
        anInt209 = class44_sub3_sub2.getUnsignedLEShort();
        anIntArray210 = new int[anInt209];
        int i = 2;
        for(int j = 0; j < anInt209; j++)
        {
            anIntArray210[j] = i;
            i += class44_sub3_sub2.getUnsignedLEShort();
        }
        aClass8Array212 = new Class8[20];
        for(int k = 0; k < 20; k++)
        {
            aClass8Array212[k] = new Class8();
        }
    }

    public static void method198(byte byte0)
    {
        try
        {
            aClass39_251 = null;
            aClass39_252 = null;
            anIntArray210 = null;
            aClass8Array212 = null;
            aClass44_Sub3_Sub2_211 = null;
            if(byte0 != 42)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("19919, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static Class8 method199(int i)
    {
        for(int j = 0; j < 20; j++)
        {
            if(aClass8Array212[j].anInt215 == i)
            {
                return aClass8Array212[j];
            }
        }
        anInt213 = (anInt213 + 1) % 20;
        Class8 class8 = aClass8Array212[anInt213];
        aClass44_Sub3_Sub2_211.currentOffset = anIntArray210[i];
        class8.anInt215 = i;
        class8.method200();
        class8.method201(false, aClass44_Sub3_Sub2_211);
        return class8;
    }

    public void method200()
    {
        anIntArray216 = null;
        anIntArray217 = null;
        aString218 = null;
        aByteArray219 = null;
        anIntArray220 = null;
        anIntArray221 = null;
        anInt222 = 1;
        anInt223 = 1;
        aBoolean224 = true;
        aBoolean225 = true;
        aBoolean226 = false;
        aBoolean227 = false;
        aBoolean228 = false;
        aBoolean229 = false;
        anInt230 = -1;
        anInt231 = 16;
        aByte232 = 0;
        aByte233 = 0;
        aStringArray234 = null;
        anInt235 = -1;
        anInt236 = -1;
        aBoolean237 = false;
        aBoolean238 = true;
        anInt239 = 128;
        anInt240 = 128;
        anInt241 = 128;
        anInt245 = 0;
        anInt242 = 0;
        anInt243 = 0;
        anInt244 = 0;
        aBoolean246 = false;
        aBoolean247 = false;
        anInt248 = -1;
        anInt249 = -1;
        anIntArray250 = null;
    }

    public void method201(boolean flag, Stream class44_sub3_sub2)
    {
        try
        {
            int i = -1;
            if(flag)
            {
                anInt208 = -264;
            }
label0:
            do
            {
                int j;
                do
                {
                    j = class44_sub3_sub2.getUnsignedByte();
                    if(j == 0)
                    {
                        break label0;
                    }
                    if(j == 1)
                    {
                        int k = class44_sub3_sub2.getUnsignedByte();
                        if(k > 0)
                        {
                            anIntArray217 = new int[k];
                            anIntArray216 = new int[k];
                            for(int k1 = 0; k1 < k; k1++)
                            {
                                anIntArray216[k1] = class44_sub3_sub2.getUnsignedLEShort();
                                anIntArray217[k1] = class44_sub3_sub2.getUnsignedByte();
                            }
                        }
                    } else
                    if(j == 2)
                    {
                        aString218 = class44_sub3_sub2.getString();
                    } else
                    if(j == 3)
                    {
                        aByteArray219 = class44_sub3_sub2.readBytes(anInt204);
                    } else
                    if(j == 5)
                    {
                        int l = class44_sub3_sub2.getUnsignedByte();
                        if(l > 0)
                        {
                            anIntArray217 = null;
                            anIntArray216 = new int[l];
                            for(int l1 = 0; l1 < l; l1++)
                            {
                                anIntArray216[l1] = class44_sub3_sub2.getUnsignedLEShort();
                            }
                        }
                    } else
                    if(j == 14)
                    {
                        anInt222 = class44_sub3_sub2.getUnsignedByte();
                    } else
                    if(j == 15)
                    {
                        anInt223 = class44_sub3_sub2.getUnsignedByte();
                    } else
                    if(j == 17)
                    {
                        aBoolean224 = false;
                    } else
                    if(j == 18)
                    {
                        aBoolean225 = false;
                    } else
                    if(j == 19)
                    {
                        i = class44_sub3_sub2.getUnsignedByte();
                        if(i == 1)
                        {
                            aBoolean226 = true;
                        }
                    } else
                    if(j == 21)
                    {
                        aBoolean227 = true;
                    } else
                    if(j == 22)
                    {
                        aBoolean228 = true;
                    } else
                    if(j == 23)
                    {
                        aBoolean229 = true;
                    } else
                    if(j == 24)
                    {
                        anInt230 = class44_sub3_sub2.getUnsignedLEShort();
                        if(anInt230 == 65535)
                        {
                            anInt230 = -1;
                        }
                    } else
                    if(j == 28)
                    {
                        anInt231 = class44_sub3_sub2.getUnsignedByte();
                    } else
                    if(j == 29)
                    {
                        aByte232 = class44_sub3_sub2.get();
                    } else
                    if(j == 39)
                    {
                        aByte233 = class44_sub3_sub2.get();
                    } else
                    if(j >= 30 && j < 39)
                    {
                        if(aStringArray234 == null)
                        {
                            aStringArray234 = new String[5];
                        }
                        aStringArray234[j - 30] = class44_sub3_sub2.getString();
                        if(aStringArray234[j - 30].equalsIgnoreCase("hidden"))
                        {
                            aStringArray234[j - 30] = null;
                        }
                    } else
                    if(j == 40)
                    {
                        int i1 = class44_sub3_sub2.getUnsignedByte();
                        anIntArray220 = new int[i1];
                        anIntArray221 = new int[i1];
                        for(int i2 = 0; i2 < i1; i2++)
                        {
                            anIntArray220[i2] = class44_sub3_sub2.getUnsignedLEShort();
                            anIntArray221[i2] = class44_sub3_sub2.getUnsignedLEShort();
                        }
                    } else
                    if(j == 60)
                    {
                        anInt235 = class44_sub3_sub2.getUnsignedLEShort();
                    } else
                    if(j == 62)
                    {
                        aBoolean237 = true;
                    } else
                    if(j == 64)
                    {
                        aBoolean238 = false;
                    } else
                    if(j == 65)
                    {
                        anInt239 = class44_sub3_sub2.getUnsignedLEShort();
                    } else
                    if(j == 66)
                    {
                        anInt240 = class44_sub3_sub2.getUnsignedLEShort();
                    } else
                    if(j == 67)
                    {
                        anInt241 = class44_sub3_sub2.getUnsignedLEShort();
                    } else
                    if(j == 68)
                    {
                        anInt236 = class44_sub3_sub2.getUnsignedLEShort();
                    } else
                    if(j == 69)
                    {
                        anInt245 = class44_sub3_sub2.getUnsignedByte();
                    } else
                    if(j == 70)
                    {
                        anInt242 = class44_sub3_sub2.getForceLEShort();
                    } else
                    if(j == 71)
                    {
                        anInt243 = class44_sub3_sub2.getForceLEShort();
                    } else
                    if(j == 72)
                    {
                        anInt244 = class44_sub3_sub2.getForceLEShort();
                    } else
                    if(j == 73)
                    {
                        aBoolean246 = true;
                    } else
                    if(j == 74)
                    {
                        aBoolean247 = true;
                    } else
                    {
                        if(j != 75)
                        {
                            continue;
                        }
                        anInt248 = class44_sub3_sub2.getUnsignedByte();
                    }
                    continue label0;
                } while(j != 77);
                anInt249 = class44_sub3_sub2.getUnsignedLEShort();
                int j1 = class44_sub3_sub2.getUnsignedByte();
                anIntArray250 = new int[j1 + 1];
                for(int j2 = 0; j2 <= j1; j2++)
                {
                    anIntArray250[j2] = class44_sub3_sub2.getUnsignedLEShort();
                    if(anIntArray250[j2] == 65535)
                    {
                        anIntArray250[j2] = -1;
                    }
                }
            } while(true);
            if(i == -1)
            {
                aBoolean226 = false;
                if(anIntArray216 != null && (anIntArray217 == null || anIntArray217[0] == 10))
                {
                    aBoolean226 = true;
                }
                if(aStringArray234 != null)
                {
                    aBoolean226 = true;
                }
            }
            if(aBoolean247)
            {
                aBoolean224 = false;
                aBoolean225 = false;
            }
            if(anInt248 == -1)
            {
                anInt248 = aBoolean224 ? 1 : 0;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("43978, " + flag + ", " + class44_sub3_sub2 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public boolean method202(int i, int j)
    {
        try
        {
            j = 56 / j;
            if(anIntArray217 == null)
            {
                if(anIntArray216 == null)
                {
                    return true;
                }
                if(i != 10)
                {
                    return true;
                }
                boolean flag = true;
                for(int l = 0; l < anIntArray216.length; l++)
                {
                    flag &= Model.method507(anIntArray216[l] & 0xffff);
                }
                return flag;
            }
            for(int k = 0; k < anIntArray217.length; k++)
            {
                if(anIntArray217[k] == i)
                {
                    return Model.method507(anIntArray216[k] & 0xffff);
                }
            }
            return true;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("3902, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method203(int i)
    {
        try
        {
            if(anIntArray216 == null)
            {
                return true;
            }
            boolean flag = true;
            for(int j = 0; j < anIntArray216.length; j++)
            {
                flag &= Model.method507(anIntArray216[j] & 0xffff);
            }
            while(i >= 0)
            {
                aBoolean203 = !aBoolean203;
            }
            return flag;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("61709, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method204(Class43_Sub1 class43_sub1, byte byte0)
    {
        try
        {
            if(anIntArray216 == null)
            {
                return;
            }
            for(int i = 0; i < anIntArray216.length; i++)
            {
                class43_sub1.method397(anIntArray216[i] & 0xffff, 0, (byte)6);
            }
            if(byte0 == 2)
            {
                byte0 = 0;
                return;
            }
            for(int j = 1; j > 0; j++)
            {
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("2074, " + class43_sub1 + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Model method205(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        Model class44_sub3_sub4_sub4 = method206((byte)-74, k1, j, i);
        if(class44_sub3_sub4_sub4 == null)
        {
            return null;
        }
        if(aBoolean227 || aBoolean228)
        {
            class44_sub3_sub4_sub4 = new Model(aBoolean228, 0, class44_sub3_sub4_sub4, aBoolean227);
        }
        if(aBoolean227)
        {
            int l1 = (k + l + i1 + j1) / 4;
            for(int i2 = 0; i2 < class44_sub3_sub4_sub4.anInt1535; i2++)
            {
                int j2 = class44_sub3_sub4_sub4.anIntArray1536[i2];
                int k2 = class44_sub3_sub4_sub4.anIntArray1538[i2];
                int l2 = k + ((l - k) * (j2 + 64)) / 128;
                int i3 = j1 + ((i1 - j1) * (j2 + 64)) / 128;
                int j3 = l2 + ((i3 - l2) * (k2 + 64)) / 128;
                class44_sub3_sub4_sub4.anIntArray1537[i2] += j3 - l1;
            }
            class44_sub3_sub4_sub4.method511(anInt207);
        }
        return class44_sub3_sub4_sub4;
    }

    public Model method206(byte byte0, int i, int j, int k)
    {
        try
        {
            Model class44_sub3_sub4_sub4 = null;
            long l;
            if(anIntArray217 == null)
            {
                if(k != 10)
                {
                    return null;
                }
                l = (long)((anInt215 << 6) + j) + ((long)(i + 1) << 32);
                Model class44_sub3_sub4_sub4_1 = (Model)aClass39_252.method339(l);
                if(class44_sub3_sub4_sub4_1 != null)
                {
                    return class44_sub3_sub4_sub4_1;
                }
                if(anIntArray216 == null)
                {
                    return null;
                }
                boolean flag1 = aBoolean237 ^ (j > 3);
                int k1 = anIntArray216.length;
                for(int l1 = 0; l1 < k1; l1++)
                {
                    int k2 = anIntArray216[l1];
                    if(flag1)
                    {
                        k2 += 0x10000;
                    }
                    class44_sub3_sub4_sub4 = (Model)aClass39_251.method339(k2);
                    if(class44_sub3_sub4_sub4 == null)
                    {
                        class44_sub3_sub4_sub4 = Model.method506(k2 & 0xffff, aByte205);
                        if(class44_sub3_sub4_sub4 == null)
                        {
                            return null;
                        }
                        if(flag1)
                        {
                            class44_sub3_sub4_sub4.method521(6);
                        }
                        aClass39_251.method340(k2, (byte)76, class44_sub3_sub4_sub4);
                    }
                    if(k1 > 1)
                    {
                        aClass44_Sub3_Sub4_Sub4Array214[l1] = class44_sub3_sub4_sub4;
                    }
                }
                if(k1 > 1)
                {
                    class44_sub3_sub4_sub4 = new Model(aClass44_Sub3_Sub4_Sub4Array214, k1, -33019);
                }
            } else
            {
                int i1 = -1;
                for(int j1 = 0; j1 < anIntArray217.length; j1++)
                {
                    if(anIntArray217[j1] != k)
                    {
                        continue;
                    }
                    i1 = j1;
                    break;
                }
                if(i1 == -1)
                {
                    return null;
                }
                l = (long)((anInt215 << 6) + (i1 << 3) + j) + ((long)(i + 1) << 32);
                Model class44_sub3_sub4_sub4_2 = (Model)aClass39_252.method339(l);
                if(class44_sub3_sub4_sub4_2 != null)
                {
                    return class44_sub3_sub4_sub4_2;
                }
                int i2 = anIntArray216[i1];
                boolean flag3 = aBoolean237 ^ (j > 3);
                if(flag3)
                {
                    i2 += 0x10000;
                }
                class44_sub3_sub4_sub4 = (Model)aClass39_251.method339(i2);
                if(class44_sub3_sub4_sub4 == null)
                {
                    class44_sub3_sub4_sub4 = Model.method506(i2 & 0xffff, aByte205);
                    if(class44_sub3_sub4_sub4 == null)
                    {
                        return null;
                    }
                    if(flag3)
                    {
                        class44_sub3_sub4_sub4.method521(6);
                    }
                    aClass39_251.method340(i2, (byte)76, class44_sub3_sub4_sub4);
                }
            }
            if(byte0 != -74)
            {
                throw new NullPointerException();
            }
            boolean flag;
            if(anInt239 != 128 || anInt240 != 128 || anInt241 != 128)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean flag2;
            if(anInt242 != 0 || anInt243 != 0 || anInt244 != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            Model class44_sub3_sub4_sub4_3 = new Model(class44_sub3_sub4_sub4, Class11.method211(i, 0), j == 0 && i == -1 && !flag && !flag2, anInt206, anIntArray220 == null);
            if(i != -1)
            {
                class44_sub3_sub4_sub4_3.method513((byte)3);
                class44_sub3_sub4_sub4_3.method514(i, 188);
                class44_sub3_sub4_sub4_3.anIntArrayArray1567 = null;
                class44_sub3_sub4_sub4_3.anIntArrayArray1566 = null;
            }
            while(j-- > 0)
            {
                class44_sub3_sub4_sub4_3.method517(0);
            }
            if(anIntArray220 != null)
            {
                for(int j2 = 0; j2 < anIntArray220.length; j2++)
                {
                    class44_sub3_sub4_sub4_3.method520(anIntArray220[j2], anIntArray221[j2]);
                }
            }
            if(flag)
            {
                class44_sub3_sub4_sub4_3.method522(anInt239, anInt241, anInt240, (byte)31);
            }
            if(flag2)
            {
                class44_sub3_sub4_sub4_3.method519(anInt243, anInt242, (byte)2, anInt244);
            }
            class44_sub3_sub4_sub4_3.method523(64 + aByte232, 768 + aByte233 * 5, -50, -10, -50, !aBoolean228);
            if(anInt248 == 1)
            {
                class44_sub3_sub4_sub4_3.anInt1563 = ((Animable) (class44_sub3_sub4_sub4_3)).modelHeight;
            }
            aClass39_252.method340(l, (byte)76, class44_sub3_sub4_sub4_3);
            return class44_sub3_sub4_sub4_3;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("13988, " + byte0 + ", " + i + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class8()
    {
        aBoolean203 = false;
        anInt204 = 44692;
        aByte205 = 4;
        anInt207 = -139;
        anInt215 = -1;
    }

}
