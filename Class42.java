import sign.signlink;

public class Class42
{

    public boolean aBoolean764;
    public boolean aBoolean765;
    public int anInt766;
    public int anInt767;
    public Class44 aClass44Array768[];

    public Class42(int i, byte byte0)
    {
        aBoolean764 = false;
        aBoolean765 = false;
        anInt766 = 8;
        try
        {
            anInt767 = i;
            aClass44Array768 = new Class44[i];
            for(int j = 0; j < i; j++)
            {
                Class44 class44 = aClass44Array768[j] = new Class44();
                class44.aClass44_770 = class44;
                class44.aClass44_771 = class44;
            }
            if(byte0 != 124)
            {
                for(int k = 1; k > 0; k++)
                {
                }
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("10752, " + i + ", " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public Class44 method380(long l)
    {
        Class44 class44 = aClass44Array768[(int)(l & (long)(anInt767 - 1))];
        for(Class44 class44_1 = class44.aClass44_770; class44_1 != class44; class44_1 = class44_1.aClass44_770)
        {
            if(class44_1.aLong769 == l)
            {
                return class44_1;
            }
        }
        return null;
    }

    public void method381(boolean flag, Class44 class44, long l)
    {
        try
        {
            if(class44.aClass44_771 != null)
            {
                class44.method404();
            }
            Class44 class44_1 = aClass44Array768[(int)(l & (long)(anInt767 - 1))];
            class44.aClass44_771 = class44_1.aClass44_771;
            if(flag)
            {
                aBoolean764 = !aBoolean764;
            }
            class44.aClass44_770 = class44_1;
            class44.aClass44_771.aClass44_770 = class44;
            class44.aClass44_770.aClass44_771 = class44;
            class44.aLong769 = l;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("44360, " + flag + ", " + class44 + ", " + l + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }
}
