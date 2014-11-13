import sign.signlink;

public class Class10
    implements Runnable
{

    public client aClient256;
    public boolean aBoolean257;
    public Object anObject258;
    public int anInt259;
    public int anIntArray260[];
    public int anIntArray261[];

    public Class10(int i, client client1)
    {
        aBoolean257 = true;
        anObject258 = new Object();
        anIntArray260 = new int[500];
        anIntArray261 = new int[500];
        try
        {
            i = 31 / i;
            aClient256 = client1;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("34650, " + i + ", " + client1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void run()
    {
        while(aBoolean257)
        {
            synchronized(anObject258)
            {
                if(anInt259 < 500)
                {
                    anIntArray260[anInt259] = ((Applet_Sub1) (aClient256)).anInt21;
                    anIntArray261[anInt259] = ((Applet_Sub1) (aClient256)).anInt22;
                    anInt259++;
                }
            }
            try
            {
                Thread.sleep(50L);
            }
            catch(Exception _ex)
            {
            }
        }
    }
}
