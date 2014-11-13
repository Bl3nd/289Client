import sign.signlink;

public class Class44_Sub3_Sub4_Sub2 extends Class44_Sub3_Sub4
{

    public boolean aBoolean1494;
    public int anInt1495;
    public int anInt1496;

    public Class44_Sub3_Sub4_Sub4 method499(int i)
    {
        try
        {
            Class14 class14 = Class14.method220(anInt1495);
            if(i != -37770)
            {
                aBoolean1494 = !aBoolean1494;
            }
            return class14.method224(anInt1496);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("51746, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class44_Sub3_Sub4_Sub2()
    {
        aBoolean1494 = true;
    }
}
