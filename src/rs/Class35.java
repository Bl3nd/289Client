package src.rs;
import java.io.PrintStream;

import sign.signlink;
import src.rs.stream.Stream;

public class Class35
{

    public static int anInt588 = 810;
    public static int anInt589;
    public static Class35 cache[];
    public String aString591;
    public int anInt592;
    public int anInt593;
    public int anInt594;
    public boolean aBoolean595;
    public int anInt596;
    public int anInt597;

    public static void method275(boolean flag, Class47 class47)
    {
        try
        {
            if(!flag)
            {
                return;
            }
            Stream class44_sub3_sub2 = new Stream(class47.method549("varbit.dat", null), 15787);
            anInt589 = class44_sub3_sub2.getUnsignedLEShort();
            if(cache == null)
            {
                cache = new Class35[anInt589];
            }
            for(int i = 0; i < anInt589; i++)
            {
                if(cache[i] == null)
                {
                    cache[i] = new Class35();
                }
                cache[i].method276(anInt588, i, class44_sub3_sub2);
                if(cache[i].aBoolean595)
                {
                    Class38.aClass38Array674[cache[i].anInt592].aBoolean686 = true;
                }
            }
            if(class44_sub3_sub2.currentOffset != class44_sub3_sub2.buffer.length)
            {
                System.out.println("varbit load mismatch");
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("10921, " + flag + ", " + class47 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method276(int i, int j, Stream class44_sub3_sub2)
    {
        try
        {
            i = 55 / i;
            do
            {
                int k = class44_sub3_sub2.getUnsignedByte();
                if(k == 0)
                {
                    return;
                }
                if(k == 1)
                {
                    anInt592 = class44_sub3_sub2.getUnsignedLEShort();
                    anInt593 = class44_sub3_sub2.getUnsignedByte();
                    anInt594 = class44_sub3_sub2.getUnsignedByte();
                } else
                if(k == 10)
                {
                    aString591 = class44_sub3_sub2.getString();
                } else
                if(k == 2)
                {
                    aBoolean595 = true;
                } else
                if(k == 3)
                {
                    anInt596 = class44_sub3_sub2.getInt();
                } else
                if(k == 4)
                {
                    anInt597 = class44_sub3_sub2.getInt();
                } else
                {
                    System.out.println("Error unrecognised config code: " + k);
                }
            } while(true);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("19355, " + i + ", " + j + ", " + class44_sub3_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class35()
    {
        aBoolean595 = false;
        anInt596 = -1;
    }

}
