import sign.signlink;

public class Class31
{

    public int anInt553;
    public Class44_Sub3 aClass44_Sub3_554;
    public Class44_Sub3 aClass44_Sub3_555;

    public Class31(int i)
    {
        anInt553 = 195;
        aClass44_Sub3_554 = new Class44_Sub3();
        try
        {
            aClass44_Sub3_554.aClass44_Sub3_1360 = aClass44_Sub3_554;
            aClass44_Sub3_554.aClass44_Sub3_1361 = aClass44_Sub3_554;
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

    public void method264(Class44_Sub3 class44_sub3)
    {
        if(class44_sub3.aClass44_Sub3_1361 != null)
        {
            class44_sub3.method405();
        }
        class44_sub3.aClass44_Sub3_1361 = aClass44_Sub3_554.aClass44_Sub3_1361;
        class44_sub3.aClass44_Sub3_1360 = aClass44_Sub3_554;
        class44_sub3.aClass44_Sub3_1361.aClass44_Sub3_1360 = class44_sub3;
        class44_sub3.aClass44_Sub3_1360.aClass44_Sub3_1361 = class44_sub3;
    }

    public Class44_Sub3 method265()
    {
        Class44_Sub3 class44_sub3 = aClass44_Sub3_554.aClass44_Sub3_1360;
        if(class44_sub3 == aClass44_Sub3_554)
        {
            return null;
        } else
        {
            class44_sub3.method405();
            return class44_sub3;
        }
    }

    public Class44_Sub3 method266()
    {
        Class44_Sub3 class44_sub3 = aClass44_Sub3_554.aClass44_Sub3_1360;
        if(class44_sub3 == aClass44_Sub3_554)
        {
            aClass44_Sub3_555 = null;
            return null;
        } else
        {
            aClass44_Sub3_555 = class44_sub3.aClass44_Sub3_1360;
            return class44_sub3;
        }
    }

    public Class44_Sub3 method267(boolean flag)
    {
        try
        {
            Class44_Sub3 class44_sub3 = aClass44_Sub3_555;
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
                aClass44_Sub3_555 = class44_sub3.aClass44_Sub3_1360;
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
        for(Class44_Sub3 class44_sub3 = aClass44_Sub3_554.aClass44_Sub3_1360; class44_sub3 != aClass44_Sub3_554; class44_sub3 = class44_sub3.aClass44_Sub3_1360)
        {
            i++;
        }
        return i;
    }
}
