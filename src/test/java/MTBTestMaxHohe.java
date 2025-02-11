import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MTBTestMaxHohe
{

    @Test
    public void maxHohe1()
    {
        MTB mtb;

        mtb = new MTB("Rax easy");
        mtb.testdaten();
        assertEquals (210, mtb.maxHohe());
    }

    @Test
    public void maxHohe2()
    {
        MTB mtb;

        mtb = new MTB("Rax easy");
        mtb.testdaten2();
        assertEquals (300, mtb.maxHohe());
    }

    @Test
    public void maxHohe3()
    {
        MTB mtb;

        mtb = new MTB("Rax easy");
        mtb.testdaten3();
        assertEquals (290, mtb.maxHohe());
    }


}