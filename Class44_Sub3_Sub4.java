import sign.signlink;

public class Class44_Sub3_Sub4 extends Class44_Sub3
{

    public int anInt1410;
    public Class25 aClass25Array1411[];
    public int anInt1412;
    public static boolean aBoolean1413;

    public void method498(int i, int j, int k, int l, int i1, int j1, int k1,
            int l1, int i2)
    {
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = method499(-37770);
        if(class44_sub3_sub4_sub4 != null)
        {
            anInt1412 = ((Class44_Sub3_Sub4) (class44_sub3_sub4_sub4)).anInt1412;
            class44_sub3_sub4_sub4.method498(i, j, k, l, i1, j1, k1, l1, i2);
        }
    }

    public Class44_Sub3_Sub4_Sub4 method499(int i)
    {
        try
        {
            if(i != -37770)
            {
                anInt1410 = 414;
            }
            return null;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("59009, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class44_Sub3_Sub4()
    {
        anInt1410 = 772;
        anInt1412 = 1000;
    }
}
