package src.rs;
import sign.signlink;
import src.rs.animable.Animable;
import src.rs.animable.impl.Model;
import src.rs.drawing.DrawingArea;
import src.rs.drawing.impl.Rasterizer;
import src.rs.drawing.impl.Sprite;
import src.rs.stream.Stream;

public class Class14
{

    public boolean aBoolean316;
    public int anInt317;
    public byte aByte318;
    public static int anInt319 = 6;
    public static byte aByte320 = 1;
    public static byte aByte321 = 8;
    public int anInt322;
    public static int itemCount;
    public static int anIntArray324[];
    public static Stream aClass44_Sub3_Sub2_325;
    public static Class14 aClass14Array326[];
    public static int anInt327;
    public static boolean aBoolean328 = true;
    public int anInt329;
    public int anInt330;
    public String aString331;
    public byte aByteArray332[];
    public int anIntArray333[];
    public int anIntArray334[];
    public int anInt335;
    public int anInt336;
    public int anInt337;
    public int anInt338;
    public int anInt339;
    public int anInt340;
    public int anInt341;
    public boolean aBoolean342;
    public int anInt343;
    public boolean aBoolean344;
    public String aStringArray345[];
    public String aStringArray346[];
    public int anInt347;
    public int anInt348;
    public byte aByte349;
    public int anInt350;
    public int anInt351;
    public byte aByte352;
    public int anInt353;
    public int anInt354;
    public int anInt355;
    public int anInt356;
    public int anInt357;
    public int anInt358;
    public int anIntArray359[];
    public int anIntArray360[];
    public int anInt361;
    public int anInt362;
    public int anInt363;
    public int anInt364;
    public int anInt365;
    public int anInt366;
    public int anInt367;
    public int teamId;
    public static Class39 aClass39_369 = new Class39((byte)7, 50);
    public static Class39 aClass39_370 = new Class39((byte)7, 100);

    public static void method218(Class47 class47)
    {
        aClass44_Sub3_Sub2_325 = new Stream(class47.method549("obj.dat", null), 15787);
        Stream class44_sub3_sub2 = new Stream(class47.method549("obj.idx", null), 15787);
        itemCount = class44_sub3_sub2.getUnsignedLEShort();
        anIntArray324 = new int[itemCount];
        int i = 2;
        for(int j = 0; j < itemCount; j++)
        {
            anIntArray324[j] = i;
            i += class44_sub3_sub2.getUnsignedLEShort();
        }
        aClass14Array326 = new Class14[10];
        for(int k = 0; k < 10; k++)
        {
            aClass14Array326[k] = new Class14();
        }
    }

    public static void method219(byte byte0)
    {
        try
        {
            aClass39_369 = null;
            aClass39_370 = null;
            anIntArray324 = null;
            aClass14Array326 = null;
            aClass44_Sub3_Sub2_325 = null;
            if(byte0 != 42)
            {
                anInt319 = 87;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("13898, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static Class14 method220(int i)
    {
        for(int j = 0; j < 10; j++)
        {
            if(aClass14Array326[j].anInt329 == i)
            {
                return aClass14Array326[j];
            }
        }
        anInt327 = (anInt327 + 1) % 10;
        Class14 class14 = aClass14Array326[anInt327];
        aClass44_Sub3_Sub2_325.currentOffset = anIntArray324[i];
        class14.anInt329 = i;
        class14.method221();
        class14.method222(false, aClass44_Sub3_Sub2_325);
        if(class14.anInt362 != -1)
        {
            class14.method223(6);
        }
        if(!aBoolean328 && class14.aBoolean344)
        {
            class14.aString331 = "Members Object";
            class14.aByteArray332 = "Login to a members' server to use this object.".getBytes();
            class14.aStringArray345 = null;
            class14.aStringArray346 = null;
        }
        return class14;
    }

    public void method221()
    {
        anInt330 = 0;
        aString331 = null;
        aByteArray332 = null;
        anIntArray333 = null;
        anIntArray334 = null;
        anInt335 = 2000;
        anInt336 = 0;
        anInt337 = 0;
        anInt338 = 0;
        anInt339 = 0;
        anInt340 = 0;
        anInt341 = -1;
        aBoolean342 = false;
        anInt343 = 1;
        aBoolean344 = false;
        aStringArray345 = null;
        aStringArray346 = null;
        anInt347 = -1;
        anInt348 = -1;
        aByte349 = 0;
        anInt350 = -1;
        anInt351 = -1;
        aByte352 = 0;
        anInt353 = -1;
        anInt354 = -1;
        anInt355 = -1;
        anInt356 = -1;
        anInt357 = -1;
        anInt358 = -1;
        anIntArray359 = null;
        anIntArray360 = null;
        anInt361 = -1;
        anInt362 = -1;
        anInt363 = 128;
        anInt364 = 128;
        anInt365 = 128;
        anInt366 = 0;
        anInt367 = 0;
        teamId = 0;
    }

    public void method222(boolean flag, Stream class44_sub3_sub2)
    {
        try
        {
            if(flag)
            {
                throw new NullPointerException();
            }
            do
            {
                int i = class44_sub3_sub2.getUnsignedByte();
                if(i == 0)
                {
                    return;
                }
                if(i == 1)
                {
                    anInt330 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 2)
                {
                    aString331 = class44_sub3_sub2.getString();
                } else
                if(i == 3)
                {
                    aByteArray332 = class44_sub3_sub2.readBytes(anInt317);
                } else
                if(i == 4)
                {
                    anInt335 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 5)
                {
                    anInt336 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 6)
                {
                    anInt337 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 7)
                {
                    anInt339 = class44_sub3_sub2.getUnsignedLEShort();
                    if(anInt339 > 32767)
                    {
                        anInt339 -= 0x10000;
                    }
                } else
                if(i == 8)
                {
                    anInt340 = class44_sub3_sub2.getUnsignedLEShort();
                    if(anInt340 > 32767)
                    {
                        anInt340 -= 0x10000;
                    }
                } else
                if(i == 10)
                {
                    anInt341 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 11)
                {
                    aBoolean342 = true;
                } else
                if(i == 12)
                {
                    anInt343 = class44_sub3_sub2.getInt();
                } else
                if(i == 16)
                {
                    aBoolean344 = true;
                } else
                if(i == 23)
                {
                    anInt347 = class44_sub3_sub2.getUnsignedLEShort();
                    aByte349 = class44_sub3_sub2.get();
                } else
                if(i == 24)
                {
                    anInt348 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 25)
                {
                    anInt350 = class44_sub3_sub2.getUnsignedLEShort();
                    aByte352 = class44_sub3_sub2.get();
                } else
                if(i == 26)
                {
                    anInt351 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i >= 30 && i < 35)
                {
                    if(aStringArray345 == null)
                    {
                        aStringArray345 = new String[5];
                    }
                    aStringArray345[i - 30] = class44_sub3_sub2.getString();
                    if(aStringArray345[i - 30].equalsIgnoreCase("hidden"))
                    {
                        aStringArray345[i - 30] = null;
                    }
                } else
                if(i >= 35 && i < 40)
                {
                    if(aStringArray346 == null)
                    {
                        aStringArray346 = new String[5];
                    }
                    aStringArray346[i - 35] = class44_sub3_sub2.getString();
                } else
                if(i == 40)
                {
                    int j = class44_sub3_sub2.getUnsignedByte();
                    anIntArray333 = new int[j];
                    anIntArray334 = new int[j];
                    for(int k = 0; k < j; k++)
                    {
                        anIntArray333[k] = class44_sub3_sub2.getUnsignedLEShort();
                        anIntArray334[k] = class44_sub3_sub2.getUnsignedLEShort();
                    }
                } else
                if(i == 78)
                {
                    anInt353 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 79)
                {
                    anInt354 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 90)
                {
                    anInt355 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 91)
                {
                    anInt357 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 92)
                {
                    anInt356 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 93)
                {
                    anInt358 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 95)
                {
                    anInt338 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 97)
                {
                    anInt361 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 98)
                {
                    anInt362 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i >= 100 && i < 110)
                {
                    if(anIntArray359 == null)
                    {
                        anIntArray359 = new int[10];
                        anIntArray360 = new int[10];
                    }
                    anIntArray359[i - 100] = class44_sub3_sub2.getUnsignedLEShort();
                    anIntArray360[i - 100] = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 110)
                {
                    anInt363 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 111)
                {
                    anInt364 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 112)
                {
                    anInt365 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 113)
                {
                    anInt366 = class44_sub3_sub2.get();
                } else
                if(i == 114)
                {
                    anInt367 = class44_sub3_sub2.get() * 5;
                } else
                if(i == 115)
                {
                    teamId = class44_sub3_sub2.getUnsignedByte();
                }
            } while(true);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("33855, " + flag + ", " + class44_sub3_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method223(int i)
    {
        try
        {
            Class14 class14 = method220(anInt362);
            anInt330 = class14.anInt330;
            anInt335 = class14.anInt335;
            anInt336 = class14.anInt336;
            anInt337 = class14.anInt337;
            anInt338 = class14.anInt338;
            anInt339 = class14.anInt339;
            anInt340 = class14.anInt340;
            anIntArray333 = class14.anIntArray333;
            anIntArray334 = class14.anIntArray334;
            Class14 class14_1 = method220(anInt361);
            aString331 = class14_1.aString331;
            aBoolean344 = class14_1.aBoolean344;
            anInt343 = class14_1.anInt343;
            String s = "a";
            char c = class14_1.aString331.charAt(0);
            if(i != 6)
            {
                anInt317 = -375;
            }
            if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            {
                s = "an";
            }
            aByteArray332 = ("Swap this note at any bank for " + s + " " + class14_1.aString331 + ".").getBytes();
            aBoolean342 = true;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("48619, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Model method224(int i)
    {
        if(anIntArray359 != null && i > 1)
        {
            int j = -1;
            for(int k = 0; k < 10; k++)
            {
                if(i >= anIntArray360[k] && anIntArray360[k] != 0)
                {
                    j = anIntArray359[k];
                }
            }
            if(j != -1)
            {
                return method220(j).method224(1);
            }
        }
        Model class44_sub3_sub4_sub4 = (Model)aClass39_369.method339(anInt329);
        if(class44_sub3_sub4_sub4 != null)
        {
            return class44_sub3_sub4_sub4;
        }
        class44_sub3_sub4_sub4 = Model.method506(anInt330, aByte318);
        if(class44_sub3_sub4_sub4 == null)
        {
            return null;
        }
        if(anInt363 != 128 || anInt364 != 128 || anInt365 != 128)
        {
            class44_sub3_sub4_sub4.method522(anInt363, anInt365, anInt364, (byte)31);
        }
        if(anIntArray333 != null)
        {
            for(int l = 0; l < anIntArray333.length; l++)
            {
                class44_sub3_sub4_sub4.method520(anIntArray333[l], anIntArray334[l]);
            }
        }
        class44_sub3_sub4_sub4.method523(64 + anInt366, 768 + anInt367, -50, -10, -50, true);
        class44_sub3_sub4_sub4.singleTile = true;
        aClass39_369.method340(anInt329, (byte)76, class44_sub3_sub4_sub4);
        return class44_sub3_sub4_sub4;
    }

    public Model method225(boolean flag, int i)
    {
        try
        {
            if(anIntArray359 != null && i > 1)
            {
                int j = -1;
                for(int k = 0; k < 10; k++)
                {
                    if(i >= anIntArray360[k] && anIntArray360[k] != 0)
                    {
                        j = anIntArray359[k];
                    }
                }
                if(j != -1)
                {
                    return method220(j).method225(true, 1);
                }
            }
            Model class44_sub3_sub4_sub4 = Model.method506(anInt330, aByte318);
            if(!flag)
            {
                anInt322 = 243;
            }
            if(class44_sub3_sub4_sub4 == null)
            {
                return null;
            }
            if(anIntArray333 != null)
            {
                for(int l = 0; l < anIntArray333.length; l++)
                {
                    class44_sub3_sub4_sub4.method520(anIntArray333[l], anIntArray334[l]);
                }
            }
            return class44_sub3_sub4_sub4;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("56792, " + flag + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static Sprite method226(int i, int j, int k, int l)
    {
        try
        {
            if(k == 0)
            {
                Sprite class44_sub3_sub1_sub2 = (Sprite)aClass39_370.method339(j);
                if(class44_sub3_sub1_sub2 != null && class44_sub3_sub1_sub2.maxHeight != l && class44_sub3_sub1_sub2.maxHeight != -1)
                {
                    class44_sub3_sub1_sub2.unlink();
                    class44_sub3_sub1_sub2 = null;
                }
                if(class44_sub3_sub1_sub2 != null)
                {
                    return class44_sub3_sub1_sub2;
                }
            }
            Class14 class14 = method220(j);
            if(class14.anIntArray359 == null)
            {
                l = -1;
            }
            if(l > 1)
            {
                int i1 = -1;
                for(int j1 = 0; j1 < 10; j1++)
                {
                    if(l >= class14.anIntArray360[j1] && class14.anIntArray360[j1] != 0)
                    {
                        i1 = class14.anIntArray359[j1];
                    }
                }
                if(i1 != -1)
                {
                    class14 = method220(i1);
                }
            }
            Model class44_sub3_sub4_sub4 = class14.method224(1);
            if(class44_sub3_sub4_sub4 == null)
            {
                return null;
            }
            Sprite class44_sub3_sub1_sub2_2 = null;
            if(class14.anInt362 != -1)
            {
                class44_sub3_sub1_sub2_2 = method226(54, class14.anInt361, -1, 10);
                if(class44_sub3_sub1_sub2_2 == null)
                {
                    return null;
                }
            }
            Sprite class44_sub3_sub1_sub2_1 = new Sprite(32, 32);
            int k1 = Rasterizer.centerX;
            int l1 = Rasterizer.centerY;
            int ai[] = Rasterizer.lineOffsets;
            int ai1[] = DrawingArea.pixels;
            int i2 = DrawingArea.width;
            int j2 = DrawingArea.height;
            int k2 = DrawingArea.topX;
            int l2 = DrawingArea.bottomX;
            int i3 = DrawingArea.topY;
            int j3 = DrawingArea.bottomY;
            Rasterizer.textured = false;
            DrawingArea.initializeDrawingArea(-78, class44_sub3_sub1_sub2_1.pixels, 32, 32);
            DrawingArea.method411(0, 210, 0, 32, 0, 32);
            Rasterizer.setDefaultBounds((byte)3);
            int k3 = class14.anInt335;
            if(k == -1)
            {
                k3 = (int)((double)k3 * 1.5D);
            }
            if(k > 0)
            {
                k3 = (int)((double)k3 * 1.04D);
            }
            int l3 = Rasterizer.anIntArray1427[class14.anInt336] * k3 >> 16;
            int i4 = Rasterizer.anIntArray1428[class14.anInt336] * k3 >> 16;
            class44_sub3_sub4_sub4.method526(0, class14.anInt337, class14.anInt338, class14.anInt336, class14.anInt339, l3 + ((Animable) (class44_sub3_sub4_sub4)).modelHeight / 2 + class14.anInt340, i4 + class14.anInt340);
            for(int i5 = 31; i5 >= 0; i5--)
            {
                for(int j4 = 31; j4 >= 0; j4--)
                {
                    if(class44_sub3_sub1_sub2_1.pixels[i5 + j4 * 32] == 0)
                    {
                        if(i5 > 0 && class44_sub3_sub1_sub2_1.pixels[(i5 - 1) + j4 * 32] > 1)
                        {
                            class44_sub3_sub1_sub2_1.pixels[i5 + j4 * 32] = 1;
                        } else
                        if(j4 > 0 && class44_sub3_sub1_sub2_1.pixels[i5 + (j4 - 1) * 32] > 1)
                        {
                            class44_sub3_sub1_sub2_1.pixels[i5 + j4 * 32] = 1;
                        } else
                        if(i5 < 31 && class44_sub3_sub1_sub2_1.pixels[i5 + 1 + j4 * 32] > 1)
                        {
                            class44_sub3_sub1_sub2_1.pixels[i5 + j4 * 32] = 1;
                        } else
                        if(j4 < 31 && class44_sub3_sub1_sub2_1.pixels[i5 + (j4 + 1) * 32] > 1)
                        {
                            class44_sub3_sub1_sub2_1.pixels[i5 + j4 * 32] = 1;
                        }
                    }
                }
            }
            if(k > 0)
            {
                for(int j5 = 31; j5 >= 0; j5--)
                {
                    for(int k4 = 31; k4 >= 0; k4--)
                    {
                        if(class44_sub3_sub1_sub2_1.pixels[j5 + k4 * 32] == 0)
                        {
                            if(j5 > 0 && class44_sub3_sub1_sub2_1.pixels[(j5 - 1) + k4 * 32] == 1)
                            {
                                class44_sub3_sub1_sub2_1.pixels[j5 + k4 * 32] = k;
                            } else
                            if(k4 > 0 && class44_sub3_sub1_sub2_1.pixels[j5 + (k4 - 1) * 32] == 1)
                            {
                                class44_sub3_sub1_sub2_1.pixels[j5 + k4 * 32] = k;
                            } else
                            if(j5 < 31 && class44_sub3_sub1_sub2_1.pixels[j5 + 1 + k4 * 32] == 1)
                            {
                                class44_sub3_sub1_sub2_1.pixels[j5 + k4 * 32] = k;
                            } else
                            if(k4 < 31 && class44_sub3_sub1_sub2_1.pixels[j5 + (k4 + 1) * 32] == 1)
                            {
                                class44_sub3_sub1_sub2_1.pixels[j5 + k4 * 32] = k;
                            }
                        }
                    }
                }
            } else
            if(k == 0)
            {
                for(int k5 = 31; k5 >= 0; k5--)
                {
                    for(int l4 = 31; l4 >= 0; l4--)
                    {
                        if(class44_sub3_sub1_sub2_1.pixels[k5 + l4 * 32] == 0 && k5 > 0 && l4 > 0 && class44_sub3_sub1_sub2_1.pixels[(k5 - 1) + (l4 - 1) * 32] > 0)
                        {
                            class44_sub3_sub1_sub2_1.pixels[k5 + l4 * 32] = 0x302020;
                        }
                    }
                }
            }
            if(class14.anInt362 != -1)
            {
                int l5 = class44_sub3_sub1_sub2_2.maxWidth;
                int j6 = class44_sub3_sub1_sub2_2.maxHeight;
                class44_sub3_sub1_sub2_2.maxWidth = 32;
                class44_sub3_sub1_sub2_2.maxHeight = 32;
                class44_sub3_sub1_sub2_2.drawImage(0, aByte320, 0);
                class44_sub3_sub1_sub2_2.maxWidth = l5;
                class44_sub3_sub1_sub2_2.maxHeight = j6;
            }
            if(k == 0)
            {
                aClass39_370.method340(j, (byte)76, class44_sub3_sub1_sub2_1);
            }
            DrawingArea.initializeDrawingArea(-78, ai1, i2, j2);
            DrawingArea.setDrawingArea(aByte321, j3, l2, i3, k2);
            Rasterizer.centerX = k1;
            Rasterizer.centerY = l1;
            Rasterizer.lineOffsets = ai;
            Rasterizer.textured = true;
            if(class14.aBoolean342)
            {
                class44_sub3_sub1_sub2_1.maxWidth = 33;
            } else
            {
                class44_sub3_sub1_sub2_1.maxWidth = 32;
            }
            class44_sub3_sub1_sub2_1.maxHeight = l;
            if(i <= 0)
            {
                for(int i6 = 1; i6 > 0; i6++)
                {
                }
            }
            return class44_sub3_sub1_sub2_1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("85079, " + i + ", " + j + ", " + k + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method227(boolean flag, int i)
    {
        try
        {
            int j = anInt347;
            int k = anInt348;
            int l = anInt353;
            if(flag)
            {
                throw new NullPointerException();
            }
            if(i == 1)
            {
                j = anInt350;
                k = anInt351;
                l = anInt354;
            }
            if(j == -1)
            {
                return true;
            }
            boolean flag1 = true;
            if(!Model.method507(j))
            {
                flag1 = false;
            }
            if(k != -1 && !Model.method507(k))
            {
                flag1 = false;
            }
            if(l != -1 && !Model.method507(l))
            {
                flag1 = false;
            }
            return flag1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("20483, " + flag + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Model method228(int i, int j)
    {
        try
        {
            if(j != 0)
            {
                throw new NullPointerException();
            }
            int k = anInt347;
            int l = anInt348;
            int i1 = anInt353;
            if(i == 1)
            {
                k = anInt350;
                l = anInt351;
                i1 = anInt354;
            }
            if(k == -1)
            {
                return null;
            }
            Model class44_sub3_sub4_sub4 = Model.method506(k, aByte318);
            if(l != -1)
            {
                if(i1 != -1)
                {
                    Model class44_sub3_sub4_sub4_1 = Model.method506(l, aByte318);
                    Model class44_sub3_sub4_sub4_3 = Model.method506(i1, aByte318);
                    Model aclass44_sub3_sub4_sub4_1[] = {
                        class44_sub3_sub4_sub4, class44_sub3_sub4_sub4_1, class44_sub3_sub4_sub4_3
                    };
                    class44_sub3_sub4_sub4 = new Model(aclass44_sub3_sub4_sub4_1, 3, -33019);
                } else
                {
                    Model class44_sub3_sub4_sub4_2 = Model.method506(l, aByte318);
                    Model aclass44_sub3_sub4_sub4[] = {
                        class44_sub3_sub4_sub4, class44_sub3_sub4_sub4_2
                    };
                    class44_sub3_sub4_sub4 = new Model(aclass44_sub3_sub4_sub4, 2, -33019);
                }
            }
            if(i == 0 && aByte349 != 0)
            {
                class44_sub3_sub4_sub4.method519(aByte349, 0, (byte)2, 0);
            }
            if(i == 1 && aByte352 != 0)
            {
                class44_sub3_sub4_sub4.method519(aByte352, 0, (byte)2, 0);
            }
            if(anIntArray333 != null)
            {
                for(int j1 = 0; j1 < anIntArray333.length; j1++)
                {
                    class44_sub3_sub4_sub4.method520(anIntArray333[j1], anIntArray334[j1]);
                }
            }
            return class44_sub3_sub4_sub4;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("48423, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method229(boolean flag, int i)
    {
        try
        {
            if(!flag)
            {
                throw new NullPointerException();
            }
            int j = anInt355;
            int k = anInt356;
            if(i == 1)
            {
                j = anInt357;
                k = anInt358;
            }
            if(j == -1)
            {
                return true;
            }
            boolean flag1 = true;
            if(!Model.method507(j))
            {
                flag1 = false;
            }
            if(k != -1 && !Model.method507(k))
            {
                flag1 = false;
            }
            return flag1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("33754, " + flag + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Model method230(int i, int j)
    {
        try
        {
            i = 52 / i;
            int k = anInt355;
            int l = anInt356;
            if(j == 1)
            {
                k = anInt357;
                l = anInt358;
            }
            if(k == -1)
            {
                return null;
            }
            Model class44_sub3_sub4_sub4 = Model.method506(k, aByte318);
            if(l != -1)
            {
                Model class44_sub3_sub4_sub4_1 = Model.method506(l, aByte318);
                Model aclass44_sub3_sub4_sub4[] = {
                    class44_sub3_sub4_sub4, class44_sub3_sub4_sub4_1
                };
                class44_sub3_sub4_sub4 = new Model(aclass44_sub3_sub4_sub4, 2, -33019);
            }
            if(anIntArray333 != null)
            {
                for(int i1 = 0; i1 < anIntArray333.length; i1++)
                {
                    class44_sub3_sub4_sub4.method520(anIntArray333[i1], anIntArray334[i1]);
                }
            }
            return class44_sub3_sub4_sub4;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("35633, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class14()
    {
        aBoolean316 = false;
        anInt317 = 44692;
        aByte318 = 4;
        anInt322 = 2;
        anInt329 = -1;
    }

}
