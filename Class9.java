import sign.signlink;

public class Class9
{

    public int anInt253;
    public int anIntArray254[];
    public int anIntArrayArray255[][];

    public Class9(Class44_Sub3_Sub2 class44_sub3_sub2, int i)
    {
        try
        {
            anInt253 = class44_sub3_sub2.method482();
            anIntArray254 = new int[anInt253];
            if(i != 0)
            {
                throw new NullPointerException();
            }
            anIntArrayArray255 = new int[anInt253][];
            for(int j = 0; j < anInt253; j++)
            {
                anIntArray254[j] = class44_sub3_sub2.method482();
            }
            for(int k = 0; k < anInt253; k++)
            {
                int l = class44_sub3_sub2.method482();
                anIntArrayArray255[k] = new int[l];
                for(int i1 = 0; i1 < l; i1++)
                {
                    anIntArrayArray255[k][i1] = class44_sub3_sub2.method482();
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("27585, " + class44_sub3_sub2 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }
}
