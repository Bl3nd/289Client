import sign.signlink;

public class Class44_Sub3_Sub4_Sub6 extends Animable
{

    public boolean aBoolean1613;
    public boolean aBoolean1614;
    public int anInt1615;
    public int anInt1616;
    public int anInt1617;
    public boolean aBoolean1618;
    public int anInt1619;
    public int anInt1620;
    public int anInt1621;
    public int anInt1622;
    public int anInt1623;
    public int anInt1624;
    public int anInt1625;
    public int anInt1626;
    public String aString1627;
    public int anInt1628;
    public int anInt1629;
    public int anInt1630;
    public int anIntArray1631[];
    public int anIntArray1632[];
    public int anIntArray1633[];
    public int anInt1634;
    public int anInt1635;
    public int anInt1636;
    public int anInt1637;
    public int anInt1638;
    public int anInt1639;
    public int anInt1640;
    public int anInt1641;
    public int anInt1642;
    public int anInt1643;
    public int anInt1644;
    public int anInt1645;
    public int anInt1646;
    public int anInt1647;
    public int anInt1648;
    public int anInt1649;
    public int anInt1650;
    public int anInt1651;
    public int anInt1652;
    public int anInt1653;
    public int anInt1654;
    public int anInt1655;
    public int anInt1656;
    public int anInt1657;
    public int anInt1658;
    public int anInt1659;
    public int anInt1660;
    public int anInt1661;
    public int anInt1662;
    public int anInt1663;
    public int anInt1664;
    public int anIntArray1665[];
    public int anIntArray1666[];
    public boolean aBooleanArray1667[];
    public int anInt1668;
    public int anInt1669;

    public void method532(int i, boolean flag, int j, byte byte0)
    {
        try
        {
            if(anInt1643 != -1 && Class26.aClass26Array508[anInt1643].anInt521 == 1)
            {
                anInt1643 = -1;
            }
            if(!flag)
            {
                int k = i - anIntArray1665[0];
                int l = j - anIntArray1666[0];
                if(k >= -8 && k <= 8 && l >= -8 && l <= 8)
                {
                    if(anInt1664 < 9)
                    {
                        anInt1664++;
                    }
                    for(int i1 = anInt1664; i1 > 0; i1--)
                    {
                        anIntArray1665[i1] = anIntArray1665[i1 - 1];
                        anIntArray1666[i1] = anIntArray1666[i1 - 1];
                        aBooleanArray1667[i1] = aBooleanArray1667[i1 - 1];
                    }
                    anIntArray1665[0] = i;
                    anIntArray1666[0] = j;
                    aBooleanArray1667[0] = false;
                    return;
                }
            }
            anInt1664 = 0;
            anInt1669 = 0;
            anInt1668 = 0;
            anIntArray1665[0] = i;
            anIntArray1666[0] = j;
            anInt1615 = anIntArray1665[0] * 128 + anInt1619 * 64;
            if(byte0 == 1)
            {
                byte0 = 0;
            } else
            {
                aBoolean1613 = !aBoolean1613;
            }
            anInt1616 = anIntArray1666[0] * 128 + anInt1619 * 64;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("61882, " + i + ", " + flag + ", " + j + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method533(boolean flag, int i, int j)
    {
        try
        {
            int k = anIntArray1665[0];
            int l = anIntArray1666[0];
            if(i == 0)
            {
                k--;
                l++;
            }
            if(i == 1)
            {
                l++;
            }
            if(i == 2)
            {
                k++;
                l++;
            }
            if(i == 3)
            {
                k--;
            }
            if(i == 4)
            {
                k++;
            }
            if(i == 5)
            {
                k--;
                l--;
            }
            if(i == 6)
            {
                l--;
            }
            if(i == 7)
            {
                k++;
                l--;
            }
            if(anInt1643 != -1 && Class26.aClass26Array508[anInt1643].anInt521 == 1)
            {
                anInt1643 = -1;
            }
            if(anInt1664 < 9)
            {
                anInt1664++;
            }
            for(int i1 = anInt1664; i1 > 0; i1--)
            {
                anIntArray1665[i1] = anIntArray1665[i1 - 1];
                anIntArray1666[i1] = anIntArray1666[i1 - 1];
                aBooleanArray1667[i1] = aBooleanArray1667[i1 - 1];
            }
            anIntArray1665[0] = k;
            anIntArray1666[0] = l;
            aBooleanArray1667[0] = flag;
            if(j != -6002)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("37957, " + flag + ", " + i + ", " + j + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method534(boolean flag)
    {
        try
        {
            if(flag)
            {
                aBoolean1614 = !aBoolean1614;
            }
            anInt1664 = 0;
            anInt1669 = 0;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("39799, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method535(boolean flag)
    {
        try
        {
            if(!flag)
            {
                throw new NullPointerException();
            } else
            {
                return false;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("30413, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method536(int i, int j, int k, boolean flag)
    {
        try
        {
            if(flag)
            {
                return;
            }
            for(int l = 0; l < 4; l++)
            {
                if(anIntArray1633[l] <= j)
                {
                    anIntArray1631[l] = k;
                    anIntArray1632[l] = i;
                    anIntArray1633[l] = j + 70;
                    return;
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("15311, " + i + ", " + j + ", " + k + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class44_Sub3_Sub4_Sub6()
    {
        aBoolean1613 = false;
        aBoolean1614 = false;
        aBoolean1618 = false;
        anInt1619 = 1;
        anInt1620 = -1;
        anInt1621 = -1;
        anInt1622 = -1;
        anInt1623 = -1;
        anInt1624 = -1;
        anInt1625 = -1;
        anInt1626 = -1;
        anInt1628 = 100;
        anIntArray1631 = new int[4];
        anIntArray1632 = new int[4];
        anIntArray1633 = new int[4];
        anInt1634 = -1000;
        anInt1637 = -1;
        anInt1640 = -1;
        anInt1643 = -1;
        anInt1648 = -1;
        anInt1661 = 200;
        anInt1663 = 32;
        anIntArray1665 = new int[10];
        anIntArray1666 = new int[10];
        aBooleanArray1667 = new boolean[10];
    }
}
