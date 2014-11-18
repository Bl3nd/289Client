import java.io.PrintStream;
import sign.signlink;

public class Class32
{

    public boolean aBoolean556;
    public byte aByte557;
    public static int anInt558;
    public static Class32 aClass32Array559[];
    public int anInt560;
    public int anInt561;
    public int anInt562;
    public Class26 aClass26_563;
    public int anIntArray564[];
    public int anIntArray565[];
    public int anInt566;
    public int anInt567;
    public int anInt568;
    public int anInt569;
    public int anInt570;
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
            if(aClass32Array559 == null)
            {
                aClass32Array559 = new Class32[anInt558];
            }
            for(int i = 0; i < anInt558; i++)
            {
                if(aClass32Array559[i] == null)
                {
                    aClass32Array559[i] = new Class32();
                }
                aClass32Array559[i].anInt560 = i;
                aClass32Array559[i].method270(false, class44_sub3_sub2);
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
                    if(Class26.aClass26Array508 != null)
                    {
                        aClass26_563 = Class26.aClass26Array508[anInt562];
                    }
                } else
                if(i == 4)
                {
                    anInt566 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 5)
                {
                    anInt567 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 6)
                {
                    anInt568 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 7)
                {
                    anInt569 = class44_sub3_sub2.getUnsignedByte();
                } else
                if(i == 8)
                {
                    anInt570 = class44_sub3_sub2.getUnsignedByte();
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

    public Class44_Sub3_Sub4_Sub4 method271()
    {
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = (Class44_Sub3_Sub4_Sub4)aClass39_571.method339(anInt560);
        if(class44_sub3_sub4_sub4 != null)
        {
            return class44_sub3_sub4_sub4;
        }
        class44_sub3_sub4_sub4 = Class44_Sub3_Sub4_Sub4.method506(anInt561, aByte557);
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
        anInt566 = 128;
        anInt567 = 128;
    }

}
