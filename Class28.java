import sign.signlink;

public class Class28
{

    public int anInt532;
    public boolean aBoolean533;
    public Class44 aClass44_534;
    public Class44 aClass44_535;

    public Class28(int i)
    {
        anInt532 = 9;
        aBoolean533 = true;
        aClass44_534 = new Class44();
        try
        {
            aClass44_534.aClass44_770 = aClass44_534;
            if(i >= 0)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            aClass44_534.aClass44_771 = aClass44_534;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("20960, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method256(Class44 class44)
    {
        if(class44.aClass44_771 != null)
        {
            class44.method404();
        }
        class44.aClass44_771 = aClass44_534.aClass44_771;
        class44.aClass44_770 = aClass44_534;
        class44.aClass44_771.aClass44_770 = class44;
        class44.aClass44_770.aClass44_771 = class44;
    }

    public void method257(Class44 class44, int i)
    {
        try
        {
            if(class44.aClass44_771 != null)
            {
                class44.method404();
            }
            class44.aClass44_771 = aClass44_534;
            class44.aClass44_770 = aClass44_534.aClass44_770;
            class44.aClass44_771.aClass44_770 = class44;
            class44.aClass44_770.aClass44_771 = class44;
            if(i != -12925)
            {
                aBoolean533 = !aBoolean533;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("22708, " + class44 + ", " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public Class44 method258()
    {
        Class44 class44 = aClass44_534.aClass44_770;
        if(class44 == aClass44_534)
        {
            return null;
        } else
        {
            class44.method404();
            return class44;
        }
    }

    public Class44 method259()
    {
        Class44 class44 = aClass44_534.aClass44_770;
        if(class44 == aClass44_534)
        {
            aClass44_535 = null;
            return null;
        } else
        {
            aClass44_535 = class44.aClass44_770;
            return class44;
        }
    }

    public Class44 method260(int i)
    {
        try
        {
            Class44 class44 = aClass44_534.aClass44_771;
            if(class44 == aClass44_534)
            {
                aClass44_535 = null;
                return null;
            }
            aClass44_535 = class44.aClass44_771;
            if(i != 0)
            {
                aBoolean533 = !aBoolean533;
            }
            return class44;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("18269, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class44 method261(boolean flag)
    {
        try
        {
            Class44 class44 = aClass44_535;
            if(flag)
            {
                throw new NullPointerException();
            }
            if(class44 == aClass44_534)
            {
                aClass44_535 = null;
                return null;
            } else
            {
                aClass44_535 = class44.aClass44_770;
                return class44;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("49472, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class44 method262(int i)
    {
        try
        {
            Class44 class44 = aClass44_535;
            if(i != -20683)
            {
                throw new NullPointerException();
            }
            if(class44 == aClass44_534)
            {
                aClass44_535 = null;
                return null;
            } else
            {
                aClass44_535 = class44.aClass44_771;
                return class44;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("30725, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method263()
    {
        if(aClass44_534.aClass44_770 == aClass44_534)
        {
            return;
        }
        do
        {
            Class44 class44 = aClass44_534.aClass44_770;
            if(class44 == aClass44_534)
            {
                return;
            }
            class44.method404();
        } while(true);
    }
}
