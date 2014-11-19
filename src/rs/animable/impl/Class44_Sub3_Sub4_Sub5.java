package src.rs.animable.impl;
import sign.signlink;
import src.rs.Class11;
import src.rs.Class32;
import src.rs.animable.Animable;

public class Class44_Sub3_Sub4_Sub5 extends Animable
{

    public int anInt1602;
    public int anInt1603;
    public Class32 aClass32_1604;
    public int anInt1605;
    public int anInt1606;
    public int anInt1607;
    public int anInt1608;
    public int anInt1609;
    public int anInt1610;
    public int anInt1611;
    public boolean aBoolean1612;

    public Class44_Sub3_Sub4_Sub5(int i, int j, int k, int l, boolean flag, int i1, int j1,
            int k1)
    {
        anInt1603 = 393;
        aBoolean1612 = false;
        try
        {
            aClass32_1604 = Class32.aClass32Array559[j1];
            if(!flag)
            {
                anInt1603 = 385;
            }
            anInt1606 = j;
            anInt1607 = i;
            anInt1608 = i1;
            anInt1609 = k;
            anInt1605 = k1 + l;
            aBoolean1612 = false;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("81124, " + i + ", " + j + ", " + k + ", " + l + ", " + flag + ", " + i1 + ", " + j1 + ", " + k1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method531(int i, int j)
    {
        try
        {
            if(i <= 0)
            {
                return;
            }
            for(anInt1611 += j; anInt1611 > aClass32_1604.aClass26_563.method254(anInt1610, 24425);)
            {
                anInt1611 -= aClass32_1604.aClass26_563.method254(anInt1610, 24425) + 1;
                anInt1610++;
                if(anInt1610 >= aClass32_1604.aClass26_563.anInt509 && (anInt1610 < 0 || anInt1610 >= aClass32_1604.aClass26_563.anInt509))
                {
                    anInt1610 = 0;
                    aBoolean1612 = true;
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("93520, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Model getRotatedModel(int i)
    {
        try
        {
            if(i != -37770)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            Model class44_sub3_sub4_sub4 = aClass32_1604.method271();
            if(class44_sub3_sub4_sub4 == null)
            {
                return null;
            }
            int k = aClass32_1604.aClass26_563.anIntArray510[anInt1610];
            Model class44_sub3_sub4_sub4_1 = new Model(class44_sub3_sub4_sub4, Class11.method211(k, 0), false, anInt1602, true);
            if(!aBoolean1612)
            {
                class44_sub3_sub4_sub4_1.method513((byte)3);
                class44_sub3_sub4_sub4_1.method514(k, 188);
                class44_sub3_sub4_sub4_1.anIntArrayArray1567 = null;
                class44_sub3_sub4_sub4_1.anIntArrayArray1566 = null;
            }
            if(aClass32_1604.anInt566 != 128 || aClass32_1604.anInt567 != 128)
            {
                class44_sub3_sub4_sub4_1.method522(aClass32_1604.anInt566, aClass32_1604.anInt566, aClass32_1604.anInt567, (byte)31);
            }
            if(aClass32_1604.anInt568 != 0)
            {
                if(aClass32_1604.anInt568 == 90)
                {
                    class44_sub3_sub4_sub4_1.method517(0);
                }
                if(aClass32_1604.anInt568 == 180)
                {
                    class44_sub3_sub4_sub4_1.method517(0);
                    class44_sub3_sub4_sub4_1.method517(0);
                }
                if(aClass32_1604.anInt568 == 270)
                {
                    class44_sub3_sub4_sub4_1.method517(0);
                    class44_sub3_sub4_sub4_1.method517(0);
                    class44_sub3_sub4_sub4_1.method517(0);
                }
            }
            class44_sub3_sub4_sub4_1.method523(64 + aClass32_1604.anInt569, 850 + aClass32_1604.anInt570, -30, -50, -30, true);
            return class44_sub3_sub4_sub4_1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("834, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }
}
