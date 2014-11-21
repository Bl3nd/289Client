package src.rs;
import java.io.PrintStream;

import sign.signlink;
import src.rs.stream.Stream;

public class Class26
{

    public boolean aBoolean504;
    public byte aByte505;
    public static boolean aBoolean506 = true;
    public static int anInt507;
    public static Class26 animations[];
    public int frameCount;
    public int frame2Ids[];
    public int anIntArray511[];
    public int anIntArray512[];
    public int frameStep;
    public int flowControl[];
    public boolean aBoolean515;
    public int anInt516;
    public int playerReplacementShield;
    public int playerReplacementWeapon;
    public int anInt519;
    public int anInt520;
    public int precendenceWalking;
    public int anInt522;
    public int anInt523;
    public static int anInt524;

    public static void method253(boolean flag, Class47 class47)
    {
        try
        {
            Stream class44_sub3_sub2 = new Stream(class47.method549("seq.dat", null), 15787);
            anInt507 = class44_sub3_sub2.getUnsignedLEShort();
            if(animations == null)
            {
                animations = new Class26[anInt507];
            }
            for(int i = 0; i < anInt507; i++)
            {
                if(animations[i] == null)
                {
                    animations[i] = new Class26();
                }
                animations[i].method255(false, class44_sub3_sub2);
            }
            if(!flag)
            {
                aBoolean506 = !aBoolean506;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("90750, " + flag + ", " + class47 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public int method254(int i, int j)
    {
        try
        {
            if(j != 24425)
            {
                for(int k = 1; k > 0; k++)
                {
                }
            }
            int l = anIntArray512[i];
            if(l == 0)
            {
                Class11 class11 = Class11.method210(frame2Ids[i], aByte505);
                if(class11 != null)
                {
                    l = anIntArray512[i] = class11.anInt265;
                }
            }
            if(l == 0)
            {
                l = 1;
            }
            return l;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("17518, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method255(boolean flag, Stream class44_sub3_sub2)
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
                    break;
                }
                if(i == 1)
                {
                    frameCount = class44_sub3_sub2.getUnsignedByte();
                    frame2Ids = new int[frameCount];
                    anIntArray511 = new int[frameCount];
                    anIntArray512 = new int[frameCount];
                    for(int j = 0; j < frameCount; j++)
                    {
                        frame2Ids[j] = class44_sub3_sub2.getUnsignedLEShort();
                        anIntArray511[j] = class44_sub3_sub2.getUnsignedLEShort();
                        if(anIntArray511[j] == 65535)
                        {
                            anIntArray511[j] = -1;
                        }
                        anIntArray512[j] = class44_sub3_sub2.getUnsignedLEShort();
                    }
                } else
                if(i == 2)
                {
                    frameStep = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 3)
                {
                    int k = class44_sub3_sub2.getUnsignedByte();
                    flowControl = new int[k + 1];
                    for(int l = 0; l < k; l++)
                    {
                        flowControl[l] = class44_sub3_sub2.getUnsignedByte();
                    }
                    flowControl[k] = 0x98967f;
                } else
                if(i == 4)
                {
                    aBoolean515 = true;
                } else
                if(i == 5)
                {
                    anInt516 = class44_sub3_sub2.getUnsignedByte();
                } else
                if(i == 6)
                {
                    playerReplacementShield = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 7)
                {
                    playerReplacementWeapon = class44_sub3_sub2.getUnsignedLEShort();
                } else
                if(i == 8)
                {
                    anInt519 = class44_sub3_sub2.getUnsignedByte();
                } else
                if(i == 9)
                {
                    anInt520 = class44_sub3_sub2.getUnsignedByte();
                } else
                if(i == 10)
                {
                    precendenceWalking = class44_sub3_sub2.getUnsignedByte();
                } else
                if(i == 11)
                {
                    anInt522 = class44_sub3_sub2.getUnsignedByte();
                } else
                if(i == 12)
                {
                    anInt523 = class44_sub3_sub2.getInt();
                } else
                {
                    System.out.println("Error unrecognised seq config code: " + i);
                }
            } while(true);
            if(frameCount == 0)
            {
                frameCount = 1;
                frame2Ids = new int[1];
                frame2Ids[0] = -1;
                anIntArray511 = new int[1];
                anIntArray511[0] = -1;
                anIntArray512 = new int[1];
                anIntArray512[0] = -1;
            }
            if(anInt520 == -1)
            {
                if(flowControl != null)
                {
                    anInt520 = 2;
                } else
                {
                    anInt520 = 0;
                }
            }
            if(precendenceWalking == -1)
            {
                if(flowControl != null)
                {
                    precendenceWalking = 2;
                    return;
                } else
                {
                    precendenceWalking = 0;
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("13368, " + flag + ", " + class44_sub3_sub2 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public Class26()
    {
        aBoolean504 = false;
        aByte505 = 4;
        frameStep = -1;
        aBoolean515 = false;
        anInt516 = 5;
        playerReplacementShield = -1;
        playerReplacementWeapon = -1;
        anInt519 = 99;
        anInt520 = -1;
        precendenceWalking = -1;
    }

}
