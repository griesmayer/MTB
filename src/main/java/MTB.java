public class MTB
{
    private String name;
    private int[] hohe;
    private int   km;

    public MTB()
    {
        setName("Unbekannt");
        hohe = new int[16];
        setKm(-1);
    }

    public MTB(String name)
    {
        setName(name);
        hohe = new int[16];
        setKm(-1);
    }

    public int getKm()
    {
        return km;
    }

    public void setKm(int km)
    {
        this.km = km;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if (name != null)
            this.name = name;
        else
        {
            System.out.println("Fehler: kein gültiger Name!");
            this.name = "UNKN";
        }
    }

    public void testdaten()
    {
        hohe[0] = 100;
        hohe[1] = 150;
        hohe[2] = 210;
        hohe[3] = 180;
        hohe[4] = 160;
        hohe[5] = 160;
        hohe[6] = 160;
        hohe[7] = 175;
        hohe[8] = 200;
        hohe[9] = 190;
        hohe[10] = 110;
        hohe[11] =  50;
        km = 11;
    }

    public void testdaten2()
    {
        hohe[0] = 100;
        hohe[1] = 150;
        hohe[2] = 210;
        hohe[3] = 180;
        hohe[4] = 160;
        hohe[5] = 160;
        hohe[6] = 160;
        hohe[7] = 175;
        hohe[8] = 200;
        hohe[9] = 190;
        hohe[10] = 300;
        hohe[11] =  50;
        km = 11;
    }

    public void testdaten3()
    {
        hohe[0] = 100;
        hohe[1] = 150;
        hohe[2] = 210;
        hohe[3] = 180;
        hohe[4] = 160;
        hohe[5] = 160;
        hohe[6] = 160;
        hohe[7] = 175;
        hohe[8] = 290;
        hohe[9] = 190;
        hohe[10] = 110;
        hohe[11] =  50;
        km = 11;
    }

    public void testdaten4()
    {
        hohe[0] = 100;
        hohe[1] =  90;
        hohe[2] =  80;
        hohe[3] =  70;
        hohe[4] =  60;
        hohe[5] =  50;
        km = 5;
    }

    public int minHohe()
    {
        return -999;
    }

    public int maxDown()
    {
        return -999;
    }


    public int maxSteigung()
    {
        int max;

        max = -999;
        for (int i=0; i<km; i++)
        {
            if ((hohe[i+1] > hohe[i]) && ((hohe[i+1] - hohe[i]) > max))
            {
                max = (hohe[i + 1] - hohe[i]);
            }
        }
        return max;
    }

    public int maxHohe()
    {
        int max;

        max = -999;
        for (int i=0; i<=km; i++)
        {
            if (hohe[i] > max)
            {
                max = hohe[i];
            }
        }
        return max;
    }

    public String toString()
    {
        String erg;
        int i;

        erg = name + "\n\n";
        i = 0;
        while (i <= km)
        {
            erg = erg + i + " km:\t" + hohe[i] + "\t";
            for (int j=0; j<hohe[i]/10; j++)
            {
                erg = erg + "*";
            }
            erg = erg + "\n";
            i++;
        }
        return erg;
    }
}
