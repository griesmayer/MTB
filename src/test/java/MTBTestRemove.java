import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MTBTestRemove
{

    @Test
    public void testRemovePos8()
    {
        MTB mtb;
        int[] hohe;
        int[] ergebnis = {100, 150, 210, 180, 160, 160, 160, 175, 190, 110, 50, 0, 0, 0, 0, 0};

        mtb = new MTB("Rax easy");

        hohe = mtb.getHohe();

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
        mtb.setKm(11);

        mtb.remove(8);

        /*
        assertEquals(100, hohe[0]);
        assertEquals(150, hohe[1]);
        assertEquals(210, hohe[2]);
        assertEquals(180, hohe[3]);
        assertEquals(160, hohe[4]);
        assertEquals(160, hohe[5]);
        assertEquals(160, hohe[6]);
        assertEquals(175, hohe[7]);
        assertEquals(190, hohe[8]);
        assertEquals(110, hohe[9]);
        assertEquals( 50, hohe[10]);
        */

        assertEquals(true, Arrays.equals(ergebnis, mtb.getHohe()));
        assertEquals( 10, mtb.getKm());
    }

    @Test
    public void testRemovePos0()
    {
        MTB mtb;
        int[] hohe;
        int[] ergebnis = {150, 210, 180, 160, 160, 160, 175, 200, 190, 110, 50, 0, 0, 0, 0, 0};

        mtb = new MTB("Rax easy");

        hohe = mtb.getHohe();

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
        mtb.setKm(11);

        mtb.remove(0);

        assertEquals(true, Arrays.equals(ergebnis, mtb.getHohe()));
        assertEquals( 10, mtb.getKm());
    }

    @Test
    public void testRemoveLast()
    {
        MTB mtb;
        int[] hohe;
        int[] ergebnis = {100, 150, 210, 180, 160, 160, 160, 175, 200, 190, 110, 0, 0, 0, 0, 0};

        mtb = new MTB("Rax easy");

        hohe = mtb.getHohe();

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
        mtb.setKm(11);

        mtb.remove(11);

        assertEquals(true, Arrays.equals(ergebnis, mtb.getHohe()));
        assertEquals( 10, mtb.getKm());
    }



    @Test
    public void testRemoveErrorNegative()
    {
        MTB mtb;
        int[] hohe;
        int[] ergebnis = {100, 150, 210, 180, 160, 160, 160, 175, 200, 190, 110, 50, 0, 0, 0, 0};

        mtb = new MTB("Rax easy");

        hohe = mtb.getHohe();

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
        mtb.setKm(11);

        mtb.remove(-1);

        assertEquals(true, Arrays.equals(ergebnis, mtb.getHohe()));
        assertEquals( 11, mtb.getKm());
    }

    @Test
    public void testRemoveErrorToBig()
    {
        MTB mtb;
        int[] hohe;
        int[] ergebnis = {100, 150, 210, 180, 160, 160, 160, 175, 200, 190, 110, 50, 0, 0, 0, 0};

        mtb = new MTB("Rax easy");

        hohe = mtb.getHohe();

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
        mtb.setKm(11);

        mtb.remove(12);

        assertEquals(true, Arrays.equals(ergebnis, mtb.getHohe()));
        assertEquals( 11, mtb.getKm());
    }
}