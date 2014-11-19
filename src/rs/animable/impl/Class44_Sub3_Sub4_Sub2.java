package src.rs.animable.impl;
import sign.signlink;
import src.rs.Class14;
import src.rs.animable.Animable;

public class Class44_Sub3_Sub4_Sub2 extends Animable
{

    public boolean aBoolean1494;
    public int anInt1495;
    public int anInt1496;

    public Model getRotatedModel(int i)
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
