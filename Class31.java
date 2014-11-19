import sign.signlink;

public class Class31
{

    public int anInt553;
    public SubNode aClass44_Sub3_554;
    public SubNode aClass44_Sub3_555;

    public Class31(int i)
    {
        anInt553 = 195;
        aClass44_Sub3_554 = new SubNode();
        try
        {
            aClass44_Sub3_554.previousSubNode = aClass44_Sub3_554;
            aClass44_Sub3_554.nextSubNode = aClass44_Sub3_554;
            if(i != 9)
            {
                anInt553 = 185;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("32770, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method264(SubNode class44_sub3)
    {
        if(class44_sub3.nextSubNode != null)
        {
            class44_sub3.method405();
        }
        class44_sub3.nextSubNode = aClass44_Sub3_554.nextSubNode;
        class44_sub3.previousSubNode = aClass44_Sub3_554;
        class44_sub3.nextSubNode.previousSubNode = class44_sub3;
        class44_sub3.previousSubNode.nextSubNode = class44_sub3;
    }

    public SubNode method265()
    {
        SubNode class44_sub3 = aClass44_Sub3_554.previousSubNode;
        if(class44_sub3 == aClass44_Sub3_554)
        {
            return null;
        } else
        {
            class44_sub3.method405();
            return class44_sub3;
        }
    }

    public SubNode method266()
    {
        SubNode class44_sub3 = aClass44_Sub3_554.previousSubNode;
        if(class44_sub3 == aClass44_Sub3_554)
        {
            aClass44_Sub3_555 = null;
            return null;
        } else
        {
            aClass44_Sub3_555 = class44_sub3.previousSubNode;
            return class44_sub3;
        }
    }

    public SubNode method267(boolean flag)
    {
        try
        {
            SubNode class44_sub3 = aClass44_Sub3_555;
            if(flag)
            {
                throw new NullPointerException();
            }
            if(class44_sub3 == aClass44_Sub3_554)
            {
                aClass44_Sub3_555 = null;
                return null;
            } else
            {
                aClass44_Sub3_555 = class44_sub3.previousSubNode;
                return class44_sub3;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("43753, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method268()
    {
        int i = 0;
        for(SubNode class44_sub3 = aClass44_Sub3_554.previousSubNode; class44_sub3 != aClass44_Sub3_554; class44_sub3 = class44_sub3.previousSubNode)
        {
            i++;
        }
        return i;
    }
}
