import sign.signlink;

public class Class41
{

    public static int anInt745;
    public static int anInt746;
    public static boolean aBoolean747;
    public static boolean aBoolean748 = true;
    public static int anInt749 = 2;
    public static int anInt750 = 2;
    public static int anInt751;
    public static byte aByte752 = 7;
    public static byte aByte753 = 121;
    public static byte aByte754 = 16;
    public static boolean aBoolean755 = true;
    public static int anIntArray756[];
    public static char aCharArrayArray757[][];
    public static byte aByteArrayArrayArray758[][][];
    public static char aCharArrayArray759[][];
    public static char aCharArrayArray760[][];
    public static int anIntArray761[];
    public static String aStringArray762[] = {
        "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs"
    };
    public static int anInt763;

    public static void method342(Class47 class47)
    {
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(class47.method549("fragmentsenc.txt", null), 15787);
        Class44_Sub3_Sub2 class44_sub3_sub2_1 = new Class44_Sub3_Sub2(class47.method549("badenc.txt", null), 15787);
        Class44_Sub3_Sub2 class44_sub3_sub2_2 = new Class44_Sub3_Sub2(class47.method549("domainenc.txt", null), 15787);
        Class44_Sub3_Sub2 class44_sub3_sub2_3 = new Class44_Sub3_Sub2(class47.method549("tldlist.txt", null), 15787);
        method343(class44_sub3_sub2, class44_sub3_sub2_1, class44_sub3_sub2_2, class44_sub3_sub2_3);
    }

    public static void method343(Class44_Sub3_Sub2 class44_sub3_sub2, Class44_Sub3_Sub2 class44_sub3_sub2_1, Class44_Sub3_Sub2 class44_sub3_sub2_2, Class44_Sub3_Sub2 class44_sub3_sub2_3)
    {
        method345(class44_sub3_sub2_1, 5);
        method346(true, class44_sub3_sub2_2);
        method347(class44_sub3_sub2, (byte)-47);
        method344(anInt749, class44_sub3_sub2_3);
    }

    public static void method344(int i, Class44_Sub3_Sub2 class44_sub3_sub2)
    {
        try
        {
            if(i < anInt750 || i > anInt750)
            {
                aBoolean748 = !aBoolean748;
            }
            int j = class44_sub3_sub2.method487();
            aCharArrayArray760 = new char[j][];
            anIntArray761 = new int[j];
            for(int k = 0; k < j; k++)
            {
                anIntArray761[k] = class44_sub3_sub2.method482();
                char ac[] = new char[class44_sub3_sub2.method482()];
                for(int l = 0; l < ac.length; l++)
                {
                    ac[l] = (char)class44_sub3_sub2.method482();
                }
                aCharArrayArray760[k] = ac;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("16414, " + i + ", " + class44_sub3_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method345(Class44_Sub3_Sub2 class44_sub3_sub2, int i)
    {
        try
        {
            int j = class44_sub3_sub2.method487();
            aCharArrayArray757 = new char[j][];
            aByteArrayArrayArray758 = new byte[j][][];
            method348(aCharArrayArray757, aByteArrayArrayArray758, class44_sub3_sub2, 4);
            if(i < 5 || i > 5)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("10589, " + class44_sub3_sub2 + ", " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static void method346(boolean flag, Class44_Sub3_Sub2 class44_sub3_sub2)
    {
        try
        {
            int i = class44_sub3_sub2.method487();
            aCharArrayArray759 = new char[i][];
            method349(class44_sub3_sub2, 961, aCharArrayArray759);
            if(!flag)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("39796, " + flag + ", " + class44_sub3_sub2 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static void method347(Class44_Sub3_Sub2 class44_sub3_sub2, byte byte0)
    {
        try
        {
            anIntArray756 = new int[class44_sub3_sub2.method487()];
            for(int i = 0; i < anIntArray756.length; i++)
            {
                anIntArray756[i] = class44_sub3_sub2.method484();
            }
            if(byte0 != -47)
            {
                for(int j = 1; j > 0; j++)
                {
                }
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("97017, " + class44_sub3_sub2 + ", " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static void method348(char ac[][], byte abyte0[][][], Class44_Sub3_Sub2 class44_sub3_sub2, int i)
    {
        try
        {
            if(i < 4 || i > 4)
            {
                aBoolean748 = !aBoolean748;
            }
            for(int j = 0; j < ac.length; j++)
            {
                char ac1[] = new char[class44_sub3_sub2.method482()];
                for(int k = 0; k < ac1.length; k++)
                {
                    ac1[k] = (char)class44_sub3_sub2.method482();
                }
                ac[j] = ac1;
                byte abyte1[][] = new byte[class44_sub3_sub2.method482()][2];
                for(int l = 0; l < abyte1.length; l++)
                {
                    abyte1[l][0] = (byte)class44_sub3_sub2.method482();
                    abyte1[l][1] = (byte)class44_sub3_sub2.method482();
                }
                if(abyte1.length > 0)
                {
                    abyte0[j] = abyte1;
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("50706, " + ac + ", " + abyte0 + ", " + class44_sub3_sub2 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method349(Class44_Sub3_Sub2 class44_sub3_sub2, int i, char ac[][])
    {
        try
        {
            i = 75 / i;
            for(int j = 0; j < ac.length; j++)
            {
                char ac1[] = new char[class44_sub3_sub2.method482()];
                for(int k = 0; k < ac1.length; k++)
                {
                    ac1[k] = (char)class44_sub3_sub2.method482();
                }
                ac[j] = ac1;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("12171, " + class44_sub3_sub2 + ", " + i + ", " + ac + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method350(char ac[], int i)
    {
        try
        {
            int j = 0;
            for(int k = 0; k < ac.length; k++)
            {
                if(method351(ac[k], 898))
                {
                    ac[j] = ac[k];
                } else
                {
                    ac[j] = ' ';
                }
                if(j == 0 || ac[j] != ' ' || ac[j - 1] != ' ')
                {
                    j++;
                }
            }
            i = 19 / i;
            for(int l = j; l < ac.length; l++)
            {
                ac[l] = ' ';
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("15486, " + ac + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method351(char c, int i)
    {
        try
        {
            i = 56 / i;
            return c >= ' ' && c <= '\177' || c == ' ' || c == '\n' || c == '\t' || c == '\243' || c == '\u20AC';
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("93407, " + c + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static String method352(String s, int i)
    {
        try
        {
            long l = System.currentTimeMillis();
            char ac[] = s.toCharArray();
            method350(ac, 448);
            String s1 = (new String(ac)).trim();
            ac = s1.toLowerCase().toCharArray();
            String s2 = s1.toLowerCase();
            method360(ac, 5);
            method355((byte)1, ac);
            if(i != 0)
            {
                throw new NullPointerException();
            }
            method356(anInt751, ac);
            method369(ac, -17411);
            for(int j = 0; j < aStringArray762.length; j++)
            {
                for(int k = -1; (k = s2.indexOf(aStringArray762[j], k + 1)) != -1;)
                {
                    char ac1[] = aStringArray762[j].toCharArray();
                    for(int i1 = 0; i1 < ac1.length; i1++)
                    {
                        ac[i1 + k] = ac1[i1];
                    }
                }
            }
            method353(s1.toCharArray(), ac, true);
            method354(ac, (byte)-47);
            long l1 = System.currentTimeMillis();
            return (new String(ac)).trim();
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("926, " + s + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method353(char ac[], char ac1[], boolean flag)
    {
        try
        {
            for(int i = 0; i < ac.length; i++)
            {
                if(ac1[i] != '*' && method377(false, ac[i]))
                {
                    ac1[i] = ac[i];
                }
            }
            if(!flag)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("96470, " + ac + ", " + ac1 + ", " + flag + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static void method354(char ac[], byte byte0)
    {
        try
        {
            if(byte0 != -47)
            {
                anInt745 = 240;
            }
            boolean flag = true;
            for(int i = 0; i < ac.length; i++)
            {
                char c = ac[i];
                if(method374(c, 8))
                {
                    if(flag)
                    {
                        if(method376(c, false))
                        {
                            flag = false;
                        }
                    } else
                    if(method377(false, c))
                    {
                        ac[i] = (char)((c + 97) - 65);
                    }
                } else
                {
                    flag = true;
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("60830, " + ac + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method355(byte byte0, char ac[])
    {
        try
        {
            for(int i = 0; i < 2; i++)
            {
                for(int j = aCharArrayArray757.length - 1; j >= 0; j--)
                {
                    method364(ac, aCharArrayArray757[j], aByteArrayArrayArray758[j], 4);
                }
            }
            if(byte0 != 1)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("661, " + byte0 + ", " + ac + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static void method356(int i, char ac[])
    {
        try
        {
            char ac1[] = (char[])ac.clone();
            if(i != 0)
            {
                return;
            }
            char ac2[] = {
                '(', 'a', ')'
            };
            method364(ac1, ac2, null, 4);
            char ac3[] = (char[])ac.clone();
            char ac4[] = {
                'd', 'o', 't'
            };
            method364(ac3, ac4, null, 4);
            for(int j = aCharArrayArray759.length - 1; j >= 0; j--)
            {
                method357(ac1, ac, ac3, (byte)3, aCharArrayArray759[j]);
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("89247, " + i + ", " + ac + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method357(char ac[], char ac1[], char ac2[], byte byte0, char ac3[])
    {
        try
        {
            if(ac3.length > ac1.length)
            {
                return;
            }
            boolean flag = true;
            if(byte0 == 3)
            {
                byte0 = 0;
            } else
            {
                return;
            }
            int i;
            for(int j = 0; j <= ac1.length - ac3.length; j += i)
            {
                int k = j;
                int l = 0;
                i = 1;
                while(k < ac1.length)
                {
                    int i1 = 0;
                    char c = ac1[k];
                    char c1 = '\0';
                    if(k + 1 < ac1.length)
                    {
                        c1 = ac1[k + 1];
                    }
                    if(l < ac3.length && (i1 = method366(c1, c, (byte)-31, ac3[l])) > 0)
                    {
                        k += i1;
                        l++;
                        continue;
                    }
                    if(l == 0)
                    {
                        break;
                    }
                    if((i1 = method366(c1, c, (byte)-31, ac3[l - 1])) > 0)
                    {
                        k += i1;
                        if(l == 1)
                        {
                            i++;
                        }
                        continue;
                    }
                    if(l >= ac3.length || !method372(c, 0))
                    {
                        break;
                    }
                    k++;
                }
                if(l >= ac3.length)
                {
                    boolean flag1 = false;
                    int j1 = method358(4, ac, j, ac1);
                    int k1 = method359(ac1, ac2, 0, k - 1);
                    if(j1 > 2 || k1 > 2)
                    {
                        flag1 = true;
                    }
                    if(flag1)
                    {
                        for(int l1 = j; l1 < k; l1++)
                        {
                            ac1[l1] = '*';
                        }
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("13466, " + ac + ", " + ac1 + ", " + ac2 + ", " + byte0 + ", " + ac3 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method358(int i, char ac[], int j, char ac1[])
    {
        try
        {
            if(j == 0)
            {
                return 2;
            }
            for(int k = j - 1; k >= 0; k--)
            {
                if(!method372(ac1[k], 0))
                {
                    break;
                }
                if(ac1[k] == '@')
                {
                    return 3;
                }
            }
            int l = 0;
            if(i < 4 || i > 4)
            {
                return 4;
            }
            for(int i1 = j - 1; i1 >= 0; i1--)
            {
                if(!method372(ac[i1], 0))
                {
                    break;
                }
                if(ac[i1] == '*')
                {
                    l++;
                }
            }
            if(l >= 3)
            {
                return 4;
            }
            return !method372(ac1[j - 1], 0) ? 0 : 1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("36104, " + i + ", " + ac + ", " + j + ", " + ac1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method359(char ac[], char ac1[], int i, int j)
    {
        try
        {
            if(i != 0)
            {
                return anInt746;
            }
            if(j + 1 == ac.length)
            {
                return 2;
            }
            for(int k = j + 1; k < ac.length; k++)
            {
                if(!method372(ac[k], 0))
                {
                    break;
                }
                if(ac[k] == '.' || ac[k] == ',')
                {
                    return 3;
                }
            }
            int l = 0;
            for(int i1 = j + 1; i1 < ac.length; i1++)
            {
                if(!method372(ac1[i1], 0))
                {
                    break;
                }
                if(ac1[i1] == '*')
                {
                    l++;
                }
            }
            if(l >= 3)
            {
                return 4;
            }
            return !method372(ac[j + 1], 0) ? 0 : 1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("83310, " + ac + ", " + ac1 + ", " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method360(char ac[], int i)
    {
        try
        {
            char ac1[] = (char[])ac.clone();
            if(i < 5 || i > 5)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            char ac2[] = {
                'd', 'o', 't'
            };
            method364(ac1, ac2, null, 4);
            char ac3[] = (char[])ac.clone();
            char ac4[] = {
                's', 'l', 'a', 's', 'h'
            };
            method364(ac3, ac4, null, 4);
            for(int k = 0; k < aCharArrayArray760.length; k++)
            {
                method361(anIntArray761[k], 947, ac, aCharArrayArray760[k], ac3, ac1);
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("75731, " + ac + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method361(int i, int j, char ac[], char ac1[], char ac2[], char ac3[])
    {
        try
        {
            if(ac1.length > ac.length)
            {
                return;
            }
            boolean flag = true;
            int k;
            for(int l = 0; l <= ac.length - ac1.length; l += k)
            {
                int i1 = l;
                int j1 = 0;
                k = 1;
                while(i1 < ac.length)
                {
                    int k1 = 0;
                    char c = ac[i1];
                    char c1 = '\0';
                    if(i1 + 1 < ac.length)
                    {
                        c1 = ac[i1 + 1];
                    }
                    if(j1 < ac1.length && (k1 = method366(c1, c, (byte)-31, ac1[j1])) > 0)
                    {
                        i1 += k1;
                        j1++;
                        continue;
                    }
                    if(j1 == 0)
                    {
                        break;
                    }
                    if((k1 = method366(c1, c, (byte)-31, ac1[j1 - 1])) > 0)
                    {
                        i1 += k1;
                        if(j1 == 1)
                        {
                            k++;
                        }
                        continue;
                    }
                    if(j1 >= ac1.length || !method372(c, 0))
                    {
                        break;
                    }
                    i1++;
                }
                if(j1 >= ac1.length)
                {
                    boolean flag1 = false;
                    int l1 = method362(l, ac, true, ac3);
                    int i2 = method363(ac2, ac, (byte)-34, i1 - 1);
                    if(i == 1 && l1 > 0 && i2 > 0)
                    {
                        flag1 = true;
                    }
                    if(i == 2 && (l1 > 2 && i2 > 0 || l1 > 0 && i2 > 2))
                    {
                        flag1 = true;
                    }
                    if(i == 3 && l1 > 0 && i2 > 2)
                    {
                        flag1 = true;
                    }
                    boolean _tmp = i == 3 && l1 > 2 && i2 > 0;
                    if(flag1)
                    {
                        int j2 = l;
                        int k2 = i1 - 1;
                        if(l1 > 2)
                        {
                            if(l1 == 4)
                            {
                                boolean flag2 = false;
                                for(int i3 = j2 - 1; i3 >= 0; i3--)
                                {
                                    if(flag2)
                                    {
                                        if(ac3[i3] != '*')
                                        {
                                            break;
                                        }
                                        j2 = i3;
                                    } else
                                    if(ac3[i3] == '*')
                                    {
                                        j2 = i3;
                                        flag2 = true;
                                    }
                                }
                            }
                            boolean flag3 = false;
                            for(int j3 = j2 - 1; j3 >= 0; j3--)
                            {
                                if(flag3)
                                {
                                    if(method372(ac[j3], 0))
                                    {
                                        break;
                                    }
                                    j2 = j3;
                                } else
                                if(!method372(ac[j3], 0))
                                {
                                    flag3 = true;
                                    j2 = j3;
                                }
                            }
                        }
                        if(i2 > 2)
                        {
                            if(i2 == 4)
                            {
                                boolean flag4 = false;
                                for(int k3 = k2 + 1; k3 < ac.length; k3++)
                                {
                                    if(flag4)
                                    {
                                        if(ac2[k3] != '*')
                                        {
                                            break;
                                        }
                                        k2 = k3;
                                    } else
                                    if(ac2[k3] == '*')
                                    {
                                        k2 = k3;
                                        flag4 = true;
                                    }
                                }
                            }
                            boolean flag5 = false;
                            for(int l3 = k2 + 1; l3 < ac.length; l3++)
                            {
                                if(flag5)
                                {
                                    if(method372(ac[l3], 0))
                                    {
                                        break;
                                    }
                                    k2 = l3;
                                } else
                                if(!method372(ac[l3], 0))
                                {
                                    flag5 = true;
                                    k2 = l3;
                                }
                            }
                        }
                        for(int l2 = j2; l2 <= k2; l2++)
                        {
                            ac[l2] = '*';
                        }
                    }
                }
            }
            j = 64 / j;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("11090, " + i + ", " + j + ", " + ac + ", " + ac1 + ", " + ac2 + ", " + ac3 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method362(int i, char ac[], boolean flag, char ac1[])
    {
        try
        {
            if(i == 0)
            {
                return 2;
            }
            for(int j = i - 1; j >= 0; j--)
            {
                if(!method372(ac[j], 0))
                {
                    break;
                }
                if(ac[j] == ',' || ac[j] == '.')
                {
                    return 3;
                }
            }
            int k = 0;
            for(int l = i - 1; l >= 0; l--)
            {
                if(!method372(ac1[l], 0))
                {
                    break;
                }
                if(ac1[l] == '*')
                {
                    k++;
                }
            }
            if(!flag)
            {
                return anInt746;
            }
            if(k >= 3)
            {
                return 4;
            }
            return !method372(ac[i - 1], 0) ? 0 : 1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("59837, " + i + ", " + ac + ", " + flag + ", " + ac1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method363(char ac[], char ac1[], byte byte0, int i)
    {
        try
        {
            if(i + 1 == ac1.length)
            {
                return 2;
            }
            for(int j = i + 1; j < ac1.length; j++)
            {
                if(!method372(ac1[j], 0))
                {
                    break;
                }
                if(ac1[j] == '\\' || ac1[j] == '/')
                {
                    return 3;
                }
            }
            int k = 0;
            for(int l = i + 1; l < ac1.length; l++)
            {
                if(!method372(ac[l], 0))
                {
                    break;
                }
                if(ac[l] == '*')
                {
                    k++;
                }
            }
            if(byte0 != -34)
            {
                return anInt750;
            }
            if(k >= 5)
            {
                return 4;
            }
            return !method372(ac1[i + 1], 0) ? 0 : 1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("32535, " + ac + ", " + ac1 + ", " + byte0 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method364(char ac[], char ac1[], byte abyte0[][], int i)
    {
        try
        {
            if(ac1.length > ac.length)
            {
                return;
            }
            boolean flag = true;
            int j;
            for(int k = 0; k <= ac.length - ac1.length; k += j)
            {
                int l = k;
                int i1 = 0;
                int j1 = 0;
                j = 1;
                boolean flag1 = false;
                boolean flag2 = false;
                boolean flag3 = false;
                while(l < ac.length && (!flag2 || !flag3))
                {
                    int k1 = 0;
                    char c = ac[l];
                    char c2 = '\0';
                    if(l + 1 < ac.length)
                    {
                        c2 = ac[l + 1];
                    }
                    if(i1 < ac1.length && (k1 = method367((byte)9, c, c2, ac1[i1])) > 0)
                    {
                        if(k1 == 1 && method375(0, c))
                        {
                            flag2 = true;
                        }
                        if(k1 == 2 && (method375(0, c) || method375(0, c2)))
                        {
                            flag2 = true;
                        }
                        l += k1;
                        i1++;
                        continue;
                    }
                    if(i1 == 0)
                    {
                        break;
                    }
                    if((k1 = method367((byte)9, c, c2, ac1[i1 - 1])) > 0)
                    {
                        l += k1;
                        if(i1 == 1)
                        {
                            j++;
                        }
                        continue;
                    }
                    if(i1 >= ac1.length || !method373(c, 40411))
                    {
                        break;
                    }
                    if(method372(c, 0) && c != '\'')
                    {
                        flag1 = true;
                    }
                    if(method375(0, c))
                    {
                        flag3 = true;
                    }
                    l++;
                    if((++j1 * 100) / (l - k) > 90)
                    {
                        break;
                    }
                }
                if(i1 >= ac1.length && (!flag2 || !flag3))
                {
                    boolean flag4 = true;
                    if(!flag1)
                    {
                        char c1 = ' ';
                        if(k - 1 >= 0)
                        {
                            c1 = ac[k - 1];
                        }
                        char c3 = ' ';
                        if(l < ac.length)
                        {
                            c3 = ac[l];
                        }
                        byte byte0 = method368(-379, c1);
                        byte byte1 = method368(-379, c3);
                        if(abyte0 != null && method365(byte1, aByte752, byte0, abyte0))
                        {
                            flag4 = false;
                        }
                    } else
                    {
                        boolean flag5 = false;
                        boolean flag6 = false;
                        if(k - 1 < 0 || method372(ac[k - 1], 0) && ac[k - 1] != '\'')
                        {
                            flag5 = true;
                        }
                        if(l >= ac.length || method372(ac[l], 0) && ac[l] != '\'')
                        {
                            flag6 = true;
                        }
                        if(!flag5 || !flag6)
                        {
                            boolean flag7 = false;
                            int k2 = k - 2;
                            if(flag5)
                            {
                                k2 = k;
                            }
                            for(; !flag7 && k2 < l; k2++)
                            {
                                if(k2 >= 0 && (!method372(ac[k2], 0) || ac[k2] == '\''))
                                {
                                    char ac2[] = new char[3];
                                    int j3;
                                    for(j3 = 0; j3 < 3; j3++)
                                    {
                                        if(k2 + j3 >= ac.length || method372(ac[k2 + j3], 0) && ac[k2 + j3] != '\'')
                                        {
                                            break;
                                        }
                                        ac2[j3] = ac[k2 + j3];
                                    }
                                    boolean flag8 = true;
                                    if(j3 == 0)
                                    {
                                        flag8 = false;
                                    }
                                    if(j3 < 3 && k2 - 1 >= 0 && (!method372(ac[k2 - 1], 0) || ac[k2 - 1] == '\''))
                                    {
                                        flag8 = false;
                                    }
                                    if(flag8 && !method378(ac2, 0))
                                    {
                                        flag7 = true;
                                    }
                                }
                            }
                            if(!flag7)
                            {
                                flag4 = false;
                            }
                        }
                    }
                    if(flag4)
                    {
                        int l1 = 0;
                        int i2 = 0;
                        int j2 = -1;
                        for(int l2 = k; l2 < l; l2++)
                        {
                            if(method375(0, ac[l2]))
                            {
                                l1++;
                            } else
                            if(method374(ac[l2], 8))
                            {
                                i2++;
                                j2 = l2;
                            }
                        }
                        if(j2 > -1)
                        {
                            l1 -= l - 1 - j2;
                        }
                        if(l1 <= i2)
                        {
                            for(int i3 = k; i3 < l; i3++)
                            {
                                ac[i3] = '*';
                            }
                        } else
                        {
                            j = 1;
                        }
                    }
                }
            }
            if(i < 4 || i > 4)
            {
                aBoolean747 = !aBoolean747;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("88077, " + ac + ", " + ac1 + ", " + abyte0 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method365(byte byte0, byte byte1, byte byte2, byte abyte0[][])
    {
        try
        {
            if(byte1 != 7)
            {
                throw new NullPointerException();
            }
            int i = 0;
            if(abyte0[i][0] == byte2 && abyte0[i][1] == byte0)
            {
                return true;
            }
            int j = abyte0.length - 1;
            if(abyte0[j][0] == byte2 && abyte0[j][1] == byte0)
            {
                return true;
            }
            do
            {
                int k = (i + j) / 2;
                if(abyte0[k][0] == byte2 && abyte0[k][1] == byte0)
                {
                    return true;
                }
                if(byte2 < abyte0[k][0] || byte2 == abyte0[k][0] && byte0 < abyte0[k][1])
                {
                    j = k;
                } else
                {
                    i = k;
                }
            } while(i != j && i + 1 != j);
            return false;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("46590, " + byte0 + ", " + byte1 + ", " + byte2 + ", " + abyte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method366(char c, char c1, byte byte0, char c2)
    {
        try
        {
            if(byte0 != -31)
            {
                for(int i = 1; i > 0; i++)
                {
                }
            }
            if(c2 == c1)
            {
                return 1;
            }
            if(c2 == 'o' && c1 == '0')
            {
                return 1;
            }
            if(c2 == 'o' && c1 == '(' && c == ')')
            {
                return 2;
            }
            if(c2 == 'c' && (c1 == '(' || c1 == '<' || c1 == '['))
            {
                return 1;
            }
            if(c2 == 'e' && c1 == '\u20AC')
            {
                return 1;
            }
            if(c2 == 's' && c1 == '$')
            {
                return 1;
            }
            return c2 != 'l' || c1 != 'i' ? 0 : 1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("34450, " + c + ", " + c1 + ", " + byte0 + ", " + c2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method367(byte byte0, char c, char c1, char c2)
    {
        try
        {
            if(byte0 == 9)
            {
                byte0 = 0;
            } else
            {
                return 2;
            }
            if(c2 == c)
            {
                return 1;
            }
            if(c2 >= 'a' && c2 <= 'm')
            {
                if(c2 == 'a')
                {
                    if(c == '4' || c == '@' || c == '^')
                    {
                        return 1;
                    }
                    return c != '/' || c1 != '\\' ? 0 : 2;
                }
                if(c2 == 'b')
                {
                    if(c == '6' || c == '8')
                    {
                        return 1;
                    }
                    return (c != '1' || c1 != '3') && (c != 'i' || c1 != '3') ? 0 : 2;
                }
                if(c2 == 'c')
                {
                    return c != '(' && c != '<' && c != '{' && c != '[' ? 0 : 1;
                }
                if(c2 == 'd')
                {
                    return (c != '[' || c1 != ')') && (c != 'i' || c1 != ')') ? 0 : 2;
                }
                if(c2 == 'e')
                {
                    return c != '3' && c != '\u20AC' ? 0 : 1;
                }
                if(c2 == 'f')
                {
                    if(c == 'p' && c1 == 'h')
                    {
                        return 2;
                    }
                    return c != '\243' ? 0 : 1;
                }
                if(c2 == 'g')
                {
                    return c != '9' && c != '6' && c != 'q' ? 0 : 1;
                }
                if(c2 == 'h')
                {
                    return c != '#' ? 0 : 1;
                }
                if(c2 == 'i')
                {
                    return c != 'y' && c != 'l' && c != 'j' && c != '1' && c != '!' && c != ':' && c != ';' && c != '|' ? 0 : 1;
                }
                if(c2 == 'j')
                {
                    return 0;
                }
                if(c2 == 'k')
                {
                    return 0;
                }
                if(c2 == 'l')
                {
                    return c != '1' && c != '|' && c != 'i' ? 0 : 1;
                }
                if(c2 == 'm')
                {
                    return 0;
                }
            }
            if(c2 >= 'n' && c2 <= 'z')
            {
                if(c2 == 'n')
                {
                    return 0;
                }
                if(c2 == 'o')
                {
                    if(c == '0' || c == '*')
                    {
                        return 1;
                    }
                    return (c != '(' || c1 != ')') && (c != '[' || c1 != ']') && (c != '{' || c1 != '}') && (c != '<' || c1 != '>') ? 0 : 2;
                }
                if(c2 == 'p')
                {
                    return 0;
                }
                if(c2 == 'q')
                {
                    return 0;
                }
                if(c2 == 'r')
                {
                    return 0;
                }
                if(c2 == 's')
                {
                    return c != '5' && c != 'z' && c != '$' && c != '2' ? 0 : 1;
                }
                if(c2 == 't')
                {
                    return c != '7' && c != '+' ? 0 : 1;
                }
                if(c2 == 'u')
                {
                    if(c == 'v')
                    {
                        return 1;
                    }
                    return (c != '\\' || c1 != '/') && (c != '\\' || c1 != '|') && (c != '|' || c1 != '/') ? 0 : 2;
                }
                if(c2 == 'v')
                {
                    return (c != '\\' || c1 != '/') && (c != '\\' || c1 != '|') && (c != '|' || c1 != '/') ? 0 : 2;
                }
                if(c2 == 'w')
                {
                    return c != 'v' || c1 != 'v' ? 0 : 2;
                }
                if(c2 == 'x')
                {
                    return (c != ')' || c1 != '(') && (c != '}' || c1 != '{') && (c != ']' || c1 != '[') && (c != '>' || c1 != '<') ? 0 : 2;
                }
                if(c2 == 'y')
                {
                    return 0;
                }
                if(c2 == 'z')
                {
                    return 0;
                }
            }
            if(c2 >= '0' && c2 <= '9')
            {
                if(c2 == '0')
                {
                    if(c == 'o' || c == 'O')
                    {
                        return 1;
                    }
                    return (c != '(' || c1 != ')') && (c != '{' || c1 != '}') && (c != '[' || c1 != ']') ? 0 : 2;
                }
                if(c2 == '1')
                {
                    return c != 'l' ? 0 : 1;
                } else
                {
                    return 0;
                }
            }
            if(c2 == ',')
            {
                return c != '.' ? 0 : 1;
            }
            if(c2 == '.')
            {
                return c != ',' ? 0 : 1;
            }
            if(c2 == '!')
            {
                return c != 'i' ? 0 : 1;
            } else
            {
                return 0;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("9530, " + byte0 + ", " + c + ", " + c1 + ", " + c2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static byte method368(int i, char c)
    {
        try
        {
            if(i >= 0)
            {
                throw new NullPointerException();
            }
            if(c >= 'a' && c <= 'z')
            {
                return (byte)((c - 97) + 1);
            }
            if(c == '\'')
            {
                return 28;
            }
            if(c >= '0' && c <= '9')
            {
                return (byte)((c - 48) + 29);
            } else
            {
                return 27;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("80234, " + i + ", " + c + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method369(char ac[], int i)
    {
        try
        {
            int j = 0;
            if(i != -17411)
            {
                return;
            }
            int k = 0;
            int l = 0;
            int i1 = 0;
            while((j = method370(-365, k, ac)) != -1)
            {
                boolean flag = false;
                for(int j1 = k; j1 >= 0 && j1 < j && !flag; j1++)
                {
                    if(!method372(ac[j1], 0) && !method373(ac[j1], 40411))
                    {
                        flag = true;
                    }
                }
                if(flag)
                {
                    l = 0;
                }
                if(l == 0)
                {
                    i1 = j;
                }
                k = method371(ac, j, false);
                int k1 = 0;
                for(int l1 = j; l1 < k; l1++)
                {
                    k1 = (k1 * 10 + ac[l1]) - 48;
                }
                if(k1 > 255 || k - j > 8)
                {
                    l = 0;
                } else
                {
                    l++;
                }
                if(l == 4)
                {
                    for(int i2 = i1; i2 < k; i2++)
                    {
                        ac[i2] = '*';
                    }
                    l = 0;
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("48666, " + ac + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method370(int i, int j, char ac[])
    {
        try
        {
            if(i >= 0)
            {
                aBoolean748 = !aBoolean748;
            }
            for(int k = j; k < ac.length && k >= 0; k++)
            {
                if(ac[k] >= '0' && ac[k] <= '9')
                {
                    return k;
                }
            }
            return -1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("33082, " + i + ", " + j + ", " + ac + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method371(char ac[], int i, boolean flag)
    {
        try
        {
            for(int j = i; j < ac.length && j >= 0; j++)
            {
                if(ac[j] < '0' || ac[j] > '9')
                {
                    return j;
                }
            }
            if(flag)
            {
                return anInt750;
            } else
            {
                return ac.length;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("23776, " + ac + ", " + i + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method372(char c, int i)
    {
        try
        {
            if(i != 0)
            {
                anInt745 = 186;
            }
            return !method374(c, 8) && !method375(0, c);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("61856, " + c + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method373(char c, int i)
    {
        try
        {
            if(i != 40411)
            {
                throw new NullPointerException();
            }
            if(c < 'a' || c > 'z')
            {
                return true;
            }
            return c == 'v' || c == 'x' || c == 'j' || c == 'q' || c == 'z';
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("6880, " + c + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method374(char c, int i)
    {
        try
        {
            if(i != 8)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("27010, " + c + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method375(int i, char c)
    {
        try
        {
            if(i != 0)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            return c >= '0' && c <= '9';
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("56986, " + i + ", " + c + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method376(char c, boolean flag)
    {
        try
        {
            if(flag)
            {
                for(int i = 1; i > 0; i++)
                {
                }
            }
            return c >= 'a' && c <= 'z';
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("7741, " + c + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method377(boolean flag, char c)
    {
        try
        {
            if(flag)
            {
                throw new NullPointerException();
            }
            return c >= 'A' && c <= 'Z';
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("60575, " + flag + ", " + c + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method378(char ac[], int i)
    {
        try
        {
            boolean flag = true;
            for(int j = 0; j < ac.length; j++)
            {
                if(!method375(0, ac[j]) && ac[j] != 0)
                {
                    flag = false;
                }
            }
            if(i != 0)
            {
                for(int k = 1; k > 0; k++)
                {
                }
            }
            if(flag)
            {
                return true;
            }
            int l = method379(ac, (byte)122);
            int i1 = 0;
            int j1 = anIntArray756.length - 1;
            if(l == anIntArray756[i1] || l == anIntArray756[j1])
            {
                return true;
            }
            do
            {
                int k1 = (i1 + j1) / 2;
                if(l == anIntArray756[k1])
                {
                    return true;
                }
                if(l < anIntArray756[k1])
                {
                    j1 = k1;
                } else
                {
                    i1 = k1;
                }
            } while(i1 != j1 && i1 + 1 != j1);
            return false;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("32549, " + ac + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method379(char ac[], byte byte0)
    {
        try
        {
            if(byte0 != 122)
            {
                aBoolean748 = !aBoolean748;
            }
            if(ac.length > 6)
            {
                return 0;
            }
            int i = 0;
            for(int j = 0; j < ac.length; j++)
            {
                char c = ac[ac.length - j - 1];
                if(c >= 'a' && c <= 'z')
                {
                    i = i * 38 + ((c - 97) + 1);
                } else
                if(c == '\'')
                {
                    i = i * 38 + 27;
                } else
                if(c >= '0' && c <= '9')
                {
                    i = i * 38 + ((c - 48) + 28);
                } else
                if(c != 0)
                {
                    return 0;
                }
            }
            return i;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("24004, " + ac + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

}
