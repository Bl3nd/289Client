package src.rs;
import java.io.PrintStream;

import sign.signlink;
import src.rs.animable.impl.Model;
import src.rs.stream.Stream;

public class Class32
{

    public boolean aBoolean556;
    public byte aByte557;
    public static int anInt558;
    public static Class32 cache[];
    public int anInt560;
    public int anInt561;
    public int anInt562;
    public Class26 sequences;
    public int anIntArray564[];
    public int anIntArray565[];
    public int scaleXY;
    public int scaleZ;
    public int rotation;
    public int modelLightFalloff;
    public int modelLightAmbient;
    public static Class39 aClass39_571 = new Class39((byte)7, 30);

    public static void method269(boolean flag, Class47 class47)
    {
        try
        {
            Stream class44_sub3_sub2 = new Stream(class47.method549("spotanim.dat", null), 15787);
            anInt558 = class44_sub3_sub2.getUnsignedLEShort();
            if(!flag)
            {
                return;
            }
            if(cache == null)
            {
                cache = new Class32[anInt558];
            }
            for(int i = 0; i < anInt558; i++)
            {
                if(cache[i] == null)
                {
                    cache[i] = new Class32();
                }
                cache[i].anInt560 = i;
                cache[i].method270(false, class44_sub3_sub2);
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("58052, " + flag + ", " + class47 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method270(boolean flag, Stream class44_sub3_sub2)
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
                    anInt561 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 2)
                {
                    anInt562 = class44_sub3_sub2.getUnsignedLEShort();
                    if(Class26.animations != null)
                    {
                        sequences = Class26.animations[anInt562];
                    }
                } else
                if(i == 4)
                {
                    scaleXY = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 5)
                {
                    scaleZ = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 6)
                {
                    rotation = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 7)
                {
                    modelLightFalloff = class44_sub3_sub2.getUnsignedByte();
                } else
                if(i == 8)
                {
                    modelLightAmbient = class44_sub3_sub2.getUnsignedByte();
                } else
                if(i >= 40 && i < 50)
                {
                    anIntArray564[i - 40] = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i >= 50 && i < 60)
                {
                    anIntArray565[i - 50] = class44_sub3_sub2.getUnsignedLEShort();
                } else
                {
                    System.out.println("Error unrecognised spotanim config code: " + i);
                }
            } while(true);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("87905, " + flag + ", " + class44_sub3_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Model method271()
    {
        Model class44_sub3_sub4_sub4 = (Model)aClass39_571.method339(anInt560);
        if(class44_sub3_sub4_sub4 != null)
        {
            return class44_sub3_sub4_sub4;
        }
        class44_sub3_sub4_sub4 = Model.method506(anInt561, aByte557);
        if(class44_sub3_sub4_sub4 == null)
        {
            return null;
        }
        for(int i = 0; i < 6; i++)
        {
            if(anIntArray564[0] != 0)
            {
                class44_sub3_sub4_sub4.method520(anIntArray564[i], anIntArray565[i]);
            }
        }
        aClass39_571.method340(anInt560, (byte)76, class44_sub3_sub4_sub4);
        return class44_sub3_sub4_sub4;
    }

    public Class32()
    {
        aBoolean556 = false;
        aByte557 = 4;
        anInt562 = -1;
        anIntArray564 = new int[6];
        anIntArray565 = new int[6];
        scaleXY = 128;
        scaleZ = 128;
    }

}
