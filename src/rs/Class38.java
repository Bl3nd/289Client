package src.rs;
import java.io.PrintStream;

import sign.signlink;
import src.rs.stream.Stream;

public class Class38
{

    public int anInt670;
    public static boolean aBoolean671 = true;
    public static int anInt672 = 810;
    public static int anInt673;
    public static Class38 aClass38Array674[];
    public static int anInt675;
    public static int anIntArray676[];
    public String aString677;
    public int anInt678;
    public int anInt679;
    public boolean aBoolean680;
    public boolean aBoolean681;
    public int anInt682;
    public boolean aBoolean683;
    public int anInt684;
    public int anInt685;
    public boolean aBoolean686;
    public int anInt687;

    public static void method337(boolean flag, Class47 class47)
    {
        try
        {
            if(!flag)
            {
                aBoolean671 = !aBoolean671;
            }
            Stream class44_sub3_sub2 = new Stream(class47.method549("varp.dat", null), 15787);
            anInt675 = 0;
            anInt673 = class44_sub3_sub2.getUnsignedLEShort();
            if(aClass38Array674 == null)
            {
                aClass38Array674 = new Class38[anInt673];
            }
            if(anIntArray676 == null)
            {
                anIntArray676 = new int[anInt673];
            }
            for(int i = 0; i < anInt673; i++)
            {
                if(aClass38Array674[i] == null)
                {
                    aClass38Array674[i] = new Class38();
                }
                aClass38Array674[i].method338(anInt672, i, class44_sub3_sub2);
            }
            if(class44_sub3_sub2.currentOffset != class44_sub3_sub2.buffer.length)
            {
                System.out.println("varptype load mismatch");
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("51793, " + flag + ", " + class47 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method338(int i, int j, Stream class44_sub3_sub2)
    {
        try
        {
            if(i <= 0)
            {
                anInt670 = 68;
            }
            do
            {
                int k = class44_sub3_sub2.getUnsignedByte();
                if(k == 0)
                {
                    return;
                }
                if(k == 1)
                {
                    anInt678 = class44_sub3_sub2.getUnsignedByte();
                } else
                if(k == 2)
                {
                    anInt679 = class44_sub3_sub2.getUnsignedByte();
                } else
                if(k == 3)
                {
                    aBoolean680 = true;
                    anIntArray676[anInt675++] = j;
                } else
                if(k == 4)
                {
                    aBoolean681 = false;
                } else
                if(k == 5)
                {
                    anInt682 = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(k == 6)
                {
                    aBoolean683 = true;
                } else
                if(k == 7)
                {
                    anInt684 = class44_sub3_sub2.getInt();
                } else
                if(k == 8)
                {
                    anInt685 = 1;
                    aBoolean686 = true;
                } else
                if(k == 10)
                {
                    aString677 = class44_sub3_sub2.getString();
                } else
                if(k == 11)
                {
                    aBoolean686 = true;
                } else
                if(k == 12)
                {
                    anInt687 = class44_sub3_sub2.getInt();
                } else
                if(k == 13)
                {
                    anInt685 = 2;
                } else
                {
                    System.out.println("Error unrecognised config code: " + k);
                }
            } while(true);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("69668, " + i + ", " + j + ", " + class44_sub3_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class38()
    {
        anInt670 = -550;
        aBoolean680 = false;
        aBoolean681 = true;
        aBoolean683 = false;
        aBoolean686 = false;
        anInt687 = -1;
    }

}
