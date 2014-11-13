import java.io.PrintStream;
import sign.signlink;

public class Class22
{

    public boolean aBoolean459;
    public byte aByte460;
    public int anInt461;
    public static boolean aBoolean462;
    public static int anInt463;
    public static Class22 aClass22Array464[];
    public int anInt465;
    public int anIntArray466[];
    public int anIntArray467[];
    public int anIntArray468[];
    public int anIntArray469[] = {
        -1, -1, -1, -1, -1
    };
    public boolean aBoolean470;

    public static void method247(boolean flag, Class47 class47)
    {
        try
        {
            Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(class47.method549("idk.dat", null), 15787);
            if(!flag)
            {
                aBoolean462 = !aBoolean462;
            }
            anInt463 = class44_sub3_sub2.method484();
            if(aClass22Array464 == null)
            {
                aClass22Array464 = new Class22[anInt463];
            }
            for(int i = 0; i < anInt463; i++)
            {
                if(aClass22Array464[i] == null)
                {
                    aClass22Array464[i] = new Class22();
                }
                aClass22Array464[i].method248(false, class44_sub3_sub2);
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("42475, " + flag + ", " + class47 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method248(boolean flag, Class44_Sub3_Sub2 class44_sub3_sub2)
    {
        try
        {
            if(flag)
            {
                throw new NullPointerException();
            }
            do
            {
                int i = class44_sub3_sub2.method482();
                if(i == 0)
                {
                    return;
                }
                if(i == 1)
                {
                    anInt465 = class44_sub3_sub2.method482();
                } else
                if(i == 2)
                {
                    int j = class44_sub3_sub2.method482();
                    anIntArray466 = new int[j];
                    for(int k = 0; k < j; k++)
                    {
                        anIntArray466[k] = class44_sub3_sub2.method484();
                    }
                } else
                if(i == 3)
                {
                    aBoolean470 = true;
                } else
                if(i >= 40 && i < 50)
                {
                    anIntArray467[i - 40] = class44_sub3_sub2.method484();
                } else
                if(i >= 50 && i < 60)
                {
                    anIntArray468[i - 50] = class44_sub3_sub2.method484();
                } else
                if(i >= 60 && i < 70)
                {
                    anIntArray469[i - 60] = class44_sub3_sub2.method484();
                } else
                {
                    System.out.println("Error unrecognised config code: " + i);
                }
            } while(true);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("93901, " + flag + ", " + class44_sub3_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method249(int i)
    {
        try
        {
            if(anIntArray466 == null)
            {
                return true;
            }
            boolean flag = true;
            if(i < 9 || i > 9)
            {
                throw new NullPointerException();
            }
            for(int j = 0; j < anIntArray466.length; j++)
            {
                if(!Class44_Sub3_Sub4_Sub4.method507(anIntArray466[j]))
                {
                    flag = false;
                }
            }
            return flag;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("47258, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class44_Sub3_Sub4_Sub4 method250(int i)
    {
        try
        {
            if(anIntArray466 == null)
            {
                return null;
            }
            Class44_Sub3_Sub4_Sub4 aclass44_sub3_sub4_sub4[] = new Class44_Sub3_Sub4_Sub4[anIntArray466.length];
            if(i != 0)
            {
                anInt461 = 428;
            }
            for(int j = 0; j < anIntArray466.length; j++)
            {
                aclass44_sub3_sub4_sub4[j] = Class44_Sub3_Sub4_Sub4.method506(anIntArray466[j], aByte460);
            }
            Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4;
            if(aclass44_sub3_sub4_sub4.length == 1)
            {
                class44_sub3_sub4_sub4 = aclass44_sub3_sub4_sub4[0];
            } else
            {
                class44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4(aclass44_sub3_sub4_sub4, aclass44_sub3_sub4_sub4.length, -33019);
            }
            for(int k = 0; k < 6; k++)
            {
                if(anIntArray467[k] == 0)
                {
                    break;
                }
                class44_sub3_sub4_sub4.method520(anIntArray467[k], anIntArray468[k]);
            }
            return class44_sub3_sub4_sub4;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("95134, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method251(byte byte0)
    {
        try
        {
            if(byte0 != 0)
            {
                throw new NullPointerException();
            }
            boolean flag = true;
            for(int i = 0; i < 5; i++)
            {
                if(anIntArray469[i] != -1 && !Class44_Sub3_Sub4_Sub4.method507(anIntArray469[i]))
                {
                    flag = false;
                }
            }
            return flag;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("34430, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class44_Sub3_Sub4_Sub4 method252(byte byte0)
    {
        try
        {
            Class44_Sub3_Sub4_Sub4 aclass44_sub3_sub4_sub4[] = new Class44_Sub3_Sub4_Sub4[5];
            int i = 0;
            for(int j = 0; j < 5; j++)
            {
                if(anIntArray469[j] != -1)
                {
                    aclass44_sub3_sub4_sub4[i++] = Class44_Sub3_Sub4_Sub4.method506(anIntArray469[j], aByte460);
                }
            }
            if(byte0 != -45)
            {
                for(int k = 1; k > 0; k++)
                {
                }
            }
            Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4(aclass44_sub3_sub4_sub4, i, -33019);
            for(int l = 0; l < 6; l++)
            {
                if(anIntArray467[l] == 0)
                {
                    break;
                }
                class44_sub3_sub4_sub4.method520(anIntArray467[l], anIntArray468[l]);
            }
            return class44_sub3_sub4_sub4;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("40216, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class22()
    {
        aBoolean459 = false;
        aByte460 = 4;
        anInt465 = -1;
        anIntArray467 = new int[6];
        anIntArray468 = new int[6];
        aBoolean470 = false;
    }
}
